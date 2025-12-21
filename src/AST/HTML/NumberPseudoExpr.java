package AST.HTML;

public class NumberPseudoExpr extends PseudoExprPart {
    private final String value;

    public NumberPseudoExpr(String value) {
        this.value = value;
    }

    @Override
    public String toString(int level) {
        return value;
    }
}
