package AST.HTML;

public class VarProperty extends Property {

    private final String name;

    public VarProperty(String name) {
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
