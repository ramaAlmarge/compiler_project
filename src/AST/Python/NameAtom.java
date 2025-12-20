package AST.Python;

public class NameAtom extends Atom{
    Name name;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NameAtom{" +
                "name=" + name +
                '}';
    }
}
