// Generated from C:/Users/diogo/IdeaProjects/markdown-cv/src/grammar\MarkdownGrammar.g4 by ANTLR 4.5.1
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MarkdownGrammar extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, TAB=2, NEWLINE=3, STAR=4, MINUS=5, COLON=6, CLOSE_ANGLE_BRACKET=7, 
		OPEN_ANGLE_BRACKET=8, SHARP=9, OPEN_SB=10, CLOSE_SB=11, SLASH=12, OPEN_CURLY=13, 
		CLOSE_CURLY=14, BLOCKSPLITTER=15, TILT=16, HAT=17, SPLIT=18, ESCAPE=19, 
		SYMBOL=20, WORD=21, INT=22, STAR_CLASS=23;
	public static final int
		RULE_cv = 0, RULE_info = 1, RULE_subHeader = 2, RULE_name = 3, RULE_address = 4, 
		RULE_contacts = 5, RULE_block = 6, RULE_subBlock = 7, RULE_blockList = 8, 
		RULE_blockListCell = 9, RULE_table = 10, RULE_tableBody = 11, RULE_icon = 12, 
		RULE_boldText = 13, RULE_tableHeader = 14, RULE_tableCell = 15, RULE_tableLine = 16, 
		RULE_blockName = 17, RULE_blockSubName = 18, RULE_any = 19, RULE_tablecontent = 20, 
		RULE_word_space = 21;
	public static final String[] ruleNames = {
		"cv", "info", "subHeader", "name", "address", "contacts", "block", "subBlock", 
		"blockList", "blockListCell", "table", "tableBody", "icon", "boldText", 
		"tableHeader", "tableCell", "tableLine", "blockName", "blockSubName", 
		"any", "tablecontent", "word_space"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", "'\t'", null, "'*'", "'-'", "':'", "'>'", "'<'", "'#'", "'['", 
		"']'", "'/'", "'{'", "'}'", "'------'", "'~'", "'^'", "'|'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "TAB", "NEWLINE", "STAR", "MINUS", "COLON", "CLOSE_ANGLE_BRACKET", 
		"OPEN_ANGLE_BRACKET", "SHARP", "OPEN_SB", "CLOSE_SB", "SLASH", "OPEN_CURLY", 
		"CLOSE_CURLY", "BLOCKSPLITTER", "TILT", "HAT", "SPLIT", "ESCAPE", "SYMBOL", 
		"WORD", "INT", "STAR_CLASS"
	};
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
	public String getGrammarFileName() { return "MarkdownGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    public Data.Cv cv = new Data.Cv();

	public MarkdownGrammar(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CvContext extends ParserRuleContext {
		public InfoContext info() {
			return getRuleContext(InfoContext.class,0);
		}
		public List<TerminalNode> BLOCKSPLITTER() { return getTokens(MarkdownGrammar.BLOCKSPLITTER); }
		public TerminalNode BLOCKSPLITTER(int i) {
			return getToken(MarkdownGrammar.BLOCKSPLITTER, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownGrammar.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownGrammar.NEWLINE, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public CvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterCv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitCv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitCv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CvContext cv() throws RecognitionException {
		CvContext _localctx = new CvContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			info();
			setState(45);
			match(BLOCKSPLITTER);
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				match(NEWLINE);
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(51);
				block();
				setState(52);
				match(BLOCKSPLITTER);
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(53);
					match(NEWLINE);
					}
					}
					setState(56); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SHARP );
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

	public static class InfoContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public AddressContext address() {
			return getRuleContext(AddressContext.class,0);
		}
		public List<SubHeaderContext> subHeader() {
			return getRuleContexts(SubHeaderContext.class);
		}
		public SubHeaderContext subHeader(int i) {
			return getRuleContext(SubHeaderContext.class,i);
		}
		public List<ContactsContext> contacts() {
			return getRuleContexts(ContactsContext.class);
		}
		public ContactsContext contacts(int i) {
			return getRuleContext(ContactsContext.class,i);
		}
		public InfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfoContext info() throws RecognitionException {
		InfoContext _localctx = new InfoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_info);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			name();
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				subHeader();
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SHARP );
			setState(68);
			address();
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69);
				contacts();
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLOSE_ANGLE_BRACKET );
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

	public static class SubHeaderContext extends ParserRuleContext {
		public Word_spaceContext word_space;
		public List<TerminalNode> SHARP() { return getTokens(MarkdownGrammar.SHARP); }
		public TerminalNode SHARP(int i) {
			return getToken(MarkdownGrammar.SHARP, i);
		}
		public Word_spaceContext word_space() {
			return getRuleContext(Word_spaceContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MarkdownGrammar.NEWLINE, 0); }
		public List<TerminalNode> SPACE() { return getTokens(MarkdownGrammar.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
		}
		public SubHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterSubHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitSubHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitSubHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubHeaderContext subHeader() throws RecognitionException {
		SubHeaderContext _localctx = new SubHeaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_subHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			cv.info.newSub();
			setState(75);
			match(SHARP);
			setState(76);
			match(SHARP);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(77);
				match(SPACE);
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			((SubHeaderContext)_localctx).word_space = word_space();
			cv.info.addSub((((SubHeaderContext)_localctx).word_space!=null?_input.getText(((SubHeaderContext)_localctx).word_space.start,((SubHeaderContext)_localctx).word_space.stop):null));
			setState(85);
			match(NEWLINE);
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

	public static class NameContext extends ParserRuleContext {
		public Word_spaceContext word_space;
		public TerminalNode SHARP() { return getToken(MarkdownGrammar.SHARP, 0); }
		public Word_spaceContext word_space() {
			return getRuleContext(Word_spaceContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MarkdownGrammar.NEWLINE, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(SHARP);
			setState(88);
			((NameContext)_localctx).word_space = word_space();
			cv.info.addName((((NameContext)_localctx).word_space!=null?_input.getText(((NameContext)_localctx).word_space.start,((NameContext)_localctx).word_space.stop):null));
			setState(90);
			match(NEWLINE);
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

	public static class AddressContext extends ParserRuleContext {
		public AnyContext any;
		public TerminalNode STAR() { return getToken(MarkdownGrammar.STAR, 0); }
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MarkdownGrammar.NEWLINE, 0); }
		public AddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitAddress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitAddress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddressContext address() throws RecognitionException {
		AddressContext _localctx = new AddressContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_address);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(STAR);
			setState(93);
			((AddressContext)_localctx).any = any();
			cv.info.addAddress((((AddressContext)_localctx).any!=null?_input.getText(((AddressContext)_localctx).any.start,((AddressContext)_localctx).any.stop):null));
			setState(95);
			match(NEWLINE);
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

	public static class ContactsContext extends ParserRuleContext {
		public AnyContext any;
		public TerminalNode CLOSE_ANGLE_BRACKET() { return getToken(MarkdownGrammar.CLOSE_ANGLE_BRACKET, 0); }
		public IconContext icon() {
			return getRuleContext(IconContext.class,0);
		}
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownGrammar.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownGrammar.NEWLINE, i);
		}
		public ContactsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contacts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterContacts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitContacts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitContacts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContactsContext contacts() throws RecognitionException {
		ContactsContext _localctx = new ContactsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_contacts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(CLOSE_ANGLE_BRACKET);
			setState(98);
			icon();
			setState(99);
			((ContactsContext)_localctx).any = any();
			cv.info.addContacts((((ContactsContext)_localctx).any!=null?_input.getText(((ContactsContext)_localctx).any.start,((ContactsContext)_localctx).any.stop):null));
			setState(102); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(101);
				match(NEWLINE);
				}
				}
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class BlockContext extends ParserRuleContext {
		public BlockNameContext blockName() {
			return getRuleContext(BlockNameContext.class,0);
		}
		public List<SubBlockContext> subBlock() {
			return getRuleContexts(SubBlockContext.class);
		}
		public SubBlockContext subBlock(int i) {
			return getRuleContext(SubBlockContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			cv.newBlock();
			setState(107);
			blockName();
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108);
				subBlock();
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << STAR) | (1L << SHARP) | (1L << ESCAPE) | (1L << SYMBOL) | (1L << WORD) | (1L << INT))) != 0) );
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

	public static class SubBlockContext extends ParserRuleContext {
		public BlockSubNameContext blockSubName;
		public BoldTextContext boldText;
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public BlockSubNameContext blockSubName() {
			return getRuleContext(BlockSubNameContext.class,0);
		}
		public List<BlockListContext> blockList() {
			return getRuleContexts(BlockListContext.class);
		}
		public BlockListContext blockList(int i) {
			return getRuleContext(BlockListContext.class,i);
		}
		public BoldTextContext boldText() {
			return getRuleContext(BoldTextContext.class,0);
		}
		public SubBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterSubBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitSubBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitSubBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubBlockContext subBlock() throws RecognitionException {
		SubBlockContext _localctx = new SubBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_subBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if (_la==SHARP) {
				{
				setState(113);
				((SubBlockContext)_localctx).blockSubName = blockSubName();
				cv.getBlock().addSubBlockName((((SubBlockContext)_localctx).blockSubName!=null?_input.getText(((SubBlockContext)_localctx).blockSubName.start,((SubBlockContext)_localctx).blockSubName.stop):null));
				setState(116);
				_la = _input.LA(1);
				if (_la==TILT) {
					{
					setState(115);
					((SubBlockContext)_localctx).boldText = boldText();
					}
				}

				cv.getBlock().addBoldText((((SubBlockContext)_localctx).boldText!=null?_input.getText(((SubBlockContext)_localctx).boldText.start,((SubBlockContext)_localctx).boldText.stop):null));
				}
			}

			setState(129);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(123); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(122);
						blockList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(125); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				{
				setState(127);
				table();
				}
				break;
			case 3:
				{
				setState(128);
				any();
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

	public static class BlockListContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(MarkdownGrammar.STAR, 0); }
		public TerminalNode NEWLINE() { return getToken(MarkdownGrammar.NEWLINE, 0); }
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public List<BlockListCellContext> blockListCell() {
			return getRuleContexts(BlockListCellContext.class);
		}
		public BlockListCellContext blockListCell(int i) {
			return getRuleContext(BlockListCellContext.class,i);
		}
		public BlockListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterBlockList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitBlockList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitBlockList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockListContext blockList() throws RecognitionException {
		BlockListContext _localctx = new BlockListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_blockList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(STAR);
			setState(133); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(132);
				any();
				}
				}
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << ESCAPE) | (1L << SYMBOL) | (1L << WORD) | (1L << INT))) != 0) );
			setState(137);
			match(NEWLINE);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(138);
				blockListCell();
				}
				}
				setState(143);
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

	public static class BlockListCellContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(MarkdownGrammar.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(MarkdownGrammar.NEWLINE, 0); }
		public IconContext icon() {
			return getRuleContext(IconContext.class,0);
		}
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public BlockListCellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockListCell; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterBlockListCell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitBlockListCell(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitBlockListCell(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockListCellContext blockListCell() throws RecognitionException {
		BlockListCellContext _localctx = new BlockListCellContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_blockListCell);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(COLON);
			setState(146);
			_la = _input.LA(1);
			if (_la==OPEN_CURLY) {
				{
				setState(145);
				icon();
				}
			}

			setState(149);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << ESCAPE) | (1L << SYMBOL) | (1L << WORD) | (1L << INT))) != 0)) {
				{
				setState(148);
				any();
				}
			}

			setState(151);
			match(NEWLINE);
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

	public static class TableContext extends ParserRuleContext {
		public TableHeaderContext tableHeader() {
			return getRuleContext(TableHeaderContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MarkdownGrammar.NEWLINE, 0); }
		public TableBodyContext tableBody() {
			return getRuleContext(TableBodyContext.class,0);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			cv.getBlock().setType(Data.Block.BlockType.TABLE);
			setState(154);
			tableHeader();
			setState(155);
			match(NEWLINE);
			setState(156);
			tableBody();
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

	public static class TableBodyContext extends ParserRuleContext {
		public List<TableLineContext> tableLine() {
			return getRuleContexts(TableLineContext.class);
		}
		public TableLineContext tableLine(int i) {
			return getRuleContext(TableLineContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownGrammar.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownGrammar.NEWLINE, i);
		}
		public TableBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterTableBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitTableBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitTableBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableBodyContext tableBody() throws RecognitionException {
		TableBodyContext _localctx = new TableBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tableBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(158);
					tableLine();
					setState(159);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(163); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class IconContext extends ParserRuleContext {
		public boolean allow = true;
		public Token STAR_CLASS;
		public TerminalNode OPEN_CURLY() { return getToken(MarkdownGrammar.OPEN_CURLY, 0); }
		public TerminalNode WORD() { return getToken(MarkdownGrammar.WORD, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(MarkdownGrammar.CLOSE_CURLY, 0); }
		public List<TerminalNode> SPACE() { return getTokens(MarkdownGrammar.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
		}
		public TerminalNode STAR_CLASS() { return getToken(MarkdownGrammar.STAR_CLASS, 0); }
		public IconContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_icon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterIcon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitIcon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitIcon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IconContext icon() throws RecognitionException {
		IconContext _localctx = new IconContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_icon);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(OPEN_CURLY);
			setState(166);
			match(WORD);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(167);
					match(SPACE);
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(174);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(173);
				((IconContext)_localctx).STAR_CLASS = match(STAR_CLASS);
				}
				break;
			}
			String s=(((IconContext)_localctx).STAR_CLASS!=null?((IconContext)_localctx).STAR_CLASS.getText():null); if(s!=null){String[] ints= s.split("/");float esquerda=Float.valueOf(ints[0].trim()); float direita=Float.valueOf(ints[1].trim()); if(esquerda>direita){System.err.println("Nr of stars cannot be bigger than total stars");((IconContext)_localctx).allow = false;}else ((IconContext)_localctx).allow = true;}
			setState(177);
			if (!(_localctx.allow)) throw new FailedPredicateException(this, "$allow");
			setState(178);
			match(CLOSE_CURLY);
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

	public static class BoldTextContext extends ParserRuleContext {
		public TerminalNode TILT() { return getToken(MarkdownGrammar.TILT, 0); }
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownGrammar.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownGrammar.NEWLINE, i);
		}
		public BoldTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boldText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterBoldText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitBoldText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitBoldText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoldTextContext boldText() throws RecognitionException {
		BoldTextContext _localctx = new BoldTextContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_boldText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(TILT);
			setState(182); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(181);
				any();
				}
				}
				setState(184); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << ESCAPE) | (1L << SYMBOL) | (1L << WORD) | (1L << INT))) != 0) );
			setState(187); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(186);
				match(NEWLINE);
				}
				}
				setState(189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class TableHeaderContext extends ParserRuleContext {
		public Word_spaceContext word_space;
		public List<Word_spaceContext> word_space() {
			return getRuleContexts(Word_spaceContext.class);
		}
		public Word_spaceContext word_space(int i) {
			return getRuleContext(Word_spaceContext.class,i);
		}
		public List<TerminalNode> HAT() { return getTokens(MarkdownGrammar.HAT); }
		public TerminalNode HAT(int i) {
			return getToken(MarkdownGrammar.HAT, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownGrammar.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
		}
		public TableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableHeaderContext tableHeader() throws RecognitionException {
		TableHeaderContext _localctx = new TableHeaderContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			((TableHeaderContext)_localctx).word_space = word_space();
			cv.getTable().addHeaderCell((((TableHeaderContext)_localctx).word_space!=null?_input.getText(((TableHeaderContext)_localctx).word_space.start,((TableHeaderContext)_localctx).word_space.stop):null));
			setState(203); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(193);
				match(HAT);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(194);
					match(SPACE);
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(200);
				((TableHeaderContext)_localctx).word_space = word_space();
				cv.getTable().addHeaderCell((((TableHeaderContext)_localctx).word_space!=null?_input.getText(((TableHeaderContext)_localctx).word_space.start,((TableHeaderContext)_localctx).word_space.stop):null));
				}
				}
				setState(205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==HAT );
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

	public static class TableCellContext extends ParserRuleContext {
		public TablecontentContext tablecontent() {
			return getRuleContext(TablecontentContext.class,0);
		}
		public TerminalNode SPLIT() { return getToken(MarkdownGrammar.SPLIT, 0); }
		public TableCellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableCell; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterTableCell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitTableCell(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitTableCell(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableCellContext tableCell() throws RecognitionException {
		TableCellContext _localctx = new TableCellContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tableCell);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			tablecontent();
			setState(208);
			match(SPLIT);
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

	public static class TableLineContext extends ParserRuleContext {
		public List<TableCellContext> tableCell() {
			return getRuleContexts(TableCellContext.class);
		}
		public TableCellContext tableCell(int i) {
			return getRuleContext(TableCellContext.class,i);
		}
		public TableLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterTableLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitTableLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitTableLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableLineContext tableLine() throws RecognitionException {
		TableLineContext _localctx = new TableLineContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tableLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			cv.getTable().addBodyLine();
			setState(212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(211);
				tableCell();
				}
				}
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << OPEN_CURLY) | (1L << ESCAPE) | (1L << SYMBOL) | (1L << WORD) | (1L << INT))) != 0) );
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

	public static class BlockNameContext extends ParserRuleContext {
		public Word_spaceContext word_space;
		public List<TerminalNode> SHARP() { return getTokens(MarkdownGrammar.SHARP); }
		public TerminalNode SHARP(int i) {
			return getToken(MarkdownGrammar.SHARP, i);
		}
		public Word_spaceContext word_space() {
			return getRuleContext(Word_spaceContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownGrammar.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownGrammar.NEWLINE, i);
		}
		public BlockNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterBlockName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitBlockName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitBlockName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockNameContext blockName() throws RecognitionException {
		BlockNameContext _localctx = new BlockNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_blockName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(SHARP);
			setState(217);
			match(SHARP);
			setState(218);
			match(SHARP);
			setState(219);
			((BlockNameContext)_localctx).word_space = word_space();
			cv.getBlock().addBlockName((((BlockNameContext)_localctx).word_space!=null?_input.getText(((BlockNameContext)_localctx).word_space.start,((BlockNameContext)_localctx).word_space.stop):null));
			setState(222); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(221);
				match(NEWLINE);
				}
				}
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class BlockSubNameContext extends ParserRuleContext {
		public Word_spaceContext word_space;
		public List<TerminalNode> SHARP() { return getTokens(MarkdownGrammar.SHARP); }
		public TerminalNode SHARP(int i) {
			return getToken(MarkdownGrammar.SHARP, i);
		}
		public Word_spaceContext word_space() {
			return getRuleContext(Word_spaceContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownGrammar.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownGrammar.NEWLINE, i);
		}
		public BlockSubNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockSubName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterBlockSubName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitBlockSubName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitBlockSubName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockSubNameContext blockSubName() throws RecognitionException {
		BlockSubNameContext _localctx = new BlockSubNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_blockSubName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(SHARP);
			setState(227);
			match(SHARP);
			setState(228);
			match(SHARP);
			setState(229);
			match(SHARP);
			setState(230);
			((BlockSubNameContext)_localctx).word_space = word_space();
			cv.getBlock().addSubBlockName((((BlockSubNameContext)_localctx).word_space!=null?_input.getText(((BlockSubNameContext)_localctx).word_space.start,((BlockSubNameContext)_localctx).word_space.stop):null));
			setState(233); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(232);
				match(NEWLINE);
				}
				}
				setState(235); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class AnyContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(MarkdownGrammar.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(MarkdownGrammar.WORD, i);
		}
		public List<TerminalNode> INT() { return getTokens(MarkdownGrammar.INT); }
		public TerminalNode INT(int i) {
			return getToken(MarkdownGrammar.INT, i);
		}
		public List<TerminalNode> SYMBOL() { return getTokens(MarkdownGrammar.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(MarkdownGrammar.SYMBOL, i);
		}
		public List<TerminalNode> ESCAPE() { return getTokens(MarkdownGrammar.ESCAPE); }
		public TerminalNode ESCAPE(int i) {
			return getToken(MarkdownGrammar.ESCAPE, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownGrammar.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
		}
		public AnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitAny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitAny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyContext any() throws RecognitionException {
		AnyContext _localctx = new AnyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_any);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(246);
					switch (_input.LA(1)) {
					case WORD:
						{
						setState(237);
						match(WORD);
						}
						break;
					case INT:
						{
						setState(238);
						match(INT);
						}
						break;
					case SYMBOL:
						{
						setState(239);
						match(SYMBOL);
						}
						break;
					case ESCAPE:
						{
						setState(240);
						match(ESCAPE);
						}
						break;
					case SPACE:
						{
						setState(242); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(241);
								match(SPACE);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(244); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(248); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class TablecontentContext extends ParserRuleContext {
		public AnyContext any;
		public List<IconContext> icon() {
			return getRuleContexts(IconContext.class);
		}
		public IconContext icon(int i) {
			return getRuleContext(IconContext.class,i);
		}
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public TablecontentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablecontent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterTablecontent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitTablecontent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitTablecontent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablecontentContext tablecontent() throws RecognitionException {
		TablecontentContext _localctx = new TablecontentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tablecontent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(254);
				switch (_input.LA(1)) {
				case OPEN_CURLY:
					{
					setState(250);
					icon();
					}
					break;
				case SPACE:
				case ESCAPE:
				case SYMBOL:
				case WORD:
				case INT:
					{
					setState(251);
					((TablecontentContext)_localctx).any = any();
					cv.getTable().addBodyCell((((TablecontentContext)_localctx).any!=null?_input.getText(((TablecontentContext)_localctx).any.start,((TablecontentContext)_localctx).any.stop):null));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(256); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << OPEN_CURLY) | (1L << ESCAPE) | (1L << SYMBOL) | (1L << WORD) | (1L << INT))) != 0) );
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

	public static class Word_spaceContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(MarkdownGrammar.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(MarkdownGrammar.WORD, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownGrammar.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownGrammar.SPACE, i);
		}
		public Word_spaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word_space; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).enterWord_space(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownGrammarListener ) ((MarkdownGrammarListener)listener).exitWord_space(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownGrammarVisitor ) return ((MarkdownGrammarVisitor<? extends T>)visitor).visitWord_space(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Word_spaceContext word_space() throws RecognitionException {
		Word_spaceContext _localctx = new Word_spaceContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_word_space);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(258);
				match(WORD);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(259);
					match(SPACE);
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(267); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return icon_sempred((IconContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean icon_sempred(IconContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return _localctx.allow;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u0110\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\6\2\62"+
		"\n\2\r\2\16\2\63\3\2\3\2\3\2\6\29\n\2\r\2\16\2:\6\2=\n\2\r\2\16\2>\3\3"+
		"\3\3\6\3C\n\3\r\3\16\3D\3\3\3\3\6\3I\n\3\r\3\16\3J\3\4\3\4\3\4\3\4\7\4"+
		"Q\n\4\f\4\16\4T\13\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\6\7i\n\7\r\7\16\7j\3\b\3\b\3\b\6\bp\n\b\r\b"+
		"\16\bq\3\t\3\t\3\t\5\tw\n\t\3\t\3\t\5\t{\n\t\3\t\6\t~\n\t\r\t\16\t\177"+
		"\3\t\3\t\5\t\u0084\n\t\3\n\3\n\6\n\u0088\n\n\r\n\16\n\u0089\3\n\3\n\7"+
		"\n\u008e\n\n\f\n\16\n\u0091\13\n\3\13\3\13\5\13\u0095\n\13\3\13\5\13\u0098"+
		"\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\6\r\u00a4\n\r\r\r\16\r"+
		"\u00a5\3\16\3\16\3\16\7\16\u00ab\n\16\f\16\16\16\u00ae\13\16\3\16\5\16"+
		"\u00b1\n\16\3\16\3\16\3\16\3\16\3\17\3\17\6\17\u00b9\n\17\r\17\16\17\u00ba"+
		"\3\17\6\17\u00be\n\17\r\17\16\17\u00bf\3\20\3\20\3\20\3\20\7\20\u00c6"+
		"\n\20\f\20\16\20\u00c9\13\20\3\20\3\20\3\20\6\20\u00ce\n\20\r\20\16\20"+
		"\u00cf\3\21\3\21\3\21\3\22\3\22\6\22\u00d7\n\22\r\22\16\22\u00d8\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\6\23\u00e1\n\23\r\23\16\23\u00e2\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\6\24\u00ec\n\24\r\24\16\24\u00ed\3\25\3\25\3\25"+
		"\3\25\3\25\6\25\u00f5\n\25\r\25\16\25\u00f6\6\25\u00f9\n\25\r\25\16\25"+
		"\u00fa\3\26\3\26\3\26\3\26\6\26\u0101\n\26\r\26\16\26\u0102\3\27\3\27"+
		"\7\27\u0107\n\27\f\27\16\27\u010a\13\27\6\27\u010c\n\27\r\27\16\27\u010d"+
		"\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\2\u011e"+
		"\2.\3\2\2\2\4@\3\2\2\2\6L\3\2\2\2\bY\3\2\2\2\n^\3\2\2\2\fc\3\2\2\2\16"+
		"l\3\2\2\2\20z\3\2\2\2\22\u0085\3\2\2\2\24\u0092\3\2\2\2\26\u009b\3\2\2"+
		"\2\30\u00a3\3\2\2\2\32\u00a7\3\2\2\2\34\u00b6\3\2\2\2\36\u00c1\3\2\2\2"+
		" \u00d1\3\2\2\2\"\u00d4\3\2\2\2$\u00da\3\2\2\2&\u00e4\3\2\2\2(\u00f8\3"+
		"\2\2\2*\u0100\3\2\2\2,\u010b\3\2\2\2./\5\4\3\2/\61\7\21\2\2\60\62\7\5"+
		"\2\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64<\3\2\2"+
		"\2\65\66\5\16\b\2\668\7\21\2\2\679\7\5\2\28\67\3\2\2\29:\3\2\2\2:8\3\2"+
		"\2\2:;\3\2\2\2;=\3\2\2\2<\65\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?\3"+
		"\3\2\2\2@B\5\b\5\2AC\5\6\4\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2E"+
		"F\3\2\2\2FH\5\n\6\2GI\5\f\7\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2"+
		"K\5\3\2\2\2LM\b\4\1\2MN\7\13\2\2NR\7\13\2\2OQ\7\3\2\2PO\3\2\2\2QT\3\2"+
		"\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\5,\27\2VW\b\4\1\2WX\7\5"+
		"\2\2X\7\3\2\2\2YZ\7\13\2\2Z[\5,\27\2[\\\b\5\1\2\\]\7\5\2\2]\t\3\2\2\2"+
		"^_\7\6\2\2_`\5(\25\2`a\b\6\1\2ab\7\5\2\2b\13\3\2\2\2cd\7\t\2\2de\5\32"+
		"\16\2ef\5(\25\2fh\b\7\1\2gi\7\5\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3"+
		"\2\2\2k\r\3\2\2\2lm\b\b\1\2mo\5$\23\2np\5\20\t\2on\3\2\2\2pq\3\2\2\2q"+
		"o\3\2\2\2qr\3\2\2\2r\17\3\2\2\2st\5&\24\2tv\b\t\1\2uw\5\34\17\2vu\3\2"+
		"\2\2vw\3\2\2\2wx\3\2\2\2xy\b\t\1\2y{\3\2\2\2zs\3\2\2\2z{\3\2\2\2{\u0083"+
		"\3\2\2\2|~\5\22\n\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2"+
		"\2\2\u0080\u0084\3\2\2\2\u0081\u0084\5\26\f\2\u0082\u0084\5(\25\2\u0083"+
		"}\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\21\3\2\2\2\u0085"+
		"\u0087\7\6\2\2\u0086\u0088\5(\25\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008f\7\5\2\2\u008c\u008e\5\24\13\2\u008d\u008c\3\2\2\2\u008e\u0091\3"+
		"\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\23\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0094\7\b\2\2\u0093\u0095\5\32\16\2\u0094\u0093\3"+
		"\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0098\5(\25\2\u0097"+
		"\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\5"+
		"\2\2\u009a\25\3\2\2\2\u009b\u009c\b\f\1\2\u009c\u009d\5\36\20\2\u009d"+
		"\u009e\7\5\2\2\u009e\u009f\5\30\r\2\u009f\27\3\2\2\2\u00a0\u00a1\5\"\22"+
		"\2\u00a1\u00a2\7\5\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\31\3\2\2\2\u00a7"+
		"\u00a8\7\17\2\2\u00a8\u00ac\7\27\2\2\u00a9\u00ab\7\3\2\2\u00aa\u00a9\3"+
		"\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b1\7\31\2\2\u00b0\u00af\3"+
		"\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\b\16\1\2\u00b3"+
		"\u00b4\6\16\2\3\u00b4\u00b5\7\20\2\2\u00b5\33\3\2\2\2\u00b6\u00b8\7\22"+
		"\2\2\u00b7\u00b9\5(\25\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00be\7\5"+
		"\2\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\35\3\2\2\2\u00c1\u00c2\5,\27\2\u00c2\u00cd\b\20\1"+
		"\2\u00c3\u00c7\7\23\2\2\u00c4\u00c6\7\3\2\2\u00c5\u00c4\3\2\2\2\u00c6"+
		"\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2"+
		"\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\5,\27\2\u00cb\u00cc\b\20\1\2\u00cc"+
		"\u00ce\3\2\2\2\u00cd\u00c3\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\37\3\2\2\2\u00d1\u00d2\5*\26\2\u00d2\u00d3"+
		"\7\24\2\2\u00d3!\3\2\2\2\u00d4\u00d6\b\22\1\2\u00d5\u00d7\5 \21\2\u00d6"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9#\3\2\2\2\u00da\u00db\7\13\2\2\u00db\u00dc\7\13\2\2\u00dc\u00dd"+
		"\7\13\2\2\u00dd\u00de\5,\27\2\u00de\u00e0\b\23\1\2\u00df\u00e1\7\5\2\2"+
		"\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3%\3\2\2\2\u00e4\u00e5\7\13\2\2\u00e5\u00e6\7\13\2\2\u00e6"+
		"\u00e7\7\13\2\2\u00e7\u00e8\7\13\2\2\u00e8\u00e9\5,\27\2\u00e9\u00eb\b"+
		"\24\1\2\u00ea\u00ec\7\5\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\'\3\2\2\2\u00ef\u00f9\7\27\2"+
		"\2\u00f0\u00f9\7\30\2\2\u00f1\u00f9\7\26\2\2\u00f2\u00f9\7\25\2\2\u00f3"+
		"\u00f5\7\3\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00ef\3\2\2\2\u00f8"+
		"\u00f0\3\2\2\2\u00f8\u00f1\3\2\2\2\u00f8\u00f2\3\2\2\2\u00f8\u00f4\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		")\3\2\2\2\u00fc\u0101\5\32\16\2\u00fd\u00fe\5(\25\2\u00fe\u00ff\b\26\1"+
		"\2\u00ff\u0101\3\2\2\2\u0100\u00fc\3\2\2\2\u0100\u00fd\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103+\3\2\2\2\u0104"+
		"\u0108\7\27\2\2\u0105\u0107\7\3\2\2\u0106\u0105\3\2\2\2\u0107\u010a\3"+
		"\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010c\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010b\u0104\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010d\u010e\3\2\2\2\u010e-\3\2\2\2#\63:>DJRjqvz\177\u0083\u0089\u008f"+
		"\u0094\u0097\u00a5\u00ac\u00b0\u00ba\u00bf\u00c7\u00cf\u00d8\u00e2\u00ed"+
		"\u00f6\u00f8\u00fa\u0100\u0102\u0108\u010d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}