package AST.HTML;

public class NotPseudoExpr extends PseudoExprPart {
    @Override
    public String toString(int level) {
        return ":not";
    }
}
