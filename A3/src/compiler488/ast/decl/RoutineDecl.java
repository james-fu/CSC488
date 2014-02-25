package compiler488.ast.decl;

import java.io.PrintStream;
import java.util.List;
import java.util.Vector;

import compiler488.ast.AST;
import compiler488.ast.ASTList;
import compiler488.ast.IdentNode;
import compiler488.ast.Indentable;
import compiler488.ast.SourceLoc;
import compiler488.ast.type.Type;
import compiler488.ast.type.FunctionType;
import compiler488.ast.stmt.Scope;

/**
 * Represents the declaration of a function or procedure.
 */
public class RoutineDecl extends Declaration {
    /*
     * The formal parameters of the function/procedure and the
     * statements to execute when the procedure is called.
     */
    private ASTList<ScalarDecl> params; // The formal parameters of the routine.
    private Scope body = null;
    private FunctionType funcType;

    public RoutineDecl(IdentNode ident, Type returnType, ASTList<ScalarDecl> params, SourceLoc loc) {
    	super(ident, returnType, loc);
        
        ASTList<Type> argTypes = new ASTList<Type>();
        
        this.params = params;
        params.setParent(this);
        
        for (ScalarDecl argDecl : params.getList()) {
            argTypes.addLast(argDecl.getType());
        }

        funcType = new FunctionType(returnType, argTypes, loc);
        funcType.setParent(this);
    }
    
    public RoutineDecl(IdentNode ident, Type returnType, ASTList<ScalarDecl> params, Scope body, SourceLoc loc) {
        this(ident, returnType, params, loc);
        
        this.body = body;
        body.setParent(this);
    }

    public RoutineDecl withBody(Scope body, SourceLoc wider_loc) {
        return new RoutineDecl(ident, type, params, body, wider_loc);
    }

    public boolean isFunction() {
        return !type.isNil();
    }

    public boolean isForward() {
        return body == null;
    }
    
    public Scope getBody() {
        return body;
    }
    
    public FunctionType getFunctionType() {
        return funcType;
    }
    
    public ASTList<ScalarDecl> getParameters() {
        return params;
    }
    
    public List<AST> getChildren() {
        Vector<AST> children = new Vector<AST>();
        children.add(type);
        children.add(params);
        if(body != null) children.add(body);
        return children;        
    }

    /**
     * Returns a string indicating that this is a function with
     * return type or a procedure, name, Type parameters, if any,
     * are listed later by routineBody
     */
    @Override
    public String toString() {
        String s = "";

        if (body == null) {
            s = "forward ";
        }


        if (!isFunction()) {
            s += "proc ";
        } else {
            s += "func ";
        }

        s += ident;

        return s;
    }

    /**
     * Prints a description of the function/procedure.
     *
     * @param out
     *            Where to print the description.
     * @param depth
     *            How much indentation to use while printing.
     */
    @Override
    public void printOn(PrintStream out, int depth) {
        Indentable.printIndentOn(out, depth, this + " ");

        if (params != null) {
            out.println("(" + params + ")");
        }
        else {
            out.println("( ) ");
        }

        if (body != null) {
            body.printOn(out, depth + 1);
        }
    }
}
