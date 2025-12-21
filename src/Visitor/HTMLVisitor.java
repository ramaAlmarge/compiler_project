package Visitor;
import AST.HTML.*;
import antlrHTML.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class HTMLVisitor  extends HTMLParserBaseVisitor{
    @Override
    public Root visitRoot(HTMLParser.RootContext ctx) {
        Root node = new Root();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof HTMLParser.Html_contentContext) {
                Html_content htmlNode = (Html_content) visit(ctx.getChild(i));
                node.addHtml_content(htmlNode);
            }
        }

        return node;
    }


    @Override
    public Root visitHtml_content(HTMLParser.Html_contentContext ctx) {
        Html_content node = new Html_content();

        if (ctx.getChildCount() > 0) {
            if (ctx.getChild(0) instanceof HTMLParser.TagContext) {
                Tag tagNode = (Tag) visit(ctx.getChild(0));
                node.setTag(tagNode);
            } else if (ctx.getChild(0) instanceof HTMLParser.StyleContext) {
                Style styleNode = (Style) visit(ctx.getChild(0));
                node.setStyle(styleNode);
            } else if (ctx.getChild(0) instanceof HTMLParser.Jinja2Context) {
                Jinja2 jinjaNode = (Jinja2) visit(ctx.getChild(0));
                node.setJinja2(jinjaNode);
            }
        }

        return node;
    }

    @Override
    public Root visitTag(HTMLParser.TagContext ctx) {
        Tag node = new Tag();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof HTMLParser.Tag_contentContext) {
                Tag_content tagContentNode = (Tag_content) visit(ctx.getChild(i));
                node.setTag_content(tagContentNode);
            }
        }

        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof HTMLParser.IdentContext) {
                Ident idNode = (Ident) visit(ctx.getChild(i));
                if (idNode.getId() != null) {
                    node.addId(idNode.getId());
                } else if (idNode.getEq() != null) {
                    node.addId(idNode.getEq());
                } else if (idNode.getDoubleQuote() != null) {
                    node.addId(idNode.getDoubleQuote());
                }
            }
        }

        return node;
    }


    @Override
    public Root visitTag_content(HTMLParser.Tag_contentContext ctx) {
        Tag_content node = new Tag_content();

        if (ctx.getChildCount() > 0) {

            node.setId(ctx.getChild(0).getText());

            for (int i = 1; i < ctx.getChildCount(); i++) {
                if (ctx.getChild(i) instanceof HTMLParser.IdentContext) {
                    Ident identNode = (Ident) visit(ctx.getChild(i));
                    node.addIdent(identNode);
                }
            }
        }

        return node;
    }


    @Override
    public Root visitIdent(HTMLParser.IdentContext ctx) {
        Ident node = new Ident();

        if (ctx.getChild(0) != null) {
            String text = ctx.getChild(0).getText();

            switch (ctx.getChild(0).getPayload().getClass().getSimpleName()) {
                case "TerminalNodeImpl":
                    // يمكن أن يكون ID أو EQ أو DOUBLE_QUOTE_STRING
                    if (ctx.getChild(0).getText().startsWith("\"")) {
                        node.setDoubleQuote(text);
                    } else if (text.equals("=")) {
                        node.setEq(text);
                    } else {
                        node.setId(text);
                    }
                    break;
                default:
                    break;
            }
        }

        return node;
    }


    @Override
    public Root visitStyle(HTMLParser.StyleContext ctx) {
        Style node = new Style();

        if (ctx.getChild(0) instanceof HTMLParser.RuleContext) {
            Rule ruleNode = (Rule) visit(ctx.getChild(0));
            node.setRule(ruleNode);
        } else if (ctx.getChild(0) instanceof HTMLParser.AtRuleContext) {
            AtRule atRuleNode = (AtRule) visit(ctx.getChild(0));
            node.setAtRule(atRuleNode);
        }

        return node;
    }


    @Override
    public Root visitRule(HTMLParser.RuleContext ctx) {
        Rule node = new Rule();

        if (ctx.selector() != null) {
            node.setSelector((Selector) visit(ctx.selector()));
        }

        for (TerminalNode idNode : ctx.ID()) {
            node.addID(idNode.getText());
        }

        for (HTMLParser.DeclarationContext declCtx : ctx.declaration()) {
            Declaration decl = (Declaration) visitDeclaration(declCtx);
            node.addDeclaration(decl);
        }

        return node;
    }


    @Override
    public Root visitSelector(HTMLParser.SelectorContext ctx) {


        if (ctx.COMMA() != null) {

            SelectorGroup group = new SelectorGroup();


            Selector first = new Selector();
            first.addSimpleSelector((SimpleSelector) visit(ctx.simpleSelector(0)));

            for (int i = 0; i < ctx.combinator().size(); i++) {
                first.addCombinator((Combinator) visit(ctx.combinator(i)));
                first.addSimpleSelector((SimpleSelector) visit(ctx.simpleSelector(i + 1)));
            }

            group.addSelector(first);

            Selector rest = (Selector) visit(ctx.selector());
            group.addSelector(rest);

            return group;
        }

        Selector selector = new Selector();
        selector.addSimpleSelector((SimpleSelector) visit(ctx.simpleSelector(0)));

        for (int i = 0; i < ctx.combinator().size(); i++) {
            selector.addCombinator((Combinator) visit(ctx.combinator(i)));
            selector.addSimpleSelector((SimpleSelector) visit(ctx.simpleSelector(i + 1)));
        }

        return selector;
    }


    @Override
    public Selector visitSimpleSelector(HTMLParser.SimpleSelectorContext ctx) {

        SimpleSelector node = new SimpleSelector();

        if (ctx.typeSelector() != null) {
            node.setTypeSelector((TypeSelector) visit(ctx.typeSelector()));
        } else if (ctx.universal() != null) {
            node.setUniversal((Universal) visit(ctx.universal()));
        }

        for (var child : ctx.children) {

            if (child instanceof TerminalNode terminal) {

                if (terminal.getSymbol().getType() == HTMLParser.HASH) {
                    String text = terminal.getText(); // #main
                    node.addHash(new HashSelector(text.substring(1))
                    );
                }

            } else if (child instanceof HTMLParser.ClassContext) {
                node.addClass((Class) visit(child));

            } else if (child instanceof HTMLParser.AttribContext) {
                node.addAttrib((Attrib) visit(child));

            } else if (child instanceof HTMLParser.PseudoContext) {
                node.addPseudo((Pseudo) visit(child));
            }
        }

        return node;
    }

    @Override
    public Root visitTypeSelector(HTMLParser.TypeSelectorContext ctx) {

        if (ctx.ID() != null) {
            return new TypeSelector(ctx.ID().getText());
        }

        return new TypeSelector(null);
    }


    @Override
    public Root visitUniversal(HTMLParser.UniversalContext ctx) {
        return new Universal();
    }

    @Override
    public Selector visitClass(HTMLParser.ClassContext ctx) {

        String id = ctx.ID().getText();

        return new ClassSelector(id);
    }



    @Override
    public Attrib visitAttribWithValue(HTMLParser.AttribWithValueContext ctx) {

        String id = ctx.ID(0).getText();

        String value = ctx.ID(1).getText();

        String operator = null;

        if (ctx.EQ() != null) operator = "=";
        else if (ctx.TILDE_EQUALS() != null) operator = "~=";
        else if (ctx.PIPE_EQUALS() != null) operator = "|=";
        else if (ctx.CARET_EQUALS() != null) operator = "^=";
        else if (ctx.DOLLAR_EQUALS() != null) operator = "$=";
        else if (ctx.STAR_EQUALS() != null) operator = "*=";

        return new AttribWithValue(id, operator, value);
    }

    @Override
    public Attrib visitAttribWithoutValue(HTMLParser.AttribWithoutValueContext ctx) {

        String id = ctx.ID().getText();

        return new AttribWithoutValue(id);
    }


    @Override
    public PseudoClass visitPseudoClass(HTMLParser.PseudoClassContext ctx) {

        String id = ctx.ID().getText();

        PseudoExpr expr = null;
        if (ctx.pseudoExpr() != null) {
            expr = (PseudoExpr) visit(ctx.pseudoExpr());
        }

        // إنشاء node لكل مرة
        return new PseudoClass(id, expr);
    }


    @Override
    public PseudoElement visitPseudoElement(HTMLParser.PseudoElementContext ctx) {

        String id = ctx.ID().getText();

        PseudoExpr expr = null;
        if (ctx.pseudoExpr() != null) {
            expr = (PseudoExpr) visit(ctx.pseudoExpr());
        }

        // إنشاء node لكل مرة
        return new PseudoElement(id, expr);
    }


    @Override
    public NotPseudo visitNotPseudo(HTMLParser.NotPseudoContext ctx) {

        PseudoExpr expr = null;

        if (ctx.pseudoExpr() != null) {
            expr = (PseudoExpr) visit(ctx.pseudoExpr());
        }

        return new NotPseudo(expr);
    }


    @Override
    public PseudoExpr visitPseudoExpr(HTMLParser.PseudoExprContext ctx) {

        PseudoExpr expr = new PseudoExpr();


        for (ParseTree child : ctx.children) {

            if (child instanceof TerminalNode) {
                TerminalNode t = (TerminalNode) child;
                String text = t.getText();
                int type = t.getSymbol().getType();

                switch (type) {
                    case HTMLParser.NUMBER:
                        expr.addPart(new NumberPseudoExpr(text));
                        break;
                    case HTMLParser.ID:
                        expr.addPart(new IdentPseudoExpr(text));
                        break;
                    case HTMLParser.PLUS:
                    case HTMLParser.MINUS:
                    case HTMLParser.STAR:
                    case HTMLParser.SLASH:
                    case HTMLParser.COLON:
                        expr.addPart(new OperatorPseudoExpr(text));
                        break;
                    case HTMLParser.NOT:
                        expr.addPart(new NotPseudoExpr());
                        break;
                    default:

                        break;
                }

            } else if (child instanceof HTMLParser.PseudoContext) {
                Pseudo pseudo = (Pseudo) visit(child);
                expr.addPart(new NestedPseudoExpr(pseudo));
            }
        }

        return expr;
    }


    @Override
    public Combinator visitChildCombinator(HTMLParser.ChildCombinatorContext ctx) {
        return new ChildCombinator();
    }

    @Override
    public Combinator visitAdjacentSiblingCombinator(HTMLParser.AdjacentSiblingCombinatorContext ctx) {
        return new AdjacentSiblingCombinator();
    }

    @Override
    public Combinator visitGeneralSiblingCombinator(HTMLParser.GeneralSiblingCombinatorContext ctx) {
        return new GeneralSiblingCombinator();
    }

    @Override
    public Declaration visitDeclaration(HTMLParser.DeclarationContext ctx) {

        Property property = (Property) visit(ctx.property());
        Value value = (Value) visit(ctx.value());

        return new Declaration(property, value);
    }

    @Override
    public Property visitIdentProperty(HTMLParser.IdentPropertyContext ctx) {
        return new IdentProperty(ctx.ID().getText());
    }

    @Override
    public Property visitVarProperty(HTMLParser.VarPropertyContext ctx) {
        return new VarProperty(ctx.VAR().getText());
    }


    @Override
    public Value visitValue(HTMLParser.ValueContext ctx) {Value node = new Value();
        for (HTMLParser.ValuePartContext vpCtx : ctx.valuePart()) {
            ValuePart part = (ValuePart) visit(vpCtx);
            node.addValuePart(part);
        }

        return node;
    }

    @Override
    public ValuePart visitIdentValue(HTMLParser.IdentValueContext ctx) {
        return new IdentValue(ctx.getText());
    }


    @Override
    public ValuePart visitVarValue(HTMLParser.VarValueContext ctx) {
        return new VarValue(ctx.getText());
    }

    @Override
    public ValuePart visitNumberValue(HTMLParser.NumberValueContext ctx) {

        String text = ctx.getText();
        Float number = null;
        String unit = "";

        int i = 0;
        while (i < text.length() &&
                (Character.isDigit(text.charAt(i)) || text.charAt(i) == '-' || text.charAt(i) == '.')) {
            i++;
        }

        try {
            number = Float.parseFloat(text.substring(0, i));
        } catch (NumberFormatException e) {
            number = 0f;
        }

        if (i < text.length()) {
            unit = text.substring(i);
        }

        return new NumberValue(number, unit);
    }

    @Override
    public ValuePart visitHashValue(HTMLParser.HashValueContext ctx) {
        return new HashValue();
    }

    @Override
    public ValuePart visitImportantValue(HTMLParser.ImportantValueContext ctx) {
        return new ImportantValue();
    }


    @Override
    public ValuePart visitUrlValue(HTMLParser.UrlValueContext ctx) {UrlValue node = new UrlValue();


        if (ctx.URL() != null) {
            node.setUrl(ctx.URL().getText());
        }

        for (int i = 1; i < ctx.getChildCount() - 1; i++) {
            var child = ctx.getChild(i);


            String text = child.getText();

            switch (text) {
                case "=":
                    node.addEq("=");
                    break;
                case "&":
                    node.addAnd("&");
                    break;
                case "/":

                    break;
                case ":":
                    break;
                case ".":
                    break;
                case "?":

                    break;
                case "+":

                    break;
                case "-":

                    break;
                default:

                    try {
                        Float number = Float.parseFloat(text);
                        node.addNumber(number);
                    } catch (NumberFormatException e) {

                        node.addId(text);
                    }
                    break;
            }
        }

        return node;
    }


    @Override
    public ValuePart visitParenValue(HTMLParser.ParenValueContext ctx) {
        ParenValue node = new ParenValue();

        if (ctx.value() != null) {
            Value val = (Value) visitValue(ctx.value());
            node.setValue(val);
        }

        return node;
    }

    @Override
    public ValuePart visitCommaValue(HTMLParser.CommaValueContext ctx) {
        return new CommaValue();
    }

    @Override
    public ValuePart visitDotValue(HTMLParser.DotValueContext ctx) {
        return new DotValue();
    }

    @Override
    public ValuePart visitColonValue(HTMLParser.ColonValueContext ctx) {
        return new ColonValue();
    }

    @Override
    public ValuePart visitSlashValue(HTMLParser.SlashValueContext ctx) {
        return new SlashValue();
    }

    @Override
    public ValuePart visitGreaterValue(HTMLParser.GreaterValueContext ctx) {
        return new GreaterValue();
    }

    @Override
    public Root visitPlusValue(HTMLParser.PlusValueContext ctx) {
        return new PlusValue();
    }

    @Override
    public ValuePart visitMinusValue(HTMLParser.MinusValueContext ctx) {
        return new MinusValue();
    }

    @Override
    public ValuePart visitStarValue(HTMLParser.StarValueContext ctx) {
        return new StarValue();
    }

    @Override
    public ValuePart visitTildeValue(HTMLParser.TildeValueContext ctx) {
        return new TildeValue();
    }

    @Override
    public ValuePart visitEqualsValue(HTMLParser.EqualsValueContext ctx) {
        return new EqualsValue();
    }

    @Override
    public ValuePart visitQuestionValue(HTMLParser.QuestionValueContext ctx) {
        return new QuestionValue();
    }


    @Override
    public ValuePart visitDoubleQuoteValue(HTMLParser.DoubleQuoteValueContext ctx) {String text = ctx.getText();
        if (text.length() >= 2 && text.startsWith("\"") && text.endsWith("\"")) {
            text = text.substring(1, text.length() - 1);
        }
        return new DoubleQuoteValue(text);
    }


    @Override
    public Root visitAtRule(HTMLParser.AtRuleContext ctx) {
        AtRule node = new AtRule();
        return null;
    }

    @Override
    public AtRuleBody visitAtRuleWithBlock(HTMLParser.AtRuleWithBlockContext ctx) {

        AtRuleWithBlock body = new AtRuleWithBlock();

        for (var child : ctx.children) {
            if (child instanceof HTMLParser.RuleContext) {
                Rule rule = (Rule) visitRule((HTMLParser.RuleContext) child);
                body.addRule(rule);
            } else if (child instanceof HTMLParser.DeclarationContext) {
                Declaration declaration =
                        (Declaration) visitDeclaration((HTMLParser.DeclarationContext) child);
                body.addDeclaration(declaration);
            } else if (child instanceof HTMLParser.AtRuleContext) {
                AtRule atRule =
                        (AtRule) visitAtRule((HTMLParser.AtRuleContext) child);
                body.addAtRule(atRule);
            }
        }

        return body;
    }


    @Override
    public AtRuleBody visitAtRuleWithoutBlock(HTMLParser.AtRuleWithoutBlockContext ctx) {

        return new AtRuleWithoutBlock();
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
            Stmt stmt = (Stmt) visitStmt(ctx.stmt());
            return node;
        }

        if (ctx.expr() != null) {
            Expr expr = (Expr) visitExpr(ctx.expr());
            return node;
        }

        return null;
    }


    @Override
    public Root visitStmt(HTMLParser.StmtContext ctx) {

        Stmt node = new Stmt();

        for (var idToken : ctx.ID()) {
            node.addId(idToken.getText());
        }

        return node;
    }


    @Override
    public Root visitExpr(HTMLParser.ExprContext ctx) {

        Expr node = new Expr();

        for (HTMLParser.Expr_contentContext contentCtx : ctx.expr_content()) {
            Expr_content content =
                    (Expr_content) visitExpr_content(contentCtx);
            node.addExpr_content(content);
        }

        return node;
    }




    @Override
    public Root visitExpr_content(HTMLParser.Expr_contentContext ctx) {

        if (ctx.ID() != null) {
            return new Expr_content(
                    Expr_content.ExprType.ID,
                    ctx.ID().getText()
            );
        }

        if (ctx.NUMBER() != null) {
            return new Expr_content(
                    Expr_content.ExprType.NUMBER,
                    ctx.NUMBER().getText()
            );
        }

        if (ctx.DOUBLE_QUOTE_STRING() != null) {
            return new Expr_content(
                    Expr_content.ExprType.STRING,
                    ctx.DOUBLE_QUOTE_STRING().getText()
            );
        }

        if (ctx.OR() != null) {
            return new Expr_content(
                    Expr_content.ExprType.OR,
                    ctx.OR().getText()
            );
        }

        if (ctx.LPAREN() != null) {
            return new Expr_content(
                    Expr_content.ExprType.LPAREN,
                    ctx.LPAREN().getText()
            );
        }

        if (ctx.RPAREN() != null) {
            return new Expr_content(
                    Expr_content.ExprType.RPAREN,
                    ctx.RPAREN().getText()
            );
        }

        if (ctx.COLON() != null) {
            return new Expr_content(
                    Expr_content.ExprType.COLON,
                    ctx.COLON().getText()
            );
        }

        if (ctx.LBRACK() != null) {
            return new Expr_content(
                    Expr_content.ExprType.LBRACK,
                    ctx.LBRACK().getText()
            );
        }

        if (ctx.RBRACK() != null) {
            return new Expr_content(
                    Expr_content.ExprType.RBRACK,
                    ctx.RBRACK().getText()
            );
        }

        if (ctx.PIPE() != null) {
            return new Expr_content(
                    Expr_content.ExprType.PIPE,
                    ctx.PIPE().getText()
            );
        }

        if (ctx.TILDE() != null) {
            return new Expr_content(
                    Expr_content.ExprType.TILDE,
                    ctx.TILDE().getText()
            );
        }

        if (ctx.TAG_CLOSE() != null) {
            return new Expr_content(
                    Expr_content.ExprType.TAG_CLOSE,
                    ctx.TAG_CLOSE().getText()
            );
        }

        return null;
    }
}
