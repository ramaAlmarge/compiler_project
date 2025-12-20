package AST.HTML;
import java.util.ArrayList;
import java.util.List;

public class Stmt extends Root {

    private List<String> ids = new ArrayList<>();

    public void addId(String id) {
        this.ids.add(id);
    }

    public List<String> getIds() {
        return ids;
    }

    @Override
    public String toString() {
        return "Stmt{" +
                "ids=" + ids +
                '}';
    }
}
