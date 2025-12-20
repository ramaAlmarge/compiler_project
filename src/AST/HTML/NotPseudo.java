package AST.HTML;

public class NotPseudo implements  Pseudo{
 String not;
    PseudoExpr pseudoExpr;

    public String getNot() {
        return not;
    }

    public void setNot(String not) {
        this.not = not;
    }

    public PseudoExpr getPseudoExpr() {
        return pseudoExpr;
    }

    public void setPseudoExpr(PseudoExpr pseudoExpr) {
        this.pseudoExpr = pseudoExpr;
    }

    @Override
    public String toString() {
        return "NotPseudo{" +
                "not='" + not + '\'' +
                ", pseudoExpr=" + pseudoExpr +
                '}';
    }
}
