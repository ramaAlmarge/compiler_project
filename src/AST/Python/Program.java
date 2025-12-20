package AST.Python;

import java.util.ArrayList;

public class Program {
    ArrayList<Root> program;

    public Program() {
        this.program = new ArrayList<>();
    }

    public void setProgram(Root program) {
        this.program.add(program);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Root program : this.program){
            stringBuilder.append(program);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
