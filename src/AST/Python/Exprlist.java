package AST.Python;

import java.util.ArrayList;
import java.util.List;

public class Exprlist {
    List<Expr> expr = new ArrayList<>();

    public List<Expr> getExpr() {
        return expr;
    }

    public void setExpr(List<Expr> expr) {
        this.expr = expr;
    }

    @Override
    public String toString() {
        return "Exprlist{" +
                "expr=" + expr +
                '}';
    }
}
