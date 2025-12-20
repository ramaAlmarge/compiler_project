package AST.HTML;

import java.util.ArrayList;
import java.util.List;

public class Stmt {
    List<String> id = new ArrayList<>();

    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Stmt{" +
                "id=" + id +
                '}';
    }
}
