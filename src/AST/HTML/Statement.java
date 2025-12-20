package AST.HTML;

public class Statement {
    Stmt stmt;
    Expr expr;

    public Stmt getStmt() {
        return stmt;
    }

    public void setStmt(Stmt stmt) {
        this.stmt = stmt;
    }

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Statement{");
        if (stmt != null) {
            sb.append("stmt=").append(stmt);
        }
        if (expr != null) {
            sb.append("expr=").append(expr);
        }
        sb.append('}');
        return sb.toString();
    }
}
