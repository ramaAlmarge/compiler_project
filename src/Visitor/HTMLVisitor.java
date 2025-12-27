package Visitor;
import AST.HTML.*;
import antlrHTML.*;
import org.antlr.v4.runtime.tree.TerminalNode;
//import SympolTable.*;

public class HTMLVisitor  extends HTMLParserBaseVisitor{
//    HTMLSympolTable htmlSympolTable = new HTMLSympolTable();
    @Override
    public Program visitRoot(HTMLParser.RootContext ctx) {
        Program program = new Program();
            for (HTMLParser.Html_contentContext hcCtx : ctx.html_content()) {
                program.addHtmlContent((Root) visit(hcCtx));
            }
        return program;
    }

    public Root visitHtml_content(HTMLParser.Html_contentContext ctx) {
        Html_content node = new Html_content();
        if (ctx.tag() != null) {
            node.setTag((Tag) visit(ctx.tag()));
        } else if (ctx.style() != null) {
            node.setStyle((Style) visit(ctx.style()));
        } else if (ctx.jinja2() != null) {
            node.setJinja2((Jinja2) visit(ctx.jinja2()));
        }
        node.setLine(ctx.getStart().getLine());
        return node;
    }

    @Override
    public Root visitTag(HTMLParser.TagContext ctx) {

        Tag node = new Tag();

        if (ctx.tag_content() != null) {
            node.setTag_content((Tag_content) visit(ctx.tag_content()));
        }

        if (ctx.ID() != null) {
            for (var idToken : ctx.ID()) {
                node.addId(idToken.getText());
            }
        }

        return node;
    }


    @Override
    public Root visitTag_content(HTMLParser.Tag_contentContext ctx) {
        Tag_content node = new Tag_content();
        node.setId(ctx.ID().getText());
        for (HTMLParser.IdentContext iCtx : ctx.ident()) {
            node.addIdent((Ident)visit(iCtx));
        }
        return node;
    }


    @Override
    public Tag_content visitIdent(HTMLParser.IdentContext ctx) {
        Ident node = new Ident();
        if (ctx.ID() != null){
            node.setId(ctx.ID().getText());
        }
        else if (ctx.DOUBLE_QUOTE_STRING() != null){
            node.setDoubleQuote(ctx.DOUBLE_QUOTE_STRING().getText());
        }
        return node;
    }


    @Override
    public Root visitStyle(HTMLParser.StyleContext ctx) {
        Style node = new Style();
        if (ctx.rule_() != null) {
            Rule ruleNode = (Rule) visit(ctx.rule_());
            node.setRule(ruleNode);
        } else if (ctx.atRule() != null) {
            AtRule atRuleNode = (AtRule) visit(ctx.atRule());
            node.setAtRule(atRuleNode);
        }
        return node;
    }

    @Override
    public Root visitRule(HTMLParser.RuleContext ctx) {
//        htmlSympolTable.enter("css-rule");
        Rule node = new Rule();
        if (ctx.selector() != null) {
            node.setSelector((Selector) visit(ctx.selector()));
        }
        for (TerminalNode idNode : ctx.ID()) {
            node.addID(idNode.getText());
        }
        for (HTMLParser.DeclarationContext dCtx : ctx.declaration()) {
            node.addDeclaration((Declaration) visit(dCtx));
        }
//        htmlSympolTable.exit();
        return node;
    }

    @Override
    public Root visitSelector(HTMLParser.SelectorContext ctx) {
        Selector node = new Selector();
        SimpleSelector first = (SimpleSelector) visit(ctx.simpleSelector(0));
        node.addSimpleSelector(first);
        for (int i = 1; i < ctx.simpleSelector().size(); i++) {
            SimpleSelector s = (SimpleSelector) visit(ctx.simpleSelector(i));
            node.addSimpleSelector(s);
        }
        if (ctx.selector() != null) {
            Selector next = (Selector) visit(ctx.selector());
            node.getSelectors().addAll(next.getSelectors());
        }
        return node;
    }

