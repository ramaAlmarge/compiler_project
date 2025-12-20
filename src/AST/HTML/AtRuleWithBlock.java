package AST.HTML;

import java.util.ArrayList;
import java.util.List;

public class AtRuleWithBlock implements AtRuleBody{
    List<Rule> rule = new ArrayList<>();
    List<Declaration> declaration = new ArrayList<>();
    List<AtRule> atRule = new ArrayList<>();

    public List<Rule> getRule() {
        return rule;
    }

    public void setRule(List<Rule> rule) {
        this.rule = rule;
    }

    public List<Declaration> getDeclaration() {
        return declaration;
    }

    public void setDeclaration(List<Declaration> declaration) {
        this.declaration = declaration;
    }

    public List<AtRule> getAtRule() {
        return atRule;
    }

    public void setAtRule(List<AtRule> atRule) {
        this.atRule = atRule;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AtRuleWithBlock{");
        if (rule != null) {
            sb.append("rule=").append(rule);
        }
        if (declaration != null) {
            sb.append("declaration=").append(declaration);
        }
        if (atRule != null) {
            sb.append("atRule=").append(atRule);
        }
        sb.append('}');
        return sb.toString();
    }
}
