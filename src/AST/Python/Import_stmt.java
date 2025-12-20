package AST.Python;

public class Import_stmt {
    String import_name;
    Dotted_as_names dotted_as_names;

    public String getImport_name() {
        return import_name;
    }

    public void setImport_name(String import_name) {
        this.import_name = import_name;
    }

    public Dotted_as_names getDotted_as_names() {
        return dotted_as_names;
    }

    public void setDotted_as_names(Dotted_as_names dotted_as_names) {
        this.dotted_as_names = dotted_as_names;
    }

    @Override
    public String toString() {
        return "Import_stmt{" +
                "import_name='" + import_name + '\'' +
                ", dotted_as_names=" + dotted_as_names +
                '}';
    }
}
