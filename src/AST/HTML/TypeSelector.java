package AST.HTML;

public class TypeSelector extends Root {

    private String id; // قد يكون null

    public TypeSelector(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public boolean isUniversal() {
        return id == null;
    }

    @Override
    public String toString(int level) {
        return id == null ? "" : id;
    }
}
