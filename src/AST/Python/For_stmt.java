package AST.Python;

import java.util.ArrayList;
import java.util.List;

public class For_stmt extends Compound_stmt {
     Exprlist targets;
     List<Test> iterables = new ArrayList<>();
     Suite suite;

    public Exprlist getTargets() {
        return targets;
    }

    public void setTargets(Exprlist targets) {
        this.targets = targets;
    }

    public List<Test> getIterables() {
        return iterables;
    }

    public void addIterable(Test t) {
        this.iterables.add(t);
    }

    public Suite getSuite() {
        return suite;
    }

    public void setSuite(Suite suite) {
        this.suite = suite;
    }

    @Override
    public String toString(int level) {
        return toTreeString(level);
    }
}
