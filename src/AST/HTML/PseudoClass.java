package AST.HTML;

public class PseudoClass extends Pseudo {

    private String id;
    private PseudoExpr pseudoExpr;

    public PseudoClass(String id, PseudoExpr pseudoExpr) {
        this.id = id;
        this.pseudoExpr = pseudoExpr;
    }

    public String getId() {
        return id;
    }

    public PseudoExpr getPseudoExpr() {
        return pseudoExpr;
    }

    @Override
    public String toString() {
        if (pseudoExpr != null) {
            return ":" + id + "(" + pseudoExpr + ")";
        }
        return ":" + id;
    }
}
