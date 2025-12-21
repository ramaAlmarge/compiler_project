package AST.HTML;

import java.util.ArrayList;
import java.util.List;

public class SelectorGroup extends Root {

    private final List<Selector> selectors = new ArrayList<>();

    public void addSelector(Selector selector) {
        selectors.add(selector);
    }

    public List<Selector> getSelectors() {
        return selectors;
    }

    @Override
    public String toString(int level) {
        return String.join(", ",
                selectors.stream().map(Object::toString).toList()
        );
    }
}
