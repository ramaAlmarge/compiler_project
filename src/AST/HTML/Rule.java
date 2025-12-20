package AST.HTML;

import java.util.ArrayList;
import java.util.List;

public class Rule {
    Selector selector;
    List<String> ID = new ArrayList<>();
    List<Declaration> declaration = new ArrayList<>();

    public Selector getSelector() {
        return selector;
    }

    public void setSelector(Selector selector) {
        this.selector = selector;
    }

    public List<String> getID() {
        return ID;
    }

    public void setID(List<String> ID) {
        this.ID = ID;
    }

    public List<Declaration> getDeclaration() {
        return declaration;
    }

    public void setDeclaration(List<Declaration> declaration) {
        this.declaration = declaration;
    }

    @Override
    public String toString() {
        return "Rule{" +
                "selector=" + selector +
                ", ID=" + ID +
                ", declaration=" + declaration +
                '}';
    }
}
