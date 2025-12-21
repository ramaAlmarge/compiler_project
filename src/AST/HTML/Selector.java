package AST.HTML;

import java.util.ArrayList;
import java.util.List;

public class Selector extends Root {

    private final List<SimpleSelector> selectors = new ArrayList<>();
    private final List<Combinator> combinators = new ArrayList<>();

    // selectors: s0 c0 s1 c1 s2 ...
    public void addSimpleSelector(SimpleSelector s) {
        selectors.add(s);
    }

    public void addCombinator(Combinator c) {
        combinators.add(c);
    }

    public List<SimpleSelector> getSelectors() {
        return selectors;
    }

    public List<Combinator> getCombinators() {
        return combinators;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(selectors.get(0));
        for (int i = 0; i < combinators.size(); i++) {
            sb.append(" ")
                    .append(combinators.get(i))
                    .append(" ")
                    .append(selectors.get(i + 1));
        }

        return sb.toString();
    }
}
