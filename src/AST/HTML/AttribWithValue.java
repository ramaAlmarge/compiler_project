package AST.HTML;

public class AttribWithValue extends Attrib {

    private String id;
    private String operator;
    private String value;

    public AttribWithValue(String id, String operator, String value) {
        this.id = id;
        this.operator = operator;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public String getOperator() {
        return operator;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString(int level) {
        return "[" + id + operator + value + "]";
    }
}
