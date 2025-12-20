package AST.Python;

import java.util.ArrayList;
import java.util.List;

public class Comparison extends Root{
    public enum CompOp {
        EQUALS,
        NOT_EQUALS,
        IN,
        NOT_IN,
        IS,
        IS_NOT,
        EQ
    }
    List<CompOp> ops = new ArrayList<>();
    List<Expr> expr = new ArrayList<>();

    public void addExpr(Expr e) {
        expr.add(e);
    }

    public void addOp(CompOp op) {
        ops.add(op);
    }

    @Override
    public String toString() {
        return "Comparison{" +
                "exprs=" + expr +
                ", ops=" + ops +
                '}';
    }
}
