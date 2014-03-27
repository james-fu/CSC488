package compiler488.codegen;

import java.io.*;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import compiler488.ast.AST;
import compiler488.ast.decl.RoutineDecl;
import compiler488.ast.stmt.Program;
import compiler488.ast.stmt.Scope;
import compiler488.runtime.Machine;
import compiler488.codegen.Frame;
import compiler488.compiler.Main;

/**      CodeGenerator.java
 *<pre>
 *  Code Generation Conventions
 *
 *  To simplify the course project, this code generator is
 *  designed to compile directly to pseudo machine memory
 *  which is available as the private array memory[]
 *
 *  It is assumed that the code generator places instructions
 *  in memory in locations
 *
 *      memory[ 0 .. startMSP - 1 ]
 *
 *  The code generator may also place instructions and/or
 *  constants in high memory at locations (though this may
 *  not be necessary)
 *      memory[ startMLP .. Machine.memorySize - 1 ]
 *
 *  During program exection the memory area
 *      memory[ startMSP .. startMLP - 1 ]
 *  is used as a dynamic stack for storing activation records
 *  and temporaries used during expression evaluation.
 *  A hardware exception (stack overflow) occurs if the pointer
 *  for this stack reaches the memory limit register (mlp).
 *
 *  The code generator is responsible for setting the global
 *  variables:
 *      startPC         initial value for program counter
 *      startMSP        initial value for msp
 *      startMLP        initial value for mlp
 * </pre>
 * @author Daniel Bloemendal
 */

public class CodeGen extends Visitor
{
    //
    // Processors
    //

    @Processor(target="Scope")
    void processScope(Scope scope) {
        // Skip minor scopes
        boolean isRoutine = (scope.getParent() instanceof RoutineDecl);
        boolean isProgram = (scope instanceof Program); 
        if(!isRoutine && !isProgram) return;
        
        // The routine
        RoutineDecl routine = null;
        
        // Emit comment for start of scope
        if(isRoutine) {
            routine = (RoutineDecl) scope.getParent();
            emit("; Start of " + routine.getName());
        } else emit("; Start of program");

        // Generate code for scope
        enterFrame(scope);                                     // Enter a new stack frame
        if(isRoutine) label(getLabelRoutine(routine));         // Starting label
        emit("SAVECTX", 0);                                    // Scope prolog
        reserve(currentFrame().getSize());                     // Reserve memory for locals
        visit(scope.getStatements());                          // Visit statements in scope
        if(isRoutine) label(getLabelRoutine(routine, true));   // Ending label
        free(currentFrame().getSize());                        // Free locals memory
        emit("RESTORECTX", currentFrame().getLevel(),          // Scope epilog
                           currentFrame().getArgumentsSize()); // ...
        if(!currentFrame().isRoutine()) emit("HALT");          // Program epilog
        exitFrame();                                           // Exit the stack frame
        
        // Emit comment for end of scope
        if(isRoutine) { emit("; End of " + routine.getName()); }
        else emit("; End of program");
        
        // Generate code for declared routines
        visit(scope.getDeclarations());        
    }
    
    @Processor(target="RoutineDecl")
    void processRoutineDecl(RoutineDecl routine) {
        visit(routine.getBody());
    }

    //
    // Code generator life cycle
    //

    public void Initialize() {
        // Instantiate internals
        codegenFrames = new LinkedList<Frame>();
        codegenRoutines = new HashMap<AST, Frame>();
        codegenLabels = 0;
        codegenDump = Main.dumpCode;
        // Start the assembler
        assemblerStart();
    }

    public void Generate(Program program) {
        emit("SECTION", ".code"); // Start the code section
        visit(program);           // Traverse the AST
    }

    public Boolean Finalize() {
        // Finish assembling code
        int result = assemblerEnd();
        if(result < 0) return false;
        // Set initial machine state
        Machine.setPC((short) 0);
        Machine.setMSP((short) result);
        Machine.setMLP((short) (Machine.memorySize - 1));
        return true;
    }
    
    //
    // Labels
    //
    
    String getLabelGenerated() {
        return "_L" + codegenLabels++;
    }
    
    String getLabelRoutine(RoutineDecl routine) {
        return getLabelRoutine(routine, false);
    }
    
    String getLabelRoutine(RoutineDecl routine, boolean end) {
        Frame frame = codegenRoutines.get(routine);
        if(frame == null) return null;
        String label = routine.getName() + "_LL" + frame.getLevel();
        if(end) label += "_END";
        return label;
    }    

    //
    // Helpers
    //

    void enterFrame(Scope scope) {
        Frame frame = new Frame(scope, currentLexicalLevel());
        if(frame.isRoutine()) codegenRoutines.put(frame.getRoutine(), frame);
        codegenFrames.push(frame);
    }

    void exitFrame() {
        codegenFrames.pop();
    }

    Frame currentFrame() {
        return codegenFrames.peek();
    }

    short currentLexicalLevel() {
        return (short) codegenFrames.size();
    }
    
    // Code generator internals
    Deque<Frame>    codegenFrames;
    Map<AST, Frame> codegenRoutines;
    int             codegenLabels;
    boolean         codegenDump;

    //
    // Assembler
    //

    Boolean assemblerStart() {
        assemblerThread = new AssemblerThread();
        assemblerStream = new PrintStream(assemblerThread.getPipe());
        assemblerThread.start();
        return true;
    }

    void assemblerPrintln(String x) {
        assemblerStream.println(x);
        if(codegenDump) System.out.println(x);
    }

    int assemblerEnd() {
        try {
            assemblerStream.close();
            assemblerThread.join();
            return assemblerThread.getResult();
        } catch (InterruptedException e) {
            return -1;
        }
    }

    void section(String name) {
        assemblerPrintln("SECTION " + name);
    }
    
    void label(String name) {
        assemblerPrintln(name + ":");
    }

    void put(String string) {
        boolean firstLine = true;
        for(String line : string.split("\\r?\\n")) {
            if(!firstLine) assemblerPrintln("PUTNEWLINE");
            else firstLine = false;
            assemblerPrintln("PUTSTR \"" + line + "\"");
        }
    }

    void emit(String instruction, Object... operands) {
        String command = instruction;
        for(Object op : operands)
            command += " " + op.toString();
        assemblerPrintln(command);
    }
    
    void reserve(short words) {
        if(words == 0) return;
        emit("RESERVE", words);
    }
    
    void free(short words) {
        if(words == 0) return;
        emit("PUSH", words);
        emit("POPN");
    }

    // Assembler internals
    PrintStream     assemblerStream;
    AssemblerThread assemblerThread;
}
