package AST.Python;

import java.util.ArrayList;
import java.util.List;

public class Trailer extends Root{
    Name name;
    ArrayList<Test> test ;

    public Trailer() {
        this.test = new ArrayList<>();
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setTest(Test test) {
        this.test.add(test);
    }

    @Override
    public String toString(int level) {
        return "Trailer{" +
                "name=" + name +
                ", test=" + test +
                '}';
    }
}
