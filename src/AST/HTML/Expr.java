package AST.HTML;

import java.util.ArrayList;
import java.util.List;

public class Expr {
    List<Expr_content> expr_content = new ArrayList<>();

    public List<Expr_content> getExpr_content() {
        return expr_content;
    }

    public void setExpr_content(List<Expr_content> expr_content) {
        this.expr_content = expr_content;
    }

    @Override
    public String toString() {
        return "Expr{" +
                "expr_content=" + expr_content +
                '}';
    }
}
