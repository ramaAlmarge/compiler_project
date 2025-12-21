package AST.Python;

import java.util.ArrayList;
import java.util.List;

public class AnnotatedAssign extends Assign_part {
    Test test;
    List<Test> defaultValues = new ArrayList<>();

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public List<Test> getDefaultValues() { return defaultValues; }

    public void addDefaultValue(Test t) { this.defaultValues.add(t); }

    @Override
    public String toString(int level) {
        return "AnnotatedAssign{" +
                "test=" + test +
                ", defaultValues=" + defaultValues +
                '}';
    }
}
