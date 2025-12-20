package AST.Python;

public class Return_stmt {
    String return_name;
    Testlist testlist;

    public String getReturn_name() {
        return return_name;
    }

    public void setReturn_name(String return_name) {
        this.return_name = return_name;
    }

    public Testlist getTestlist() {
        return testlist;
    }

    public void setTestlist(Testlist testlist) {
        this.testlist = testlist;
    }

    @Override
    public String toString() {
        return "Return_stmt{" +
                "return_name='" + return_name + '\'' +
                ", testlist=" + testlist +
                '}';
    }
}
