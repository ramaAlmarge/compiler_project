package AST.HTML;

public class DoubleQuoteValue implements ValuePart{
    String double_quote_string;

    public String getDouble_quote_string() {
        return double_quote_string;
    }

    public void setDouble_quote_string(String double_quote_string) {
        this.double_quote_string = double_quote_string;
    }

    @Override
    public String toString() {
        return "DoubleQuoteValue{" +
                "double_quote_string='" + double_quote_string + '\'' +
                '}';
    }
}
