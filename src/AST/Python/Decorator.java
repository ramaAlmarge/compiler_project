package AST.Python;

import java.util.ArrayList;
import java.util.List;

public class Decorator extends Root {
     List<Name> names = new ArrayList<>();
     List<Test> args = new ArrayList<>();

    public List<Name> getNames() {
        return names;
    }

    public void addName(Name name) {
        this.names.add(name);
    }

    public List<Test> getArgs() {
        return args;
    }

    public void addArg(Test t) {
        this.args.add(t);
    }

    @Override
    public String toString(int level) {
        return "Decorator{" +
                "names=" + names +
                ", args=" + args +
                '}';
    }
}
