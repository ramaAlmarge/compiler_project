package AST.HTML;

public class Html_content {
    Tag tag;
    Style style;
    Jinja2 jinja2;

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public Jinja2 getJinja2() {
        return jinja2;
    }

    public void setJinja2(Jinja2 jinja2) {
        this.jinja2 = jinja2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Html_content{");
        if (tag != null) {
            sb.append("tag=").append(tag);
        }
        if (style != null) {
            sb.append("style=").append(style);
        }
        if (jinja2 != null) {
            sb.append("jinja2=").append(jinja2);
        }
        sb.append('}');
        return sb.toString();

    }
}
