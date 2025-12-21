package AST.HTML;

import java.util.ArrayList;
import java.util.List;

public class Program extends Root {
    List<Root> html = new ArrayList<>();

    public List<Root> getStmts() {
        return html;
    }

    public void addHtmlContent(Root stmt) {
        this.html.add(stmt);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();

        sb.append(indent(level)).append("Program {\n");

        for (int i = 0; i < html.size(); i++) {
            sb.append(indent(level)).append("html: [\n");
            sb.append(html.get(i).toString(level + 2));

            if (i < html.size() - 1) {
                sb.append("\n");
            }
            sb.append("\n");
            sb.append(indent(level)).append("}");
            sb.append(indent(level )).append("]\n");
        }
        return sb.toString();
    }

}
