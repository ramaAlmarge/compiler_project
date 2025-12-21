package AST.Python;

public class ListAssign extends Assign_part{
    private Simple_stmt stmt;

    public void setStmt(Simple_stmt stmt) {
        this.stmt = stmt;
    }

    @Override
    public String toString(int level) {
        return toTreeString(level);
    }
}
