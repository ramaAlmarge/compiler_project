package AST.Python;

public class Number extends Root {
    int integer_number;
    float float_number;

    public int getInteger_number() {
        return integer_number;
    }

    public float getFloat_number() {
        return float_number;
    }

    public Number() {

    }

    public void setInteger_number(int integer_number) {
        this.integer_number = integer_number;
    }

    public void setFloat_number(float float_number) {
        this.float_number = float_number;
    }

    @Override
    public String toString() {
        return "Number{" +
                "integer_number=" + integer_number +
                ", float_number=" + float_number +
                '}';
    }
}
