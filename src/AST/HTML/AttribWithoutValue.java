package AST.HTML;

public class AttribWithoutValue extends   Attrib{
 String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AttribWithoutValue{" +
                "id='" + id + '\'' +
                '}';
    }
}
