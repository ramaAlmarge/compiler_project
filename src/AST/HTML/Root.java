package AST.HTML;

import java.util.ArrayList;
import java.util.List;

public class Root {
    List<Html_content> html_content = new ArrayList<>();

    public List<Html_content> getHtml_content() {
        return html_content;
    }

    public void addHtml_content(Html_content hc) {
        this.html_content.add(hc);
    }

    @Override
    public String toString() {
        return "Root{" +
                "html_content=" + html_content +
                '}';
    }
}
