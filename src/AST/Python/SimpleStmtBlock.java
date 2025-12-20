package AST.Python;

import java.util.ArrayList;
import java.util.List;

public class SimpleStmtBlock {
    List<Small_stmt> smallStmts = new ArrayList<>();

    public List<Small_stmt> getSmallStmts() {
        return smallStmts;
    }

    public void setSmallStmts(List<Small_stmt> smallStmts) {
        this.smallStmts = smallStmts;
    }

    @Override
    public String toString() {
        return "SimpleStmtBlock{" +
                "smallStmts=" + smallStmts +
                '}';
    }
}
