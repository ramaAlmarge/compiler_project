package AST.Python;

import java.util.ArrayList;
import java.util.List;

public class Decorated {
    List<Decorator> decorator = new ArrayList<>();
    Funcdef funcdef;
    Classdef classdef;

    public Classdef getClassdef() {
        return classdef;
    }

    public void setClassdef(Classdef classdef) {
        this.classdef = classdef;
    }

    public List<Decorator> getDecorator() {
        return decorator;
    }

    public void setDecorator(List<Decorator> decorator) {
        this.decorator = decorator;
    }

    public Funcdef getFuncdef() {
        return funcdef;
    }

    public void setFuncdef(Funcdef funcdef) {
        this.funcdef = funcdef;
    }

    @Override
    public String toString() {
        return "Decorated{" +
                "decorator=" + decorator +
                ", funcdef=" + funcdef +
                ", classdef=" + classdef +
                '}';
    }
}
