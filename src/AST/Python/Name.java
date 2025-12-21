package AST.Python;

public class Name extends Root {
    String name;
    String true_name;
    String false_name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrue_name() {
        return true_name;
    }

    public void setTrue_name(String true_name) {
        this.true_name = true_name;
    }

    public String getFalse_name() {
        return false_name;
    }

    public void setFalse_name(String false_name) {
        this.false_name = false_name;
    }

    @Override
    public String toString(int level) {
        return toTreeString(level);
    }
}
