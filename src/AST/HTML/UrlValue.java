package AST.HTML;

import java.util.ArrayList;
import java.util.List;

public class UrlValue implements  ValuePart{
String url;
List<String> id = new ArrayList<>();
List<Float> number = new ArrayList<>();
List<String> eq = new ArrayList<>();
List<String> and = new ArrayList<>();

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public List<Float> getNumber() {
        return number;
    }

    public void setNumber(List<Float> number) {
        this.number = number;
    }

    public List<String> getEq() {
        return eq;
    }

    public void setEq(List<String> eq) {
        this.eq = eq;
    }

    public List<String> getAnd() {
        return and;
    }

    public void setAnd(List<String> and) {
        this.and = and;
    }

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
