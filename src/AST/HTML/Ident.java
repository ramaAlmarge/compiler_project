package AST.HTML;

public class Ident {
    String id;
    String eq;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Ident{");
        if (id != null) {
            sb.append("id=").append(id);
        }
        if (eq != null) {
            sb.append("eq=").append(eq);
        }
        sb.append('}');
        return sb.toString();
    }
}
