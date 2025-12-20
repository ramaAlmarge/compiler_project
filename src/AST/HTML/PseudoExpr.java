package AST.HTML;

import java.util.ArrayList;
import java.util.List;

public class PseudoExpr {
    List<Float> number = new ArrayList<>();
    List<String> id = new ArrayList<>();
    List<String> not = new ArrayList<>();
    List<Pseudo> pseudo = new ArrayList<>() ;

    public List<Pseudo> getPseudo() {
        return pseudo;
    }

    public void setPseudo(List<Pseudo> pseudo) {
        this.pseudo = pseudo;
    }

    public List<String> getNot() {
        return not;
    }

    public void setNot(List<String> not) {
        this.not = not;
    }

    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public List<Float> getNumber() {
        return number;
    }

    public void setNumber(List<Float> number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "PseudoExpr{" +
                "number=" + number +
                ", id=" + id +
                ", not=" + not +
                ", pseudo=" + pseudo +
                '}';
    }
}
