package AST.HTML;

import java.util.ArrayList;
import java.util.List;

public class Value extends Root {

    private final List<ValuePart> valueParts = new ArrayList<>();

    public List<ValuePart> getValueParts() {
        return valueParts;
    }

    public void addValuePart(ValuePart part) {
        valueParts.add(part);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (ValuePart vp : valueParts) {
            sb.append(vp);
        }
        return sb.toString();
    }
}
