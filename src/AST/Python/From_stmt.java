package AST.Python;

import java.util.ArrayList;
import java.util.List;

public class From_stmt extends Small_stmt {
    List<Name> name = new ArrayList<>();

    public List<Name> getName() {
        return name;
    }

    public void setName(List<Name> name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("from");
        stringBuilder.append(name);
        stringBuilder.append("import");
        if (name !=null){
            stringBuilder.append(name);
        }
        return stringBuilder.toString();
    }
}