package AST.HTML;

public class Declaration {
    Property property;
    Value value;

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Declaration{" +
                "property=" + property +
                ", value=" + value +
                '}';
    }
}
