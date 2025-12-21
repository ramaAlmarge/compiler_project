package AST.Python;

public class AdditiveExpr extends Expr {
    public enum BinaryOp {
        PLUS,
        MINUS
    }

    Expr left;
    Expr right;
    BinaryOp op;

    public void setLeft(Expr left) {
        this.left = left;
    }

    public void setRight(Expr right) {
        this.right = right;
    }

    public void setOp(BinaryOp op) {
        this.op = op;
    }

    @Override
    public String toString(int level) {
        return toTreeString(level);
    }
}