    @Override
    public Selector visitSimpleSelector(HTMLParser.SimpleSelectorContext ctx) {
        SimpleSelector node = new SimpleSelector();
        if (ctx.typeSelector() != null) {
            node.setTypeSelector((Id) visit(ctx.typeSelector()));
        }
        for (TerminalNode hash : ctx.HASH()) {
            node.addHash(new HashSelector(hash.getText()));
        }
        for (HTMLParser.ClassContext c : ctx.class_()) {
            node.addClass((Id) visit(c));
        }
        for (HTMLParser.AttribContext a : ctx.attrib()) {
            node.addAttrib((Attrib) visit(a));
        }
        for (HTMLParser.PseudoContext p : ctx.pseudo()) {
            node.addPseudo((Pseudo) visit(p));
        }
        return node;
    }

    @Override
    public Root visitTypeSelector(HTMLParser.TypeSelectorContext ctx) {
        Id node = new Id();
        if (ctx.ID() != null) {
            node.setId(ctx.ID().getText());
            return node;
        }
        return null;
    }

    @Override
    public Root visitClass(HTMLParser.ClassContext ctx) {
        Id node = new Id();
        node.setId(ctx.ID().getText());
        return node;
    }

    @Override
    public Attrib visitAttribWithValue(HTMLParser.AttribWithValueContext ctx) {
        AttribWithValue node = new AttribWithValue();
        node.setId(ctx.ID(0).getText());
        node.setValue(ctx.ID(1).getText());
        return node;
    }

    @Override
    public Attrib visitAttribWithoutValue(HTMLParser.AttribWithoutValueContext ctx) {
        AttribWithoutValue node = new AttribWithoutValue();
        node.setId(ctx.ID().getText());
        return node;
    }
    
    @Override
    public Declaration visitDeclaration(HTMLParser.DeclarationContext ctx) {
        Declaration node = new Declaration();
        node.setProperty((Property) visit(ctx.property()));
        node.setValue((Value) visit(ctx.value()));
        return node;
    }


    @Override
    public Property visitIdentProperty(HTMLParser.IdentPropertyContext ctx) {
        IdentProperty node = new IdentProperty();
        node.setId(ctx.ID().getText());
        return node;
    }

    @Override
    public Property visitVarProperty(HTMLParser.VarPropertyContext ctx) {
        VarProperty node = new VarProperty();
        node.setName(ctx.VAR().getText());
        return node;
    }


    @Override
    public Value visitValue(HTMLParser.ValueContext ctx) {
        Value node = new Value();
        for (HTMLParser.ValuePartContext vpCtx : ctx.valuePart()) {
            ValuePart part = (ValuePart) visit(vpCtx);
            node.addValuePart(part);
        }

        return node;
    }

    @Override
    public ValuePart visitIdentValue(HTMLParser.IdentValueContext ctx) {
        IdentValue node = new IdentValue();
        node.setName(ctx.ID().getText());
        return node;
    }


    @Override
    public ValuePart visitVarValue(HTMLParser.VarValueContext ctx) {
       VarValue node = new VarValue();
       node.setName(ctx.VAR().getText());
       return node;
    }

    @Override
    public ValuePart visitNumberValue(HTMLParser.NumberValueContext ctx) {
        NumberValue node = new NumberValue();
        node.setNumber((ctx.NUMBER().getText()));
        return node;
    }

    @Override
    public ValuePart visitUrlValue(HTMLParser.UrlValueContext ctx) {
        UrlValue node = new UrlValue();
        for (TerminalNode idNode : ctx.ID()) {
            node.addId(idNode.getText());
        }
        for (TerminalNode numNode : ctx.NUMBER()) {
            node.addNumber(Float.parseFloat(numNode.getText()));
        }
        return node;
    }

    @Override
    public ValuePart visitParenValue(HTMLParser.ParenValueContext ctx) {
        ParenValue node = new ParenValue();
        if (ctx.value() != null) {
            node.setValue((Value)visit(ctx.value()));
        }
        return node;
    }

