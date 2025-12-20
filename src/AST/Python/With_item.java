package AST.Python;

public class With_item {
    Test test;
    Expr expr;

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    @Override
    public String toString() {
        return "With_item{" +
                "test=" + test +
                ", expr=" + expr +
                '}';
    }
}
