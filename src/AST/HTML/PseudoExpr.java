package AST.HTML;

import java.util.ArrayList;
import java.util.List;

public class PseudoExpr {

    private final List<PseudoExprPart> parts = new ArrayList<>();

    public void addPart(PseudoExprPart part) {
        parts.add(part);
    }

    public List<PseudoExprPart> getParts() {
        return parts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (PseudoExprPart part : parts) {
            sb.append(part);
        }
        return sb.toString();
    }
}
