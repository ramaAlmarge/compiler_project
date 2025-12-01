parser grammar HTMLParser;

options { tokenVocab = HTMLLexer; }

htmlDocument
    : scriptletOrSeaWs* XML? scriptletOrSeaWs* DTD? scriptletOrSeaWs* htmlElements*
    ;

scriptletOrSeaWs
    : SCRIPTLET
    | SEA_WS
    ;

htmlElements
    : htmlMisc* htmlElement htmlMisc*
    ;

htmlElement
    : TAG_OPEN TAG_NAME htmlAttribute* (
        TAG_CLOSE (htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE)?
        | TAG_SLASH_CLOSE
    )
    | SCRIPTLET
    | script
    | style
    ;

htmlContent
    : htmlChardata? ((htmlElement | CDATA | htmlComment) htmlChardata?)*
    ;

htmlAttribute
    : TAG_NAME (TAG_EQUALS ATTVALUE_VALUE)?
    ;

htmlChardata
    : HTML_TEXT
    | SEA_WS
    ;

htmlMisc
    : htmlComment
    | SEA_WS
    ;

htmlComment
    : HTML_COMMENT
    | HTML_CONDITIONAL_COMMENT
    ;

script
    : SCRIPT_OPEN (SCRIPT_BODY | SCRIPT_SHORT_BODY)
    ;

style
    : STYLE_OPEN (STYLE_BODY | STYLE_SHORT_BODY)
    ;

// --- CSS subset/parser rules (stylesheet) ---
stylesheet
    : ws (charset ( Comment | Space | Cdo | Cdc)*)* (imports ( Comment | Space | Cdo | Cdc)*)* (
        namespace_ ( Comment | Space | Cdo | Cdc)* )* (nestedStatement ( Comment | Space | Cdo | Cdc)*)* EOF
    ;

charset
    : Charset ws String_ ws SEMI ws # goodCharset
    | Charset ws String_ ws        # badCharset
    ;

imports
    : Import ws (String_ | url) ws mediaQueryList SEMI ws # goodImport
    | Import ws ( String_ | url) ws SEMI ws               # goodImport
    | Import ws ( String_ | url) ws mediaQueryList       # badImport
    | Import ws ( String_ | url) ws                      # badImport
    ;

namespace_
    : Namespace ws (namespacePrefix ws)? (String_ | url) ws SEMI ws # goodNamespace
    | Namespace ws (namespacePrefix ws)? ( String_ | url) ws       # badNamespace
    ;

namespacePrefix
    : ident
    ;

// many CSS rules (selector, ruleset, declaration, expr...) kept minimal for parser completeness
media
    : Media ws mediaQueryList groupRuleBody ws
    ;

mediaQueryList
    : (mediaQuery ( Comma ws mediaQuery)*)? ws
    ;

mediaQuery
    : (MediaOnly | Not)? ws mediaType ws (And ws mediaExpression)*
    | mediaExpression ( And ws mediaExpression)*
    ;

mediaType: ident;
mediaExpression: LPAREN ws mediaFeature (COLON ws expr)? RPAREN ws;
mediaFeature: ident ws;

page
    : Page ws pseudoPage? LBRACE  ws declaration? (SEMI ws declaration?)* RBRACE  ws
    ;

pseudoPage: COLON ident ws;

// selectors and many CSS production rules included (you can extend as needed)
selectorGroup: selector (Comma ws selector)*;
selector: simpleSelectorSequence ws (combinator simpleSelectorSequence ws)*;
combinator: Plus ws | Greater ws | Tilde ws | Space ws;
simpleSelectorSequence
    : (typeSelector | universal) (Hash | className | attrib | pseudo | negation)*
    | ( Hash | className | attrib | pseudo | negation)+
    ;
typeSelector: typeNamespacePrefix? elementName;
typeNamespacePrefix: (ident | STAR)? PIPE;
elementName: ident;
universal: typeNamespacePrefix? STAR;
className: DOT ident;
attrib
    : LBRACK ws typeNamespacePrefix? ident ws (
        (PrefixMatch | SuffixMatch | SubstringMatch | Equal | Includes | DashMatch) ws (
            ident
            | String_
        ) ws
    )? RBRACK
    ;
pseudo: COLON COLON? (ident | functionalPseudo);
functionalPseudo: Function_ ws expression RPAREN;
expression: (( Plus | Minus | Dimension | UnknownDimension | Number | String_ | ident) ws)+;
negation: PseudoNot ws negationArg ws RPAREN;
negationArg: typeSelector | universal | Hash | className | attrib | pseudo;

// ruleset / declarations (summary)
ruleset
    : selectorGroup LBRACE  ws declarationList? RBRACE ws # knownRuleset
    | any_* LBRACE  ws declarationList? RBRACE ws         # unknownRuleset
    ;
