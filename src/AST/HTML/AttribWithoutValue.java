package AST.HTML;

public class AttribWithoutValue implements  Attrib{
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
