package AST.HTML;

public class IdentValue extends ValuePart {

    private final String name;

    public IdentValue(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
