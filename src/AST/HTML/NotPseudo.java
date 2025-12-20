package AST.HTML;

public class NotPseudo extends Pseudo {

    private PseudoExpr pseudoExpr;

    public NotPseudo(PseudoExpr pseudoExpr) {
        this.pseudoExpr = pseudoExpr;
    }

    public PseudoExpr getPseudoExpr() {
        return pseudoExpr;
    }

    @Override
    public String toString() {
        return ":not(" + (pseudoExpr != null ? pseudoExpr : "") + ")";
    }
}
