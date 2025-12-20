package AST.Python;

public class With_item extends Root {
    Test test;
     Expr expr;

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public Expr getAlias() {
        return expr;
    }

    public void setAlias(Expr alias) {
        this.expr = alias;
    }

    @Override
    public String toString() {
        return "With_item{" +
                "test=" + test +
                ", alias=" + expr +
                '}';
    }
}
