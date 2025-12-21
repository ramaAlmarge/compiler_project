package AST.HTML;

import java.util.ArrayList;
import java.util.List;

public class Tag extends Root {
    Tag_content tag_content;
    List<String> id = new ArrayList<>();

    public Tag_content getTag_content() {
        return tag_content;
    }

    public void setTag_content(Tag_content tag_content) {
        this.tag_content = tag_content;
    }

    public List<String> getId() {
        return id;
    }

    // لإضافة عنصر واحد في كل مرة
    public void addId(String id) {
        this.id.add(id);
    }

    @Override
    public String toString(int level) {
        return "Tag{" +
                "tag_content=" + tag_content +
                ", id=" + id +
                '}';
    }
}
