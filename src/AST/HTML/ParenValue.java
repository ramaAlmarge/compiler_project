package AST.HTML;

public class ParenValue implements ValuePart{
    Value value;

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ParenValue{" +
                "value=" + value +
                '}';
    }
}
