package AST.HTML;

import java.util.ArrayList;
import java.util.List;

public class UrlValue extends ValuePart {

    private String url;
    private List<String> id = new ArrayList<>();
    private List<Float> number = new ArrayList<>();
    private List<String> eq = new ArrayList<>();
    private List<String> and = new ArrayList<>();

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }

    public List<String> getId() { return id; }
    public void addId(String id) { this.id.add(id); }

    public List<Float> getNumber() { return number; }
    public void addNumber(Float number) { this.number.add(number); }

    public List<String> getEq() { return eq; }
    public void addEq(String eq) { this.eq.add(eq); }

    public List<String> getAnd() { return and; }
    public void addAnd(String and) { this.and.add(and); }

    @Override
    public String toString() {
        return "UrlValue{" +
                "url='" + url + '\'' +
                ", id=" + id +
                ", number=" + number +
                ", eq=" + eq +
                ", and=" + and +
                '}';
    }
}
