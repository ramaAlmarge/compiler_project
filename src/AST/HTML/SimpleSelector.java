package AST.HTML;

import java.util.ArrayList;
import java.util.List;

public class SimpleSelector extends Selector {

    private TypeSelector typeSelector;
    private Universal universal;

    private final List<HashSelector> hashes = new ArrayList<>();
    private final List<Class> classes = new ArrayList<>();
    private final List<Attrib> attribs = new ArrayList<>();
    private final List<Pseudo> pseudos = new ArrayList<>();

    public void setTypeSelector(TypeSelector typeSelector) {
        this.typeSelector = typeSelector;
    }

    public void setUniversal(Universal universal) {
        this.universal = universal;
    }

    public void addHash(HashSelector hash) {
        hashes.add(hash);
    }

    public void addClass(Class cls) {
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

        if (typeSelector != null) sb.append(typeSelector);
        if (universal != null) sb.append(universal);

        hashes.forEach(sb::append);
        classes.forEach(sb::append);
        attribs.forEach(sb::append);
        pseudos.forEach(sb::append);

        return sb.toString();
    }
}
