package AST.HTML;

public class Jinja2 {
    Statement statement;

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    @Override
    public String toString() {
        return "Jinja2{" +
                "statement=" + statement +
                '}';
    }
}
