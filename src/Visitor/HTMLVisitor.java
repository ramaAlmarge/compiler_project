package Visitor;
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
    public Object visitAtRule(HTMLParser.AtRuleContext ctx) {
        return super.visitAtRule(ctx);
    }

    @Override
    public Object visitAtRuleWithBlock(HTMLParser.AtRuleWithBlockContext ctx) {
        return super.visitAtRuleWithBlock(ctx);
    }

    @Override
    public Object visitAtRuleWithoutBlock(HTMLParser.AtRuleWithoutBlockContext ctx) {
        return super.visitAtRuleWithoutBlock(ctx);
    }

    @Override
    public Object visitJinja2(HTMLParser.Jinja2Context ctx) {
        return super.visitJinja2(ctx);
    }

    @Override
    public Object visitStatement(HTMLParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    @Override
    public Object visitStmt(HTMLParser.StmtContext ctx) {
        return super.visitStmt(ctx);
    }

    @Override
    public Object visitExpr(HTMLParser.ExprContext ctx) {
        return super.visitExpr(ctx);
    }

    @Override
    public Object visitExpr_content(HTMLParser.Expr_contentContext ctx) {
        return super.visitExpr_content(ctx);
    }
}
