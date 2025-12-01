# Generated from C:/Users/iyadh/IdeaProjects/CompilerProject/src/HTMLParser.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .HTMLParser import HTMLParser
else:
    from HTMLParser import HTMLParser

# This class defines a complete listener for a parse tree produced by HTMLParser.
class HTMLParserListener(ParseTreeListener):

    # Enter a parse tree produced by HTMLParser#htmlDocument.
    def enterHtmlDocument(self, ctx:HTMLParser.HtmlDocumentContext):
        pass

    # Exit a parse tree produced by HTMLParser#htmlDocument.
    def exitHtmlDocument(self, ctx:HTMLParser.HtmlDocumentContext):
        pass


    # Enter a parse tree produced by HTMLParser#scriptletOrSeaWs.
    def enterScriptletOrSeaWs(self, ctx:HTMLParser.ScriptletOrSeaWsContext):
        pass

    # Exit a parse tree produced by HTMLParser#scriptletOrSeaWs.
    def exitScriptletOrSeaWs(self, ctx:HTMLParser.ScriptletOrSeaWsContext):
        pass


    # Enter a parse tree produced by HTMLParser#htmlElements.
    def enterHtmlElements(self, ctx:HTMLParser.HtmlElementsContext):
        pass

    # Exit a parse tree produced by HTMLParser#htmlElements.
    def exitHtmlElements(self, ctx:HTMLParser.HtmlElementsContext):
        pass


    # Enter a parse tree produced by HTMLParser#htmlElement.
    def enterHtmlElement(self, ctx:HTMLParser.HtmlElementContext):
        pass

    # Exit a parse tree produced by HTMLParser#htmlElement.
    def exitHtmlElement(self, ctx:HTMLParser.HtmlElementContext):
        pass


    # Enter a parse tree produced by HTMLParser#htmlContent.
    def enterHtmlContent(self, ctx:HTMLParser.HtmlContentContext):
        pass

    # Exit a parse tree produced by HTMLParser#htmlContent.
    def exitHtmlContent(self, ctx:HTMLParser.HtmlContentContext):
        pass


    # Enter a parse tree produced by HTMLParser#htmlAttribute.
    def enterHtmlAttribute(self, ctx:HTMLParser.HtmlAttributeContext):
        pass

    # Exit a parse tree produced by HTMLParser#htmlAttribute.
    def exitHtmlAttribute(self, ctx:HTMLParser.HtmlAttributeContext):
        pass


    # Enter a parse tree produced by HTMLParser#htmlChardata.
    def enterHtmlChardata(self, ctx:HTMLParser.HtmlChardataContext):
        pass

    # Exit a parse tree produced by HTMLParser#htmlChardata.
    def exitHtmlChardata(self, ctx:HTMLParser.HtmlChardataContext):
        pass


    # Enter a parse tree produced by HTMLParser#htmlMisc.
    def enterHtmlMisc(self, ctx:HTMLParser.HtmlMiscContext):
        pass

    # Exit a parse tree produced by HTMLParser#htmlMisc.
    def exitHtmlMisc(self, ctx:HTMLParser.HtmlMiscContext):
        pass


    # Enter a parse tree produced by HTMLParser#htmlComment.
    def enterHtmlComment(self, ctx:HTMLParser.HtmlCommentContext):
        pass

    # Exit a parse tree produced by HTMLParser#htmlComment.
    def exitHtmlComment(self, ctx:HTMLParser.HtmlCommentContext):
        pass


    # Enter a parse tree produced by HTMLParser#script.
    def enterScript(self, ctx:HTMLParser.ScriptContext):
        pass

    # Exit a parse tree produced by HTMLParser#script.
    def exitScript(self, ctx:HTMLParser.ScriptContext):
        pass


    # Enter a parse tree produced by HTMLParser#style.
    def enterStyle(self, ctx:HTMLParser.StyleContext):
        pass

    # Exit a parse tree produced by HTMLParser#style.
    def exitStyle(self, ctx:HTMLParser.StyleContext):
        pass


    # Enter a parse tree produced by HTMLParser#stylesheet.
    def enterStylesheet(self, ctx:HTMLParser.StylesheetContext):
        pass

    # Exit a parse tree produced by HTMLParser#stylesheet.
    def exitStylesheet(self, ctx:HTMLParser.StylesheetContext):
        pass


    # Enter a parse tree produced by HTMLParser#goodCharset.
    def enterGoodCharset(self, ctx:HTMLParser.GoodCharsetContext):
        pass

    # Exit a parse tree produced by HTMLParser#goodCharset.
    def exitGoodCharset(self, ctx:HTMLParser.GoodCharsetContext):
        pass


    # Enter a parse tree produced by HTMLParser#badCharset.
    def enterBadCharset(self, ctx:HTMLParser.BadCharsetContext):
        pass

    # Exit a parse tree produced by HTMLParser#badCharset.
    def exitBadCharset(self, ctx:HTMLParser.BadCharsetContext):
        pass


    # Enter a parse tree produced by HTMLParser#goodImport.
    def enterGoodImport(self, ctx:HTMLParser.GoodImportContext):
        pass

    # Exit a parse tree produced by HTMLParser#goodImport.
    def exitGoodImport(self, ctx:HTMLParser.GoodImportContext):
        pass


    # Enter a parse tree produced by HTMLParser#badImport.
    def enterBadImport(self, ctx:HTMLParser.BadImportContext):
        pass

    # Exit a parse tree produced by HTMLParser#badImport.
    def exitBadImport(self, ctx:HTMLParser.BadImportContext):
        pass


    # Enter a parse tree produced by HTMLParser#goodNamespace.
    def enterGoodNamespace(self, ctx:HTMLParser.GoodNamespaceContext):
        pass

    # Exit a parse tree produced by HTMLParser#goodNamespace.
    def exitGoodNamespace(self, ctx:HTMLParser.GoodNamespaceContext):
        pass


    # Enter a parse tree produced by HTMLParser#badNamespace.
    def enterBadNamespace(self, ctx:HTMLParser.BadNamespaceContext):
        pass

    # Exit a parse tree produced by HTMLParser#badNamespace.
    def exitBadNamespace(self, ctx:HTMLParser.BadNamespaceContext):
        pass


    # Enter a parse tree produced by HTMLParser#namespacePrefix.
    def enterNamespacePrefix(self, ctx:HTMLParser.NamespacePrefixContext):
        pass

    # Exit a parse tree produced by HTMLParser#namespacePrefix.
    def exitNamespacePrefix(self, ctx:HTMLParser.NamespacePrefixContext):
        pass


    # Enter a parse tree produced by HTMLParser#media.
    def enterMedia(self, ctx:HTMLParser.MediaContext):
        pass

    # Exit a parse tree produced by HTMLParser#media.
    def exitMedia(self, ctx:HTMLParser.MediaContext):
        pass


    # Enter a parse tree produced by HTMLParser#mediaQueryList.
    def enterMediaQueryList(self, ctx:HTMLParser.MediaQueryListContext):
        pass

    # Exit a parse tree produced by HTMLParser#mediaQueryList.
    def exitMediaQueryList(self, ctx:HTMLParser.MediaQueryListContext):
        pass


    # Enter a parse tree produced by HTMLParser#mediaQuery.
    def enterMediaQuery(self, ctx:HTMLParser.MediaQueryContext):
        pass

    # Exit a parse tree produced by HTMLParser#mediaQuery.
    def exitMediaQuery(self, ctx:HTMLParser.MediaQueryContext):
        pass


    # Enter a parse tree produced by HTMLParser#mediaType.
    def enterMediaType(self, ctx:HTMLParser.MediaTypeContext):
        pass

    # Exit a parse tree produced by HTMLParser#mediaType.
    def exitMediaType(self, ctx:HTMLParser.MediaTypeContext):
        pass


    # Enter a parse tree produced by HTMLParser#mediaExpression.
    def enterMediaExpression(self, ctx:HTMLParser.MediaExpressionContext):
        pass

    # Exit a parse tree produced by HTMLParser#mediaExpression.
    def exitMediaExpression(self, ctx:HTMLParser.MediaExpressionContext):
        pass


    # Enter a parse tree produced by HTMLParser#mediaFeature.
    def enterMediaFeature(self, ctx:HTMLParser.MediaFeatureContext):
        pass

    # Exit a parse tree produced by HTMLParser#mediaFeature.
    def exitMediaFeature(self, ctx:HTMLParser.MediaFeatureContext):
        pass


    # Enter a parse tree produced by HTMLParser#page.
    def enterPage(self, ctx:HTMLParser.PageContext):
        pass

    # Exit a parse tree produced by HTMLParser#page.
    def exitPage(self, ctx:HTMLParser.PageContext):
        pass


    # Enter a parse tree produced by HTMLParser#pseudoPage.
    def enterPseudoPage(self, ctx:HTMLParser.PseudoPageContext):
        pass

    # Exit a parse tree produced by HTMLParser#pseudoPage.
    def exitPseudoPage(self, ctx:HTMLParser.PseudoPageContext):
        pass


    # Enter a parse tree produced by HTMLParser#selectorGroup.
    def enterSelectorGroup(self, ctx:HTMLParser.SelectorGroupContext):
        pass

    # Exit a parse tree produced by HTMLParser#selectorGroup.
    def exitSelectorGroup(self, ctx:HTMLParser.SelectorGroupContext):
        pass


    # Enter a parse tree produced by HTMLParser#selector.
    def enterSelector(self, ctx:HTMLParser.SelectorContext):
        pass

    # Exit a parse tree produced by HTMLParser#selector.
    def exitSelector(self, ctx:HTMLParser.SelectorContext):
        pass


    # Enter a parse tree produced by HTMLParser#combinator.
    def enterCombinator(self, ctx:HTMLParser.CombinatorContext):
        pass

    # Exit a parse tree produced by HTMLParser#combinator.
    def exitCombinator(self, ctx:HTMLParser.CombinatorContext):
        pass


    # Enter a parse tree produced by HTMLParser#simpleSelectorSequence.
    def enterSimpleSelectorSequence(self, ctx:HTMLParser.SimpleSelectorSequenceContext):
        pass

    # Exit a parse tree produced by HTMLParser#simpleSelectorSequence.
    def exitSimpleSelectorSequence(self, ctx:HTMLParser.SimpleSelectorSequenceContext):
        pass


    # Enter a parse tree produced by HTMLParser#typeSelector.
    def enterTypeSelector(self, ctx:HTMLParser.TypeSelectorContext):
        pass

    # Exit a parse tree produced by HTMLParser#typeSelector.
    def exitTypeSelector(self, ctx:HTMLParser.TypeSelectorContext):
        pass


    # Enter a parse tree produced by HTMLParser#typeNamespacePrefix.
    def enterTypeNamespacePrefix(self, ctx:HTMLParser.TypeNamespacePrefixContext):
        pass

    # Exit a parse tree produced by HTMLParser#typeNamespacePrefix.
    def exitTypeNamespacePrefix(self, ctx:HTMLParser.TypeNamespacePrefixContext):
        pass


    # Enter a parse tree produced by HTMLParser#elementName.
    def enterElementName(self, ctx:HTMLParser.ElementNameContext):
        pass

    # Exit a parse tree produced by HTMLParser#elementName.
    def exitElementName(self, ctx:HTMLParser.ElementNameContext):
        pass


    # Enter a parse tree produced by HTMLParser#universal.
    def enterUniversal(self, ctx:HTMLParser.UniversalContext):
        pass

    # Exit a parse tree produced by HTMLParser#universal.
    def exitUniversal(self, ctx:HTMLParser.UniversalContext):
        pass


    # Enter a parse tree produced by HTMLParser#className.
    def enterClassName(self, ctx:HTMLParser.ClassNameContext):
        pass

    # Exit a parse tree produced by HTMLParser#className.
    def exitClassName(self, ctx:HTMLParser.ClassNameContext):
        pass


    # Enter a parse tree produced by HTMLParser#attrib.
    def enterAttrib(self, ctx:HTMLParser.AttribContext):
        pass

    # Exit a parse tree produced by HTMLParser#attrib.
    def exitAttrib(self, ctx:HTMLParser.AttribContext):
        pass


    # Enter a parse tree produced by HTMLParser#pseudo.
    def enterPseudo(self, ctx:HTMLParser.PseudoContext):
        pass

    # Exit a parse tree produced by HTMLParser#pseudo.
    def exitPseudo(self, ctx:HTMLParser.PseudoContext):
        pass


    # Enter a parse tree produced by HTMLParser#functionalPseudo.
    def enterFunctionalPseudo(self, ctx:HTMLParser.FunctionalPseudoContext):
        pass

    # Exit a parse tree produced by HTMLParser#functionalPseudo.
    def exitFunctionalPseudo(self, ctx:HTMLParser.FunctionalPseudoContext):
        pass


    # Enter a parse tree produced by HTMLParser#expression.
    def enterExpression(self, ctx:HTMLParser.ExpressionContext):
        pass

    # Exit a parse tree produced by HTMLParser#expression.
    def exitExpression(self, ctx:HTMLParser.ExpressionContext):
        pass


    # Enter a parse tree produced by HTMLParser#negation.
    def enterNegation(self, ctx:HTMLParser.NegationContext):
        pass

    # Exit a parse tree produced by HTMLParser#negation.
    def exitNegation(self, ctx:HTMLParser.NegationContext):
        pass


    # Enter a parse tree produced by HTMLParser#negationArg.
    def enterNegationArg(self, ctx:HTMLParser.NegationArgContext):
        pass

    # Exit a parse tree produced by HTMLParser#negationArg.
    def exitNegationArg(self, ctx:HTMLParser.NegationArgContext):
        pass


    # Enter a parse tree produced by HTMLParser#knownRuleset.
    def enterKnownRuleset(self, ctx:HTMLParser.KnownRulesetContext):
        pass

    # Exit a parse tree produced by HTMLParser#knownRuleset.
    def exitKnownRuleset(self, ctx:HTMLParser.KnownRulesetContext):
        pass


    # Enter a parse tree produced by HTMLParser#unknownRuleset.
    def enterUnknownRuleset(self, ctx:HTMLParser.UnknownRulesetContext):
        pass

    # Exit a parse tree produced by HTMLParser#unknownRuleset.
    def exitUnknownRuleset(self, ctx:HTMLParser.UnknownRulesetContext):
        pass


    # Enter a parse tree produced by HTMLParser#declarationList.
    def enterDeclarationList(self, ctx:HTMLParser.DeclarationListContext):
        pass

    # Exit a parse tree produced by HTMLParser#declarationList.
    def exitDeclarationList(self, ctx:HTMLParser.DeclarationListContext):
        pass


    # Enter a parse tree produced by HTMLParser#knownDeclaration.
    def enterKnownDeclaration(self, ctx:HTMLParser.KnownDeclarationContext):
        pass

    # Exit a parse tree produced by HTMLParser#knownDeclaration.
    def exitKnownDeclaration(self, ctx:HTMLParser.KnownDeclarationContext):
        pass


    # Enter a parse tree produced by HTMLParser#unknownDeclaration.
    def enterUnknownDeclaration(self, ctx:HTMLParser.UnknownDeclarationContext):
        pass

    # Exit a parse tree produced by HTMLParser#unknownDeclaration.
    def exitUnknownDeclaration(self, ctx:HTMLParser.UnknownDeclarationContext):
        pass


    # Enter a parse tree produced by HTMLParser#prio.
    def enterPrio(self, ctx:HTMLParser.PrioContext):
        pass

    # Exit a parse tree produced by HTMLParser#prio.
    def exitPrio(self, ctx:HTMLParser.PrioContext):
        pass


    # Enter a parse tree produced by HTMLParser#value.
    def enterValue(self, ctx:HTMLParser.ValueContext):
        pass

    # Exit a parse tree produced by HTMLParser#value.
    def exitValue(self, ctx:HTMLParser.ValueContext):
        pass


    # Enter a parse tree produced by HTMLParser#expr.
    def enterExpr(self, ctx:HTMLParser.ExprContext):
        pass

    # Exit a parse tree produced by HTMLParser#expr.
    def exitExpr(self, ctx:HTMLParser.ExprContext):
        pass


    # Enter a parse tree produced by HTMLParser#term.
    def enterTerm(self, ctx:HTMLParser.TermContext):
        pass

    # Exit a parse tree produced by HTMLParser#term.
    def exitTerm(self, ctx:HTMLParser.TermContext):
        pass


    # Enter a parse tree produced by HTMLParser#function_.
    def enterFunction_(self, ctx:HTMLParser.Function_Context):
        pass

    # Exit a parse tree produced by HTMLParser#function_.
    def exitFunction_(self, ctx:HTMLParser.Function_Context):
        pass


    # Enter a parse tree produced by HTMLParser#dxImageTransform.
    def enterDxImageTransform(self, ctx:HTMLParser.DxImageTransformContext):
        pass

    # Exit a parse tree produced by HTMLParser#dxImageTransform.
    def exitDxImageTransform(self, ctx:HTMLParser.DxImageTransformContext):
        pass


    # Enter a parse tree produced by HTMLParser#hexcolor.
    def enterHexcolor(self, ctx:HTMLParser.HexcolorContext):
        pass

    # Exit a parse tree produced by HTMLParser#hexcolor.
    def exitHexcolor(self, ctx:HTMLParser.HexcolorContext):
        pass


    # Enter a parse tree produced by HTMLParser#number.
    def enterNumber(self, ctx:HTMLParser.NumberContext):
        pass

    # Exit a parse tree produced by HTMLParser#number.
    def exitNumber(self, ctx:HTMLParser.NumberContext):
        pass


    # Enter a parse tree produced by HTMLParser#percentage.
    def enterPercentage(self, ctx:HTMLParser.PercentageContext):
        pass

    # Exit a parse tree produced by HTMLParser#percentage.
    def exitPercentage(self, ctx:HTMLParser.PercentageContext):
        pass


    # Enter a parse tree produced by HTMLParser#dimension.
    def enterDimension(self, ctx:HTMLParser.DimensionContext):
        pass

    # Exit a parse tree produced by HTMLParser#dimension.
    def exitDimension(self, ctx:HTMLParser.DimensionContext):
        pass


    # Enter a parse tree produced by HTMLParser#unknownDimension.
    def enterUnknownDimension(self, ctx:HTMLParser.UnknownDimensionContext):
        pass

    # Exit a parse tree produced by HTMLParser#unknownDimension.
    def exitUnknownDimension(self, ctx:HTMLParser.UnknownDimensionContext):
        pass


    # Enter a parse tree produced by HTMLParser#any_.
    def enterAny_(self, ctx:HTMLParser.Any_Context):
        pass

    # Exit a parse tree produced by HTMLParser#any_.
    def exitAny_(self, ctx:HTMLParser.Any_Context):
        pass


    # Enter a parse tree produced by HTMLParser#unknownAtRule.
    def enterUnknownAtRule(self, ctx:HTMLParser.UnknownAtRuleContext):
        pass

    # Exit a parse tree produced by HTMLParser#unknownAtRule.
    def exitUnknownAtRule(self, ctx:HTMLParser.UnknownAtRuleContext):
        pass


    # Enter a parse tree produced by HTMLParser#unused.
    def enterUnused(self, ctx:HTMLParser.UnusedContext):
        pass

    # Exit a parse tree produced by HTMLParser#unused.
    def exitUnused(self, ctx:HTMLParser.UnusedContext):
        pass


    # Enter a parse tree produced by HTMLParser#block.
    def enterBlock(self, ctx:HTMLParser.BlockContext):
        pass

    # Exit a parse tree produced by HTMLParser#block.
    def exitBlock(self, ctx:HTMLParser.BlockContext):
        pass


    # Enter a parse tree produced by HTMLParser#nestedStatement.
    def enterNestedStatement(self, ctx:HTMLParser.NestedStatementContext):
        pass

    # Exit a parse tree produced by HTMLParser#nestedStatement.
    def exitNestedStatement(self, ctx:HTMLParser.NestedStatementContext):
        pass


    # Enter a parse tree produced by HTMLParser#groupRuleBody.
    def enterGroupRuleBody(self, ctx:HTMLParser.GroupRuleBodyContext):
        pass

    # Exit a parse tree produced by HTMLParser#groupRuleBody.
    def exitGroupRuleBody(self, ctx:HTMLParser.GroupRuleBodyContext):
        pass


    # Enter a parse tree produced by HTMLParser#supportsRule.
    def enterSupportsRule(self, ctx:HTMLParser.SupportsRuleContext):
        pass

    # Exit a parse tree produced by HTMLParser#supportsRule.
    def exitSupportsRule(self, ctx:HTMLParser.SupportsRuleContext):
        pass


    # Enter a parse tree produced by HTMLParser#supportsCondition.
    def enterSupportsCondition(self, ctx:HTMLParser.SupportsConditionContext):
        pass

    # Exit a parse tree produced by HTMLParser#supportsCondition.
    def exitSupportsCondition(self, ctx:HTMLParser.SupportsConditionContext):
        pass


    # Enter a parse tree produced by HTMLParser#supportsConditionInParens.
    def enterSupportsConditionInParens(self, ctx:HTMLParser.SupportsConditionInParensContext):
        pass

    # Exit a parse tree produced by HTMLParser#supportsConditionInParens.
    def exitSupportsConditionInParens(self, ctx:HTMLParser.SupportsConditionInParensContext):
        pass


    # Enter a parse tree produced by HTMLParser#supportsNegation.
    def enterSupportsNegation(self, ctx:HTMLParser.SupportsNegationContext):
        pass

    # Exit a parse tree produced by HTMLParser#supportsNegation.
    def exitSupportsNegation(self, ctx:HTMLParser.SupportsNegationContext):
        pass


    # Enter a parse tree produced by HTMLParser#supportsConjunction.
    def enterSupportsConjunction(self, ctx:HTMLParser.SupportsConjunctionContext):
        pass

    # Exit a parse tree produced by HTMLParser#supportsConjunction.
    def exitSupportsConjunction(self, ctx:HTMLParser.SupportsConjunctionContext):
        pass


    # Enter a parse tree produced by HTMLParser#supportsDisjunction.
    def enterSupportsDisjunction(self, ctx:HTMLParser.SupportsDisjunctionContext):
        pass

    # Exit a parse tree produced by HTMLParser#supportsDisjunction.
    def exitSupportsDisjunction(self, ctx:HTMLParser.SupportsDisjunctionContext):
        pass


    # Enter a parse tree produced by HTMLParser#supportsDeclarationCondition.
    def enterSupportsDeclarationCondition(self, ctx:HTMLParser.SupportsDeclarationConditionContext):
        pass

    # Exit a parse tree produced by HTMLParser#supportsDeclarationCondition.
    def exitSupportsDeclarationCondition(self, ctx:HTMLParser.SupportsDeclarationConditionContext):
        pass


    # Enter a parse tree produced by HTMLParser#generalEnclosed.
    def enterGeneralEnclosed(self, ctx:HTMLParser.GeneralEnclosedContext):
        pass

    # Exit a parse tree produced by HTMLParser#generalEnclosed.
    def exitGeneralEnclosed(self, ctx:HTMLParser.GeneralEnclosedContext):
        pass


    # Enter a parse tree produced by HTMLParser#url.
    def enterUrl(self, ctx:HTMLParser.UrlContext):
        pass

    # Exit a parse tree produced by HTMLParser#url.
    def exitUrl(self, ctx:HTMLParser.UrlContext):
        pass


    # Enter a parse tree produced by HTMLParser#var_.
    def enterVar_(self, ctx:HTMLParser.Var_Context):
        pass

    # Exit a parse tree produced by HTMLParser#var_.
    def exitVar_(self, ctx:HTMLParser.Var_Context):
        pass


    # Enter a parse tree produced by HTMLParser#calc.
    def enterCalc(self, ctx:HTMLParser.CalcContext):
        pass

    # Exit a parse tree produced by HTMLParser#calc.
    def exitCalc(self, ctx:HTMLParser.CalcContext):
        pass


    # Enter a parse tree produced by HTMLParser#calcSum.
    def enterCalcSum(self, ctx:HTMLParser.CalcSumContext):
        pass

    # Exit a parse tree produced by HTMLParser#calcSum.
    def exitCalcSum(self, ctx:HTMLParser.CalcSumContext):
        pass


    # Enter a parse tree produced by HTMLParser#calcProduct.
    def enterCalcProduct(self, ctx:HTMLParser.CalcProductContext):
        pass

    # Exit a parse tree produced by HTMLParser#calcProduct.
    def exitCalcProduct(self, ctx:HTMLParser.CalcProductContext):
        pass


    # Enter a parse tree produced by HTMLParser#calcValue.
    def enterCalcValue(self, ctx:HTMLParser.CalcValueContext):
        pass

    # Exit a parse tree produced by HTMLParser#calcValue.
    def exitCalcValue(self, ctx:HTMLParser.CalcValueContext):
        pass


    # Enter a parse tree produced by HTMLParser#fontFaceRule.
    def enterFontFaceRule(self, ctx:HTMLParser.FontFaceRuleContext):
        pass

    # Exit a parse tree produced by HTMLParser#fontFaceRule.
    def exitFontFaceRule(self, ctx:HTMLParser.FontFaceRuleContext):
        pass


    # Enter a parse tree produced by HTMLParser#fontFaceDeclaration.
    def enterFontFaceDeclaration(self, ctx:HTMLParser.FontFaceDeclarationContext):
        pass

    # Exit a parse tree produced by HTMLParser#fontFaceDeclaration.
    def exitFontFaceDeclaration(self, ctx:HTMLParser.FontFaceDeclarationContext):
        pass


    # Enter a parse tree produced by HTMLParser#keyframesRule.
    def enterKeyframesRule(self, ctx:HTMLParser.KeyframesRuleContext):
        pass

    # Exit a parse tree produced by HTMLParser#keyframesRule.
    def exitKeyframesRule(self, ctx:HTMLParser.KeyframesRuleContext):
        pass


    # Enter a parse tree produced by HTMLParser#keyframeBlock.
    def enterKeyframeBlock(self, ctx:HTMLParser.KeyframeBlockContext):
        pass

    # Exit a parse tree produced by HTMLParser#keyframeBlock.
    def exitKeyframeBlock(self, ctx:HTMLParser.KeyframeBlockContext):
        pass


    # Enter a parse tree produced by HTMLParser#keyframeSelector.
    def enterKeyframeSelector(self, ctx:HTMLParser.KeyframeSelectorContext):
        pass

    # Exit a parse tree produced by HTMLParser#keyframeSelector.
    def exitKeyframeSelector(self, ctx:HTMLParser.KeyframeSelectorContext):
        pass


    # Enter a parse tree produced by HTMLParser#viewport.
    def enterViewport(self, ctx:HTMLParser.ViewportContext):
        pass

    # Exit a parse tree produced by HTMLParser#viewport.
    def exitViewport(self, ctx:HTMLParser.ViewportContext):
        pass


    # Enter a parse tree produced by HTMLParser#counterStyle.
    def enterCounterStyle(self, ctx:HTMLParser.CounterStyleContext):
        pass

    # Exit a parse tree produced by HTMLParser#counterStyle.
    def exitCounterStyle(self, ctx:HTMLParser.CounterStyleContext):
        pass


    # Enter a parse tree produced by HTMLParser#fontFeatureValuesRule.
    def enterFontFeatureValuesRule(self, ctx:HTMLParser.FontFeatureValuesRuleContext):
        pass

    # Exit a parse tree produced by HTMLParser#fontFeatureValuesRule.
    def exitFontFeatureValuesRule(self, ctx:HTMLParser.FontFeatureValuesRuleContext):
        pass


    # Enter a parse tree produced by HTMLParser#fontFamilyNameList.
    def enterFontFamilyNameList(self, ctx:HTMLParser.FontFamilyNameListContext):
        pass

    # Exit a parse tree produced by HTMLParser#fontFamilyNameList.
    def exitFontFamilyNameList(self, ctx:HTMLParser.FontFamilyNameListContext):
        pass


    # Enter a parse tree produced by HTMLParser#fontFamilyName.
    def enterFontFamilyName(self, ctx:HTMLParser.FontFamilyNameContext):
        pass

    # Exit a parse tree produced by HTMLParser#fontFamilyName.
    def exitFontFamilyName(self, ctx:HTMLParser.FontFamilyNameContext):
        pass


    # Enter a parse tree produced by HTMLParser#featureValueBlock.
    def enterFeatureValueBlock(self, ctx:HTMLParser.FeatureValueBlockContext):
        pass

    # Exit a parse tree produced by HTMLParser#featureValueBlock.
    def exitFeatureValueBlock(self, ctx:HTMLParser.FeatureValueBlockContext):
        pass


    # Enter a parse tree produced by HTMLParser#featureType.
    def enterFeatureType(self, ctx:HTMLParser.FeatureTypeContext):
        pass

    # Exit a parse tree produced by HTMLParser#featureType.
    def exitFeatureType(self, ctx:HTMLParser.FeatureTypeContext):
        pass


    # Enter a parse tree produced by HTMLParser#featureValueDefinition.
    def enterFeatureValueDefinition(self, ctx:HTMLParser.FeatureValueDefinitionContext):
        pass

    # Exit a parse tree produced by HTMLParser#featureValueDefinition.
    def exitFeatureValueDefinition(self, ctx:HTMLParser.FeatureValueDefinitionContext):
        pass


    # Enter a parse tree produced by HTMLParser#ident.
    def enterIdent(self, ctx:HTMLParser.IdentContext):
        pass

    # Exit a parse tree produced by HTMLParser#ident.
    def exitIdent(self, ctx:HTMLParser.IdentContext):
        pass


    # Enter a parse tree produced by HTMLParser#property_.
    def enterProperty_(self, ctx:HTMLParser.Property_Context):
        pass

    # Exit a parse tree produced by HTMLParser#property_.
    def exitProperty_(self, ctx:HTMLParser.Property_Context):
        pass


    # Enter a parse tree produced by HTMLParser#operator_.
    def enterOperator_(self, ctx:HTMLParser.Operator_Context):
        pass

    # Exit a parse tree produced by HTMLParser#operator_.
    def exitOperator_(self, ctx:HTMLParser.Operator_Context):
        pass


    # Enter a parse tree produced by HTMLParser#ws.
    def enterWs(self, ctx:HTMLParser.WsContext):
        pass

    # Exit a parse tree produced by HTMLParser#ws.
    def exitWs(self, ctx:HTMLParser.WsContext):
        pass



del HTMLParser