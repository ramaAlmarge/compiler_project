package Visitor;
import AST.HTML.*;
import antlrHTML.*;
public class HTMLVisitor  extends HTMLParserBaseVisitor{
    @Override
    public Object visitRoot(HTMLParser.RootContext ctx) {
        return super.visitRoot(ctx);
    }

    @Override
    public Object visitHtml_content(HTMLParser.Html_contentContext ctx) {
        return super.visitHtml_content(ctx);
    }

    @Override
    public Object visitTag(HTMLParser.TagContext ctx) {
        return super.visitTag(ctx);
    }

    @Override
    public Object visitTag_content(HTMLParser.Tag_contentContext ctx) {
        return super.visitTag_content(ctx);
    }

    @Override
    public Object visitIdent(HTMLParser.IdentContext ctx) {
        return super.visitIdent(ctx);
    }

    @Override
    public Object visitStyle(HTMLParser.StyleContext ctx) {
        return super.visitStyle(ctx);
    }

    @Override
    public Object visitRule(HTMLParser.RuleContext ctx) {
        return super.visitRule(ctx);
    }

    @Override
    public Object visitSelector(HTMLParser.SelectorContext ctx) {
        return super.visitSelector(ctx);
    }

    @Override
    public Object visitSimpleSelector(HTMLParser.SimpleSelectorContext ctx) {
        return super.visitSimpleSelector(ctx);
    }

    @Override
    public Object visitTypeSelector(HTMLParser.TypeSelectorContext ctx) {
        return super.visitTypeSelector(ctx);
    }

    @Override
    public Object visitUniversal(HTMLParser.UniversalContext ctx) {
        return super.visitUniversal(ctx);
    }

    @Override
    public Object visitClass(HTMLParser.ClassContext ctx) {
        return super.visitClass(ctx);
    }

    @Override
    public Object visitAttribWithValue(HTMLParser.AttribWithValueContext ctx) {
        return super.visitAttribWithValue(ctx);
    }

    @Override
    public Object visitAttribWithoutValue(HTMLParser.AttribWithoutValueContext ctx) {
        return super.visitAttribWithoutValue(ctx);
    }

    @Override
    public Object visitPseudoClass(HTMLParser.PseudoClassContext ctx) {
        return super.visitPseudoClass(ctx);
    }

    @Override
    public Object visitPseudoElement(HTMLParser.PseudoElementContext ctx) {
        return super.visitPseudoElement(ctx);
    }

    @Override
    public Object visitNotPseudo(HTMLParser.NotPseudoContext ctx) {
        return super.visitNotPseudo(ctx);
    }

    @Override
    public Object visitPseudoExpr(HTMLParser.PseudoExprContext ctx) {
        return super.visitPseudoExpr(ctx);
    }

    @Override
    public Object visitChildCombinator(HTMLParser.ChildCombinatorContext ctx) {
        return super.visitChildCombinator(ctx);
    }

    @Override
    public Object visitAdjacentSiblingCombinator(HTMLParser.AdjacentSiblingCombinatorContext ctx) {
        return super.visitAdjacentSiblingCombinator(ctx);
    }

    @Override
    public Object visitGeneralSiblingCombinator(HTMLParser.GeneralSiblingCombinatorContext ctx) {
        return super.visitGeneralSiblingCombinator(ctx);
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
    public Object visitPlusValue(HTMLParser.PlusValueContext ctx) {
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
