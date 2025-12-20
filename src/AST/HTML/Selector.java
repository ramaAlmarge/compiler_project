package AST.HTML;

import java.util.ArrayList;
import java.util.List;

public class Selector {
List<SimpleSelector> simpleSelector = new ArrayList<>();
List<Combinator> combinator = new ArrayList<>();
    Selector selector;

    public List<SimpleSelector> getSimpleSelector() {
        return simpleSelector;
    }

    public void setSimpleSelector(List<SimpleSelector> simpleSelector) {
        this.simpleSelector = simpleSelector;
    }

    public List<Combinator> getCombinator() {
        return combinator;
    }

    public void setCombinator(List<Combinator> combinator) {
        this.combinator = combinator;
    }

    public Selector getSelector() {
        return selector;
    }

    public void setSelector(Selector selector) {
        this.selector = selector;
    }

    @Override
    public String toString() {
        return "Selector{" +
                "simpleSelector=" + simpleSelector +
                ", combinator=" + combinator +
                ", selector=" + selector +
                '}';
    }
}
