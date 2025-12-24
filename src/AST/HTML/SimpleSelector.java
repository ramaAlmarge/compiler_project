package AST.HTML;

import java.util.ArrayList;
import java.util.List;

public class SimpleSelector extends Selector {

    private Id id;

    private final List<HashSelector> hashes = new ArrayList<>();
    private final List<Id> classes = new ArrayList<>();
    private final List<Attrib> attribs = new ArrayList<>();
    private final List<Pseudo> pseudos = new ArrayList<>();

    public void setTypeSelector(Id id) {
        this.id = id;
    }



    public void addHash(HashSelector hash) {
        hashes.add(hash);
    }

    public void addClass(Id cls) {
        classes.add(cls);
    }

    public void addAttrib(Attrib attrib) {
        attribs.add(attrib);
    }

    public void addPseudo(Pseudo pseudo) {
        pseudos.add(pseudo);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();

        if (id != null) sb.append(id);


        hashes.forEach(sb::append);
        classes.forEach(sb::append);
        attribs.forEach(sb::append);
        pseudos.forEach(sb::append);

        return sb.toString();
    }
}
