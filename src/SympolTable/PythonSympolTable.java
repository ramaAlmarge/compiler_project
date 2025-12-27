package SympolTable;

import java.util.HashMap;
import java.util.Map;

public class PythonSympolTable {
    private Map<String, String> table;

    public PythonSympolTable() {
        table = new HashMap<>();
    }

    public void addVariable(String name) {
        table.put(name, "variable");
    }

    public void addFunction(String name) {
        table.put(name, "function");
    }

    public boolean contains(String name) {
        return table.containsKey(name);
    }

    public Map<String, String> getTable() {
        return table;
    }

    public void printTable() {
        System.out.println("---- Symbol Table ----");
        table.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
