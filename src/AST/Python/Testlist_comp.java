package AST.Python;

import java.util.ArrayList;
import java.util.List;

public class Testlist_comp extends Root{
    List<Test> test =new ArrayList<>();


    public List<Test> getTest() {
        return test;
    }

    public void setTest(List<Test> test) {
        this.test = test;
    }

    @Override
    public String toString(int level) {
        return toTreeString(level);
    }
}
