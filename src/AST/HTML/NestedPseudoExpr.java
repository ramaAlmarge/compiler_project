package AST.HTML;

public class NestedPseudoExpr extends PseudoExprPart {
    private final Pseudo pseudo;

    public NestedPseudoExpr(Pseudo pseudo) {
        this.pseudo = pseudo;
    }

    @Override
    public String toString() {
        return pseudo.toString();
    }
}
