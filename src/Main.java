
import AST.Python.Program;
import AST.Python.Root;
import antlrPython.*;
import Visitor.PythonVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Main {
    public static void main(String[] args) throws IOException {
        Program program = new Program();
        System.out.println(program);
//        String source = "test/app.py";
//        CharStream charStream = fromFileName(source);
//        PythonLexer lexer = new PythonLexer(charStream);
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        PythonParser parser = new PythonParser(tokens);
//        ParseTree ast = parser.root();
//        PythonVisitor pythonVisitor = new PythonVisitor();
//        Program program = (Program) PythonVisitor.visit(ast);
//        System.out.println(program);
    }
}
