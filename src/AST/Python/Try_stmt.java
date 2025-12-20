package AST.Python;

import java.util.ArrayList;
import java.util.List;

public class Try_stmt {
    String try_name;
    Suite suite;
    List<Except_clause> except_clause = new ArrayList<>();
    Else_clause else_clause;
    Finally_clause finally_clause;

    public String getTry_name() {
        return try_name;
    }

    public void setTry_name(String try_name) {
        this.try_name = try_name;
    }

    public Suite getSuite() {
        return suite;
    }

    public void setSuite(Suite suite) {
        this.suite = suite;
    }

    public List<Except_clause> getExcept_clause() {
        return except_clause;
    }

    public void setExcept_clause(List<Except_clause> except_clause) {
        this.except_clause = except_clause;
    }

    public Else_clause getElse_clause() {
        return else_clause;
    }

    public void setElse_clause(Else_clause else_clause) {
        this.else_clause = else_clause;
    }

    public Finally_clause getFinally_clause() {
        return finally_clause;
    }

    public void setFinally_clause(Finally_clause finally_clause) {
        this.finally_clause = finally_clause;
    }

    @Override
    public String toString() {
        return "Try_stmt{" +
                "try_name='" + try_name + '\'' +
                ", suite=" + suite +
                ", except_clause=" + except_clause +
                ", else_clause=" + else_clause +
                ", finally_clause=" + finally_clause +
                '}';
    }
}