declarationList: (SEMI ws)* declaration ws (SEMI ws declaration?)*;
declaration
    : property_ COLON ws expr prio? # knownDeclaration
    | property_ COLON ws value      # unknownDeclaration
    ;
prio: Important ws;
value: (any_ | block | AtKeyword ws)+;
expr: term (operator_? term)*;
term
    : number ws
    | percentage ws
    | dimension ws
    | String_ ws
    | UnicodeRange ws
    | ident ws
    | var_
    | url ws
    | hexcolor
    | calc
    | function_
    | unknownDimension ws
    | dxImageTransform
    ;
function_: Function_ ws expr RPAREN  ws;
dxImageTransform: DxImageTransform ws expr  ws;
hexcolor: Hash ws;
number: (Plus | Minus)? Number;
percentage: (Plus | Minus)? Percentage;
dimension: (Plus | Minus)? Dimension;
unknownDimension: (Plus | Minus)? UnknownDimension;

// error / helper productions
any_
    : ident ws
    | number ws
    | percentage ws
    | dimension ws
    | unknownDimension ws
    | String_ ws
    | url ws
    | Hash ws
    | UnicodeRange ws
    | Includes ws
    | DashMatch ws
    | COLON ws
    | Function_ ws ( any_ | unused)* RPAREN ws
    | LPAREN   ws ( any_ | unused)* RPAREN ws
    | LBRACK  ws ( any_ | unused)* RBRACK  ws
    ;
atRule: AtKeyword ws any_* (block | SEMI ws) # unknownAtRule;
unused: block | AtKeyword ws | SEMI ws | Cdo ws | Cdc ws;
block: LBRACE  ws (declarationList | nestedStatement | any_ | block | AtKeyword ws | SEMI ws)* RBRACE ws;
nestedStatement: ruleset | media | page | fontFaceRule | keyframesRule | supportsRule | viewport | counterStyle | fontFeatureValuesRule | atRule;
groupRuleBody: LBRACE  ws nestedStatement* RBRACE ws;
supportsRule: Supports ws supportsCondition ws groupRuleBody;
supportsCondition: supportsNegation | supportsConjunction | supportsDisjunction | supportsConditionInParens;
supportsConditionInParens: LPAREN ws supportsCondition ws RPAREN  ws | supportsDeclarationCondition | generalEnclosed;
supportsNegation: Not ws Space ws supportsConditionInParens;
supportsConjunction: supportsConditionInParens (ws Space ws And ws Space ws supportsConditionInParens)+;
supportsDisjunction: supportsConditionInParens (ws Space ws Or ws Space ws supportsConditionInParens)+;
supportsDeclarationCondition: LPAREN ws declaration RPAREN ;
generalEnclosed: (Function_ | LPAREN) (any_ | unused)* RPAREN ;
url: Url_ ws String_ ws RPAREN  ws | Url;
var_: Var ws Variable ws RPAREN  ws;
calc: Calc ws calcSum RPAREN  ws;
calcSum: calcProduct (Space ws ( Plus | Minus) ws Space ws calcProduct)*;
calcProduct: calcValue (STAR ws calcValue | Divide ws number ws)*;
calcValue: number ws | dimension ws | unknownDimension ws | percentage ws | LPAREN ws calcSum RPAREN  ws;
fontFaceRule: FontFace ws LBRACE  ws fontFaceDeclaration? (SEMI ws fontFaceDeclaration?)* RBRACE ws;
fontFaceDeclaration: property_ COLON ws expr  | property_ COLON ws value ;
keyframesRule: Keyframes ws Space ws ident ws LBRACE  ws keyframeBlock* RBRACE ws;
keyframeBlock: (keyframeSelector LBRACE ws declarationList? RBRACE ws);
keyframeSelector: (From | To | Percentage) ws (Comma ws ( From | To | Percentage) ws)*;
viewport: Viewport ws LBRACE  ws declarationList? RBRACE  ws;
counterStyle: CounterStyle ws ident ws LBRACE  ws declarationList? RBRACE ws;
fontFeatureValuesRule: FontFeatureValues ws fontFamilyNameList ws LBRACE  ws featureValueBlock* RBRACE ws;
fontFamilyNameList: fontFamilyName (ws Comma ws fontFamilyName)*;
fontFamilyName: String_ | ident ( ws ident)*;
featureValueBlock: featureType ws LBRACE  ws featureValueDefinition? (ws SEMI ws featureValueDefinition?)* RBRACE ws;
featureType: AtKeyword;
featureValueDefinition: ident ws COLON ws number (ws number)*;
ident: Ident | MediaOnly | Not | And | Or | From | To;
// ------------------------------------
// Missing rules added for CSS grammar
// ------------------------------------

property_
    : ident
    ;

operator_
    : Plus
    | Minus
    | Multiply
    | Divide
    | Equal
    | Includes
    | DashMatch
    | PrefixMatch
    | SuffixMatch
    | SubstringMatch
    ;

ws: (Comment | Space)*;
