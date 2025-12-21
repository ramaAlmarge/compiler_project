package AST.Python;

import java.util.ArrayList;
import java.util.List;

public class Test extends Root {
    ArrayList<Test>test;
    Comparison comparison;

    public Test() {
        this.test = new ArrayList<>();
    }

    public void setTest(Test test) {
        this.test.add(test);
    }

    public void setComparison(Comparison comparison) {
        this.comparison = comparison;
    }

    @Override
    public String toString(int level) {

        return "Test{" +
                "test=" + test +
                ", comparison=" + comparison +
                '}';
    }
}
