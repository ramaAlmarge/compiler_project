package AST.HTML;

public class DoubleQuoteValue extends ValuePart {

    private String value;

    public DoubleQuoteValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString(int level) {
        return "\"" + value + "\"";
    }
}
