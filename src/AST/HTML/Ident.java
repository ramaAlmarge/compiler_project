package AST.HTML;

public class Ident extends Root {
    String id;
    String eq;
    String doubleQuote;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEq() {
        return eq;
    }

    public void setEq(String eq) {
        this.eq = eq;
    }

    public String getDoubleQuote() {
        return doubleQuote;
    }

    public void setDoubleQuote(String doubleQuote) {
        this.doubleQuote = doubleQuote;
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder("Ident{");
        if (id != null) sb.append("id=").append(id).append(", ");
        if (eq != null) sb.append("eq=").append(eq).append(", ");
        if (doubleQuote != null) sb.append("doubleQuote=").append(doubleQuote);
        sb.append('}');
        return sb.toString();
    }
}
