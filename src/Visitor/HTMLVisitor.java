package Visitor;
import AST.HTML.*;
import antlrHTML.HTMLParser;
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
    public Object visitDeclaration(HTMLParser.DeclarationContext ctx) {
        return super.visitDeclaration(ctx);
    }

    @Override
    public Object visitIdentProperty(HTMLParser.IdentPropertyContext ctx) {
        return super.visitIdentProperty(ctx);
    }

    @Override
    public Object visitVarProperty(HTMLParser.VarPropertyContext ctx) {
        return super.visitVarProperty(ctx);
    }

    @Override
    public Object visitValue(HTMLParser.ValueContext ctx) {
        return super.visitValue(ctx);
    }

    @Override
    public Object visitIdentValue(HTMLParser.IdentValueContext ctx) {
        return super.visitIdentValue(ctx);
    }

    @Override
    public Object visitVarValue(HTMLParser.VarValueContext ctx) {
        return super.visitVarValue(ctx);
    }

    @Override
    public Object visitNumberValue(HTMLParser.NumberValueContext ctx) {
        return super.visitNumberValue(ctx);
    }

    @Override
    public Object visitHashValue(HTMLParser.HashValueContext ctx) {
        return super.visitHashValue(ctx);
    }

    @Override
    public Object visitImportantValue(HTMLParser.ImportantValueContext ctx) {
        return super.visitImportantValue(ctx);
    }

    @Override
    public Object visitUrlValue(HTMLParser.UrlValueContext ctx) {
        return super.visitUrlValue(ctx);
    }

    @Override
    public Object visitParenValue(HTMLParser.ParenValueContext ctx) {
        return super.visitParenValue(ctx);
    }

    @Override
    public Object visitCommaValue(HTMLParser.CommaValueContext ctx) {
        return super.visitCommaValue(ctx);
    }

    @Override
    public Object visitDotValue(HTMLParser.DotValueContext ctx) {
        return super.visitDotValue(ctx);
    }

    @Override
    public Object visitColonValue(HTMLParser.ColonValueContext ctx) {
        return super.visitColonValue(ctx);
    }

    @Override
    public Object visitSlashValue(HTMLParser.SlashValueContext ctx) {
        return super.visitSlashValue(ctx);
    }

    @Override
    public Object visitGreaterValue(HTMLParser.GreaterValueContext ctx) {
        return super.visitGreaterValue(ctx);
    }

    @Override
    public Object visitPlusValue(HTMLParser.PlusValueContext ctx) {
        return super.visitPlusValue(ctx);
    }

    @Override
    public Object visitMinusValue(HTMLParser.MinusValueContext ctx) {
        return super.visitMinusValue(ctx);
    }

    @Override
    public Object visitStarValue(HTMLParser.StarValueContext ctx) {
        return super.visitStarValue(ctx);
    }

    @Override
    public Object visitTildeValue(HTMLParser.TildeValueContext ctx) {
        return super.visitTildeValue(ctx);
    }

    @Override
    public Object visitEqualsValue(HTMLParser.EqualsValueContext ctx) {
        return super.visitEqualsValue(ctx);
    }

    @Override
    public Object visitQuestionValue(HTMLParser.QuestionValueContext ctx) {
        return super.visitQuestionValue(ctx);
    }

    @Override
    public Object visitDoubleQuoteValue(HTMLParser.DoubleQuoteValueContext ctx) {
        return super.visitDoubleQuoteValue(ctx);
    }

    @Override
    public Root visitAtRule(HTMLParser.AtRuleContext ctx) {
        AtRule node = new AtRule();

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
