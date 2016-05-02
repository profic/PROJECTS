// Generated from Example.g4 by ANTLR 4.5.3

	import java.util.HashMap;
	import java.util.Map;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExampleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, TYPE=21, NAME=22, LOGICTERM=23, SIGN=24, 
		BOOLEAN=25, INT=26, FLOAT=27, EXP=28, WS=29, STR=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "TYPE", "NAME", "LOGICTERM", "SIGN", "BOOLEAN", 
		"INT", "FLOAT", "EXP", "WS", "STR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'print'", "'('", "','", "')'", "'''", "'read'", "'_'", "'if'", 
		"'{'", "'}'", "'else'", "'while'", "'for'", "'range'", "'or'", "'and'", 
		"'int'", "'float'", "'bool'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "TYPE", "NAME", 
		"LOGICTERM", "SIGN", "BOOLEAN", "INT", "FLOAT", "EXP", "WS", "STR"
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


	public ExampleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Example.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2 \u00e6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0095\n\26\3\27\5\27\u0098\n\27"+
		"\3\27\7\27\u009b\n\27\f\27\16\27\u009e\13\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u00a7\n\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u00b4\n\32\3\33\3\33\3\33\7\33\u00b9\n\33\f\33\16\33\u00bc"+
		"\13\33\5\33\u00be\n\33\3\34\5\34\u00c1\n\34\3\34\3\34\3\34\3\34\5\34\u00c7"+
		"\n\34\3\34\5\34\u00ca\n\34\3\34\3\34\3\34\3\34\5\34\u00d0\n\34\3\34\5"+
		"\34\u00d3\n\34\3\35\3\35\5\35\u00d7\n\35\3\35\3\35\3\36\6\36\u00dc\n\36"+
		"\r\36\16\36\u00dd\3\36\3\36\3\37\6\37\u00e3\n\37\r\37\16\37\u00e4\2\2"+
		" \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= \3\2\f\4\2C\\c|\5\2\62;C\\c|\4\2>>@@\5\2,-//\61\61\3\2\63;\3\2\62;\4"+
		"\2GGgg\4\2--//\5\2\13\f\17\17\"\"\4\2))^^\u00f7\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3"+
		"\2\2\2\5A\3\2\2\2\7G\3\2\2\2\tI\3\2\2\2\13K\3\2\2\2\rM\3\2\2\2\17O\3\2"+
		"\2\2\21T\3\2\2\2\23V\3\2\2\2\25Y\3\2\2\2\27[\3\2\2\2\31]\3\2\2\2\33b\3"+
		"\2\2\2\35h\3\2\2\2\37l\3\2\2\2!r\3\2\2\2#u\3\2\2\2%y\3\2\2\2\'}\3\2\2"+
		"\2)\u0083\3\2\2\2+\u0094\3\2\2\2-\u0097\3\2\2\2/\u00a6\3\2\2\2\61\u00a8"+
		"\3\2\2\2\63\u00b3\3\2\2\2\65\u00bd\3\2\2\2\67\u00d2\3\2\2\29\u00d4\3\2"+
		"\2\2;\u00db\3\2\2\2=\u00e2\3\2\2\2?@\7?\2\2@\4\3\2\2\2AB\7r\2\2BC\7t\2"+
		"\2CD\7k\2\2DE\7p\2\2EF\7v\2\2F\6\3\2\2\2GH\7*\2\2H\b\3\2\2\2IJ\7.\2\2"+
		"J\n\3\2\2\2KL\7+\2\2L\f\3\2\2\2MN\7)\2\2N\16\3\2\2\2OP\7t\2\2PQ\7g\2\2"+
		"QR\7c\2\2RS\7f\2\2S\20\3\2\2\2TU\7a\2\2U\22\3\2\2\2VW\7k\2\2WX\7h\2\2"+
		"X\24\3\2\2\2YZ\7}\2\2Z\26\3\2\2\2[\\\7\177\2\2\\\30\3\2\2\2]^\7g\2\2^"+
		"_\7n\2\2_`\7u\2\2`a\7g\2\2a\32\3\2\2\2bc\7y\2\2cd\7j\2\2de\7k\2\2ef\7"+
		"n\2\2fg\7g\2\2g\34\3\2\2\2hi\7h\2\2ij\7q\2\2jk\7t\2\2k\36\3\2\2\2lm\7"+
		"t\2\2mn\7c\2\2no\7p\2\2op\7i\2\2pq\7g\2\2q \3\2\2\2rs\7q\2\2st\7t\2\2"+
		"t\"\3\2\2\2uv\7c\2\2vw\7p\2\2wx\7f\2\2x$\3\2\2\2yz\7k\2\2z{\7p\2\2{|\7"+
		"v\2\2|&\3\2\2\2}~\7h\2\2~\177\7n\2\2\177\u0080\7q\2\2\u0080\u0081\7c\2"+
		"\2\u0081\u0082\7v\2\2\u0082(\3\2\2\2\u0083\u0084\7d\2\2\u0084\u0085\7"+
		"q\2\2\u0085\u0086\7q\2\2\u0086\u0087\7n\2\2\u0087*\3\2\2\2\u0088\u0089"+
		"\7d\2\2\u0089\u008a\7q\2\2\u008a\u008b\7q\2\2\u008b\u0095\7n\2\2\u008c"+
		"\u008d\7k\2\2\u008d\u008e\7p\2\2\u008e\u0095\7v\2\2\u008f\u0090\7h\2\2"+
		"\u0090\u0091\7n\2\2\u0091\u0092\7q\2\2\u0092\u0093\7c\2\2\u0093\u0095"+
		"\7v\2\2\u0094\u0088\3\2\2\2\u0094\u008c\3\2\2\2\u0094\u008f\3\2\2\2\u0095"+
		",\3\2\2\2\u0096\u0098\t\2\2\2\u0097\u0096\3\2\2\2\u0098\u009c\3\2\2\2"+
		"\u0099\u009b\t\3\2\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d.\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a0\7?\2\2\u00a0\u00a7\7?\2\2\u00a1\u00a2\7@\2\2\u00a2\u00a7\7?\2\2"+
		"\u00a3\u00a4\7>\2\2\u00a4\u00a7\7?\2\2\u00a5\u00a7\t\4\2\2\u00a6\u009f"+
		"\3\2\2\2\u00a6\u00a1\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\60\3\2\2\2\u00a8\u00a9\t\5\2\2\u00a9\62\3\2\2\2\u00aa\u00ab\7V\2\2\u00ab"+
		"\u00ac\7t\2\2\u00ac\u00ad\7w\2\2\u00ad\u00b4\7g\2\2\u00ae\u00af\7H\2\2"+
		"\u00af\u00b0\7c\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b4"+
		"\7g\2\2\u00b3\u00aa\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b4\64\3\2\2\2\u00b5"+
		"\u00be\7\62\2\2\u00b6\u00ba\t\6\2\2\u00b7\u00b9\t\7\2\2\u00b8\u00b7\3"+
		"\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00b5\3\2\2\2\u00bd\u00b6\3\2"+
		"\2\2\u00be\66\3\2\2\2\u00bf\u00c1\7/\2\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\5\65\33\2\u00c3\u00c4\7\60\2"+
		"\2\u00c4\u00c6\5\65\33\2\u00c5\u00c7\59\35\2\u00c6\u00c5\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00d3\3\2\2\2\u00c8\u00ca\7/\2\2\u00c9\u00c8\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\5\65\33\2\u00cc"+
		"\u00cd\59\35\2\u00cd\u00d3\3\2\2\2\u00ce\u00d0\7/\2\2\u00cf\u00ce\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\5\65\33\2\u00d2"+
		"\u00c0\3\2\2\2\u00d2\u00c9\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d38\3\2\2\2"+
		"\u00d4\u00d6\t\b\2\2\u00d5\u00d7\t\t\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\5\65\33\2\u00d9:\3\2\2\2\u00da"+
		"\u00dc\t\n\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\b\36\2\2\u00e0"+
		"<\3\2\2\2\u00e1\u00e3\n\13\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2"+
		"\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5>\3\2\2\2\23\2\u0094\u0097"+
		"\u009a\u009c\u00a6\u00b3\u00ba\u00bd\u00c0\u00c6\u00c9\u00cf\u00d2\u00d6"+
		"\u00dd\u00e4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}