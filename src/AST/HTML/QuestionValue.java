package AST.HTML;

public class QuestionValue extends ValuePart {

    private String value;

    public QuestionValue() {
        this.value = "?";
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString(int level) {
        return value;
    }
}
