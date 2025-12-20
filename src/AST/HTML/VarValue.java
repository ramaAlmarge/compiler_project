package AST.HTML;

public class VarValue implements ValuePart{
String var;

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return "VarValue{" +
                "var='" + var + '\'' +
                '}';
    }
}
