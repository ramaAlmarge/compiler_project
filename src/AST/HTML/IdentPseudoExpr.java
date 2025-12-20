package AST.HTML;

public class IdentPseudoExpr extends PseudoExprPart {
    private final String name;

    public IdentPseudoExpr(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
