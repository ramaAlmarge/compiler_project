package AST.Python;

import java.util.ArrayList;
import java.util.List;

public class StringAtom extends Root{
    List<String> string= new ArrayList<>();

    public List<String> getString() {
        return string;
    }

    public void setString(List<String> string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "StringAtom{" +
                "string=" + string +
                '}';
    }
}
