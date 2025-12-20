package AST.Python;

public class Except_clause extends Root{
    Suite suite;

    public Suite getSuite() {
        return suite;
    }

    public void setSuite(Suite suite) {
        this.suite = suite;
    }

    @Override
    public String toString() {
        return "Except_clause{" +
                "suite=" + suite +
                '}';
    }
}
