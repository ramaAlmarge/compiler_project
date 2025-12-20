package AST.HTML;

import java.util.ArrayList;
import java.util.List;

public class Tag {
    Tag_content tag_content;
    List<String> id = new ArrayList<>();

    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public Tag_content getTag_content() {
        return tag_content;
    }

    public void setTag_content(Tag_content tag_content) {
        this.tag_content = tag_content;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "tag_content=" + tag_content +
                ", id=" + id +
                '}';
    }
}
