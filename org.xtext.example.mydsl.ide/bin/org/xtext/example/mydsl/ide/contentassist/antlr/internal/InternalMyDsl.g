/*
 * generated by Xtext 2.29.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

}
@parser::members {
	private MyDslGrammarAccess grammarAccess;

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getSAssignment()); }
		(rule__Model__SAssignment)*
		{ after(grammarAccess.getModelAccess().getSAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleS
entryRuleS
:
{ before(grammarAccess.getSRule()); }
	 ruleS
{ after(grammarAccess.getSRule()); } 
	 EOF 
;

// Rule S
ruleS 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSAccess().getAlternatives()); }
		(rule__S__Alternatives)
		{ after(grammarAccess.getSAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleINSTRUCTION
entryRuleINSTRUCTION
:
{ before(grammarAccess.getINSTRUCTIONRule()); }
	 ruleINSTRUCTION
{ after(grammarAccess.getINSTRUCTIONRule()); } 
	 EOF 
;

// Rule INSTRUCTION
ruleINSTRUCTION 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getINSTRUCTIONAccess().getAlternatives()); }
		(rule__INSTRUCTION__Alternatives)
		{ after(grammarAccess.getINSTRUCTIONAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDECLARATION_VAR
entryRuleDECLARATION_VAR
:
{ before(grammarAccess.getDECLARATION_VARRule()); }
	 ruleDECLARATION_VAR
{ after(grammarAccess.getDECLARATION_VARRule()); } 
	 EOF 
;

// Rule DECLARATION_VAR
ruleDECLARATION_VAR 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDECLARATION_VARAccess().getGroup()); }
		(rule__DECLARATION_VAR__Group__0)
		{ after(grammarAccess.getDECLARATION_VARAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAFFECTATION_VAR
entryRuleAFFECTATION_VAR
:
{ before(grammarAccess.getAFFECTATION_VARRule()); }
	 ruleAFFECTATION_VAR
{ after(grammarAccess.getAFFECTATION_VARRule()); } 
	 EOF 
;

// Rule AFFECTATION_VAR
ruleAFFECTATION_VAR 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAFFECTATION_VARAccess().getGroup()); }
		(rule__AFFECTATION_VAR__Group__0)
		{ after(grammarAccess.getAFFECTATION_VARAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDECLARATION_FONCTION
entryRuleDECLARATION_FONCTION
:
{ before(grammarAccess.getDECLARATION_FONCTIONRule()); }
	 ruleDECLARATION_FONCTION
{ after(grammarAccess.getDECLARATION_FONCTIONRule()); } 
	 EOF 
;

// Rule DECLARATION_FONCTION
ruleDECLARATION_FONCTION 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDECLARATION_FONCTIONAccess().getGroup()); }
		(rule__DECLARATION_FONCTION__Group__0)
		{ after(grammarAccess.getDECLARATION_FONCTIONAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__S__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSAccess().getINSTRUCTIONParserRuleCall_0()); }
		ruleINSTRUCTION
		{ after(grammarAccess.getSAccess().getINSTRUCTIONParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getSAccess().getGroup_1()); }
		(rule__S__Group_1__0)
		{ after(grammarAccess.getSAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__INSTRUCTION__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getINSTRUCTIONAccess().getDECLARATION_VARParserRuleCall_0()); }
		ruleDECLARATION_VAR
		{ after(grammarAccess.getINSTRUCTIONAccess().getDECLARATION_VARParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getINSTRUCTIONAccess().getAFFECTATION_VARParserRuleCall_1()); }
		ruleAFFECTATION_VAR
		{ after(grammarAccess.getINSTRUCTIONAccess().getAFFECTATION_VARParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getINSTRUCTIONAccess().getDECLARATION_FONCTIONParserRuleCall_2()); }
		ruleDECLARATION_FONCTION
		{ after(grammarAccess.getINSTRUCTIONAccess().getDECLARATION_FONCTIONParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__S__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__S__Group_1__0__Impl
	rule__S__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__S__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSAccess().getLeftCurlyBracketKeyword_1_0()); }
	'{'
	{ after(grammarAccess.getSAccess().getLeftCurlyBracketKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__S__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__S__Group_1__1__Impl
	rule__S__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__S__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSAccess().getSParserRuleCall_1_1()); }
	ruleS
	{ after(grammarAccess.getSAccess().getSParserRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__S__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__S__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__S__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSAccess().getRightCurlyBracketKeyword_1_2()); }
	'}'
	{ after(grammarAccess.getSAccess().getRightCurlyBracketKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DECLARATION_VAR__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DECLARATION_VAR__Group__0__Impl
	rule__DECLARATION_VAR__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DECLARATION_VAR__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDECLARATION_VARAccess().getVARIABLETerminalRuleCall_0()); }
	RULE_VARIABLE
	{ after(grammarAccess.getDECLARATION_VARAccess().getVARIABLETerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DECLARATION_VAR__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DECLARATION_VAR__Group__1__Impl
	rule__DECLARATION_VAR__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DECLARATION_VAR__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDECLARATION_VARAccess().getCHAINETerminalRuleCall_1()); }
	RULE_CHAINE
	{ after(grammarAccess.getDECLARATION_VARAccess().getCHAINETerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DECLARATION_VAR__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DECLARATION_VAR__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DECLARATION_VAR__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDECLARATION_VARAccess().getSemicolonKeyword_2()); }
	';'
	{ after(grammarAccess.getDECLARATION_VARAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AFFECTATION_VAR__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AFFECTATION_VAR__Group__0__Impl
	rule__AFFECTATION_VAR__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AFFECTATION_VAR__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAFFECTATION_VARAccess().getCHAINETerminalRuleCall_0()); }
	RULE_CHAINE
	{ after(grammarAccess.getAFFECTATION_VARAccess().getCHAINETerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AFFECTATION_VAR__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AFFECTATION_VAR__Group__1__Impl
	rule__AFFECTATION_VAR__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AFFECTATION_VAR__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAFFECTATION_VARAccess().getEGALTerminalRuleCall_1()); }
	RULE_EGAL
	{ after(grammarAccess.getAFFECTATION_VARAccess().getEGALTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AFFECTATION_VAR__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AFFECTATION_VAR__Group__2__Impl
	rule__AFFECTATION_VAR__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AFFECTATION_VAR__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAFFECTATION_VARAccess().getNOMBRETerminalRuleCall_2()); }
	RULE_NOMBRE
	{ after(grammarAccess.getAFFECTATION_VARAccess().getNOMBRETerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AFFECTATION_VAR__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AFFECTATION_VAR__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AFFECTATION_VAR__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAFFECTATION_VARAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getAFFECTATION_VARAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DECLARATION_FONCTION__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DECLARATION_FONCTION__Group__0__Impl
	rule__DECLARATION_FONCTION__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DECLARATION_FONCTION__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDECLARATION_FONCTIONAccess().getFONCTIONTerminalRuleCall_0()); }
	RULE_FONCTION
	{ after(grammarAccess.getDECLARATION_FONCTIONAccess().getFONCTIONTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DECLARATION_FONCTION__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DECLARATION_FONCTION__Group__1__Impl
	rule__DECLARATION_FONCTION__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DECLARATION_FONCTION__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDECLARATION_FONCTIONAccess().getCHAINETerminalRuleCall_1()); }
	RULE_CHAINE
	{ after(grammarAccess.getDECLARATION_FONCTIONAccess().getCHAINETerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DECLARATION_FONCTION__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DECLARATION_FONCTION__Group__2__Impl
	rule__DECLARATION_FONCTION__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DECLARATION_FONCTION__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDECLARATION_FONCTIONAccess().getLeftParenthesisKeyword_2()); }
	'('
	{ after(grammarAccess.getDECLARATION_FONCTIONAccess().getLeftParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DECLARATION_FONCTION__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DECLARATION_FONCTION__Group__3__Impl
	rule__DECLARATION_FONCTION__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DECLARATION_FONCTION__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDECLARATION_FONCTIONAccess().getRightParenthesisKeyword_3()); }
	')'
	{ after(grammarAccess.getDECLARATION_FONCTIONAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DECLARATION_FONCTION__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DECLARATION_FONCTION__Group__4__Impl
	rule__DECLARATION_FONCTION__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DECLARATION_FONCTION__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDECLARATION_FONCTIONAccess().getLeftCurlyBracketKeyword_4()); }
	'{'
	{ after(grammarAccess.getDECLARATION_FONCTIONAccess().getLeftCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DECLARATION_FONCTION__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DECLARATION_FONCTION__Group__5__Impl
	rule__DECLARATION_FONCTION__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__DECLARATION_FONCTION__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDECLARATION_FONCTIONAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getDECLARATION_FONCTIONAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DECLARATION_FONCTION__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DECLARATION_FONCTION__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DECLARATION_FONCTION__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDECLARATION_FONCTIONAccess().getSemicolonKeyword_6()); }
	';'
	{ after(grammarAccess.getDECLARATION_FONCTIONAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__SAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getSINSTRUCTIONParserRuleCall_0()); }
		ruleINSTRUCTION
		{ after(grammarAccess.getModelAccess().getSINSTRUCTIONParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_VARIABLE : 'var';

RULE_EGAL : '=';

RULE_FONCTION : 'fonction';

RULE_CHAINE : ('a'..'z'|'A'..'Z')*;

RULE_NOMBRE : ('0'..'9')*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
