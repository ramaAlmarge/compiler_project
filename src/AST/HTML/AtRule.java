package AST.HTML;

import java.util.ArrayList;
import java.util.List;

public class AtRule {
    List<ValuePart> valuePart = new ArrayList<>();
    String at_rule;
    List<String> url = new ArrayList<>();
    List<String> id = new ArrayList<>();
    List<Float> number = new ArrayList<>();
    AtRuleBody atRuleBody;

    public List<ValuePart> getValuePart() {
        return valuePart;
    }

    public void setValuePart(List<ValuePart> valuePart) {
        this.valuePart = valuePart;
    }

    public String getAt_rule() {
        return at_rule;
    }

    public void setAt_rule(String at_rule) {
        this.at_rule = at_rule;
    }

    public List<String> getUrl() {
        return url;
    }

    public void setUrl(List<String> url) {
        this.url = url;
    }

    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public List<Float> getNumber() {
        return number;
    }

    public void setNumber(List<Float> number) {
        this.number = number;
    }

    public AtRuleBody getAtRuleBody() {
        return atRuleBody;
    }

    public void setAtRuleBody(AtRuleBody atRuleBody) {
        this.atRuleBody = atRuleBody;
    }

    @Override
    public String toString() {
        return "AtRule{" +
                "valuePart=" + valuePart +
                ", at_rule='" + at_rule + '\'' +
                ", url=" + url +
                ", id=" + id +
                ", number=" + number +
                ", atRuleBody=" + atRuleBody +
                '}';
    }
}
