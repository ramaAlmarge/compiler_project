package AST.HTML;

public class Statement extends Root {
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
    public String toString(int level) {
        StringBuilder stringBuilder = new StringBuilder();
        if(stmt != null){
           stringBuilder.append(stmt);
        }
        if(expr != null){
            stringBuilder.append(expr);
        }
        return stringBuilder.toString();
    }
}
