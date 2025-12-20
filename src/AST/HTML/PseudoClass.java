package AST.HTML;

public class PseudoClass implements Pseudo{
    String id;
    PseudoExpr pseudoExpr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PseudoExpr getPseudoExpr() {
        return pseudoExpr;
    }

    public void setPseudoExpr(PseudoExpr pseudoExpr) {
        this.pseudoExpr = pseudoExpr;
    }

    @Override
    public String toString() {
        return "PseudoClass{" +
                "id='" + id + '\'' +
                ", pseudoExpr=" + pseudoExpr +
                '}';
    }
}