    @Override
    public Root visitDoubleQuoteValue(HTMLParser.DoubleQuoteValueContext ctx) {
        Id node = new Id();
        if ( ctx.DOUBLE_QUOTE_STRING() != null){
            node.setId(ctx.DOUBLE_QUOTE_STRING().getText());
            return node;
        }
        return node;
    }


    @Override
    public Root visitAtRule(HTMLParser.AtRuleContext ctx) {
        AtRule node = new AtRule();
        for (HTMLParser.ValuePartContext vpCtx : ctx.valuePart()) {
            node.setValuePart((ValuePart) visit(vpCtx));
        }
        for (TerminalNode idNode : ctx.ID()) {
            node.setId(idNode.getText());
        }
        for (TerminalNode numNode : ctx.NUMBER()) {
            node.setNumber(Float.parseFloat(numNode.getText()));
        }
        if (ctx.atRuleBody() != null) {
            node.setAtRuleBody((AtRuleBody) visit(ctx.atRuleBody()));
        }
        return node;
    }

    @Override
    public AtRuleBody visitAtRuleWithBlock(HTMLParser.AtRuleWithBlockContext ctx) {
        AtRuleWithBlock node = new AtRuleWithBlock();

        for (HTMLParser.RuleContext r : ctx.rule_()) {
            node.addRule((Rule) visit(r));
        }
        for (HTMLParser.DeclarationContext d : ctx.declaration()) {
            node.addDeclaration((Declaration) visit(d));
        }
        for (HTMLParser.AtRuleContext a : ctx.atRule()) {
            node.addAtRule((AtRule) visit(a));
        }
        return node;
    }

    @Override
    public Root visitJinja2(HTMLParser.Jinja2Context ctx) {
        Jinja2 node = new Jinja2();
        node.setStatement((Statement)visitStatement(ctx.statement()));
        return node;
    }

    @Override
    public Root visitStatement(HTMLParser.StatementContext ctx) {
        Statement node = new Statement();
        if (ctx.stmt() != null) {
            node.setStmt((Stmt) visit(ctx.stmt()));
            return node;
        }
        if (ctx.expr() != null) {
            node.setExpr((Expr) visit(ctx.expr()));
            return node;
        }
//        htmlSympolTable.exit();
        return null;
    }

    @Override
    public Root visitStmt(HTMLParser.StmtContext ctx) {
        Stmt node = new Stmt();
        for (TerminalNode idNode : ctx.ID()) {
            node.addId(idNode.getText());
        }
        String text = ctx.getText();
        if (text.contains("for")) {
            String loopVar = ctx.ID(0).getText();
//            htmlSympolTable.enter("jinja-for");
//            htmlSympolTable.define(loopVar, "loop-var");
        }
//        if (text.contains("if")) {
//            htmlSympolTable.enter("jinja-if");
//        }

        return node;
    }



    @Override
    public Root visitExpr(HTMLParser.ExprContext ctx) {
        Expr node = new Expr();
        for (HTMLParser.Expr_contentContext contentCtx : ctx.expr_content()) {
            Expr_content content = (Expr_content) visitExpr_content(contentCtx);
            node.addExpr_content(content);
        }
        return node;
    }

    @Override
    public Root visitExpr_content(HTMLParser.Expr_contentContext ctx) {
        Expr_content node = new Expr_content();
        if (ctx.ID() != null) {
            node.setId(ctx.ID().getText());
            return node;
        }
        if (ctx.NUMBER() != null) {
            node.setNumber(Float.parseFloat(ctx.NUMBER().getText()));
            return node;
        }
        if (ctx.DOUBLE_QUOTE_STRING() != null) {
            node.setDouble_qoute(ctx.DOUBLE_QUOTE_STRING().getText());
            return node;
        }
        return null;
    }

    @Override
    public Object visitUniversal(HTMLParser.UniversalContext ctx) {
        return super.visitUniversal(ctx);
    }
}
