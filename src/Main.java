
import AST.Python.*;
import antlrPython.*;
import Visitor.PythonVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Main {
    public static void main(String[] args) throws IOException {
        String source = "test/app.py";
        CharStream charStream = CharStreams.fromFileName(source); // من ANTLR
        PythonLexer lexer = new PythonLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PythonParser parser = new PythonParser(tokens);

        ParseTree tree = parser.root(); // هذا ParseTree من ANTLR

        PythonVisitor pythonVisitor = new PythonVisitor(); // instance
        Program program = (Program) pythonVisitor.visit(tree); // نمرر الـ instance و الـ tree

        System.out.println(program);
    }
}
