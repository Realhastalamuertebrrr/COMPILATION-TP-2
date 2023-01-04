/*
 * generated by Xtext 2.29.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Model");
		private final Assignment cSAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cSINSTRUCTIONParserRuleCall_0 = (RuleCall)cSAssignment.eContents().get(0);
		
		//// Model : Racine du fichier Model:
		//Model:
		//    S+= INSTRUCTION*;
		@Override public ParserRule getRule() { return rule; }
		
		//S+= INSTRUCTION*
		public Assignment getSAssignment() { return cSAssignment; }
		
		//INSTRUCTION
		public RuleCall getSINSTRUCTIONParserRuleCall_0() { return cSINSTRUCTIONParserRuleCall_0; }
	}
	public class SElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.S");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cINSTRUCTIONParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cSParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		
		//S: INSTRUCTION | '{' S '}';
		@Override public ParserRule getRule() { return rule; }
		
		//INSTRUCTION | '{' S '}'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//INSTRUCTION
		public RuleCall getINSTRUCTIONParserRuleCall_0() { return cINSTRUCTIONParserRuleCall_0; }
		
		//'{' S '}'
		public Group getGroup_1() { return cGroup_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1_0() { return cLeftCurlyBracketKeyword_1_0; }
		
		//S
		public RuleCall getSParserRuleCall_1_1() { return cSParserRuleCall_1_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_1_2() { return cRightCurlyBracketKeyword_1_2; }
	}
	public class INSTRUCTIONElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.INSTRUCTION");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDECLARATION_VARParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAFFECTATION_VARParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cDECLARATION_FONCTIONParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//INSTRUCTION:
		//    DECLARATION_VAR | AFFECTATION_VAR | DECLARATION_FONCTION;
		@Override public ParserRule getRule() { return rule; }
		
		//DECLARATION_VAR | AFFECTATION_VAR | DECLARATION_FONCTION
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DECLARATION_VAR
		public RuleCall getDECLARATION_VARParserRuleCall_0() { return cDECLARATION_VARParserRuleCall_0; }
		
		//AFFECTATION_VAR
		public RuleCall getAFFECTATION_VARParserRuleCall_1() { return cAFFECTATION_VARParserRuleCall_1; }
		
		//DECLARATION_FONCTION
		public RuleCall getDECLARATION_FONCTIONParserRuleCall_2() { return cDECLARATION_FONCTIONParserRuleCall_2; }
	}
	public class DECLARATION_VARElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.DECLARATION_VAR");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cVARIABLETerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cCHAINETerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//DECLARATION_VAR:
		//    VARIABLE CHAINE ';' ;
		@Override public ParserRule getRule() { return rule; }
		
		//VARIABLE CHAINE ';'
		public Group getGroup() { return cGroup; }
		
		//VARIABLE
		public RuleCall getVARIABLETerminalRuleCall_0() { return cVARIABLETerminalRuleCall_0; }
		
		//CHAINE
		public RuleCall getCHAINETerminalRuleCall_1() { return cCHAINETerminalRuleCall_1; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class AFFECTATION_VARElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.AFFECTATION_VAR");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cCHAINETerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cEGALTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cNOMBRETerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//AFFECTATION_VAR:
		//    CHAINE EGAL NOMBRE ';';
		@Override public ParserRule getRule() { return rule; }
		
		//CHAINE EGAL NOMBRE ';'
		public Group getGroup() { return cGroup; }
		
		//CHAINE
		public RuleCall getCHAINETerminalRuleCall_0() { return cCHAINETerminalRuleCall_0; }
		
		//EGAL
		public RuleCall getEGALTerminalRuleCall_1() { return cEGALTerminalRuleCall_1; }
		
		//NOMBRE
		public RuleCall getNOMBRETerminalRuleCall_2() { return cNOMBRETerminalRuleCall_2; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class DECLARATION_FONCTIONElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.DECLARATION_FONCTION");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cFONCTIONTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cCHAINETerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//DECLARATION_FONCTION:
		//    FONCTION CHAINE '('  ')' '{''}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//FONCTION CHAINE '('  ')' '{''}' ';'
		public Group getGroup() { return cGroup; }
		
		//FONCTION
		public RuleCall getFONCTIONTerminalRuleCall_0() { return cFONCTIONTerminalRuleCall_0; }
		
		//CHAINE
		public RuleCall getCHAINETerminalRuleCall_1() { return cCHAINETerminalRuleCall_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}
	
	
	private final ModelElements pModel;
	private final SElements pS;
	private final INSTRUCTIONElements pINSTRUCTION;
	private final DECLARATION_VARElements pDECLARATION_VAR;
	private final AFFECTATION_VARElements pAFFECTATION_VAR;
	private final DECLARATION_FONCTIONElements pDECLARATION_FONCTION;
	private final TerminalRule tVARIABLE;
	private final TerminalRule tEGAL;
	private final TerminalRule tFONCTION;
	private final TerminalRule tCHAINE;
	private final TerminalRule tNOMBRE;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pS = new SElements();
		this.pINSTRUCTION = new INSTRUCTIONElements();
		this.pDECLARATION_VAR = new DECLARATION_VARElements();
		this.pAFFECTATION_VAR = new AFFECTATION_VARElements();
		this.pDECLARATION_FONCTION = new DECLARATION_FONCTIONElements();
		this.tVARIABLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.VARIABLE");
		this.tEGAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.EGAL");
		this.tFONCTION = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.FONCTION");
		this.tCHAINE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.CHAINE");
		this.tNOMBRE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.NOMBRE");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//// Model : Racine du fichier Model:
	//Model:
	//    S+= INSTRUCTION*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//S: INSTRUCTION | '{' S '}';
	public SElements getSAccess() {
		return pS;
	}
	
	public ParserRule getSRule() {
		return getSAccess().getRule();
	}
	
	//INSTRUCTION:
	//    DECLARATION_VAR | AFFECTATION_VAR | DECLARATION_FONCTION;
	public INSTRUCTIONElements getINSTRUCTIONAccess() {
		return pINSTRUCTION;
	}
	
	public ParserRule getINSTRUCTIONRule() {
		return getINSTRUCTIONAccess().getRule();
	}
	
	//DECLARATION_VAR:
	//    VARIABLE CHAINE ';' ;
	public DECLARATION_VARElements getDECLARATION_VARAccess() {
		return pDECLARATION_VAR;
	}
	
	public ParserRule getDECLARATION_VARRule() {
		return getDECLARATION_VARAccess().getRule();
	}
	
	//AFFECTATION_VAR:
	//    CHAINE EGAL NOMBRE ';';
	public AFFECTATION_VARElements getAFFECTATION_VARAccess() {
		return pAFFECTATION_VAR;
	}
	
	public ParserRule getAFFECTATION_VARRule() {
		return getAFFECTATION_VARAccess().getRule();
	}
	
	//DECLARATION_FONCTION:
	//    FONCTION CHAINE '('  ')' '{''}' ';';
	public DECLARATION_FONCTIONElements getDECLARATION_FONCTIONAccess() {
		return pDECLARATION_FONCTION;
	}
	
	public ParserRule getDECLARATION_FONCTIONRule() {
		return getDECLARATION_FONCTIONAccess().getRule();
	}
	
	//terminal VARIABLE : 'var';
	public TerminalRule getVARIABLERule() {
		return tVARIABLE;
	}
	
	//terminal EGAL: '=';
	public TerminalRule getEGALRule() {
		return tEGAL;
	}
	
	//terminal FONCTION: 'fonction';
	public TerminalRule getFONCTIONRule() {
		return tFONCTION;
	}
	
	//terminal CHAINE : ('a'..'z'|'A'..'Z')*;
	public TerminalRule getCHAINERule() {
		return tCHAINE;
	}
	
	//terminal NOMBRE : ('0'..'9')*;
	public TerminalRule getNOMBRERule() {
		return tNOMBRE;
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}