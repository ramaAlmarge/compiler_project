package AST.HTML;

public class VarProperty implements Property{
    String var;

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return "VarProperty{" +
                "var='" + var + '\'' +
                '}';
    }
}
