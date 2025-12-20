package AST.HTML;

public class TypeSelector {
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TypeSelector{" +
                "id='" + id + '\'' +
                '}';
    }
}
