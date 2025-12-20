package AST.Python;

public class Import_stmt extends Small_stmt{
    Name name;

    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }

    @Override
    public String toString() {
        return "Import_stmt{" +
                "name=" + name +
                '}';
    }
}
