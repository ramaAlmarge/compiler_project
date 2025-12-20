package AST.HTML;

public class Expr_content extends Root {
    String id;
    Float number;
    String or;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Float getNumber() {
        return number;
    }

    public void setNumber(Float number) {
        this.number = number;
    }

    public String getOr() {
        return or;
    }

    public void setOr(String or) {
        this.or = or;
    }

    @Override
    public String toString() {
        return "Expr_content{" +
                "id='" + id + '\'' +
                ", number=" + number +
                ", or='" + or + '\'' +
                '}';
    }
}
