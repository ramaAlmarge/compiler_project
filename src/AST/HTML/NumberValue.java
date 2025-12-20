package AST.HTML;

public class NumberValue implements ValuePart{
Float number;

    public Float getNumber() {
        return number;
    }

    public void setNumber(Float number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "NumberValue{" +
                "number=" + number +
                '}';
    }
}
