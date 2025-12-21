package AST.Python;

import java.util.ArrayList;
import java.util.List;

public class If_stmt extends Compound_stmt{
     String keyword;
     Test condition;
     Suite suite;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Test getCondition() {
        return condition;
    }

    public void setCondition(Test condition) {
        this.condition = condition;
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
