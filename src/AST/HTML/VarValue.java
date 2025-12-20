package AST.HTML;

public class VarValue extends ValuePart {

    private final String name;

    public VarValue(String name) {
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
