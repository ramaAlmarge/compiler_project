package AST.HTML;

public class NumberValue extends ValuePart {

    private final Float number;
    private final String unit;

    public NumberValue(Float number, String unit) {
        this.number = number;
        this.unit = unit;
    }

    public Float getNumber() {
        return number;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        if (unit != null && !unit.isEmpty()) {
            return number + unit;
        } else {
            return number.toString();
        }
    }
}
