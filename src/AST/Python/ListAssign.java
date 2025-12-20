package AST.Python;

public class ListAssign extends Assign_part{
    Small_stmt stmt;

    public Small_stmt getStmt() {
        return stmt;
    }

    public void setStmt(Small_stmt stmt) {
        this.stmt = stmt;
    }

    @Override
    public String toString() {
        return "ListAssign{" +
                "stmt=" + stmt +
                '}';
    }
}
