package SympolTable;

import java.util.*;

public class HTMLSympolTable {

    static class Scope {
        Scope parent;
        String name;
        Map<String, String> symbols = new HashMap<>();

        Scope(Scope parent, String name) {
            this.parent = parent;
            this.name = name;
        }

        void define(String name, String type){
            symbols.put(name, type);
        }

        boolean resolve(String name){
            if(symbols.containsKey(name)) return true;
            return parent != null && parent.resolve(name);
        }
    }

    Scope current = new Scope(null, "global");

    public void enter(String name){
        current = new Scope(current, name);
    }

    public void exit(){
        current = current.parent;
    }

    public void define(String name, String type){
        current.define(name, type);
    }

    public boolean exists(String name){
        return current.resolve(name);
    }
}
