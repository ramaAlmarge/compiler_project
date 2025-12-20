package AST.Python;

public class ParenAtom extends Atom {
    Testlist_comp testlist_comp;

    public Testlist_comp getTestlist_comp() {
        return testlist_comp;
    }

    public void setTestlist_comp(Testlist_comp testlist_comp) {
        this.testlist_comp = testlist_comp;
    }

    @Override
    public String toString() {
        return "ParenAtom{" +
                "(" + testlist_comp +")"+
                '}';
    }
}
