package AST.HTML;

import java.util.ArrayList;
import java.util.List;

public class Tag_content {
    List<Ident> ident = new ArrayList<>();
    String id;

    public List<Ident> getIdent() {
        return ident;
    }

    public void setIdent(List<Ident> ident) {
        this.ident = ident;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Tag_content{" +
                "ident=" + ident +
                ", id='" + id + '\'' +
                '}';
    }
}
