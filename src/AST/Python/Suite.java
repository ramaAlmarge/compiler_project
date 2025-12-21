package AST.Python;

import java.util.ArrayList;
import java.util.List;

public class Suite extends Root {
    List<Stmt> stmts = new ArrayList<>();

    public List<Stmt> getStmts() {
        return stmts;
    }

    public void addStmt(Stmt stmt) {
        this.stmts.add(stmt);
    }

    @Override
    public String toString(int level) {
        return "Suite{" +
                "stmts=" + stmts +
                '}';
    }
}
