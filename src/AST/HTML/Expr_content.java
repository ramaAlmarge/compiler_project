package AST.HTML;

public class Expr_content extends Root {

    public enum ExprType {
        ID,
        NUMBER,
        STRING,
        OR,
        LPAREN,
        RPAREN,
        COLON,
        LBRACK,
        RBRACK,
        PIPE,
        TILDE,
        TAG_CLOSE
    }

    private ExprType type;
    private String value;

    public Expr_content(ExprType type, String value) {
        this.type = type;
        this.value = value;
    }

    public ExprType getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString(int level) {
        return "Expr_content{" +
                "type=" + type +
                ", value='" + value + '\'' +
                '}';
    }
}
