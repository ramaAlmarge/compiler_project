package AST.HTML;

public class OperatorPseudoExpr extends PseudoExprPart {
    private final String op;

    public OperatorPseudoExpr(String op) {
        this.op = op;
    }

    @Override
    public String toString(int level) {
        return op;
    }
}
