package AST.Python;

public class Func_def {
    String async;
    String def;
    Name name;
    Typedargslist typedargslist;
    Test test;
    Suite suite;

    public String getAsync() {
        return async;
    }

    public void setAsync(String async) {
        this.async = async;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Typedargslist getTypedargslist() {
        return typedargslist;
    }

    public void setTypedargslist(Typedargslist typedargslist) {
        this.typedargslist = typedargslist;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public Suite getSuite() {
        return suite;
    }

    public void setSuite(Suite suite) {
        this.suite = suite;
    }

    @Override
    public String toString() {
        return "Func_def{" +
                "async='" + async + '\'' +
                ", def='" + def + '\'' +
                ", name=" + name +
                ", typedargslist=" + typedargslist +
                ", test=" + test +
                ", suite=" + suite +
                '}';
    }
}
