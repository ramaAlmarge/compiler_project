package Visitor;

import AST.Python.*;
import AST.Python.Number;
import antlrPython.*;

import java.util.List;

public class PythonVisitor extends PythonParserBaseVisitor {
    @Override
    public Object visitRoot(PythonParser.RootContext ctx) {
        return super.visitRoot(ctx);
    }

    @Override
    public Object visitStmt(PythonParser.StmtContext ctx) {
        return super.visitStmt(ctx);
    }

    @Override
    public Object visitSimple_stmt_line(PythonParser.Simple_stmt_lineContext ctx) {
        return super.visitSimple_stmt_line(ctx);
    }

    @Override
    public Object visitSimple_stmt_block(PythonParser.Simple_stmt_blockContext ctx) {
        return super.visitSimple_stmt_block(ctx);
    }

    @Override
    public Object visitDecorated(PythonParser.DecoratedContext ctx) {
        return super.visitDecorated(ctx);
    }

    @Override
    public Object visitIf_stmt(PythonParser.If_stmtContext ctx) {
        return super.visitIf_stmt(ctx);
    }

    @Override
    public Object visitWhile_stmt(PythonParser.While_stmtContext ctx) {

        return super.visitWhile_stmt(ctx);
    }

    @Override
    public Object visitFor_stmt(PythonParser.For_stmtContext ctx) {
        return super.visitFor_stmt(ctx);
    }

    @Override
    public Object visitTry_stmt(PythonParser.Try_stmtContext ctx) {
        return super.visitTry_stmt(ctx);
    }

    @Override
    public Object visitWith_stmt(PythonParser.With_stmtContext ctx) {
        return super.visitWith_stmt(ctx);
    }

    @Override
    public Object visitFunc_def(PythonParser.Func_defContext ctx) {
        return super.visitFunc_def(ctx);
    }

    @Override
    public Object visitSuite(PythonParser.SuiteContext ctx) {
        return super.visitSuite(ctx);
    }

    @Override
    public Object visitDecorator(PythonParser.DecoratorContext ctx) {
        return super.visitDecorator(ctx);
    }

    @Override
    public Object visitWith_item(PythonParser.With_itemContext ctx) {
        return super.visitWith_item(ctx);
    }

    @Override
    public Object visitExcept_clause(PythonParser.Except_clauseContext ctx) {
        return super.visitExcept_clause(ctx);
    }

    @Override
    public Object visitExprlist(PythonParser.ExprlistContext ctx) {
        return super.visitExprlist(ctx);
    }

    @Override
    public Object visitExpr_stmt(PythonParser.Expr_stmtContext ctx) {
        return super.visitExpr_stmt(ctx);
    }

    @Override
    public Object visitReturn_stmt(PythonParser.Return_stmtContext ctx) {
        return super.visitReturn_stmt(ctx);
    }

    @Override
    public Object visitImport_stmt(PythonParser.Import_stmtContext ctx) {
        return super.visitImport_stmt(ctx);
    }

    @Override
    public Object visitFrom_stmt(PythonParser.From_stmtContext ctx) {
        return super.visitFrom_stmt(ctx);
    }

    @Override
    public Assign_part visitAnnotatedAssign(PythonParser.AnnotatedAssignContext ctx) {
        AnnotatedAssign node = new AnnotatedAssign();
        node.setTest((Test) visit(ctx.test(0)));
        if (ctx.EQ() != null) {
            for (int i = 1; i < ctx.test().size(); i++) {
                node.addDefaultValue((Test) visit(ctx.test(i)));
            }
        }
        return node;
    }

    @Override
    public Assign_part visitListAssign(PythonParser.ListAssignContext ctx) {
        ListAssign node = new ListAssign();
        node.setStmt((Small_stmt) visit(ctx.simple_stmt()));
        return node;
    }

    @Override
    public Assign_part visitBlockAssign(PythonParser.BlockAssignContext ctx) {
        BlockAssign node = new BlockAssign();
        node.getSmall_stmt().add((Small_stmt) visit(ctx.small_stmt(0)));
        for (int i = 1; i < ctx.small_stmt().size(); i++) {
            node.getSmall_stmt().add((Small_stmt) visit(ctx.small_stmt(i)));
        }
        return node;
    }

    @Override
    public Root visitTest(PythonParser.TestContext ctx) {
        Test node = new Test();
        if (ctx.comparison() != null) {
            node.setComparison((Comparison) visit(ctx.comparison()));
            return node;
        }
        if (ctx.NOT() != null) {
            Test innerTest = (Test) visit(ctx.test(0));
            node.setTest(innerTest);
            return node;
        }
        if (ctx.AND() != null) {
            Test left = (Test) visit(ctx.test(0));
            Test right = (Test) visit(ctx.test(1));
            node.setTest(left);
            node.setTest(right);
            return node;
        }
        if (ctx.OR() != null) {
            Test left = (Test) visit(ctx.test(0));
            Test right = (Test) visit(ctx.test(1));
            node.setTest(left);
            node.setTest(right);
            return node;
        }
        return null;
    }

