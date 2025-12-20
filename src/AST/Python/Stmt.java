package AST.Python;

public  class Stmt extends Root{
    Simple_stmt simple_stmt;
    Compound_stmt compound_stmt;
    Decorated decorated;

    public Simple_stmt getSimple_stmt() {
        return simple_stmt;
    }

    public void setSimple_stmt(Simple_stmt simple_stmt) {
        this.simple_stmt = simple_stmt;
    }

    public Compound_stmt getCompound_stmt() {
        return compound_stmt;
    }

    public void setCompound_stmt(Compound_stmt compound_stmt) {
        this.compound_stmt = compound_stmt;
    }

    public Decorated getDecorated() {
        return decorated;
    }

    public void setDecorated(Decorated decorated) {
        this.decorated = decorated;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Stmt{");

        if (simple_stmt != null) {
            sb.append("simple_stmt=").append(simple_stmt);
        }

        if (compound_stmt != null) {
            if (sb.length() > 5) sb.append(", ");
            sb.append("compound_stmt=").append(compound_stmt);
        }

        if (decorated != null) {
            if (sb.length() > 5) sb.append(", ");
            sb.append("decorated=").append(decorated);
        }

        sb.append('}');
        return sb.toString();
    }

}
