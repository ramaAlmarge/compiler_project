package AST.Python;

import java.util.ArrayList;
import java.util.List;

public class BlockAssign extends Assign_part{
    List<Small_stmt> small_stmt= new ArrayList<>();

    public List<Small_stmt> getSmall_stmt() {
        return small_stmt;
    }

    public void setSmall_stmt(List<Small_stmt> small_stmt) {
        this.small_stmt = small_stmt;
    }

    @Override
    public String toString(int level) {
        return toTreeString(level);
    }
}
