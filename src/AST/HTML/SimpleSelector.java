package AST.HTML;

import java.util.ArrayList;
import java.util.List;

public class SimpleSelector {
    TypeSelector typeSelector;
    Universal universal;
    List<Class> class_name = new ArrayList<>();
    List<Attrib> attrib = new ArrayList<>();
    List<Pseudo> pseudo = new ArrayList<>();

    public TypeSelector getTypeSelector() {
        return typeSelector;
    }

    public void setTypeSelector(TypeSelector typeSelector) {
        this.typeSelector = typeSelector;
    }

    public Universal getUniversal() {
        return universal;
    }

    public void setUniversal(Universal universal) {
        this.universal = universal;
    }

    public List<Class> getClass_name() {
        return class_name;
    }

    public void setClass_name(List<Class> class_name) {
        this.class_name = class_name;
    }

    public List<Attrib> getAttrib() {
        return attrib;
    }

    public void setAttrib(List<Attrib> attrib) {
        this.attrib = attrib;
    }

    public List<Pseudo> getPseudo() {
        return pseudo;
    }

    public void setPseudo(List<Pseudo> pseudo) {
        this.pseudo = pseudo;
    }

    @Override
    public String toString() {
        return "SimpleSelector{" +
                "typeSelector=" + typeSelector +
                ", universal=" + universal +
                ", class_name=" + class_name +
                ", attrib=" + attrib +
                ", pseudo=" + pseudo +
                '}';
    }
}
