package AST.Python;

import java.util.ArrayList;
import java.util.List;

public class SimpleStmtLine extends Simple_stmt {
    List<Small_stmt> smallStmts = new ArrayList<>();
    int line;
    public void setLine(int line) { this.line = line; }
    public int getLine() { return line; }

    public List<Small_stmt> getSmallStmts() {
        return smallStmts;
    }

    public void setSmallStmts(List<Small_stmt> smallStmts) {
        this.smallStmts = smallStmts;
    }

    @Override
    public String toString(int level ) {
        StringBuilder sb = new StringBuilder();
        sb.append("line").append(line).append("\n");
        for (Small_stmt stmt : smallStmts) {
            sb.append(stmt.toString((level + 1))).append("\n");
        }
        return sb.toString().trim();
    }

}
