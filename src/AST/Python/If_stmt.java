package AST.Python;

import java.util.ArrayList;
import java.util.List;

public class If_stmt {
    String if_name ;
    Test test;
    Suite suite;
    List<Elif_clause> elif_clause = new ArrayList<>();
    Else_clause else_clause;

    public String getIf_name() {
        return if_name;
    }

    public void setIf_name(String if_name) {
        this.if_name = if_name;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public Suite getSuite() {
        return suite;
    }

    public void setSuite(Suite suite) {
        this.suite = suite;
    }

    public List<Elif_clause> getElif_clause() {
        return elif_clause;
    }

    public void setElif_clause(List<Elif_clause> elif_clause) {
        this.elif_clause = elif_clause;
    }

    public Else_clause getElse_clause() {
        return else_clause;
    }

    public void setElse_clause(Else_clause else_clause) {
        this.else_clause = else_clause;
    }

    @Override
    public String toString() {
        return "If_stmt{" +
                "if_name='" + if_name + '\'' +
                ", test=" + test +
                ", suite=" + suite +
                ", elif_clause=" + elif_clause +
                ", else_clause=" + else_clause +
                '}';
    }
}
