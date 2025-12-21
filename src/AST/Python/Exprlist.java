package AST.Python;

import java.util.ArrayList;
import java.util.List;

public class Exprlist extends Root{
    List<Expr> exprs = new ArrayList<>();

    public List<Expr> getExprs() {
        return exprs;
    }

    public void addExpr(Expr e) {
        this.exprs.add(e);
    }

    @Override
    public String toString(int level) {
        return toTreeString(level);
    }
}
