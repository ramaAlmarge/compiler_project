package AST.HTML;

public class IdentProperty extends Property {

    private final String id;

    public IdentProperty(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString(int level) {
        return id;
    }
}
