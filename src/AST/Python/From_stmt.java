package AST.Python;

import java.util.ArrayList;
import java.util.List;

public class From_stmt extends Small_stmt {

    private Name module;               // بعد FROM
    private List<Name> imported = new ArrayList<>();  // بعد IMPORT

    public Name getModule() { return module; }
    public void setModule(Name module) { this.module = module; }

    public List<Name> getImported() { return imported; }
    public void addImported(Name n) { this.imported.add(n); }

    @Override
    public String toString() {
        return "From_stmt{" +
                "module=" + module +
                ", imported=" + imported +
                '}';
    }
}
