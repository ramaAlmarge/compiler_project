// Generated from C:/Users/Mutaz13/Documents/CompilerProject/src/HTMLParser.g4 by ANTLR 4.13.2

package antlrHTML;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HTMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LBRACE=1, RBRACE=2, LPAREN=3, RPAREN=4, LBRACK=5, RBRACK=6, SEMI=7, COLON=8, 
		COMMA=9, DOT=10, EQ=11, PLUS=12, MINUS=13, STAR=14, SLASH=15, PIPE=16, 
		UNDERSCORE=17, QUESTION=18, AND=19, OR=20, TAG_OPEN=21, TAG_CLOSE=22, 
		HASH=23, TILDE=24, TILDE_EQUALS=25, PIPE_EQUALS=26, CARET_EQUALS=27, DOLLAR_EQUALS=28, 
		STAR_EQUALS=29, DOUBLE_COLON=30, NOT=31, NUMBER=32, VAR=33, ID=34, WS=35, 
		NEWLINE=36, DOUBLE_QUOTE_STRING=37, HTML_COMMENT=38, STYLE_COMMENT=39, 
		IMPORTANT=40, URL=41, AT_RULE=42, IDENT=43, VAR_START=44, VAR_END=45, 
		BLOCK_START=46, BLOCK_END=47, COMMENT_START=48, COMMENT_END=49, IF=50, 
		ELIF=51, ELSE=52, ENDIF=53, FOR=54, IN=55, ENDFOR=56, SET=57, BLOCK=58, 
		ENDBLOCK=59, INCLUDE=60, EXTENDS=61;
	public static final int
		RULE_root = 0, RULE_html_content = 1, RULE_tag = 2, RULE_tag_content = 3, 
		RULE_ident = 4, RULE_style = 5, RULE_rule = 6, RULE_selector = 7, RULE_simpleSelector = 8, 
		RULE_typeSelector = 9, RULE_universal = 10, RULE_class = 11, RULE_attrib = 12, 
		RULE_pseudo = 13, RULE_pseudoExpr = 14, RULE_combinator = 15, RULE_declaration = 16, 
		RULE_property = 17, RULE_value = 18, RULE_valuePart = 19, RULE_atRule = 20, 
		RULE_atRuleBody = 21, RULE_jinja2 = 22, RULE_statement = 23, RULE_stmt = 24, 
		RULE_expr = 25, RULE_expr_content = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "html_content", "tag", "tag_content", "ident", "style", "rule", 
			"selector", "simpleSelector", "typeSelector", "universal", "class", "attrib", 
			"pseudo", "pseudoExpr", "combinator", "declaration", "property", "value", 
			"valuePart", "atRule", "atRuleBody", "jinja2", "statement", "stmt", "expr", 
			"expr_content"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "'['", "']'", "';'", "':'", "','", 
			"'.'", "'='", "'+'", "'-'", "'*'", "'/'", "'|'", "'_'", "'?'", "'and'", 
			"'or'", "'<'", "'>'", "'#'", "'~'", "'~='", "'|='", "'^='", "'$='", "'*='", 
			"'::'", "'not'", null, null, null, null, "'\\r\\n'", null, null, null, 
			null, null, null, null, "'{{'", "'}}'", "'{%'", "'%}'", "'{#'", "'#}'", 
			"'if'", "'elif'", "'else'", "'endif'", "'for'", "'in'", "'endfor'", "'set'", 
			"'block'", "'endblock'", "'include'", "'extends'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LBRACE", "RBRACE", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "SEMI", 
			"COLON", "COMMA", "DOT", "EQ", "PLUS", "MINUS", "STAR", "SLASH", "PIPE", 
			"UNDERSCORE", "QUESTION", "AND", "OR", "TAG_OPEN", "TAG_CLOSE", "HASH", 
			"TILDE", "TILDE_EQUALS", "PIPE_EQUALS", "CARET_EQUALS", "DOLLAR_EQUALS", 
			"STAR_EQUALS", "DOUBLE_COLON", "NOT", "NUMBER", "VAR", "ID", "WS", "NEWLINE", 
			"DOUBLE_QUOTE_STRING", "HTML_COMMENT", "STYLE_COMMENT", "IMPORTANT", 
			"URL", "AT_RULE", "IDENT", "VAR_START", "VAR_END", "BLOCK_START", "BLOCK_END", 
			"COMMENT_START", "COMMENT_END", "IF", "ELIF", "ELSE", "ENDIF", "FOR", 
			"IN", "ENDFOR", "SET", "BLOCK", "ENDBLOCK", "INCLUDE", "EXTENDS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "HTMLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HTMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HTMLParser.EOF, 0); }
		public List<Html_contentContext> html_content() {
			return getRuleContexts(Html_contentContext.class);
		}
		public Html_contentContext html_content(int i) {
			return getRuleContext(Html_contentContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 92377261823778L) != 0)) {
				{
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(54);
					html_content();
					}
					}
					setState(57); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 92377261823778L) != 0) );
				}
			}

			setState(61);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Html_contentContext extends ParserRuleContext {
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public Jinja2Context jinja2() {
			return getRuleContext(Jinja2Context.class,0);
		}
		public Html_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtml_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtml_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtml_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_contentContext html_content() throws RecognitionException {
		Html_contentContext _localctx = new Html_contentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_html_content);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				tag();
				}
				break;
			case LBRACE:
			case LBRACK:
			case COLON:
			case COMMA:
			case DOT:
			case PLUS:
			case STAR:
			case TAG_CLOSE:
			case HASH:
			case TILDE:
			case DOUBLE_COLON:
			case ID:
			case AT_RULE:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				style();
				}
				break;
			case VAR_START:
			case BLOCK_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				jinja2();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TagContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(HTMLParser.TAG_OPEN, 0); }
		public Tag_contentContext tag_content() {
			return getRuleContext(Tag_contentContext.class,0);
		}
		public TerminalNode TAG_CLOSE() { return getToken(HTMLParser.TAG_CLOSE, 0); }
		public List<TerminalNode> SLASH() { return getTokens(HTMLParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(HTMLParser.SLASH, i);
		}
		public List<TerminalNode> ID() { return getTokens(HTMLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HTMLParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(HTMLParser.COLON, 0); }
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tag);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(TAG_OPEN);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(69);
				match(SLASH);
				}
			}

			setState(72);
			tag_content();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(73);
				match(SLASH);
				}
			}

			setState(76);
			match(TAG_CLOSE);
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(77);
					match(ID);
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(83);
				match(COLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tag_contentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HTMLParser.ID, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Tag_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterTag_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitTag_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitTag_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tag_contentContext tag_content() throws RecognitionException {
		Tag_contentContext _localctx = new Tag_contentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tag_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(ID);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 154618824704L) != 0)) {
				{
				{
				setState(87);
				ident();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HTMLParser.ID, 0); }
		public TerminalNode EQ() { return getToken(HTMLParser.EQ, 0); }
		public TerminalNode DOUBLE_QUOTE_STRING() { return getToken(HTMLParser.DOUBLE_QUOTE_STRING, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 154618824704L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleContext extends ParserRuleContext {
		public RuleContext rule_() {
			return getRuleContext(RuleContext.class,0);
		}
		public AtRuleContext atRule() {
			return getRuleContext(AtRuleContext.class,0);
		}
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_style);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
			case LBRACK:
			case COLON:
			case COMMA:
			case DOT:
			case PLUS:
			case STAR:
			case TAG_CLOSE:
			case HASH:
			case TILDE:
			case DOUBLE_COLON:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				rule_();
				}
				break;
			case AT_RULE:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				atRule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(HTMLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HTMLParser.RBRACE, 0); }
		public List<TerminalNode> ID() { return getTokens(HTMLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HTMLParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public RuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleContext rule_() throws RecognitionException {
		RuleContext _localctx = new RuleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			selector();
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(100);
				match(ID);
				}
				break;
			}
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(103);
				match(COMMA);
				}
				break;
			}
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(106);
				match(ID);
				}
				break;
			}
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(109);
				match(ID);
				}
				break;
			}
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(112);
				match(COMMA);
				}
			}

			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(115);
				match(ID);
				}
				break;
			}
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(118);
				match(ID);
				}
			}

			setState(121);
			match(LBRACE);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR || _la==ID) {
				{
				{
				setState(122);
				declaration();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public List<SimpleSelectorContext> simpleSelector() {
			return getRuleContexts(SimpleSelectorContext.class);
		}
		public SimpleSelectorContext simpleSelector(int i) {
			return getRuleContext(SimpleSelectorContext.class,i);
		}
		public List<CombinatorContext> combinator() {
			return getRuleContexts(CombinatorContext.class);
		}
		public CombinatorContext combinator(int i) {
			return getRuleContext(CombinatorContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(HTMLParser.COMMA, 0); }
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			simpleSelector();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 20975616L) != 0)) {
				{
				{
				setState(131);
				combinator();
				setState(132);
				simpleSelector();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(139);
				match(COMMA);
				setState(140);
				selector();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleSelectorContext extends ParserRuleContext {
		public TypeSelectorContext typeSelector() {
			return getRuleContext(TypeSelectorContext.class,0);
		}
		public UniversalContext universal() {
			return getRuleContext(UniversalContext.class,0);
		}
		public List<TerminalNode> HASH() { return getTokens(HTMLParser.HASH); }
		public TerminalNode HASH(int i) {
			return getToken(HTMLParser.HASH, i);
		}
		public List<ClassContext> class_() {
			return getRuleContexts(ClassContext.class);
		}
		public ClassContext class_(int i) {
			return getRuleContext(ClassContext.class,i);
		}
		public List<AttribContext> attrib() {
			return getRuleContexts(AttribContext.class);
		}
		public AttribContext attrib(int i) {
			return getRuleContext(AttribContext.class,i);
		}
		public List<PseudoContext> pseudo() {
			return getRuleContexts(PseudoContext.class);
		}
		public PseudoContext pseudo(int i) {
			return getRuleContext(PseudoContext.class,i);
		}
		public SimpleSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterSimpleSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitSimpleSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitSimpleSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectorContext simpleSelector() throws RecognitionException {
		SimpleSelectorContext _localctx = new SimpleSelectorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simpleSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
			case LBRACK:
			case COLON:
			case COMMA:
			case DOT:
			case PLUS:
			case TAG_CLOSE:
			case HASH:
			case TILDE:
			case DOUBLE_COLON:
			case ID:
				{
				setState(143);
				typeSelector();
				}
				break;
			case STAR:
				{
				setState(144);
				universal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1082131744L) != 0)) {
				{
				setState(151);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case HASH:
					{
					setState(147);
					match(HASH);
					}
					break;
				case DOT:
					{
					setState(148);
					class_();
					}
					break;
				case LBRACK:
					{
					setState(149);
					attrib();
					}
					break;
				case COLON:
				case DOUBLE_COLON:
					{
					setState(150);
					pseudo();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSelectorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HTMLParser.ID, 0); }
		public TypeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterTypeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitTypeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitTypeSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSelectorContext typeSelector() throws RecognitionException {
		TypeSelectorContext _localctx = new TypeSelectorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(156);
				match(ID);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UniversalContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(HTMLParser.STAR, 0); }
		public UniversalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_universal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterUniversal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitUniversal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitUniversal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniversalContext universal() throws RecognitionException {
		UniversalContext _localctx = new UniversalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_universal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(STAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(HTMLParser.DOT, 0); }
		public TerminalNode ID() { return getToken(HTMLParser.ID, 0); }
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(DOT);
			setState(162);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttribContext extends ParserRuleContext {
		public AttribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrib; }
	 
		public AttribContext() { }
		public void copyFrom(AttribContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttribWithoutValueContext extends AttribContext {
		public TerminalNode LBRACK() { return getToken(HTMLParser.LBRACK, 0); }
		public TerminalNode ID() { return getToken(HTMLParser.ID, 0); }
		public TerminalNode RBRACK() { return getToken(HTMLParser.RBRACK, 0); }
		public AttribWithoutValueContext(AttribContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterAttribWithoutValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitAttribWithoutValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitAttribWithoutValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttribWithValueContext extends AttribContext {
		public TerminalNode LBRACK() { return getToken(HTMLParser.LBRACK, 0); }
		public List<TerminalNode> ID() { return getTokens(HTMLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HTMLParser.ID, i);
		}
		public TerminalNode RBRACK() { return getToken(HTMLParser.RBRACK, 0); }
		public TerminalNode EQ() { return getToken(HTMLParser.EQ, 0); }
		public TerminalNode TILDE_EQUALS() { return getToken(HTMLParser.TILDE_EQUALS, 0); }
		public TerminalNode PIPE_EQUALS() { return getToken(HTMLParser.PIPE_EQUALS, 0); }
		public TerminalNode CARET_EQUALS() { return getToken(HTMLParser.CARET_EQUALS, 0); }
		public TerminalNode DOLLAR_EQUALS() { return getToken(HTMLParser.DOLLAR_EQUALS, 0); }
		public TerminalNode STAR_EQUALS() { return getToken(HTMLParser.STAR_EQUALS, 0); }
		public AttribWithValueContext(AttribContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterAttribWithValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitAttribWithValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitAttribWithValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttribContext attrib() throws RecognitionException {
		AttribContext _localctx = new AttribContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attrib);
		int _la;
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new AttribWithValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(LBRACK);
				setState(165);
				match(ID);
				{
				setState(166);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1040189440L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(167);
				match(ID);
				}
				}
				setState(169);
				match(RBRACK);
				}
				break;
			case 2:
				_localctx = new AttribWithoutValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(LBRACK);
				setState(171);
				match(ID);
				setState(172);
				match(RBRACK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PseudoContext extends ParserRuleContext {
		public PseudoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudo; }
	 
		public PseudoContext() { }
		public void copyFrom(PseudoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotPseudoContext extends PseudoContext {
		public TerminalNode COLON() { return getToken(HTMLParser.COLON, 0); }
		public TerminalNode NOT() { return getToken(HTMLParser.NOT, 0); }
		public TerminalNode LPAREN() { return getToken(HTMLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HTMLParser.RPAREN, 0); }
		public PseudoExprContext pseudoExpr() {
			return getRuleContext(PseudoExprContext.class,0);
		}
		public NotPseudoContext(PseudoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNotPseudo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNotPseudo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNotPseudo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PseudoElementContext extends PseudoContext {
		public TerminalNode DOUBLE_COLON() { return getToken(HTMLParser.DOUBLE_COLON, 0); }
		public TerminalNode ID() { return getToken(HTMLParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(HTMLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HTMLParser.RPAREN, 0); }
		public PseudoExprContext pseudoExpr() {
			return getRuleContext(PseudoExprContext.class,0);
		}
		public PseudoElementContext(PseudoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterPseudoElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitPseudoElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitPseudoElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PseudoClassContext extends PseudoContext {
		public TerminalNode COLON() { return getToken(HTMLParser.COLON, 0); }
		public TerminalNode ID() { return getToken(HTMLParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(HTMLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HTMLParser.RPAREN, 0); }
		public PseudoExprContext pseudoExpr() {
			return getRuleContext(PseudoExprContext.class,0);
		}
		public PseudoClassContext(PseudoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterPseudoClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitPseudoClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitPseudoClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoContext pseudo() throws RecognitionException {
		PseudoContext _localctx = new PseudoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pseudo);
		int _la;
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new PseudoClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(COLON);
				setState(176);
				match(ID);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(177);
					match(LPAREN);
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 24696123648L) != 0)) {
						{
						setState(178);
						pseudoExpr();
						}
					}

					setState(181);
					match(RPAREN);
					}
				}

				}
				break;
			case 2:
				_localctx = new PseudoElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(DOUBLE_COLON);
				setState(185);
				match(ID);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(186);
					match(LPAREN);
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 24696123648L) != 0)) {
						{
						setState(187);
						pseudoExpr();
						}
					}

					setState(190);
					match(RPAREN);
					}
				}

				}
				break;
			case 3:
				_localctx = new NotPseudoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				match(COLON);
				setState(194);
				match(NOT);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(195);
					match(LPAREN);
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 24696123648L) != 0)) {
						{
						setState(196);
						pseudoExpr();
						}
					}

					setState(199);
					match(RPAREN);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PseudoExprContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(HTMLParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(HTMLParser.NUMBER, i);
		}
		public List<TerminalNode> ID() { return getTokens(HTMLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HTMLParser.ID, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(HTMLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(HTMLParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(HTMLParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(HTMLParser.MINUS, i);
		}
		public List<TerminalNode> STAR() { return getTokens(HTMLParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(HTMLParser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(HTMLParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(HTMLParser.SLASH, i);
		}
		public List<TerminalNode> COLON() { return getTokens(HTMLParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(HTMLParser.COLON, i);
		}
		public List<TerminalNode> NOT() { return getTokens(HTMLParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(HTMLParser.NOT, i);
		}
		public List<PseudoContext> pseudo() {
			return getRuleContexts(PseudoContext.class);
		}
		public PseudoContext pseudo(int i) {
			return getRuleContext(PseudoContext.class,i);
		}
		public PseudoExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterPseudoExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitPseudoExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitPseudoExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoExprContext pseudoExpr() throws RecognitionException {
		PseudoExprContext _localctx = new PseudoExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pseudoExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(213);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(204);
					match(NUMBER);
					}
					break;
				case 2:
					{
					setState(205);
					match(ID);
					}
					break;
				case 3:
					{
					setState(206);
					match(PLUS);
					}
					break;
				case 4:
					{
					setState(207);
					match(MINUS);
					}
					break;
				case 5:
					{
					setState(208);
					match(STAR);
					}
					break;
				case 6:
					{
					setState(209);
					match(SLASH);
					}
					break;
				case 7:
					{
					setState(210);
					match(COLON);
					}
					break;
				case 8:
					{
					setState(211);
					match(NOT);
					}
					break;
				case 9:
					{
					setState(212);
					pseudo();
					}
					break;
				}
				}
				setState(215); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 24696123648L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CombinatorContext extends ParserRuleContext {
		public CombinatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combinator; }
	 
		public CombinatorContext() { }
		public void copyFrom(CombinatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdjacentSiblingCombinatorContext extends CombinatorContext {
		public TerminalNode PLUS() { return getToken(HTMLParser.PLUS, 0); }
		public AdjacentSiblingCombinatorContext(CombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterAdjacentSiblingCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitAdjacentSiblingCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitAdjacentSiblingCombinator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChildCombinatorContext extends CombinatorContext {
		public TerminalNode TAG_CLOSE() { return getToken(HTMLParser.TAG_CLOSE, 0); }
		public ChildCombinatorContext(CombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterChildCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitChildCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitChildCombinator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GeneralSiblingCombinatorContext extends CombinatorContext {
		public TerminalNode TILDE() { return getToken(HTMLParser.TILDE, 0); }
		public GeneralSiblingCombinatorContext(CombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterGeneralSiblingCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitGeneralSiblingCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitGeneralSiblingCombinator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombinatorContext combinator() throws RecognitionException {
		CombinatorContext _localctx = new CombinatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_combinator);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_CLOSE:
				_localctx = new ChildCombinatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(TAG_CLOSE);
				}
				break;
			case PLUS:
				_localctx = new AdjacentSiblingCombinatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(PLUS);
				}
				break;
			case TILDE:
				_localctx = new GeneralSiblingCombinatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(TILDE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(HTMLParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(HTMLParser.SEMI, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			property();
			setState(223);
			match(COLON);
			setState(224);
			value();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(225);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyContext extends ParserRuleContext {
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
	 
		public PropertyContext() { }
		public void copyFrom(PropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentPropertyContext extends PropertyContext {
		public TerminalNode ID() { return getToken(HTMLParser.ID, 0); }
		public IdentPropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterIdentProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitIdentProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitIdentProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarPropertyContext extends PropertyContext {
		public TerminalNode VAR() { return getToken(HTMLParser.VAR, 0); }
		public VarPropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterVarProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitVarProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitVarProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_property);
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(ID);
				}
				break;
			case VAR:
				_localctx = new VarPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(VAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public List<ValuePartContext> valuePart() {
			return getRuleContexts(ValuePartContext.class);
		}
		public ValuePartContext valuePart(int i) {
			return getRuleContext(ValuePartContext.class,i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_value);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(233); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(232);
					valuePart();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(235); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValuePartContext extends ParserRuleContext {
		public ValuePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuePart; }
	 
		public ValuePartContext() { }
		public void copyFrom(ValuePartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuestionValueContext extends ValuePartContext {
		public TerminalNode QUESTION() { return getToken(HTMLParser.QUESTION, 0); }
		public QuestionValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterQuestionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitQuestionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitQuestionValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UrlValueContext extends ValuePartContext {
		public TerminalNode URL() { return getToken(HTMLParser.URL, 0); }
		public TerminalNode RPAREN() { return getToken(HTMLParser.RPAREN, 0); }
		public List<TerminalNode> ID() { return getTokens(HTMLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HTMLParser.ID, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(HTMLParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(HTMLParser.NUMBER, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(HTMLParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(HTMLParser.SLASH, i);
		}
		public List<TerminalNode> COLON() { return getTokens(HTMLParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(HTMLParser.COLON, i);
		}
		public List<TerminalNode> DOT() { return getTokens(HTMLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HTMLParser.DOT, i);
		}
		public List<TerminalNode> QUESTION() { return getTokens(HTMLParser.QUESTION); }
		public TerminalNode QUESTION(int i) {
			return getToken(HTMLParser.QUESTION, i);
		}
		public List<TerminalNode> EQ() { return getTokens(HTMLParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(HTMLParser.EQ, i);
		}
		public List<TerminalNode> AND() { return getTokens(HTMLParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(HTMLParser.AND, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(HTMLParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(HTMLParser.MINUS, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(HTMLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(HTMLParser.PLUS, i);
		}
		public UrlValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterUrlValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitUrlValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitUrlValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SlashValueContext extends ValuePartContext {
		public TerminalNode SLASH() { return getToken(HTMLParser.SLASH, 0); }
		public SlashValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterSlashValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitSlashValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitSlashValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarValueContext extends ValuePartContext {
		public TerminalNode STAR() { return getToken(HTMLParser.STAR, 0); }
		public StarValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterStarValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitStarValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitStarValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DotValueContext extends ValuePartContext {
		public TerminalNode DOT() { return getToken(HTMLParser.DOT, 0); }
		public DotValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterDotValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitDotValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitDotValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleQuoteValueContext extends ValuePartContext {
		public TerminalNode DOUBLE_QUOTE_STRING() { return getToken(HTMLParser.DOUBLE_QUOTE_STRING, 0); }
		public DoubleQuoteValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterDoubleQuoteValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitDoubleQuoteValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitDoubleQuoteValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HashValueContext extends ValuePartContext {
		public TerminalNode HASH() { return getToken(HTMLParser.HASH, 0); }
		public HashValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHashValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHashValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHashValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenValueContext extends ValuePartContext {
		public TerminalNode LPAREN() { return getToken(HTMLParser.LPAREN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HTMLParser.RPAREN, 0); }
		public ParenValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterParenValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitParenValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitParenValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TildeValueContext extends ValuePartContext {
		public TerminalNode TILDE() { return getToken(HTMLParser.TILDE, 0); }
		public TildeValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterTildeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitTildeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitTildeValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarValueContext extends ValuePartContext {
		public TerminalNode VAR() { return getToken(HTMLParser.VAR, 0); }
		public VarValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterVarValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitVarValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitVarValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualsValueContext extends ValuePartContext {
		public TerminalNode EQ() { return getToken(HTMLParser.EQ, 0); }
		public EqualsValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterEqualsValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitEqualsValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitEqualsValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommaValueContext extends ValuePartContext {
		public TerminalNode COMMA() { return getToken(HTMLParser.COMMA, 0); }
		public CommaValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterCommaValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitCommaValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitCommaValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColonValueContext extends ValuePartContext {
		public TerminalNode COLON() { return getToken(HTMLParser.COLON, 0); }
		public ColonValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterColonValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitColonValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitColonValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusValueContext extends ValuePartContext {
		public TerminalNode MINUS() { return getToken(HTMLParser.MINUS, 0); }
		public MinusValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterMinusValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitMinusValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitMinusValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusValueContext extends ValuePartContext {
		public TerminalNode PLUS() { return getToken(HTMLParser.PLUS, 0); }
		public PlusValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterPlusValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitPlusValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitPlusValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportantValueContext extends ValuePartContext {
		public TerminalNode IMPORTANT() { return getToken(HTMLParser.IMPORTANT, 0); }
		public ImportantValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterImportantValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitImportantValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitImportantValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentValueContext extends ValuePartContext {
		public TerminalNode ID() { return getToken(HTMLParser.ID, 0); }
		public IdentValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterIdentValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitIdentValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitIdentValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberValueContext extends ValuePartContext {
		public TerminalNode NUMBER() { return getToken(HTMLParser.NUMBER, 0); }
		public NumberValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNumberValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNumberValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNumberValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterValueContext extends ValuePartContext {
		public TerminalNode TAG_OPEN() { return getToken(HTMLParser.TAG_OPEN, 0); }
		public GreaterValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterGreaterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitGreaterValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitGreaterValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuePartContext valuePart() throws RecognitionException {
		ValuePartContext _localctx = new ValuePartContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_valuePart);
		int _la;
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdentValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(ID);
				}
				break;
			case VAR:
				_localctx = new VarValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(VAR);
				}
				break;
			case NUMBER:
				_localctx = new NumberValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				match(NUMBER);
				}
				break;
			case HASH:
				_localctx = new HashValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				match(HASH);
				}
				break;
			case IMPORTANT:
				_localctx = new ImportantValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(241);
				match(IMPORTANT);
				}
				break;
			case URL:
				_localctx = new UrlValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(242);
				match(URL);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 21475671296L) != 0)) {
					{
					{
					setState(243);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 21475671296L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249);
				match(RPAREN);
				}
				break;
			case LPAREN:
				_localctx = new ParenValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(250);
				match(LPAREN);
				setState(251);
				value();
				setState(252);
				match(RPAREN);
				}
				break;
			case COMMA:
				_localctx = new CommaValueContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(254);
				match(COMMA);
				}
				break;
			case DOT:
				_localctx = new DotValueContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(255);
				match(DOT);
				}
				break;
			case COLON:
				_localctx = new ColonValueContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(256);
				match(COLON);
				}
				break;
			case SLASH:
				_localctx = new SlashValueContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(257);
				match(SLASH);
				}
				break;
			case TAG_OPEN:
				_localctx = new GreaterValueContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(258);
				match(TAG_OPEN);
				}
				break;
			case PLUS:
				_localctx = new PlusValueContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(259);
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new MinusValueContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(260);
				match(MINUS);
				}
				break;
			case STAR:
				_localctx = new StarValueContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(261);
				match(STAR);
				}
				break;
			case TILDE:
				_localctx = new TildeValueContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(262);
				match(TILDE);
				}
				break;
			case EQ:
				_localctx = new EqualsValueContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(263);
				match(EQ);
				}
				break;
			case QUESTION:
				_localctx = new QuestionValueContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(264);
				match(QUESTION);
				}
				break;
			case DOUBLE_QUOTE_STRING:
				_localctx = new DoubleQuoteValueContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(265);
				match(DOUBLE_QUOTE_STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleContext extends ParserRuleContext {
		public TerminalNode AT_RULE() { return getToken(HTMLParser.AT_RULE, 0); }
		public AtRuleBodyContext atRuleBody() {
			return getRuleContext(AtRuleBodyContext.class,0);
		}
		public List<ValuePartContext> valuePart() {
			return getRuleContexts(ValuePartContext.class);
		}
		public ValuePartContext valuePart(int i) {
			return getRuleContext(ValuePartContext.class,i);
		}
		public List<TerminalNode> URL() { return getTokens(HTMLParser.URL); }
		public TerminalNode URL(int i) {
			return getToken(HTMLParser.URL, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(HTMLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(HTMLParser.RPAREN, i);
		}
		public List<TerminalNode> ID() { return getTokens(HTMLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HTMLParser.ID, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(HTMLParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(HTMLParser.NUMBER, i);
		}
		public AtRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterAtRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitAtRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitAtRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtRuleContext atRule() throws RecognitionException {
		AtRuleContext _localctx = new AtRuleContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_atRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(AT_RULE);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3466066198280L) != 0)) {
				{
				setState(275);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(269);
					valuePart();
					}
					break;
				case 2:
					{
					setState(270);
					match(URL);
					setState(272);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NUMBER || _la==ID) {
						{
						setState(271);
						_la = _input.LA(1);
						if ( !(_la==NUMBER || _la==ID) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(274);
					match(RPAREN);
					}
					break;
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			atRuleBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleBodyContext extends ParserRuleContext {
		public AtRuleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atRuleBody; }
	 
		public AtRuleBodyContext() { }
		public void copyFrom(AtRuleBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleWithoutBlockContext extends AtRuleBodyContext {
		public TerminalNode SEMI() { return getToken(HTMLParser.SEMI, 0); }
		public AtRuleWithoutBlockContext(AtRuleBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterAtRuleWithoutBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitAtRuleWithoutBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitAtRuleWithoutBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleWithBlockContext extends AtRuleBodyContext {
		public TerminalNode LBRACE() { return getToken(HTMLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HTMLParser.RBRACE, 0); }
		public List<RuleContext> rule_() {
			return getRuleContexts(RuleContext.class);
		}
		public RuleContext rule_(int i) {
			return getRuleContext(RuleContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<AtRuleContext> atRule() {
			return getRuleContexts(AtRuleContext.class);
		}
		public AtRuleContext atRule(int i) {
			return getRuleContext(AtRuleContext.class,i);
		}
		public AtRuleWithBlockContext(AtRuleBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterAtRuleWithBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitAtRuleWithBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitAtRuleWithBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtRuleBodyContext atRuleBody() throws RecognitionException {
		AtRuleBodyContext _localctx = new AtRuleBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_atRuleBody);
		int _la;
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				_localctx = new AtRuleWithBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(LBRACE);
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4424919439138L) != 0)) {
					{
					setState(286);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						setState(283);
						rule_();
						}
						break;
					case 2:
						{
						setState(284);
						declaration();
						}
						break;
					case 3:
						{
						setState(285);
						atRule();
						}
						break;
					}
					}
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(291);
				match(RBRACE);
				}
				break;
			case SEMI:
				_localctx = new AtRuleWithoutBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Jinja2Context extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Jinja2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterJinja2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitJinja2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitJinja2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja2Context jinja2() throws RecognitionException {
		Jinja2Context _localctx = new Jinja2Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_jinja2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_statement);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLOCK_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				stmt();
				}
				break;
			case VAR_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public TerminalNode BLOCK_START() { return getToken(HTMLParser.BLOCK_START, 0); }
		public TerminalNode BLOCK_END() { return getToken(HTMLParser.BLOCK_END, 0); }
		public List<TerminalNode> ID() { return getTokens(HTMLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HTMLParser.ID, i);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(BLOCK_START);
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(302);
					match(ID);
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(308);
			match(BLOCK_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode VAR_START() { return getToken(HTMLParser.VAR_START, 0); }
		public TerminalNode VAR_END() { return getToken(HTMLParser.VAR_END, 0); }
		public List<Expr_contentContext> expr_content() {
			return getRuleContexts(Expr_contentContext.class);
		}
		public Expr_contentContext expr_content(int i) {
			return getRuleContext(Expr_contentContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(VAR_START);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 158935875960L) != 0)) {
				{
				{
				setState(311);
				expr_content();
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(317);
			match(VAR_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_contentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HTMLParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(HTMLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HTMLParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(HTMLParser.COLON, 0); }
		public TerminalNode NUMBER() { return getToken(HTMLParser.NUMBER, 0); }
		public TerminalNode DOUBLE_QUOTE_STRING() { return getToken(HTMLParser.DOUBLE_QUOTE_STRING, 0); }
		public TerminalNode OR() { return getToken(HTMLParser.OR, 0); }
		public TerminalNode LBRACK() { return getToken(HTMLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(HTMLParser.RBRACK, 0); }
		public TerminalNode PIPE() { return getToken(HTMLParser.PIPE, 0); }
		public TerminalNode TILDE() { return getToken(HTMLParser.TILDE, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(HTMLParser.TAG_CLOSE, 0); }
		public Expr_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterExpr_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitExpr_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitExpr_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_contentContext expr_content() throws RecognitionException {
		Expr_contentContext _localctx = new Expr_contentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expr_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 158935875960L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001=\u0142\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0004\u0000"+
		"8\b\u0000\u000b\u0000\f\u00009\u0003\u0000<\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001C\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0003\u0002G\b\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002K\b\u0002\u0001\u0002\u0001\u0002\u0005\u0002O\b\u0002\n\u0002\f"+
		"\u0002R\t\u0002\u0001\u0002\u0003\u0002U\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0005\u0003Y\b\u0003\n\u0003\f\u0003\\\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0003\u0005b\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0003\u0006f\b\u0006\u0001\u0006\u0003\u0006i\b\u0006\u0001\u0006\u0003"+
		"\u0006l\b\u0006\u0001\u0006\u0003\u0006o\b\u0006\u0001\u0006\u0003\u0006"+
		"r\b\u0006\u0001\u0006\u0003\u0006u\b\u0006\u0001\u0006\u0003\u0006x\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006|\b\u0006\n\u0006\f\u0006\u007f"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u0087\b\u0007\n\u0007\f\u0007\u008a\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u008e\b\u0007\u0001\b\u0001\b\u0003\b\u0092\b"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0098\b\b\n\b\f\b\u009b\t\b"+
		"\u0001\t\u0003\t\u009e\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0003\f\u00ae\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b4"+
		"\b\r\u0001\r\u0003\r\u00b7\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r"+
		"\u00bd\b\r\u0001\r\u0003\r\u00c0\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00c6\b\r\u0001\r\u0003\r\u00c9\b\r\u0003\r\u00cb\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0004\u000e\u00d6\b\u000e\u000b\u000e\f\u000e\u00d7"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00dd\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00e3\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00e7\b\u0011\u0001\u0012\u0004\u0012\u00ea\b"+
		"\u0012\u000b\u0012\f\u0012\u00eb\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00f5\b\u0013\n"+
		"\u0013\f\u0013\u00f8\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u010b\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u0111\b\u0014\u0001\u0014\u0005\u0014\u0114"+
		"\b\u0014\n\u0014\f\u0014\u0117\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u011f\b\u0015\n\u0015"+
		"\f\u0015\u0122\t\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0126\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u012c\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0005\u0018\u0130\b\u0018\n\u0018\f\u0018\u0133"+
		"\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0005\u0019\u0139"+
		"\b\u0019\n\u0019\f\u0019\u013c\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0002P\u0131\u0000\u001b\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"024\u0000\u0005\u0003\u0000\u000b\u000b\"\"%%\u0002\u0000\u000b\u000b"+
		"\u0019\u001d\u0006\u0000\b\b\n\r\u000f\u000f\u0012\u0013  \"\"\u0002\u0000"+
		"  \"\"\t\u0000\u0003\u0006\b\b\u0010\u0010\u0014\u0014\u0016\u0016\u0018"+
		"\u0018  \"\"%%\u0174\u0000;\u0001\u0000\u0000\u0000\u0002B\u0001\u0000"+
		"\u0000\u0000\u0004D\u0001\u0000\u0000\u0000\u0006V\u0001\u0000\u0000\u0000"+
		"\b]\u0001\u0000\u0000\u0000\na\u0001\u0000\u0000\u0000\fc\u0001\u0000"+
		"\u0000\u0000\u000e\u0082\u0001\u0000\u0000\u0000\u0010\u0091\u0001\u0000"+
		"\u0000\u0000\u0012\u009d\u0001\u0000\u0000\u0000\u0014\u009f\u0001\u0000"+
		"\u0000\u0000\u0016\u00a1\u0001\u0000\u0000\u0000\u0018\u00ad\u0001\u0000"+
		"\u0000\u0000\u001a\u00ca\u0001\u0000\u0000\u0000\u001c\u00d5\u0001\u0000"+
		"\u0000\u0000\u001e\u00dc\u0001\u0000\u0000\u0000 \u00de\u0001\u0000\u0000"+
		"\u0000\"\u00e6\u0001\u0000\u0000\u0000$\u00e9\u0001\u0000\u0000\u0000"+
		"&\u010a\u0001\u0000\u0000\u0000(\u010c\u0001\u0000\u0000\u0000*\u0125"+
		"\u0001\u0000\u0000\u0000,\u0127\u0001\u0000\u0000\u0000.\u012b\u0001\u0000"+
		"\u0000\u00000\u012d\u0001\u0000\u0000\u00002\u0136\u0001\u0000\u0000\u0000"+
		"4\u013f\u0001\u0000\u0000\u000068\u0003\u0002\u0001\u000076\u0001\u0000"+
		"\u0000\u000089\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001"+
		"\u0000\u0000\u0000:<\u0001\u0000\u0000\u0000;7\u0001\u0000\u0000\u0000"+
		";<\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0005\u0000\u0000"+
		"\u0001>\u0001\u0001\u0000\u0000\u0000?C\u0003\u0004\u0002\u0000@C\u0003"+
		"\n\u0005\u0000AC\u0003,\u0016\u0000B?\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000C\u0003\u0001\u0000\u0000"+
		"\u0000DF\u0005\u0015\u0000\u0000EG\u0005\u000f\u0000\u0000FE\u0001\u0000"+
		"\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0003"+
		"\u0006\u0003\u0000IK\u0005\u000f\u0000\u0000JI\u0001\u0000\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LP\u0005\u0016\u0000"+
		"\u0000MO\u0005\"\u0000\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QT\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000SU\u0005\b\u0000\u0000TS\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000U\u0005\u0001\u0000\u0000\u0000"+
		"VZ\u0005\"\u0000\u0000WY\u0003\b\u0004\u0000XW\u0001\u0000\u0000\u0000"+
		"Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[\u0007\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0007"+
		"\u0000\u0000\u0000^\t\u0001\u0000\u0000\u0000_b\u0003\f\u0006\u0000`b"+
		"\u0003(\u0014\u0000a_\u0001\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000"+
		"b\u000b\u0001\u0000\u0000\u0000ce\u0003\u000e\u0007\u0000df\u0005\"\u0000"+
		"\u0000ed\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fh\u0001\u0000"+
		"\u0000\u0000gi\u0005\t\u0000\u0000hg\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000ik\u0001\u0000\u0000\u0000jl\u0005\"\u0000\u0000kj\u0001\u0000"+
		"\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000mo\u0005"+
		"\"\u0000\u0000nm\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000oq\u0001"+
		"\u0000\u0000\u0000pr\u0005\t\u0000\u0000qp\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000rt\u0001\u0000\u0000\u0000su\u0005\"\u0000\u0000ts\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uw\u0001\u0000\u0000\u0000"+
		"vx\u0005\"\u0000\u0000wv\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"xy\u0001\u0000\u0000\u0000y}\u0005\u0001\u0000\u0000z|\u0003 \u0010\u0000"+
		"{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000"+
		"\u007f}\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0002\u0000\u0000\u0081"+
		"\r\u0001\u0000\u0000\u0000\u0082\u0088\u0003\u0010\b\u0000\u0083\u0084"+
		"\u0003\u001e\u000f\u0000\u0084\u0085\u0003\u0010\b\u0000\u0085\u0087\u0001"+
		"\u0000\u0000\u0000\u0086\u0083\u0001\u0000\u0000\u0000\u0087\u008a\u0001"+
		"\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001"+
		"\u0000\u0000\u0000\u0089\u008d\u0001\u0000\u0000\u0000\u008a\u0088\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0005\t\u0000\u0000\u008c\u008e\u0003\u000e"+
		"\u0007\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e\u000f\u0001\u0000\u0000\u0000\u008f\u0092\u0003\u0012"+
		"\t\u0000\u0090\u0092\u0003\u0014\n\u0000\u0091\u008f\u0001\u0000\u0000"+
		"\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0099\u0001\u0000\u0000"+
		"\u0000\u0093\u0098\u0005\u0017\u0000\u0000\u0094\u0098\u0003\u0016\u000b"+
		"\u0000\u0095\u0098\u0003\u0018\f\u0000\u0096\u0098\u0003\u001a\r\u0000"+
		"\u0097\u0093\u0001\u0000\u0000\u0000\u0097\u0094\u0001\u0000\u0000\u0000"+
		"\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u0011\u0001\u0000\u0000\u0000"+
		"\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009e\u0005\"\u0000\u0000\u009d"+
		"\u009c\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e"+
		"\u0013\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u000e\u0000\u0000\u00a0"+
		"\u0015\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\n\u0000\u0000\u00a2\u00a3"+
		"\u0005\"\u0000\u0000\u00a3\u0017\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005"+
		"\u0005\u0000\u0000\u00a5\u00a6\u0005\"\u0000\u0000\u00a6\u00a7\u0007\u0001"+
		"\u0000\u0000\u00a7\u00a8\u0005\"\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a9\u00ae\u0005\u0006\u0000\u0000\u00aa\u00ab\u0005\u0005\u0000"+
		"\u0000\u00ab\u00ac\u0005\"\u0000\u0000\u00ac\u00ae\u0005\u0006\u0000\u0000"+
		"\u00ad\u00a4\u0001\u0000\u0000\u0000\u00ad\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ae\u0019\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\b\u0000\u0000\u00b0"+
		"\u00b6\u0005\"\u0000\u0000\u00b1\u00b3\u0005\u0003\u0000\u0000\u00b2\u00b4"+
		"\u0003\u001c\u000e\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b7"+
		"\u0005\u0004\u0000\u0000\u00b6\u00b1\u0001\u0000\u0000\u0000\u00b6\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b7\u00cb\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0005\u001e\u0000\u0000\u00b9\u00bf\u0005\"\u0000\u0000\u00ba\u00bc\u0005"+
		"\u0003\u0000\u0000\u00bb\u00bd\u0003\u001c\u000e\u0000\u00bc\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be\u0001"+
		"\u0000\u0000\u0000\u00be\u00c0\u0005\u0004\u0000\u0000\u00bf\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00cb\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0005\b\u0000\u0000\u00c2\u00c8\u0005\u001f"+
		"\u0000\u0000\u00c3\u00c5\u0005\u0003\u0000\u0000\u00c4\u00c6\u0003\u001c"+
		"\u000e\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c9\u0005\u0004"+
		"\u0000\u0000\u00c8\u00c3\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u00af\u0001\u0000"+
		"\u0000\u0000\u00ca\u00b8\u0001\u0000\u0000\u0000\u00ca\u00c1\u0001\u0000"+
		"\u0000\u0000\u00cb\u001b\u0001\u0000\u0000\u0000\u00cc\u00d6\u0005 \u0000"+
		"\u0000\u00cd\u00d6\u0005\"\u0000\u0000\u00ce\u00d6\u0005\f\u0000\u0000"+
		"\u00cf\u00d6\u0005\r\u0000\u0000\u00d0\u00d6\u0005\u000e\u0000\u0000\u00d1"+
		"\u00d6\u0005\u000f\u0000\u0000\u00d2\u00d6\u0005\b\u0000\u0000\u00d3\u00d6"+
		"\u0005\u001f\u0000\u0000\u00d4\u00d6\u0003\u001a\r\u0000\u00d5\u00cc\u0001"+
		"\u0000\u0000\u0000\u00d5\u00cd\u0001\u0000\u0000\u0000\u00d5\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d5\u00cf\u0001\u0000\u0000\u0000\u00d5\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d1\u0001\u0000\u0000\u0000\u00d5\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u001d\u0001"+
		"\u0000\u0000\u0000\u00d9\u00dd\u0005\u0016\u0000\u0000\u00da\u00dd\u0005"+
		"\f\u0000\u0000\u00db\u00dd\u0005\u0018\u0000\u0000\u00dc\u00d9\u0001\u0000"+
		"\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00db\u0001\u0000"+
		"\u0000\u0000\u00dd\u001f\u0001\u0000\u0000\u0000\u00de\u00df\u0003\"\u0011"+
		"\u0000\u00df\u00e0\u0005\b\u0000\u0000\u00e0\u00e2\u0003$\u0012\u0000"+
		"\u00e1\u00e3\u0005\u0007\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3!\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e7\u0005\"\u0000\u0000\u00e5\u00e7\u0005!\u0000\u0000\u00e6\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7#\u0001"+
		"\u0000\u0000\u0000\u00e8\u00ea\u0003&\u0013\u0000\u00e9\u00e8\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec%\u0001\u0000\u0000"+
		"\u0000\u00ed\u010b\u0005\"\u0000\u0000\u00ee\u010b\u0005!\u0000\u0000"+
		"\u00ef\u010b\u0005 \u0000\u0000\u00f0\u010b\u0005\u0017\u0000\u0000\u00f1"+
		"\u010b\u0005(\u0000\u0000\u00f2\u00f6\u0005)\u0000\u0000\u00f3\u00f5\u0007"+
		"\u0002\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f8\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f9\u010b\u0005\u0004\u0000\u0000\u00fa\u00fb\u0005"+
		"\u0003\u0000\u0000\u00fb\u00fc\u0003$\u0012\u0000\u00fc\u00fd\u0005\u0004"+
		"\u0000\u0000\u00fd\u010b\u0001\u0000\u0000\u0000\u00fe\u010b\u0005\t\u0000"+
		"\u0000\u00ff\u010b\u0005\n\u0000\u0000\u0100\u010b\u0005\b\u0000\u0000"+
		"\u0101\u010b\u0005\u000f\u0000\u0000\u0102\u010b\u0005\u0015\u0000\u0000"+
		"\u0103\u010b\u0005\f\u0000\u0000\u0104\u010b\u0005\r\u0000\u0000\u0105"+
		"\u010b\u0005\u000e\u0000\u0000\u0106\u010b\u0005\u0018\u0000\u0000\u0107"+
		"\u010b\u0005\u000b\u0000\u0000\u0108\u010b\u0005\u0012\u0000\u0000\u0109"+
		"\u010b\u0005%\u0000\u0000\u010a\u00ed\u0001\u0000\u0000\u0000\u010a\u00ee"+
		"\u0001\u0000\u0000\u0000\u010a\u00ef\u0001\u0000\u0000\u0000\u010a\u00f0"+
		"\u0001\u0000\u0000\u0000\u010a\u00f1\u0001\u0000\u0000\u0000\u010a\u00f2"+
		"\u0001\u0000\u0000\u0000\u010a\u00fa\u0001\u0000\u0000\u0000\u010a\u00fe"+
		"\u0001\u0000\u0000\u0000\u010a\u00ff\u0001\u0000\u0000\u0000\u010a\u0100"+
		"\u0001\u0000\u0000\u0000\u010a\u0101\u0001\u0000\u0000\u0000\u010a\u0102"+
		"\u0001\u0000\u0000\u0000\u010a\u0103\u0001\u0000\u0000\u0000\u010a\u0104"+
		"\u0001\u0000\u0000\u0000\u010a\u0105\u0001\u0000\u0000\u0000\u010a\u0106"+
		"\u0001\u0000\u0000\u0000\u010a\u0107\u0001\u0000\u0000\u0000\u010a\u0108"+
		"\u0001\u0000\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010b\'\u0001"+
		"\u0000\u0000\u0000\u010c\u0115\u0005*\u0000\u0000\u010d\u0114\u0003&\u0013"+
		"\u0000\u010e\u0110\u0005)\u0000\u0000\u010f\u0111\u0007\u0003\u0000\u0000"+
		"\u0110\u010f\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0114\u0005\u0004\u0000\u0000"+
		"\u0113\u010d\u0001\u0000\u0000\u0000\u0113\u010e\u0001\u0000\u0000\u0000"+
		"\u0114\u0117\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0118\u0001\u0000\u0000\u0000"+
		"\u0117\u0115\u0001\u0000\u0000\u0000\u0118\u0119\u0003*\u0015\u0000\u0119"+
		")\u0001\u0000\u0000\u0000\u011a\u0120\u0005\u0001\u0000\u0000\u011b\u011f"+
		"\u0003\f\u0006\u0000\u011c\u011f\u0003 \u0010\u0000\u011d\u011f\u0003"+
		"(\u0014\u0000\u011e\u011b\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000"+
		"\u0000\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011f\u0122\u0001\u0000"+
		"\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000"+
		"\u0000\u0000\u0121\u0123\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000"+
		"\u0000\u0000\u0123\u0126\u0005\u0002\u0000\u0000\u0124\u0126\u0005\u0007"+
		"\u0000\u0000\u0125\u011a\u0001\u0000\u0000\u0000\u0125\u0124\u0001\u0000"+
		"\u0000\u0000\u0126+\u0001\u0000\u0000\u0000\u0127\u0128\u0003.\u0017\u0000"+
		"\u0128-\u0001\u0000\u0000\u0000\u0129\u012c\u00030\u0018\u0000\u012a\u012c"+
		"\u00032\u0019\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012a\u0001"+
		"\u0000\u0000\u0000\u012c/\u0001\u0000\u0000\u0000\u012d\u0131\u0005.\u0000"+
		"\u0000\u012e\u0130\u0005\"\u0000\u0000\u012f\u012e\u0001\u0000\u0000\u0000"+
		"\u0130\u0133\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000"+
		"\u0131\u012f\u0001\u0000\u0000\u0000\u0132\u0134\u0001\u0000\u0000\u0000"+
		"\u0133\u0131\u0001\u0000\u0000\u0000\u0134\u0135\u0005/\u0000\u0000\u0135"+
		"1\u0001\u0000\u0000\u0000\u0136\u013a\u0005,\u0000\u0000\u0137\u0139\u0003"+
		"4\u001a\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0139\u013c\u0001\u0000"+
		"\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000"+
		"\u0000\u0000\u013b\u013d\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000"+
		"\u0000\u0000\u013d\u013e\u0005-\u0000\u0000\u013e3\u0001\u0000\u0000\u0000"+
		"\u013f\u0140\u0007\u0004\u0000\u0000\u01405\u0001\u0000\u0000\u000009"+
		";BFJPTZaehknqtw}\u0088\u008d\u0091\u0097\u0099\u009d\u00ad\u00b3\u00b6"+
		"\u00bc\u00bf\u00c5\u00c8\u00ca\u00d5\u00d7\u00dc\u00e2\u00e6\u00eb\u00f6"+
		"\u010a\u0110\u0113\u0115\u011e\u0120\u0125\u012b\u0131\u013a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}