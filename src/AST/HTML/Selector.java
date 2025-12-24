package AST.HTML;

import java.util.ArrayList;
import java.util.List;

public class Selector extends Root {

    private final List<SimpleSelector> selectors = new ArrayList<>();


    // selectors: s0 c0 s1 c1 s2 ...
    public void addSimpleSelector(SimpleSelector s) {
        selectors.add(s);
    }


    public List<SimpleSelector> getSelectors() {
        return selectors;
    }


    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(selectors.get(0));
        return sb.toString();
    }
}
