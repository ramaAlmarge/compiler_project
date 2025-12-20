package AST.Python;

public class ListAtom extends Root{
    Testlist_comp testlist_comp;


    public Testlist_comp getTestlist_comp() {
        return testlist_comp;
    }

    public void setTestlist_comp(Testlist_comp testlist_comp) {
        this.testlist_comp = testlist_comp;
    }


    @Override
    public String toString() {
        return "listAtom{" +"["+
                 testlist_comp +"]"+
                '}';
    }
}
