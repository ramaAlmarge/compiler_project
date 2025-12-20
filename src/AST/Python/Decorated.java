package AST.Python;

import java.util.ArrayList;
import java.util.List;

public class Decorated extends Root {
     List<Decorator> decorators = new ArrayList<>();
     Compound_stmt compoundStmt;

    public List<Decorator> getDecorators() {
        return decorators;
    }

    public void addDecorator(Decorator decorator) {
        this.decorators.add(decorator);
    }

    public Compound_stmt getCompoundStmt() {
        return compoundStmt;
    }

    public void setCompoundStmt(Compound_stmt compoundStmt) {
        this.compoundStmt = compoundStmt;
    }

    @Override
    public String toString() {
        return "Decorated{" +
                "decorators=" + decorators +
                ", compoundStmt=" + compoundStmt +
                '}';
    }
}
