package AST.HTML;

import java.util.ArrayList;
import java.util.List;

public class Value {
    List<ValuePart> valuePart = new ArrayList<>();

    public List<ValuePart> getValuePart() {
        return valuePart;
    }

    public void setValuePart(List<ValuePart> valuePart) {
        this.valuePart = valuePart;
    }

    @Override
    public String toString() {
        return "Value{" +
                "valuePart=" + valuePart +
                '}';
    }
}
