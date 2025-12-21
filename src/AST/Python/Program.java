package AST.Python;

import java.util.ArrayList;
import java.util.List;

public class Program extends Root {
    List<Root> stmts = new ArrayList<>();

    public List<Root> getStmts() {
        return stmts;
    }

    public void addStmt(Root stmt) {
        this.stmts.add(stmt);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();

        sb.append(indent(level)).append("Program {\n");

        for (int i = 0; i < stmts.size(); i++) {
            sb.append(indent(level)).append("stmts: [\n");
            sb.append(stmts.get(i).toString(level + 2));

            if (i < stmts.size() - 1) {
                sb.append("\n");
            }
            sb.append("\n");
            sb.append(indent(level)).append("}");
            sb.append(indent(level )).append("]\n");
        }
        return sb.toString();
    }

}
