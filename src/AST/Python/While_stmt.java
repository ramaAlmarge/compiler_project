package AST.Python;

public class While_stmt extends Compound_stmt {
     Test condition;
     Suite suite;

    public Test getCondition() {
        return condition;
    }

    public void setCondition(Test condition) {
        this.condition = condition;
    }

    public Suite getSuite() {
        return suite;
    }

    public void setSuite(Suite suite) {
        this.suite = suite;
    }

    @Override
    public String toString() {
        return "While_stmt{" +
                "condition=" + condition +
                ", suite=" + suite +
                '}';
    }
}
