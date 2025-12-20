package AST.Python;

import java.util.ArrayList;
import java.util.List;

public class AtomExpr extends Expr {
    Root atom;
    List<Trailer> trailers = new ArrayList<>();

    public void setAtom(Root atom) {
        this.atom = atom;
    }

    public void addTrailer(Trailer trailer) {
        this.trailers.add(trailer);
    }

    @Override
    public String toString() {
        return "AtomExpr{" +
                "atom=" + atom +
                ", trailers=" + trailers +
                '}';
    }
}
