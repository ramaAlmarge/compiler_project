package AST.Python;

import java.util.ArrayList;
import java.util.List;

public class Suite {
    Simple_stmt simple_stmt;
    List<Stmt> stmt = new ArrayList<>();

    public Simple_stmt getSimple_stmt() {
        return simple_stmt;
    }

    public void setSimple_stmt(Simple_stmt simple_stmt) {
        this.simple_stmt = simple_stmt;
    }

    public List<Stmt> getStmt() {
        return stmt;
    }

    public void setStmt(List<Stmt> stmt) {
        this.stmt = stmt;
    }

    @Override
    public String toString() {
        return "Suite{" +
                "simple_stmt=" + simple_stmt +
                ", stmt=" + stmt +
                '}';
    }
}
