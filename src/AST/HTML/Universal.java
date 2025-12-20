package AST.HTML;

public class Universal {
    String star;

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    @Override
    public String toString() {
        return "Universal{" +
                "star='" + star + '\'' +
                '}';
    }
}
