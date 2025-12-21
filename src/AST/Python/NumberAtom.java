package AST.Python;

public class NumberAtom extends Atom {
    Number number;
    boolean isNegative = false;


    public void setNegative(boolean negative) {
        isNegative = negative;
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    @Override
    public String toString(int level) {
        return "NumberAtom{" +
                "value=" + (isNegative ? "-" : "") + number +
                '}';
    }
}
