// Generated from CSC488.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CSC488Lexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		L_PAREN=1, R_PAREN=2, L_SQUARE=3, R_SQUARE=4, L_CURLEY=5, R_CURLEY=6, 
		GREATER=7, LESS=8, PLUS=9, MINUS=10, TIMES=11, DIVIDE=12, EQUAL=13, DOT=14, 
		COMMA=15, COLON=16, QUESTION=17, NOT=18, AND=19, OR=20, INTEGER=21, BOOLEAN=22, 
		PROCEDURE=23, FUNC=24, DO=25, ELSE=26, END=27, EXIT=28, FI=29, FORWARD=30, 
		GET=31, IF=32, PUT=33, REPEAT=34, RESULT=35, RETURN=36, NEWLINE=37, THEN=38, 
		WHEN=39, WHILE=40, UNTIL=41, VAR=42, TRUE=43, FALSE=44, IDENT=45, INTCONST=46, 
		STRING=47, COMMENT=48, WS=49;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'('", "')'", "'['", "']'", "'{'", "'}'", "'>'", "'<'", "'+'", "'-'", 
		"'*'", "'/'", "'='", "'.'", "','", "':'", "'?'", "'not'", "'and'", "'or'", 
		"'integer'", "'boolean'", "'proc'", "'func'", "'do'", "'else'", "'end'", 
		"'exit'", "'fi'", "'forward'", "'get'", "'if'", "'put'", "'repeat'", "'result'", 
		"'return'", "'newline'", "'then'", "'when'", "'while'", "'until'", "'var'", 
		"'true'", "'false'", "IDENT", "INTCONST", "STRING", "COMMENT", "WS"
	};
	public static final String[] ruleNames = {
		"L_PAREN", "R_PAREN", "L_SQUARE", "R_SQUARE", "L_CURLEY", "R_CURLEY", 
		"GREATER", "LESS", "PLUS", "MINUS", "TIMES", "DIVIDE", "EQUAL", "DOT", 
		"COMMA", "COLON", "QUESTION", "NOT", "AND", "OR", "INTEGER", "BOOLEAN", 
		"PROCEDURE", "FUNC", "DO", "ELSE", "END", "EXIT", "FI", "FORWARD", "GET", 
		"IF", "PUT", "REPEAT", "RESULT", "RETURN", "NEWLINE", "THEN", "WHEN", 
		"WHILE", "UNTIL", "VAR", "TRUE", "FALSE", "IDENT", "INTCONST", "STRING", 
		"COMMENT", "WS"
	};


	public CSC488Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CSC488.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 47: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 48: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\63\u013f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3"+
		"%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)"+
		"\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-"+
		"\3-\3.\3.\7.\u0118\n.\f.\16.\u011b\13.\3/\6/\u011e\n/\r/\16/\u011f\3\60"+
		"\3\60\7\60\u0124\n\60\f\60\16\60\u0127\13\60\3\60\3\60\3\61\3\61\7\61"+
		"\u012d\n\61\f\61\16\61\u0130\13\61\3\61\5\61\u0133\n\61\3\61\3\61\3\61"+
		"\3\61\3\62\6\62\u013a\n\62\r\62\16\62\u013b\3\62\3\62\2\63\3\3\1\5\4\1"+
		"\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1"+
		"\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31"+
		"\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%"+
		"\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62\2c\63\3\3"+
		"\2\7\4\2C\\c|\6\2\62;C\\aac|\3\2$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u0144"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5g\3\2\2\2\7i\3\2\2\2\tk\3\2\2\2\13m\3\2"+
		"\2\2\ro\3\2\2\2\17q\3\2\2\2\21s\3\2\2\2\23u\3\2\2\2\25w\3\2\2\2\27y\3"+
		"\2\2\2\31{\3\2\2\2\33}\3\2\2\2\35\177\3\2\2\2\37\u0081\3\2\2\2!\u0083"+
		"\3\2\2\2#\u0085\3\2\2\2%\u0087\3\2\2\2\'\u008b\3\2\2\2)\u008f\3\2\2\2"+
		"+\u0092\3\2\2\2-\u009a\3\2\2\2/\u00a2\3\2\2\2\61\u00a7\3\2\2\2\63\u00ac"+
		"\3\2\2\2\65\u00af\3\2\2\2\67\u00b4\3\2\2\29\u00b8\3\2\2\2;\u00bd\3\2\2"+
		"\2=\u00c0\3\2\2\2?\u00c8\3\2\2\2A\u00cc\3\2\2\2C\u00cf\3\2\2\2E\u00d3"+
		"\3\2\2\2G\u00da\3\2\2\2I\u00e1\3\2\2\2K\u00e8\3\2\2\2M\u00f0\3\2\2\2O"+
		"\u00f5\3\2\2\2Q\u00fa\3\2\2\2S\u0100\3\2\2\2U\u0106\3\2\2\2W\u010a\3\2"+
		"\2\2Y\u010f\3\2\2\2[\u0115\3\2\2\2]\u011d\3\2\2\2_\u0121\3\2\2\2a\u012a"+
		"\3\2\2\2c\u0139\3\2\2\2ef\7*\2\2f\4\3\2\2\2gh\7+\2\2h\6\3\2\2\2ij\7]\2"+
		"\2j\b\3\2\2\2kl\7_\2\2l\n\3\2\2\2mn\7}\2\2n\f\3\2\2\2op\7\177\2\2p\16"+
		"\3\2\2\2qr\7@\2\2r\20\3\2\2\2st\7>\2\2t\22\3\2\2\2uv\7-\2\2v\24\3\2\2"+
		"\2wx\7/\2\2x\26\3\2\2\2yz\7,\2\2z\30\3\2\2\2{|\7\61\2\2|\32\3\2\2\2}~"+
		"\7?\2\2~\34\3\2\2\2\177\u0080\7\60\2\2\u0080\36\3\2\2\2\u0081\u0082\7"+
		".\2\2\u0082 \3\2\2\2\u0083\u0084\7<\2\2\u0084\"\3\2\2\2\u0085\u0086\7"+
		"A\2\2\u0086$\3\2\2\2\u0087\u0088\7p\2\2\u0088\u0089\7q\2\2\u0089\u008a"+
		"\7v\2\2\u008a&\3\2\2\2\u008b\u008c\7c\2\2\u008c\u008d\7p\2\2\u008d\u008e"+
		"\7f\2\2\u008e(\3\2\2\2\u008f\u0090\7q\2\2\u0090\u0091\7t\2\2\u0091*\3"+
		"\2\2\2\u0092\u0093\7k\2\2\u0093\u0094\7p\2\2\u0094\u0095\7v\2\2\u0095"+
		"\u0096\7g\2\2\u0096\u0097\7i\2\2\u0097\u0098\7g\2\2\u0098\u0099\7t\2\2"+
		"\u0099,\3\2\2\2\u009a\u009b\7d\2\2\u009b\u009c\7q\2\2\u009c\u009d\7q\2"+
		"\2\u009d\u009e\7n\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1"+
		"\7p\2\2\u00a1.\3\2\2\2\u00a2\u00a3\7r\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5"+
		"\7q\2\2\u00a5\u00a6\7e\2\2\u00a6\60\3\2\2\2\u00a7\u00a8\7h\2\2\u00a8\u00a9"+
		"\7w\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7e\2\2\u00ab\62\3\2\2\2\u00ac\u00ad"+
		"\7f\2\2\u00ad\u00ae\7q\2\2\u00ae\64\3\2\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1"+
		"\7n\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7g\2\2\u00b3\66\3\2\2\2\u00b4\u00b5"+
		"\7g\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7f\2\2\u00b78\3\2\2\2\u00b8\u00b9"+
		"\7g\2\2\u00b9\u00ba\7z\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7v\2\2\u00bc"+
		":\3\2\2\2\u00bd\u00be\7h\2\2\u00be\u00bf\7k\2\2\u00bf<\3\2\2\2\u00c0\u00c1"+
		"\7h\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7y\2\2\u00c4"+
		"\u00c5\7c\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7\7f\2\2\u00c7>\3\2\2\2\u00c8"+
		"\u00c9\7i\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7v\2\2\u00cb@\3\2\2\2\u00cc"+
		"\u00cd\7k\2\2\u00cd\u00ce\7h\2\2\u00ceB\3\2\2\2\u00cf\u00d0\7r\2\2\u00d0"+
		"\u00d1\7w\2\2\u00d1\u00d2\7v\2\2\u00d2D\3\2\2\2\u00d3\u00d4\7t\2\2\u00d4"+
		"\u00d5\7g\2\2\u00d5\u00d6\7r\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7c\2\2"+
		"\u00d8\u00d9\7v\2\2\u00d9F\3\2\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7g\2"+
		"\2\u00dc\u00dd\7u\2\2\u00dd\u00de\7w\2\2\u00de\u00df\7n\2\2\u00df\u00e0"+
		"\7v\2\2\u00e0H\3\2\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4"+
		"\7v\2\2\u00e4\u00e5\7w\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7p\2\2\u00e7"+
		"J\3\2\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7y\2\2\u00eb"+
		"\u00ec\7n\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7g\2\2"+
		"\u00efL\3\2\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7j\2\2\u00f2\u00f3\7g\2"+
		"\2\u00f3\u00f4\7p\2\2\u00f4N\3\2\2\2\u00f5\u00f6\7y\2\2\u00f6\u00f7\7"+
		"j\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7p\2\2\u00f9P\3\2\2\2\u00fa\u00fb"+
		"\7y\2\2\u00fb\u00fc\7j\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7n\2\2\u00fe"+
		"\u00ff\7g\2\2\u00ffR\3\2\2\2\u0100\u0101\7w\2\2\u0101\u0102\7p\2\2\u0102"+
		"\u0103\7v\2\2\u0103\u0104\7k\2\2\u0104\u0105\7n\2\2\u0105T\3\2\2\2\u0106"+
		"\u0107\7x\2\2\u0107\u0108\7c\2\2\u0108\u0109\7t\2\2\u0109V\3\2\2\2\u010a"+
		"\u010b\7v\2\2\u010b\u010c\7t\2\2\u010c\u010d\7w\2\2\u010d\u010e\7g\2\2"+
		"\u010eX\3\2\2\2\u010f\u0110\7h\2\2\u0110\u0111\7c\2\2\u0111\u0112\7n\2"+
		"\2\u0112\u0113\7u\2\2\u0113\u0114\7g\2\2\u0114Z\3\2\2\2\u0115\u0119\t"+
		"\2\2\2\u0116\u0118\t\3\2\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\\\3\2\2\2\u011b\u0119\3\2\2\2"+
		"\u011c\u011e\4\62;\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120^\3\2\2\2\u0121\u0125\7$\2\2\u0122\u0124"+
		"\n\4\2\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129\7$"+
		"\2\2\u0129`\3\2\2\2\u012a\u012e\7\'\2\2\u012b\u012d\n\5\2\2\u012c\u012b"+
		"\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0133\7\17\2\2\u0132\u0131\3"+
		"\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\7\f\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0137\b\61\2\2\u0137b\3\2\2\2\u0138\u013a\t\6\2\2"+
		"\u0139\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\b\62\3\2\u013ed\3\2\2\2\t\2\u0119"+
		"\u011f\u0125\u012e\u0132\u013b";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}