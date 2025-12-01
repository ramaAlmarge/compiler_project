# Generated from C:/Users/iyadh/IdeaProjects/CompilerProject/src/HTMLParser.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .HTMLParser import HTMLParser
else:
    from HTMLParser import HTMLParser

# This class defines a complete generic visitor for a parse tree produced by HTMLParser.

class HTMLParserVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by HTMLParser#htmlDocument.
    def visitHtmlDocument(self, ctx:HTMLParser.HtmlDocumentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#scriptletOrSeaWs.
    def visitScriptletOrSeaWs(self, ctx:HTMLParser.ScriptletOrSeaWsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#htmlElements.
    def visitHtmlElements(self, ctx:HTMLParser.HtmlElementsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#htmlElement.
    def visitHtmlElement(self, ctx:HTMLParser.HtmlElementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#htmlContent.
    def visitHtmlContent(self, ctx:HTMLParser.HtmlContentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#htmlAttribute.
    def visitHtmlAttribute(self, ctx:HTMLParser.HtmlAttributeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#htmlChardata.
    def visitHtmlChardata(self, ctx:HTMLParser.HtmlChardataContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#htmlMisc.
    def visitHtmlMisc(self, ctx:HTMLParser.HtmlMiscContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#htmlComment.
    def visitHtmlComment(self, ctx:HTMLParser.HtmlCommentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#script.
    def visitScript(self, ctx:HTMLParser.ScriptContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#style.
    def visitStyle(self, ctx:HTMLParser.StyleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#stylesheet.
    def visitStylesheet(self, ctx:HTMLParser.StylesheetContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#goodCharset.
    def visitGoodCharset(self, ctx:HTMLParser.GoodCharsetContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#badCharset.
    def visitBadCharset(self, ctx:HTMLParser.BadCharsetContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#goodImport.
    def visitGoodImport(self, ctx:HTMLParser.GoodImportContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#badImport.
    def visitBadImport(self, ctx:HTMLParser.BadImportContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#goodNamespace.
    def visitGoodNamespace(self, ctx:HTMLParser.GoodNamespaceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#badNamespace.
    def visitBadNamespace(self, ctx:HTMLParser.BadNamespaceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#namespacePrefix.
    def visitNamespacePrefix(self, ctx:HTMLParser.NamespacePrefixContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#media.
    def visitMedia(self, ctx:HTMLParser.MediaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#mediaQueryList.
    def visitMediaQueryList(self, ctx:HTMLParser.MediaQueryListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#mediaQuery.
    def visitMediaQuery(self, ctx:HTMLParser.MediaQueryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#mediaType.
    def visitMediaType(self, ctx:HTMLParser.MediaTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#mediaExpression.
    def visitMediaExpression(self, ctx:HTMLParser.MediaExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#mediaFeature.
    def visitMediaFeature(self, ctx:HTMLParser.MediaFeatureContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#page.
    def visitPage(self, ctx:HTMLParser.PageContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#pseudoPage.
    def visitPseudoPage(self, ctx:HTMLParser.PseudoPageContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#selectorGroup.
    def visitSelectorGroup(self, ctx:HTMLParser.SelectorGroupContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#selector.
    def visitSelector(self, ctx:HTMLParser.SelectorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#combinator.
    def visitCombinator(self, ctx:HTMLParser.CombinatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#simpleSelectorSequence.
    def visitSimpleSelectorSequence(self, ctx:HTMLParser.SimpleSelectorSequenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#typeSelector.
    def visitTypeSelector(self, ctx:HTMLParser.TypeSelectorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#typeNamespacePrefix.
    def visitTypeNamespacePrefix(self, ctx:HTMLParser.TypeNamespacePrefixContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#elementName.
    def visitElementName(self, ctx:HTMLParser.ElementNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#universal.
    def visitUniversal(self, ctx:HTMLParser.UniversalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#className.
    def visitClassName(self, ctx:HTMLParser.ClassNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#attrib.
    def visitAttrib(self, ctx:HTMLParser.AttribContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#pseudo.
    def visitPseudo(self, ctx:HTMLParser.PseudoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#functionalPseudo.
    def visitFunctionalPseudo(self, ctx:HTMLParser.FunctionalPseudoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#expression.
    def visitExpression(self, ctx:HTMLParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#negation.
    def visitNegation(self, ctx:HTMLParser.NegationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#negationArg.
    def visitNegationArg(self, ctx:HTMLParser.NegationArgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#knownRuleset.
    def visitKnownRuleset(self, ctx:HTMLParser.KnownRulesetContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#unknownRuleset.
    def visitUnknownRuleset(self, ctx:HTMLParser.UnknownRulesetContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#declarationList.
    def visitDeclarationList(self, ctx:HTMLParser.DeclarationListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#knownDeclaration.
    def visitKnownDeclaration(self, ctx:HTMLParser.KnownDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#unknownDeclaration.
    def visitUnknownDeclaration(self, ctx:HTMLParser.UnknownDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#prio.
    def visitPrio(self, ctx:HTMLParser.PrioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#value.
    def visitValue(self, ctx:HTMLParser.ValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#expr.
    def visitExpr(self, ctx:HTMLParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#term.
    def visitTerm(self, ctx:HTMLParser.TermContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#function_.
    def visitFunction_(self, ctx:HTMLParser.Function_Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#dxImageTransform.
    def visitDxImageTransform(self, ctx:HTMLParser.DxImageTransformContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#hexcolor.
    def visitHexcolor(self, ctx:HTMLParser.HexcolorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#number.
    def visitNumber(self, ctx:HTMLParser.NumberContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#percentage.
    def visitPercentage(self, ctx:HTMLParser.PercentageContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#dimension.
    def visitDimension(self, ctx:HTMLParser.DimensionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#unknownDimension.
    def visitUnknownDimension(self, ctx:HTMLParser.UnknownDimensionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#any_.
    def visitAny_(self, ctx:HTMLParser.Any_Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#unknownAtRule.
    def visitUnknownAtRule(self, ctx:HTMLParser.UnknownAtRuleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#unused.
    def visitUnused(self, ctx:HTMLParser.UnusedContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#block.
    def visitBlock(self, ctx:HTMLParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#nestedStatement.
    def visitNestedStatement(self, ctx:HTMLParser.NestedStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#groupRuleBody.
    def visitGroupRuleBody(self, ctx:HTMLParser.GroupRuleBodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#supportsRule.
    def visitSupportsRule(self, ctx:HTMLParser.SupportsRuleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#supportsCondition.
    def visitSupportsCondition(self, ctx:HTMLParser.SupportsConditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#supportsConditionInParens.
    def visitSupportsConditionInParens(self, ctx:HTMLParser.SupportsConditionInParensContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#supportsNegation.
    def visitSupportsNegation(self, ctx:HTMLParser.SupportsNegationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#supportsConjunction.
    def visitSupportsConjunction(self, ctx:HTMLParser.SupportsConjunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#supportsDisjunction.
    def visitSupportsDisjunction(self, ctx:HTMLParser.SupportsDisjunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#supportsDeclarationCondition.
    def visitSupportsDeclarationCondition(self, ctx:HTMLParser.SupportsDeclarationConditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#generalEnclosed.
    def visitGeneralEnclosed(self, ctx:HTMLParser.GeneralEnclosedContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#url.
    def visitUrl(self, ctx:HTMLParser.UrlContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#var_.
    def visitVar_(self, ctx:HTMLParser.Var_Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#calc.
    def visitCalc(self, ctx:HTMLParser.CalcContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#calcSum.
    def visitCalcSum(self, ctx:HTMLParser.CalcSumContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#calcProduct.
    def visitCalcProduct(self, ctx:HTMLParser.CalcProductContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#calcValue.
    def visitCalcValue(self, ctx:HTMLParser.CalcValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#fontFaceRule.
    def visitFontFaceRule(self, ctx:HTMLParser.FontFaceRuleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#fontFaceDeclaration.
    def visitFontFaceDeclaration(self, ctx:HTMLParser.FontFaceDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#keyframesRule.
    def visitKeyframesRule(self, ctx:HTMLParser.KeyframesRuleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#keyframeBlock.
    def visitKeyframeBlock(self, ctx:HTMLParser.KeyframeBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#keyframeSelector.
    def visitKeyframeSelector(self, ctx:HTMLParser.KeyframeSelectorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#viewport.
    def visitViewport(self, ctx:HTMLParser.ViewportContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#counterStyle.
    def visitCounterStyle(self, ctx:HTMLParser.CounterStyleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#fontFeatureValuesRule.
    def visitFontFeatureValuesRule(self, ctx:HTMLParser.FontFeatureValuesRuleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#fontFamilyNameList.
    def visitFontFamilyNameList(self, ctx:HTMLParser.FontFamilyNameListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#fontFamilyName.
    def visitFontFamilyName(self, ctx:HTMLParser.FontFamilyNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#featureValueBlock.
    def visitFeatureValueBlock(self, ctx:HTMLParser.FeatureValueBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#featureType.
    def visitFeatureType(self, ctx:HTMLParser.FeatureTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#featureValueDefinition.
    def visitFeatureValueDefinition(self, ctx:HTMLParser.FeatureValueDefinitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#ident.
    def visitIdent(self, ctx:HTMLParser.IdentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#property_.
    def visitProperty_(self, ctx:HTMLParser.Property_Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#operator_.
    def visitOperator_(self, ctx:HTMLParser.Operator_Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#ws.
    def visitWs(self, ctx:HTMLParser.WsContext):
        return self.visitChildren(ctx)



del HTMLParser