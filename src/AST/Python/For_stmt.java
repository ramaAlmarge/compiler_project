package AST.Python;

public class For_stmt {
    String async;
    String for_name;
    Exprlist exprlist;
    String in;
    Testlist testlist;
    Suite suite;
    Else_clause else_clause;

    public String getAsync() {
        return async;
    }

    public void setAsync(String async) {
        this.async = async;
    }

    public String getFor_name() {
        return for_name;
    }

    public void setFor_name(String for_name) {
        this.for_name = for_name;
    }

    public Exprlist getExprlist() {
        return exprlist;
    }

    public void setExprlist(Exprlist exprlist) {
        this.exprlist = exprlist;
    }

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public Testlist getTestlist() {
        return testlist;
    }

    public void setTestlist(Testlist testlist) {
        this.testlist = testlist;
    }

    public Suite getSuite() {
        return suite;
    }

    public void setSuite(Suite suite) {
        this.suite = suite;
    }

    public Else_clause getElse_clause() {
        return else_clause;
    }

    public void setElse_clause(Else_clause else_clause) {
        this.else_clause = else_clause;
    }

    @Override
    public String toString() {
        return "For_stmt{" +
                "async='" + async + '\'' +
                ", for_name='" + for_name + '\'' +
                ", exprlist=" + exprlist +
                ", in='" + in + '\'' +
                ", testlist=" + testlist +
                ", suite=" + suite +
                ", else_clause=" + else_clause +
                '}';
    }
}
