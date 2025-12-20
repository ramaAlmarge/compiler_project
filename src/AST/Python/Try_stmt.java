package AST.Python;

import java.util.ArrayList;
import java.util.List;

public class Try_stmt extends Compound_stmt{
     Suite trySuite;
     List<Except_clause> exceptClauses = new ArrayList<>();

    public Suite getTrySuite() {
        return trySuite;
    }

    public void setTrySuite(Suite trySuite) {
        this.trySuite = trySuite;
    }

    public List<Except_clause> getExceptClauses() {
        return exceptClauses;
    }

    public void addExceptClause(Except_clause exc) {
        this.exceptClauses.add(exc);
    }

    @Override
    public String toString() {
        return "Try_stmt{" +
                "trySuite=" + trySuite +
                ", exceptClauses=" + exceptClauses +
                '}';
    }
}
