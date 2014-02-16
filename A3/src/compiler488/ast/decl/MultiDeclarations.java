package compiler488.ast.decl;

import java.io.PrintStream;
import java.util.List;
import java.util.Vector;

import compiler488.ast.AST;
import compiler488.ast.ASTList;
import compiler488.ast.Indentable;
import compiler488.ast.type.Type;


/**
 * Holds the declaration of multiple elements.
 */
public class MultiDeclarations extends Declaration {
    /* The elements being declared */
    private ASTList<DeclarationPart> elements;

    public MultiDeclarations(ASTList<DeclarationPart> elements, Type type) {
        super (null, type);

        this.elements = elements;
        elements.setParent(this);
    }
    
    public List<AST> getChildren() {
        Vector<AST> children = new Vector<AST>();
        children.add(elements);
        return children;
    }    

    /**
     * Returns a string that describes the array.
     */
    @Override
    public String toString() {
        return  elements + " : " + type ;
    }


    /**
     * Print the multiple declarations of the same type.
     *
     * @param out
     *            Where to print the description.
     * @param depth
     *            How much indentation to use while printing.
     */
    @Override
    public void printOn(PrintStream out, int depth) {
        out.println(elements);
        Indentable.printIndentOn(out, depth, this + " ");
    }

    public ASTList<DeclarationPart> getElements() {
        return elements;
    }

    public void setElements(ASTList<DeclarationPart> elements) {
        this.elements = elements;
    }
}
