package AST.Python;

import java.util.ArrayList;
import java.util.List;

public class Func_def extends Compound_stmt{
     Name name;
     List<Name> params = new ArrayList<>();
     Test returnType;
     Suite suite;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public List<Name> getParams() {
        return params;
    }

    public void addParam(Name param) {
        this.params.add(param);
    }

    public Test getReturnType() {
        return returnType;
    }

    public void setReturnType(Test returnType) {
        this.returnType = returnType;
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
