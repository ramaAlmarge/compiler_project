package AST.HTML;

public class IdentValue implements  ValuePart{
String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "IdentValue{" +
                "id='" + id + '\'' +
                '}';
    }
}
