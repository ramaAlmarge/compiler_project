package AST.HTML;

public class Class {
    String dot;
    String id;

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Class{" +
                "dot='" + dot + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
