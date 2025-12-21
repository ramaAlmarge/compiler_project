package AST.HTML;

import java.util.ArrayList;
import java.util.List;

public class Tag_content extends Root {
    List<Ident> ident = new ArrayList<>();
    String id;

    public List<Ident> getIdent() {
        return ident;
    }


    public void addIdent(Ident i) {
        this.ident.add(i);
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
