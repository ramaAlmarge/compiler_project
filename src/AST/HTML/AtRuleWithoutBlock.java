package AST.HTML;

public class AtRuleWithoutBlock implements AtRuleBody{
    String semi;

    public String getSemi() {
        return semi;
    }

    public void setSemi(String semi) {
        this.semi = semi;
    }

    @Override
    public String toString() {
        return "AtRuleWithoutBlock{" +
                "semi='" + semi + '\'' +
                '}';
    }
}
