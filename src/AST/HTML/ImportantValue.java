package AST.HTML;

public class ImportantValue extends ValuePart {

    private final String value = "!important";

    public String getValue() {
        return value;
    }

    @Override
    public String toString(int level) {
        return value;
    }
}
