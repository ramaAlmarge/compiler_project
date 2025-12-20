package AST.HTML;

public class EqualsValue implements ValuePart{
    String eq;

    public String getEq() {
        return eq;
    }

    public void setEq(String eq) {
        this.eq = eq;
    }

    @Override
    public String toString() {
        return "EqualsValue{" +
                "eq='" + eq + '\'' +
                '}';
    }
}
