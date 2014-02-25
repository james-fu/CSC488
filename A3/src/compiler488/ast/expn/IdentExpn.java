package compiler488.ast.expn;

import compiler488.ast.IdentNode;

/**
 *  References to a scalar variable.
 */
public class IdentExpn extends VarRefExpn {
    public IdentExpn(IdentNode ident) {
        super(ident, ident);
    }

    public String toString() {
        return ident.toString();
    }
    
    public boolean equals(Object o) {
        if (!(o instanceof IdentExpn)) {
            return false;
        }
        
        return equals((IdentExpn) o);
    }
    
    public boolean equals(IdentExpn o) {
        return ident.equals(o.ident);
    }
}
