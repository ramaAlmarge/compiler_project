package AST.Python;

public class Decorator {
    Dotted_name dotted_name;
    Arglist arglist;

    public Dotted_name getDotted_name() {
        return dotted_name;
    }

    public void setDotted_name(Dotted_name dotted_name) {
        this.dotted_name = dotted_name;
    }

    public Arglist getArglist() {
        return arglist;
    }

    public void setArglist(Arglist arglist) {
        this.arglist = arglist;
    }

    @Override
    public String toString() {
        return "Decorator{" +
                "dotted_name=" + dotted_name +
                ", arglist=" + arglist +
                '}';
    }
}
