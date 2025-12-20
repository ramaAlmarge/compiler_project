package AST.Python;

public class Expr_stmt {
    Testlist_star_expr testlist_star_expr;
    Assign_part assign_part;

    public Assign_part getAssign_part() {
        return assign_part;
    }

    public void setAssign_part(Assign_part assign_part) {
        this.assign_part = assign_part;
    }

    public Testlist_star_expr getTestlist_star_expr() {
        return testlist_star_expr;
    }

    public void setTestlist_star_expr(Testlist_star_expr testlist_star_expr) {
        this.testlist_star_expr = testlist_star_expr;
    }

    @Override
    public String toString() {
        return "Expr_stmt{" +
                "testlist_star_expr=" + testlist_star_expr +
                ", assign_part=" + assign_part +
                '}';
    }
}
