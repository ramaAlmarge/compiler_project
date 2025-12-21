package AST.Python;

public class Expr_stmt extends Small_stmt{
    Test test;
    Assign_part assignPart;

    public Test getTest() { return test; }
    public void setTest(Test test) { this.test = test; }

    public Assign_part getAssignPart() { return assignPart; }
    public void setAssignPart(Assign_part assignPart) { this.assignPart = assignPart; }

    @Override
    public String toString(int level) {
        return "Expr_stmt{" +"\n"+
                "test=" + test +
                ", assignPart=" + assignPart +
                '}';
    }
}
