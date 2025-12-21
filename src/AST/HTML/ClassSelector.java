package AST.HTML;

public class ClassSelector extends Selector {

    private String id;

    public ClassSelector(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString(int level) {
        return "." + id;
    }
}
