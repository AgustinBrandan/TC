// Generated from /home/lucianolugani/Escritorio/tc/tp2/src/main/java/tp1/programa.g4 by ANTLR 4.9.2

package tp1;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class programaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LLAVEA=1, LLAVEC=2, PARENA=3, PARENC=4, INT=5, DOUBLE=6, VOID=7, FLOAT=8, 
		WHILE=9, IIF=10, IFOR=11, MAS=12, MENOS=13, MULT=14, DIV=15, MENOR=16, 
		MAYOR=17, MENORIGUAL=18, MAYORIGUAL=19, IGUALES=20, DISTINTO=21, ASIG=22, 
		PYQ=23, COMA=24, OR=25, AND=26, RETURN=27, ENTERO=28, ID=29, WS=30;
	public static final int
		RULE_programa = 0, RULE_instrucciones = 1, RULE_bloque = 2, RULE_instruccion = 3, 
		RULE_verificador = 4, RULE_declaracion = 5, RULE_tipo_de_datos = 6, RULE_asignacion_simple = 7, 
		RULE_asignacion = 8, RULE_opal = 9, RULE_exp = 10, RULE_e = 11, RULE_term = 12, 
		RULE_t = 13, RULE_factor = 14, RULE_logico_comp = 15, RULE_comparacion = 16, 
		RULE_comp = 17, RULE_bloque_estructuras_de_control = 18, RULE_pos_pre_incremento = 19, 
		RULE_bloque_for = 20, RULE_iwhile = 21, RULE_iif = 22, RULE_ifor = 23, 
		RULE_una_o_mas_variables = 24, RULE_tipo_de_funcion = 25, RULE_funcion = 26, 
		RULE_declaracion_funcion = 27, RULE_definicion_funcion = 28, RULE_param_declaracion = 29, 
		RULE_param_definicion = 30, RULE_finalizar_con_return = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucciones", "bloque", "instruccion", "verificador", 
			"declaracion", "tipo_de_datos", "asignacion_simple", "asignacion", "opal", 
			"exp", "e", "term", "t", "factor", "logico_comp", "comparacion", "comp", 
			"bloque_estructuras_de_control", "pos_pre_incremento", "bloque_for", 
			"iwhile", "iif", "ifor", "una_o_mas_variables", "tipo_de_funcion", "funcion", 
			"declaracion_funcion", "definicion_funcion", "param_declaracion", "param_definicion", 
			"finalizar_con_return"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "'int'", "'double'", "'void'", "'float'", 
			"'while'", "'if'", "'for'", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'!='", "'='", "';'", "','", "'||'", "'&&'", 
			"'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LLAVEA", "LLAVEC", "PARENA", "PARENC", "INT", "DOUBLE", "VOID", 
			"FLOAT", "WHILE", "IIF", "IFOR", "MAS", "MENOS", "MULT", "DIV", "MENOR", 
			"MAYOR", "MENORIGUAL", "MAYORIGUAL", "IGUALES", "DISTINTO", "ASIG", "PYQ", 
			"COMA", "OR", "AND", "RETURN", "ENTERO", "ID", "WS"
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
	public String getGrammarFileName() { return "programa.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public programaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			instrucciones();
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

	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case FLOAT:
			case WHILE:
			case IIF:
			case IFOR:
			case RETURN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				instruccion();
				setState(67);
				instrucciones();
				}
				break;
			case LLAVEA:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				bloque();
				setState(70);
				instrucciones();
				}
				break;
			case EOF:
			case LLAVEC:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LLAVEA() { return getToken(programaParser.LLAVEA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LLAVEC() { return getToken(programaParser.LLAVEC, 0); }
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(LLAVEA);
			setState(76);
			instrucciones();
			setState(77);
			match(LLAVEC);
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

	public static class InstruccionContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public TerminalNode PYQ() { return getToken(programaParser.PYQ, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public IwhileContext iwhile() {
			return getRuleContext(IwhileContext.class,0);
		}
		public IifContext iif() {
			return getRuleContext(IifContext.class,0);
		}
		public IforContext ifor() {
			return getRuleContext(IforContext.class,0);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public Declaracion_funcionContext declaracion_funcion() {
			return getRuleContext(Declaracion_funcionContext.class,0);
		}
		public Definicion_funcionContext definicion_funcion() {
			return getRuleContext(Definicion_funcionContext.class,0);
		}
		public Finalizar_con_returnContext finalizar_con_return() {
			return getRuleContext(Finalizar_con_returnContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruccion);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				declaracion();
				setState(80);
				match(PYQ);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				asignacion();
				setState(83);
				match(PYQ);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				iwhile();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				iif();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				ifor();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				funcion();
				setState(89);
				match(PYQ);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(91);
				declaracion_funcion();
				setState(92);
				match(PYQ);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(94);
				definicion_funcion();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(95);
				finalizar_con_return();
				setState(96);
				match(PYQ);
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

	public static class VerificadorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(programaParser.ID, 0); }
		public TerminalNode ENTERO() { return getToken(programaParser.ENTERO, 0); }
		public VerificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verificador; }
	}

	public final VerificadorContext verificador() throws RecognitionException {
		VerificadorContext _localctx = new VerificadorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_verificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !(_la==ENTERO || _la==ID) ) {
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

	public static class DeclaracionContext extends ParserRuleContext {
		public Tipo_de_datosContext tipo_de_datos() {
			return getRuleContext(Tipo_de_datosContext.class,0);
		}
		public Asignacion_simpleContext asignacion_simple() {
			return getRuleContext(Asignacion_simpleContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			tipo_de_datos();
			setState(103);
			asignacion_simple();
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

	public static class Tipo_de_datosContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(programaParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(programaParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(programaParser.FLOAT, 0); }
		public Tipo_de_datosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_de_datos; }
	}

	public final Tipo_de_datosContext tipo_de_datos() throws RecognitionException {
		Tipo_de_datosContext _localctx = new Tipo_de_datosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo_de_datos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT))) != 0)) ) {
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

	public static class Asignacion_simpleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(programaParser.ID, 0); }
		public TerminalNode ASIG() { return getToken(programaParser.ASIG, 0); }
		public VerificadorContext verificador() {
			return getRuleContext(VerificadorContext.class,0);
		}
		public TerminalNode COMA() { return getToken(programaParser.COMA, 0); }
		public Asignacion_simpleContext asignacion_simple() {
			return getRuleContext(Asignacion_simpleContext.class,0);
		}
		public Asignacion_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion_simple; }
	}

	public final Asignacion_simpleContext asignacion_simple() throws RecognitionException {
		Asignacion_simpleContext _localctx = new Asignacion_simpleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_asignacion_simple);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(ID);
				setState(108);
				match(ASIG);
				setState(109);
				verificador();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(ID);
				setState(111);
				match(ASIG);
				setState(112);
				match(COMA);
				setState(113);
				asignacion_simple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				match(ID);
				setState(116);
				match(COMA);
				setState(117);
				asignacion_simple();
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(programaParser.ID, 0); }
		public TerminalNode ASIG() { return getToken(programaParser.ASIG, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(ID);
			setState(121);
			match(ASIG);
			setState(122);
			opal();
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

	public static class OpalContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public OpalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opal; }
	}

	public final OpalContext opal() throws RecognitionException {
		OpalContext _localctx = new OpalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_opal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			exp();
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

	public static class ExpContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			term();
			setState(127);
			e();
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

	public static class EContext extends ParserRuleContext {
		public TerminalNode MAS() { return getToken(programaParser.MAS, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode MENOS() { return getToken(programaParser.MENOS, 0); }
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_e);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(MAS);
				setState(130);
				term();
				setState(131);
				e();
				}
				break;
			case MENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(MENOS);
				setState(134);
				term();
				setState(135);
				e();
				}
				break;
			case PARENC:
			case PYQ:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			factor();
			setState(141);
			t();
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

	public static class TContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(programaParser.MULT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TerminalNode DIV() { return getToken(programaParser.DIV, 0); }
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_t);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(MULT);
				setState(144);
				factor();
				setState(145);
				t();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(DIV);
				setState(148);
				factor();
				setState(149);
				t();
				}
				break;
			case PARENC:
			case MAS:
			case MENOS:
			case PYQ:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(programaParser.ID, 0); }
		public TerminalNode ENTERO() { return getToken(programaParser.ENTERO, 0); }
		public TerminalNode PARENA() { return getToken(programaParser.PARENA, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode PARENC() { return getToken(programaParser.PARENC, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_factor);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(ID);
				}
				break;
			case ENTERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(ENTERO);
				}
				break;
			case PARENA:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				match(PARENA);
				setState(157);
				exp();
				setState(158);
				match(PARENC);
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

	public static class Logico_compContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(programaParser.OR, 0); }
		public TerminalNode AND() { return getToken(programaParser.AND, 0); }
		public Logico_compContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logico_comp; }
	}

	public final Logico_compContext logico_comp() throws RecognitionException {
		Logico_compContext _localctx = new Logico_compContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_logico_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !(_la==OR || _la==AND) ) {
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

	public static class ComparacionContext extends ParserRuleContext {
		public TerminalNode MAYOR() { return getToken(programaParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(programaParser.MENOR, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(programaParser.MAYORIGUAL, 0); }
		public TerminalNode MENORIGUAL() { return getToken(programaParser.MENORIGUAL, 0); }
		public TerminalNode IGUALES() { return getToken(programaParser.IGUALES, 0); }
		public TerminalNode DISTINTO() { return getToken(programaParser.DISTINTO, 0); }
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOR) | (1L << MAYOR) | (1L << MENORIGUAL) | (1L << MAYORIGUAL) | (1L << IGUALES) | (1L << DISTINTO))) != 0)) ) {
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

	public static class CompContext extends ParserRuleContext {
		public VerificadorContext verificador() {
			return getRuleContext(VerificadorContext.class,0);
		}
		public Logico_compContext logico_comp() {
			return getRuleContext(Logico_compContext.class,0);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comp);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				verificador();
				setState(167);
				logico_comp();
				setState(168);
				comp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				verificador();
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

	public static class Bloque_estructuras_de_controlContext extends ParserRuleContext {
		public List<VerificadorContext> verificador() {
			return getRuleContexts(VerificadorContext.class);
		}
		public VerificadorContext verificador(int i) {
			return getRuleContext(VerificadorContext.class,i);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public Bloque_estructuras_de_controlContext bloque_estructuras_de_control() {
			return getRuleContext(Bloque_estructuras_de_controlContext.class,0);
		}
		public TerminalNode PARENA() { return getToken(programaParser.PARENA, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TerminalNode PARENC() { return getToken(programaParser.PARENC, 0); }
		public Logico_compContext logico_comp() {
			return getRuleContext(Logico_compContext.class,0);
		}
		public Bloque_estructuras_de_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_estructuras_de_control; }
	}

	public final Bloque_estructuras_de_controlContext bloque_estructuras_de_control() throws RecognitionException {
		Bloque_estructuras_de_controlContext _localctx = new Bloque_estructuras_de_controlContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bloque_estructuras_de_control);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				verificador();
				setState(174);
				comparacion();
				setState(175);
				verificador();
				setState(176);
				bloque_estructuras_de_control();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(PARENA);
				setState(179);
				comp();
				setState(180);
				comparacion();
				setState(181);
				verificador();
				setState(182);
				bloque_estructuras_de_control();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				match(PARENA);
				setState(185);
				comp();
				setState(186);
				bloque_estructuras_de_control();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				match(PARENC);
				setState(189);
				comparacion();
				setState(190);
				verificador();
				setState(191);
				bloque_estructuras_de_control();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(193);
				match(PARENC);
				setState(194);
				logico_comp();
				setState(195);
				bloque_estructuras_de_control();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(197);
				match(PARENC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(198);
				logico_comp();
				setState(199);
				bloque_estructuras_de_control();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
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

	public static class Pos_pre_incrementoContext extends ParserRuleContext {
		public VerificadorContext verificador() {
			return getRuleContext(VerificadorContext.class,0);
		}
		public List<TerminalNode> MAS() { return getTokens(programaParser.MAS); }
		public TerminalNode MAS(int i) {
			return getToken(programaParser.MAS, i);
		}
		public List<TerminalNode> MENOS() { return getTokens(programaParser.MENOS); }
		public TerminalNode MENOS(int i) {
			return getToken(programaParser.MENOS, i);
		}
		public Pos_pre_incrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pos_pre_incremento; }
	}

	public final Pos_pre_incrementoContext pos_pre_incremento() throws RecognitionException {
		Pos_pre_incrementoContext _localctx = new Pos_pre_incrementoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pos_pre_incremento);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				verificador();
				setState(205);
				match(MAS);
				setState(206);
				match(MAS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				verificador();
				setState(209);
				match(MENOS);
				setState(210);
				match(MENOS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(MAS);
				setState(213);
				match(MAS);
				setState(214);
				verificador();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				match(MENOS);
				setState(216);
				match(MENOS);
				setState(217);
				verificador();
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

	public static class Bloque_forContext extends ParserRuleContext {
		public TerminalNode PARENA() { return getToken(programaParser.PARENA, 0); }
		public TerminalNode PARENC() { return getToken(programaParser.PARENC, 0); }
		public List<TerminalNode> PYQ() { return getTokens(programaParser.PYQ); }
		public TerminalNode PYQ(int i) {
			return getToken(programaParser.PYQ, i);
		}
		public Bloque_estructuras_de_controlContext bloque_estructuras_de_control() {
			return getRuleContext(Bloque_estructuras_de_controlContext.class,0);
		}
		public Pos_pre_incrementoContext pos_pre_incremento() {
			return getRuleContext(Pos_pre_incrementoContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public Bloque_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_for; }
	}

	public final Bloque_forContext bloque_for() throws RecognitionException {
		Bloque_forContext _localctx = new Bloque_forContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bloque_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(PARENA);
			{
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case FLOAT:
				{
				setState(221);
				declaracion();
				}
				break;
			case ID:
				{
				setState(222);
				asignacion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(225);
			match(PYQ);
			setState(226);
			bloque_estructuras_de_control();
			setState(227);
			match(PYQ);
			setState(228);
			pos_pre_incremento();
			}
			setState(230);
			match(PARENC);
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

	public static class IwhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(programaParser.WHILE, 0); }
		public TerminalNode PARENA() { return getToken(programaParser.PARENA, 0); }
		public Bloque_estructuras_de_controlContext bloque_estructuras_de_control() {
			return getRuleContext(Bloque_estructuras_de_controlContext.class,0);
		}
		public TerminalNode PARENC() { return getToken(programaParser.PARENC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public IwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iwhile; }
	}

	public final IwhileContext iwhile() throws RecognitionException {
		IwhileContext _localctx = new IwhileContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_iwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(WHILE);
			setState(233);
			match(PARENA);
			setState(234);
			bloque_estructuras_de_control();
			setState(235);
			match(PARENC);
			setState(236);
			bloque();
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

	public static class IifContext extends ParserRuleContext {
		public TerminalNode IIF() { return getToken(programaParser.IIF, 0); }
		public TerminalNode PARENA() { return getToken(programaParser.PARENA, 0); }
		public Bloque_estructuras_de_controlContext bloque_estructuras_de_control() {
			return getRuleContext(Bloque_estructuras_de_controlContext.class,0);
		}
		public TerminalNode PARENC() { return getToken(programaParser.PARENC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public IifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iif; }
	}

	public final IifContext iif() throws RecognitionException {
		IifContext _localctx = new IifContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_iif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(IIF);
			setState(239);
			match(PARENA);
			setState(240);
			bloque_estructuras_de_control();
			setState(241);
			match(PARENC);
			setState(242);
			bloque();
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

	public static class IforContext extends ParserRuleContext {
		public TerminalNode IFOR() { return getToken(programaParser.IFOR, 0); }
		public Bloque_forContext bloque_for() {
			return getRuleContext(Bloque_forContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public IforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifor; }
	}

	public final IforContext ifor() throws RecognitionException {
		IforContext _localctx = new IforContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(IFOR);
			setState(245);
			bloque_for();
			setState(246);
			bloque();
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

	public static class Una_o_mas_variablesContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public Una_o_mas_variablesContext una_o_mas_variables() {
			return getRuleContext(Una_o_mas_variablesContext.class,0);
		}
		public Una_o_mas_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_una_o_mas_variables; }
	}

	public final Una_o_mas_variablesContext una_o_mas_variables() throws RecognitionException {
		Una_o_mas_variablesContext _localctx = new Una_o_mas_variablesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_una_o_mas_variables);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				declaracion();
				setState(249);
				una_o_mas_variables();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				declaracion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Tipo_de_funcionContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(programaParser.VOID, 0); }
		public Tipo_de_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_de_funcion; }
	}

	public final Tipo_de_funcionContext tipo_de_funcion() throws RecognitionException {
		Tipo_de_funcionContext _localctx = new Tipo_de_funcionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tipo_de_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(VOID);
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

	public static class FuncionContext extends ParserRuleContext {
		public Tipo_de_datosContext tipo_de_datos() {
			return getRuleContext(Tipo_de_datosContext.class,0);
		}
		public TerminalNode ID() { return getToken(programaParser.ID, 0); }
		public TerminalNode PARENA() { return getToken(programaParser.PARENA, 0); }
		public Una_o_mas_variablesContext una_o_mas_variables() {
			return getRuleContext(Una_o_mas_variablesContext.class,0);
		}
		public TerminalNode PARENC() { return getToken(programaParser.PARENC, 0); }
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_funcion);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				tipo_de_datos();
				setState(258);
				match(ID);
				setState(259);
				match(PARENA);
				setState(260);
				una_o_mas_variables();
				setState(261);
				match(PARENC);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(ID);
				setState(264);
				match(PARENA);
				setState(265);
				match(PARENC);
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

	public static class Declaracion_funcionContext extends ParserRuleContext {
		public Tipo_de_datosContext tipo_de_datos() {
			return getRuleContext(Tipo_de_datosContext.class,0);
		}
		public TerminalNode ID() { return getToken(programaParser.ID, 0); }
		public TerminalNode PARENA() { return getToken(programaParser.PARENA, 0); }
		public Param_declaracionContext param_declaracion() {
			return getRuleContext(Param_declaracionContext.class,0);
		}
		public TerminalNode PARENC() { return getToken(programaParser.PARENC, 0); }
		public Declaracion_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_funcion; }
	}

	public final Declaracion_funcionContext declaracion_funcion() throws RecognitionException {
		Declaracion_funcionContext _localctx = new Declaracion_funcionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_declaracion_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			tipo_de_datos();
			setState(269);
			match(ID);
			setState(270);
			match(PARENA);
			setState(271);
			param_declaracion();
			setState(272);
			match(PARENC);
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

	public static class Definicion_funcionContext extends ParserRuleContext {
		public Tipo_de_datosContext tipo_de_datos() {
			return getRuleContext(Tipo_de_datosContext.class,0);
		}
		public TerminalNode ID() { return getToken(programaParser.ID, 0); }
		public TerminalNode PARENA() { return getToken(programaParser.PARENA, 0); }
		public Param_definicionContext param_definicion() {
			return getRuleContext(Param_definicionContext.class,0);
		}
		public TerminalNode PARENC() { return getToken(programaParser.PARENC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Definicion_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion_funcion; }
	}

	public final Definicion_funcionContext definicion_funcion() throws RecognitionException {
		Definicion_funcionContext _localctx = new Definicion_funcionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_definicion_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			tipo_de_datos();
			setState(275);
			match(ID);
			setState(276);
			match(PARENA);
			setState(277);
			param_definicion();
			setState(278);
			match(PARENC);
			setState(279);
			bloque();
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

	public static class Param_declaracionContext extends ParserRuleContext {
		public Tipo_de_datosContext tipo_de_datos() {
			return getRuleContext(Tipo_de_datosContext.class,0);
		}
		public TerminalNode ID() { return getToken(programaParser.ID, 0); }
		public TerminalNode COMA() { return getToken(programaParser.COMA, 0); }
		public Param_declaracionContext param_declaracion() {
			return getRuleContext(Param_declaracionContext.class,0);
		}
		public Param_declaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_declaracion; }
	}

	public final Param_declaracionContext param_declaracion() throws RecognitionException {
		Param_declaracionContext _localctx = new Param_declaracionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_param_declaracion);
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				tipo_de_datos();
				setState(284);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(282);
					match(ID);
					}
					break;
				case PARENC:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				tipo_de_datos();
				setState(289);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(287);
					match(ID);
					}
					break;
				case COMA:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(291);
				match(COMA);
				setState(292);
				param_declaracion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Param_definicionContext extends ParserRuleContext {
		public Tipo_de_datosContext tipo_de_datos() {
			return getRuleContext(Tipo_de_datosContext.class,0);
		}
		public TerminalNode ID() { return getToken(programaParser.ID, 0); }
		public TerminalNode COMA() { return getToken(programaParser.COMA, 0); }
		public Param_definicionContext param_definicion() {
			return getRuleContext(Param_definicionContext.class,0);
		}
		public Param_definicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_definicion; }
	}

	public final Param_definicionContext param_definicion() throws RecognitionException {
		Param_definicionContext _localctx = new Param_definicionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_param_definicion);
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				tipo_de_datos();
				setState(298);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				tipo_de_datos();
				setState(301);
				match(ID);
				setState(302);
				match(COMA);
				setState(303);
				param_definicion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Finalizar_con_returnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(programaParser.RETURN, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Finalizar_con_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalizar_con_return; }
	}

	public final Finalizar_con_returnContext finalizar_con_return() throws RecognitionException {
		Finalizar_con_returnContext _localctx = new Finalizar_con_returnContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_finalizar_con_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(RETURN);
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARENA:
			case ENTERO:
			case ID:
				{
				setState(309);
				term();
				}
				break;
			case PYQ:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u013c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3L\n\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5e\n\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\ty\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008d\n\r\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u009b\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00a3\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u00ae\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u00cd\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00dd\n\25\3\26\3\26\3\26\5\26\u00e2"+
		"\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0100\n\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u010d\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\5\37\u011f\n\37\3\37\3\37\3\37\5\37\u0124"+
		"\n\37\3\37\3\37\3\37\3\37\5\37\u012a\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \5"+
		" \u0135\n \3!\3!\3!\5!\u013a\n!\3!\2\2\"\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\6\3\2\36\37\4\2\7\b\n\n\3\2\33\34"+
		"\3\2\22\27\2\u0144\2B\3\2\2\2\4K\3\2\2\2\6M\3\2\2\2\bd\3\2\2\2\nf\3\2"+
		"\2\2\fh\3\2\2\2\16k\3\2\2\2\20x\3\2\2\2\22z\3\2\2\2\24~\3\2\2\2\26\u0080"+
		"\3\2\2\2\30\u008c\3\2\2\2\32\u008e\3\2\2\2\34\u009a\3\2\2\2\36\u00a2\3"+
		"\2\2\2 \u00a4\3\2\2\2\"\u00a6\3\2\2\2$\u00ad\3\2\2\2&\u00cc\3\2\2\2(\u00dc"+
		"\3\2\2\2*\u00de\3\2\2\2,\u00ea\3\2\2\2.\u00f0\3\2\2\2\60\u00f6\3\2\2\2"+
		"\62\u00ff\3\2\2\2\64\u0101\3\2\2\2\66\u010c\3\2\2\28\u010e\3\2\2\2:\u0114"+
		"\3\2\2\2<\u0129\3\2\2\2>\u0134\3\2\2\2@\u0136\3\2\2\2BC\5\4\3\2C\3\3\2"+
		"\2\2DE\5\b\5\2EF\5\4\3\2FL\3\2\2\2GH\5\6\4\2HI\5\4\3\2IL\3\2\2\2JL\3\2"+
		"\2\2KD\3\2\2\2KG\3\2\2\2KJ\3\2\2\2L\5\3\2\2\2MN\7\3\2\2NO\5\4\3\2OP\7"+
		"\4\2\2P\7\3\2\2\2QR\5\f\7\2RS\7\31\2\2Se\3\2\2\2TU\5\22\n\2UV\7\31\2\2"+
		"Ve\3\2\2\2We\5,\27\2Xe\5.\30\2Ye\5\60\31\2Z[\5\66\34\2[\\\7\31\2\2\\e"+
		"\3\2\2\2]^\58\35\2^_\7\31\2\2_e\3\2\2\2`e\5:\36\2ab\5@!\2bc\7\31\2\2c"+
		"e\3\2\2\2dQ\3\2\2\2dT\3\2\2\2dW\3\2\2\2dX\3\2\2\2dY\3\2\2\2dZ\3\2\2\2"+
		"d]\3\2\2\2d`\3\2\2\2da\3\2\2\2e\t\3\2\2\2fg\t\2\2\2g\13\3\2\2\2hi\5\16"+
		"\b\2ij\5\20\t\2j\r\3\2\2\2kl\t\3\2\2l\17\3\2\2\2mn\7\37\2\2no\7\30\2\2"+
		"oy\5\n\6\2pq\7\37\2\2qr\7\30\2\2rs\7\32\2\2sy\5\20\t\2ty\7\37\2\2uv\7"+
		"\37\2\2vw\7\32\2\2wy\5\20\t\2xm\3\2\2\2xp\3\2\2\2xt\3\2\2\2xu\3\2\2\2"+
		"y\21\3\2\2\2z{\7\37\2\2{|\7\30\2\2|}\5\24\13\2}\23\3\2\2\2~\177\5\26\f"+
		"\2\177\25\3\2\2\2\u0080\u0081\5\32\16\2\u0081\u0082\5\30\r\2\u0082\27"+
		"\3\2\2\2\u0083\u0084\7\16\2\2\u0084\u0085\5\32\16\2\u0085\u0086\5\30\r"+
		"\2\u0086\u008d\3\2\2\2\u0087\u0088\7\17\2\2\u0088\u0089\5\32\16\2\u0089"+
		"\u008a\5\30\r\2\u008a\u008d\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u0083\3"+
		"\2\2\2\u008c\u0087\3\2\2\2\u008c\u008b\3\2\2\2\u008d\31\3\2\2\2\u008e"+
		"\u008f\5\36\20\2\u008f\u0090\5\34\17\2\u0090\33\3\2\2\2\u0091\u0092\7"+
		"\20\2\2\u0092\u0093\5\36\20\2\u0093\u0094\5\34\17\2\u0094\u009b\3\2\2"+
		"\2\u0095\u0096\7\21\2\2\u0096\u0097\5\36\20\2\u0097\u0098\5\34\17\2\u0098"+
		"\u009b\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0091\3\2\2\2\u009a\u0095\3\2"+
		"\2\2\u009a\u0099\3\2\2\2\u009b\35\3\2\2\2\u009c\u00a3\7\37\2\2\u009d\u00a3"+
		"\7\36\2\2\u009e\u009f\7\5\2\2\u009f\u00a0\5\26\f\2\u00a0\u00a1\7\6\2\2"+
		"\u00a1\u00a3\3\2\2\2\u00a2\u009c\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2\u009e"+
		"\3\2\2\2\u00a3\37\3\2\2\2\u00a4\u00a5\t\4\2\2\u00a5!\3\2\2\2\u00a6\u00a7"+
		"\t\5\2\2\u00a7#\3\2\2\2\u00a8\u00a9\5\n\6\2\u00a9\u00aa\5 \21\2\u00aa"+
		"\u00ab\5$\23\2\u00ab\u00ae\3\2\2\2\u00ac\u00ae\5\n\6\2\u00ad\u00a8\3\2"+
		"\2\2\u00ad\u00ac\3\2\2\2\u00ae%\3\2\2\2\u00af\u00b0\5\n\6\2\u00b0\u00b1"+
		"\5\"\22\2\u00b1\u00b2\5\n\6\2\u00b2\u00b3\5&\24\2\u00b3\u00cd\3\2\2\2"+
		"\u00b4\u00b5\7\5\2\2\u00b5\u00b6\5$\23\2\u00b6\u00b7\5\"\22\2\u00b7\u00b8"+
		"\5\n\6\2\u00b8\u00b9\5&\24\2\u00b9\u00cd\3\2\2\2\u00ba\u00bb\7\5\2\2\u00bb"+
		"\u00bc\5$\23\2\u00bc\u00bd\5&\24\2\u00bd\u00cd\3\2\2\2\u00be\u00bf\7\6"+
		"\2\2\u00bf\u00c0\5\"\22\2\u00c0\u00c1\5\n\6\2\u00c1\u00c2\5&\24\2\u00c2"+
		"\u00cd\3\2\2\2\u00c3\u00c4\7\6\2\2\u00c4\u00c5\5 \21\2\u00c5\u00c6\5&"+
		"\24\2\u00c6\u00cd\3\2\2\2\u00c7\u00cd\7\6\2\2\u00c8\u00c9\5 \21\2\u00c9"+
		"\u00ca\5&\24\2\u00ca\u00cd\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00af\3\2"+
		"\2\2\u00cc\u00b4\3\2\2\2\u00cc\u00ba\3\2\2\2\u00cc\u00be\3\2\2\2\u00cc"+
		"\u00c3\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cc\u00cb\3\2"+
		"\2\2\u00cd\'\3\2\2\2\u00ce\u00cf\5\n\6\2\u00cf\u00d0\7\16\2\2\u00d0\u00d1"+
		"\7\16\2\2\u00d1\u00dd\3\2\2\2\u00d2\u00d3\5\n\6\2\u00d3\u00d4\7\17\2\2"+
		"\u00d4\u00d5\7\17\2\2\u00d5\u00dd\3\2\2\2\u00d6\u00d7\7\16\2\2\u00d7\u00d8"+
		"\7\16\2\2\u00d8\u00dd\5\n\6\2\u00d9\u00da\7\17\2\2\u00da\u00db\7\17\2"+
		"\2\u00db\u00dd\5\n\6\2\u00dc\u00ce\3\2\2\2\u00dc\u00d2\3\2\2\2\u00dc\u00d6"+
		"\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dd)\3\2\2\2\u00de\u00e1\7\5\2\2\u00df"+
		"\u00e2\5\f\7\2\u00e0\u00e2\5\22\n\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3"+
		"\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\7\31\2\2\u00e4\u00e5\5&\24\2\u00e5"+
		"\u00e6\7\31\2\2\u00e6\u00e7\5(\25\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7"+
		"\6\2\2\u00e9+\3\2\2\2\u00ea\u00eb\7\13\2\2\u00eb\u00ec\7\5\2\2\u00ec\u00ed"+
		"\5&\24\2\u00ed\u00ee\7\6\2\2\u00ee\u00ef\5\6\4\2\u00ef-\3\2\2\2\u00f0"+
		"\u00f1\7\f\2\2\u00f1\u00f2\7\5\2\2\u00f2\u00f3\5&\24\2\u00f3\u00f4\7\6"+
		"\2\2\u00f4\u00f5\5\6\4\2\u00f5/\3\2\2\2\u00f6\u00f7\7\r\2\2\u00f7\u00f8"+
		"\5*\26\2\u00f8\u00f9\5\6\4\2\u00f9\61\3\2\2\2\u00fa\u00fb\5\f\7\2\u00fb"+
		"\u00fc\5\62\32\2\u00fc\u0100\3\2\2\2\u00fd\u0100\5\f\7\2\u00fe\u0100\3"+
		"\2\2\2\u00ff\u00fa\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100"+
		"\63\3\2\2\2\u0101\u0102\7\t\2\2\u0102\65\3\2\2\2\u0103\u0104\5\16\b\2"+
		"\u0104\u0105\7\37\2\2\u0105\u0106\7\5\2\2\u0106\u0107\5\62\32\2\u0107"+
		"\u0108\7\6\2\2\u0108\u010d\3\2\2\2\u0109\u010a\7\37\2\2\u010a\u010b\7"+
		"\5\2\2\u010b\u010d\7\6\2\2\u010c\u0103\3\2\2\2\u010c\u0109\3\2\2\2\u010d"+
		"\67\3\2\2\2\u010e\u010f\5\16\b\2\u010f\u0110\7\37\2\2\u0110\u0111\7\5"+
		"\2\2\u0111\u0112\5<\37\2\u0112\u0113\7\6\2\2\u01139\3\2\2\2\u0114\u0115"+
		"\5\16\b\2\u0115\u0116\7\37\2\2\u0116\u0117\7\5\2\2\u0117\u0118\5> \2\u0118"+
		"\u0119\7\6\2\2\u0119\u011a\5\6\4\2\u011a;\3\2\2\2\u011b\u011e\5\16\b\2"+
		"\u011c\u011f\7\37\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011d"+
		"\3\2\2\2\u011f\u012a\3\2\2\2\u0120\u0123\5\16\b\2\u0121\u0124\7\37\2\2"+
		"\u0122\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125\u0126\7\32\2\2\u0126\u0127\5<\37\2\u0127\u012a\3\2\2\2"+
		"\u0128\u012a\3\2\2\2\u0129\u011b\3\2\2\2\u0129\u0120\3\2\2\2\u0129\u0128"+
		"\3\2\2\2\u012a=\3\2\2\2\u012b\u012c\5\16\b\2\u012c\u012d\7\37\2\2\u012d"+
		"\u0135\3\2\2\2\u012e\u012f\5\16\b\2\u012f\u0130\7\37\2\2\u0130\u0131\7"+
		"\32\2\2\u0131\u0132\5> \2\u0132\u0135\3\2\2\2\u0133\u0135\3\2\2\2\u0134"+
		"\u012b\3\2\2\2\u0134\u012e\3\2\2\2\u0134\u0133\3\2\2\2\u0135?\3\2\2\2"+
		"\u0136\u0139\7\35\2\2\u0137\u013a\5\32\16\2\u0138\u013a\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013aA\3\2\2\2\23Kdx\u008c\u009a\u00a2"+
		"\u00ad\u00cc\u00dc\u00e1\u00ff\u010c\u011e\u0123\u0129\u0134\u0139";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}