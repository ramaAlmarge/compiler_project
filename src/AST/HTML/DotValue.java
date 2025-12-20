package AST.HTML;

public class DotValue implements ValuePart{
    String DOT;

    public String getDOT() {
        return DOT;
    }

    public void setDOT(String DOT) {
        this.DOT = DOT;
    }

    @Override
    public String toString() {
        return "DotValue{" +
                "DOT='" + DOT + '\'' +
                '}';
    }
}
