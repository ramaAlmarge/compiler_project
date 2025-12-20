package AST.Python;

public class While_stmt {
    String while_name;
    Test test;
    Suite suite;
    Else_clause else_clause;

    public String getWhile_name() {
        return while_name;
    }

    public void setWhile_name(String while_name) {
        this.while_name = while_name;
    }

    public Suite getSuite() {
        return suite;
    }

    public void setSuite(Suite suite) {
        this.suite = suite;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public Else_clause getElse_clause() {
        return else_clause;
    }

    public void setElse_clause(Else_clause else_clause) {
        this.else_clause = else_clause;
    }

    @Override
    public String toString() {
        return "While_stmt{" +
                "while_name='" + while_name + '\'' +
                ", test=" + test +
                ", suite=" + suite +
                ", else_clause=" + else_clause +
                '}';
    }
}