    @Override
    public Root visitComparison(PythonParser.ComparisonContext ctx) {
        Comparison node = new Comparison();
        node.addExpr((Expr) visit(ctx.expr(0)));
        for (int i = 1; i < ctx.expr().size(); i++) {
            Comparison.CompOp op = null;

            if (ctx.EQUALS(i-1) != null) op = Comparison.CompOp.EQUALS;
            else if (ctx.NOT_EQ_2(i-1) != null) op = Comparison.CompOp.NOT_EQUALS;
            else if (ctx.IN(i-1) != null) {
                op = (ctx.NOT(i-1) != null) ? Comparison.CompOp.NOT_IN : Comparison.CompOp.IN;
            }
            else if (ctx.IS(i-1) != null) {
                op = (ctx.NOT(i-1) != null) ? Comparison.CompOp.IS_NOT : Comparison.CompOp.IS;
            }
            else if (ctx.EQ(i-1) != null) op = Comparison.CompOp.EQ;
            node.addOp(op);
            node.addExpr((Expr) visit(ctx.expr(i)));
        }
        return node;
    }

    @Override
    public Expr visitAtomExpr(PythonParser.AtomExprContext ctx) {
        AtomExpr node = new AtomExpr();
        node.setAtom((Root) visit(ctx.atom()));
        for (PythonParser.TrailerContext tctx : ctx.trailer()) {
            node.addTrailer((Trailer) visit(tctx));
        }
        return node;
    }

    @Override
    public Expr visitAdditiveExpr(PythonParser.AdditiveExprContext ctx) {
        AdditiveExpr node = new AdditiveExpr();
        node.setLeft((Expr) visit(ctx.expr(0)));
        node.setRight((Expr) visit(ctx.expr(1)));
        if (ctx.PLUS() != null) {
            node.setOp(AdditiveExpr.BinaryOp.PLUS);
        } else if (ctx.MINUS() != null) {
            node.setOp(AdditiveExpr.BinaryOp.MINUS);
        }
        return node;
    }

    @Override
    public Root visitParenAtom(PythonParser.ParenAtomContext ctx) {
        ParenAtom node = new ParenAtom();
        if (ctx.testlist_comp() != null){
            node.setTestlist_comp((Testlist_comp) visit(ctx.testlist_comp()));
        }
        return node;
    }

    @Override
    public Root visitListAtom(PythonParser.ListAtomContext ctx) {
        ListAtom node = new ListAtom();
        if (ctx.testlist_comp() != null) {
            node.setTestlist_comp((Testlist_comp) visit(ctx.testlist_comp()));
        }
        return node;
    }

    @Override
    public Object visitNameAtom(PythonParser.NameAtomContext ctx) {
        NameAtom node = new NameAtom();
        node.setName((Name) visit(ctx.name()));
        return node;
    }

    @Override
    public Root visitPrintAtom(PythonParser.PrintAtomContext ctx) {
        return new PrintAtom();
    }

    @Override
    public Root visitNumberAtom(PythonParser.NumberAtomContext ctx) {
        NumberAtom node = new NumberAtom();
        node.setNumber((Number) visit(ctx.number()));
        if (ctx.MINUS() != null) {
            node.setNegative(true);
        }
        return node;
    }

    @Override
    public Root visitNoneAtom(PythonParser.NoneAtomContext ctx) {
        return new NoneAtom();
    }

    @Override
    public Root visitStringAtom(PythonParser.StringAtomContext ctx) {
        StringAtom node = new StringAtom();
        for (var str : ctx.STRING()) {
            node.getString().add(str.getText());
        }
        return node;
    }

    @Override
    public Root visitTestlist_comp(PythonParser.Testlist_compContext ctx) {
        Testlist_comp node = new Testlist_comp();
         node.getTest().add((Test) visit(ctx.test(0))
        );
        for (int i = 1; i < ctx.test().size(); i++) {
            node.getTest().add(
                    (Test) visit(ctx.test(i))
            );
        }
        return node;
    }

    @Override
    public Root visitName(PythonParser.NameContext ctx) {
        Name nameNode = new Name();
        if (ctx.NAME() != null) {
            nameNode.setName(ctx.NAME().getText());
            return nameNode;
        }
        if (ctx.TRUE() != null) {
            nameNode.setTrue_name(ctx.TRUE().getText());
            return nameNode;
        }
        if (ctx.FALSE() != null) {
            nameNode.setFalse_name(ctx.FALSE().getText());
            return nameNode;
        }
        return null;
    }

    @Override
    public Root visitNumber(PythonParser.NumberContext ctx) {
        Number number = new Number();
        if (ctx.DECIMAL_INTEGER() != null) {
            number.setInteger_number(Integer.parseInt(ctx.DECIMAL_INTEGER().getText()));
            return number;
        }
        if (ctx.FLOAT_NUMBER() != null) {
            number.setFloat_number(Float.parseFloat(ctx.FLOAT_NUMBER().getText()));
            return number;
        }
        return null;
    }

    @Override
    public Root visitTrailer(PythonParser.TrailerContext ctx) {
        Trailer trailer = new Trailer();
        if (ctx.DOT() != null) {
            trailer.setName((Name) visit(ctx.name()));
            return trailer;
        }
        if (ctx.LPAREN() != null) {
            for (PythonParser.TestContext testCtx : ctx.test()) {
                trailer.setTest((Test) visit(testCtx));
            }
            return trailer;
        }
        return null;
    }
}
