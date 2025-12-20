package AST.HTML;

public class Declaration extends Root {

    private final Property property;
    private final Value value;

    public Declaration(Property property, Value value) {
        this.property = property;
        this.value = value;
    }

    public Property getProperty() {
        return property;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public String toString() {
        return property + " : " + value + ";";
    }
}
