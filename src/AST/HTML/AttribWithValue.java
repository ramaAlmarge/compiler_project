package AST.HTML;

import java.util.ArrayList;
import java.util.List;

public class AttribWithValue extends Attrib{
List<String> ID = new ArrayList<>();
String eq;
String TILDE_EQUALS;
String PIPE_EQUALS;
String CARET_EQUALS;
String DOLLAR_EQUALS;
String STAR_EQUALS;

    public List<String> getID() {
        return ID;
    }

    public void setID(List<String> ID) {
        this.ID = ID;
    }

    public String getEq() {
        return eq;
    }

    public void setEq(String eq) {
        this.eq = eq;
    }

    public String getTILDE_EQUALS() {
        return TILDE_EQUALS;
    }

    public void setTILDE_EQUALS(String TILDE_EQUALS) {
        this.TILDE_EQUALS = TILDE_EQUALS;
    }

    public String getPIPE_EQUALS() {
        return PIPE_EQUALS;
    }

    public void setPIPE_EQUALS(String PIPE_EQUALS) {
        this.PIPE_EQUALS = PIPE_EQUALS;
    }

    public String getDOLLAR_EQUALS() {
        return DOLLAR_EQUALS;
    }

    public void setDOLLAR_EQUALS(String DOLLAR_EQUALS) {
        this.DOLLAR_EQUALS = DOLLAR_EQUALS;
    }

    public String getCARET_EQUALS() {
        return CARET_EQUALS;
    }

    public void setCARET_EQUALS(String CARET_EQUALS) {
        this.CARET_EQUALS = CARET_EQUALS;
    }

    public String getSTAR_EQUALS() {
        return STAR_EQUALS;
    }

    public void setSTAR_EQUALS(String STAR_EQUALS) {
        this.STAR_EQUALS = STAR_EQUALS;
    }

    @Override
    public String toString() {
        return "AttribWithValue{" +
                "ID=" + ID +
                ", eq='" + eq + '\'' +
                ", TILDE_EQUALS='" + TILDE_EQUALS + '\'' +
                ", PIPE_EQUALS='" + PIPE_EQUALS + '\'' +
                ", CARET_EQUALS='" + CARET_EQUALS + '\'' +
                ", DOLLAR_EQUALS='" + DOLLAR_EQUALS + '\'' +
                ", STAR_EQUALS='" + STAR_EQUALS + '\'' +
                '}';
    }
}
