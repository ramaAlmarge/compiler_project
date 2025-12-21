package AST.HTML;

public class AttribWithoutValue extends Attrib {

    private String id;

    public AttribWithoutValue(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString(int level) {
        return "[" + id + "]";
    }
}
