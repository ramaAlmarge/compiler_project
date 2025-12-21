package AST.Python;

import java.util.ArrayList;
import java.util.List;

public class Return_stmt extends Small_stmt {
    List<Test> values = new ArrayList<>(); // القيم المرجعة

    public List<Test> getValues() {
        return values;
    }

    public void addValue(Test t) {
        this.values.add(t);
    }

    @Override
    public String toString(int level) {
        return toTreeString(level);
    }
}
