package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VARIABLE", "RULE_CHAINE", "RULE_EGAL", "RULE_NOMBRE", "RULE_FONCTION", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "';'", "'('", "')'"
    };
    public static final int RULE_NOMBRE=7;
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int RULE_EGAL=6;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_CHAINE=5;
    public static final int EOF=-1;
    public static final int RULE_ID=9;
    public static final int RULE_WS=14;
    public static final int RULE_VARIABLE=4;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_FONCTION=8;
    public static final int RULE_INT=10;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_S_0_0= ruleINSTRUCTION ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_S_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_S_0_0= ruleINSTRUCTION ) )* )
            // InternalMyDsl.g:78:2: ( (lv_S_0_0= ruleINSTRUCTION ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_S_0_0= ruleINSTRUCTION ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_VARIABLE && LA1_0<=RULE_CHAINE)||LA1_0==RULE_FONCTION) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_S_0_0= ruleINSTRUCTION )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_S_0_0= ruleINSTRUCTION )
            	    // InternalMyDsl.g:80:4: lv_S_0_0= ruleINSTRUCTION
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getSINSTRUCTIONParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_S_0_0=ruleINSTRUCTION();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"S",
            	    					lv_S_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.INSTRUCTION");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleS"
    // InternalMyDsl.g:100:1: entryRuleS returns [String current=null] : iv_ruleS= ruleS EOF ;
    public final String entryRuleS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleS = null;


        try {
            // InternalMyDsl.g:100:41: (iv_ruleS= ruleS EOF )
            // InternalMyDsl.g:101:2: iv_ruleS= ruleS EOF
            {
             newCompositeNode(grammarAccess.getSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleS=ruleS();

            state._fsp--;

             current =iv_ruleS.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleS"


    // $ANTLR start "ruleS"
    // InternalMyDsl.g:107:1: ruleS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INSTRUCTION_0= ruleINSTRUCTION | (kw= '{' this_S_2= ruleS kw= '}' ) ) ;
    public final AntlrDatatypeRuleToken ruleS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_INSTRUCTION_0 = null;

        AntlrDatatypeRuleToken this_S_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (this_INSTRUCTION_0= ruleINSTRUCTION | (kw= '{' this_S_2= ruleS kw= '}' ) ) )
            // InternalMyDsl.g:114:2: (this_INSTRUCTION_0= ruleINSTRUCTION | (kw= '{' this_S_2= ruleS kw= '}' ) )
            {
            // InternalMyDsl.g:114:2: (this_INSTRUCTION_0= ruleINSTRUCTION | (kw= '{' this_S_2= ruleS kw= '}' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_VARIABLE && LA2_0<=RULE_CHAINE)||LA2_0==RULE_FONCTION) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:115:3: this_INSTRUCTION_0= ruleINSTRUCTION
                    {

                    			newCompositeNode(grammarAccess.getSAccess().getINSTRUCTIONParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_INSTRUCTION_0=ruleINSTRUCTION();

                    state._fsp--;


                    			current.merge(this_INSTRUCTION_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:126:3: (kw= '{' this_S_2= ruleS kw= '}' )
                    {
                    // InternalMyDsl.g:126:3: (kw= '{' this_S_2= ruleS kw= '}' )
                    // InternalMyDsl.g:127:4: kw= '{' this_S_2= ruleS kw= '}'
                    {
                    kw=(Token)match(input,16,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSAccess().getLeftCurlyBracketKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getSAccess().getSParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_5);
                    this_S_2=ruleS();

                    state._fsp--;


                    				current.merge(this_S_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,17,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSAccess().getRightCurlyBracketKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleS"


    // $ANTLR start "entryRuleINSTRUCTION"
    // InternalMyDsl.g:152:1: entryRuleINSTRUCTION returns [String current=null] : iv_ruleINSTRUCTION= ruleINSTRUCTION EOF ;
    public final String entryRuleINSTRUCTION() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINSTRUCTION = null;


        try {
            // InternalMyDsl.g:152:51: (iv_ruleINSTRUCTION= ruleINSTRUCTION EOF )
            // InternalMyDsl.g:153:2: iv_ruleINSTRUCTION= ruleINSTRUCTION EOF
            {
             newCompositeNode(grammarAccess.getINSTRUCTIONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleINSTRUCTION=ruleINSTRUCTION();

            state._fsp--;

             current =iv_ruleINSTRUCTION.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleINSTRUCTION"


    // $ANTLR start "ruleINSTRUCTION"
    // InternalMyDsl.g:159:1: ruleINSTRUCTION returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DECLARATION_VAR_0= ruleDECLARATION_VAR | this_AFFECTATION_VAR_1= ruleAFFECTATION_VAR | this_DECLARATION_FONCTION_2= ruleDECLARATION_FONCTION ) ;
    public final AntlrDatatypeRuleToken ruleINSTRUCTION() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_DECLARATION_VAR_0 = null;

        AntlrDatatypeRuleToken this_AFFECTATION_VAR_1 = null;

        AntlrDatatypeRuleToken this_DECLARATION_FONCTION_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:165:2: ( (this_DECLARATION_VAR_0= ruleDECLARATION_VAR | this_AFFECTATION_VAR_1= ruleAFFECTATION_VAR | this_DECLARATION_FONCTION_2= ruleDECLARATION_FONCTION ) )
            // InternalMyDsl.g:166:2: (this_DECLARATION_VAR_0= ruleDECLARATION_VAR | this_AFFECTATION_VAR_1= ruleAFFECTATION_VAR | this_DECLARATION_FONCTION_2= ruleDECLARATION_FONCTION )
            {
            // InternalMyDsl.g:166:2: (this_DECLARATION_VAR_0= ruleDECLARATION_VAR | this_AFFECTATION_VAR_1= ruleAFFECTATION_VAR | this_DECLARATION_FONCTION_2= ruleDECLARATION_FONCTION )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_VARIABLE:
                {
                alt3=1;
                }
                break;
            case RULE_CHAINE:
                {
                alt3=2;
                }
                break;
            case RULE_FONCTION:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:167:3: this_DECLARATION_VAR_0= ruleDECLARATION_VAR
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getDECLARATION_VARParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DECLARATION_VAR_0=ruleDECLARATION_VAR();

                    state._fsp--;


                    			current.merge(this_DECLARATION_VAR_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:178:3: this_AFFECTATION_VAR_1= ruleAFFECTATION_VAR
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getAFFECTATION_VARParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AFFECTATION_VAR_1=ruleAFFECTATION_VAR();

                    state._fsp--;


                    			current.merge(this_AFFECTATION_VAR_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:189:3: this_DECLARATION_FONCTION_2= ruleDECLARATION_FONCTION
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getDECLARATION_FONCTIONParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DECLARATION_FONCTION_2=ruleDECLARATION_FONCTION();

                    state._fsp--;


                    			current.merge(this_DECLARATION_FONCTION_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleINSTRUCTION"


    // $ANTLR start "entryRuleDECLARATION_VAR"
    // InternalMyDsl.g:203:1: entryRuleDECLARATION_VAR returns [String current=null] : iv_ruleDECLARATION_VAR= ruleDECLARATION_VAR EOF ;
    public final String entryRuleDECLARATION_VAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECLARATION_VAR = null;


        try {
            // InternalMyDsl.g:203:55: (iv_ruleDECLARATION_VAR= ruleDECLARATION_VAR EOF )
            // InternalMyDsl.g:204:2: iv_ruleDECLARATION_VAR= ruleDECLARATION_VAR EOF
            {
             newCompositeNode(grammarAccess.getDECLARATION_VARRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDECLARATION_VAR=ruleDECLARATION_VAR();

            state._fsp--;

             current =iv_ruleDECLARATION_VAR.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDECLARATION_VAR"


    // $ANTLR start "ruleDECLARATION_VAR"
    // InternalMyDsl.g:210:1: ruleDECLARATION_VAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VARIABLE_0= RULE_VARIABLE this_CHAINE_1= RULE_CHAINE kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleDECLARATION_VAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VARIABLE_0=null;
        Token this_CHAINE_1=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:216:2: ( (this_VARIABLE_0= RULE_VARIABLE this_CHAINE_1= RULE_CHAINE kw= ';' ) )
            // InternalMyDsl.g:217:2: (this_VARIABLE_0= RULE_VARIABLE this_CHAINE_1= RULE_CHAINE kw= ';' )
            {
            // InternalMyDsl.g:217:2: (this_VARIABLE_0= RULE_VARIABLE this_CHAINE_1= RULE_CHAINE kw= ';' )
            // InternalMyDsl.g:218:3: this_VARIABLE_0= RULE_VARIABLE this_CHAINE_1= RULE_CHAINE kw= ';'
            {
            this_VARIABLE_0=(Token)match(input,RULE_VARIABLE,FOLLOW_6); 

            			current.merge(this_VARIABLE_0);
            		

            			newLeafNode(this_VARIABLE_0, grammarAccess.getDECLARATION_VARAccess().getVARIABLETerminalRuleCall_0());
            		
            this_CHAINE_1=(Token)match(input,RULE_CHAINE,FOLLOW_7); 

            			current.merge(this_CHAINE_1);
            		

            			newLeafNode(this_CHAINE_1, grammarAccess.getDECLARATION_VARAccess().getCHAINETerminalRuleCall_1());
            		
            kw=(Token)match(input,18,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDECLARATION_VARAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDECLARATION_VAR"


    // $ANTLR start "entryRuleAFFECTATION_VAR"
    // InternalMyDsl.g:241:1: entryRuleAFFECTATION_VAR returns [String current=null] : iv_ruleAFFECTATION_VAR= ruleAFFECTATION_VAR EOF ;
    public final String entryRuleAFFECTATION_VAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAFFECTATION_VAR = null;


        try {
            // InternalMyDsl.g:241:55: (iv_ruleAFFECTATION_VAR= ruleAFFECTATION_VAR EOF )
            // InternalMyDsl.g:242:2: iv_ruleAFFECTATION_VAR= ruleAFFECTATION_VAR EOF
            {
             newCompositeNode(grammarAccess.getAFFECTATION_VARRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAFFECTATION_VAR=ruleAFFECTATION_VAR();

            state._fsp--;

             current =iv_ruleAFFECTATION_VAR.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAFFECTATION_VAR"


    // $ANTLR start "ruleAFFECTATION_VAR"
    // InternalMyDsl.g:248:1: ruleAFFECTATION_VAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CHAINE_0= RULE_CHAINE this_EGAL_1= RULE_EGAL this_NOMBRE_2= RULE_NOMBRE kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleAFFECTATION_VAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CHAINE_0=null;
        Token this_EGAL_1=null;
        Token this_NOMBRE_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:254:2: ( (this_CHAINE_0= RULE_CHAINE this_EGAL_1= RULE_EGAL this_NOMBRE_2= RULE_NOMBRE kw= ';' ) )
            // InternalMyDsl.g:255:2: (this_CHAINE_0= RULE_CHAINE this_EGAL_1= RULE_EGAL this_NOMBRE_2= RULE_NOMBRE kw= ';' )
            {
            // InternalMyDsl.g:255:2: (this_CHAINE_0= RULE_CHAINE this_EGAL_1= RULE_EGAL this_NOMBRE_2= RULE_NOMBRE kw= ';' )
            // InternalMyDsl.g:256:3: this_CHAINE_0= RULE_CHAINE this_EGAL_1= RULE_EGAL this_NOMBRE_2= RULE_NOMBRE kw= ';'
            {
            this_CHAINE_0=(Token)match(input,RULE_CHAINE,FOLLOW_8); 

            			current.merge(this_CHAINE_0);
            		

            			newLeafNode(this_CHAINE_0, grammarAccess.getAFFECTATION_VARAccess().getCHAINETerminalRuleCall_0());
            		
            this_EGAL_1=(Token)match(input,RULE_EGAL,FOLLOW_9); 

            			current.merge(this_EGAL_1);
            		

            			newLeafNode(this_EGAL_1, grammarAccess.getAFFECTATION_VARAccess().getEGALTerminalRuleCall_1());
            		
            this_NOMBRE_2=(Token)match(input,RULE_NOMBRE,FOLLOW_7); 

            			current.merge(this_NOMBRE_2);
            		

            			newLeafNode(this_NOMBRE_2, grammarAccess.getAFFECTATION_VARAccess().getNOMBRETerminalRuleCall_2());
            		
            kw=(Token)match(input,18,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAFFECTATION_VARAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAFFECTATION_VAR"


    // $ANTLR start "entryRuleDECLARATION_FONCTION"
    // InternalMyDsl.g:286:1: entryRuleDECLARATION_FONCTION returns [String current=null] : iv_ruleDECLARATION_FONCTION= ruleDECLARATION_FONCTION EOF ;
    public final String entryRuleDECLARATION_FONCTION() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECLARATION_FONCTION = null;


        try {
            // InternalMyDsl.g:286:60: (iv_ruleDECLARATION_FONCTION= ruleDECLARATION_FONCTION EOF )
            // InternalMyDsl.g:287:2: iv_ruleDECLARATION_FONCTION= ruleDECLARATION_FONCTION EOF
            {
             newCompositeNode(grammarAccess.getDECLARATION_FONCTIONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDECLARATION_FONCTION=ruleDECLARATION_FONCTION();

            state._fsp--;

             current =iv_ruleDECLARATION_FONCTION.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDECLARATION_FONCTION"


    // $ANTLR start "ruleDECLARATION_FONCTION"
    // InternalMyDsl.g:293:1: ruleDECLARATION_FONCTION returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FONCTION_0= RULE_FONCTION this_CHAINE_1= RULE_CHAINE kw= '(' kw= ')' kw= '{' kw= '}' kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleDECLARATION_FONCTION() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FONCTION_0=null;
        Token this_CHAINE_1=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:299:2: ( (this_FONCTION_0= RULE_FONCTION this_CHAINE_1= RULE_CHAINE kw= '(' kw= ')' kw= '{' kw= '}' kw= ';' ) )
            // InternalMyDsl.g:300:2: (this_FONCTION_0= RULE_FONCTION this_CHAINE_1= RULE_CHAINE kw= '(' kw= ')' kw= '{' kw= '}' kw= ';' )
            {
            // InternalMyDsl.g:300:2: (this_FONCTION_0= RULE_FONCTION this_CHAINE_1= RULE_CHAINE kw= '(' kw= ')' kw= '{' kw= '}' kw= ';' )
            // InternalMyDsl.g:301:3: this_FONCTION_0= RULE_FONCTION this_CHAINE_1= RULE_CHAINE kw= '(' kw= ')' kw= '{' kw= '}' kw= ';'
            {
            this_FONCTION_0=(Token)match(input,RULE_FONCTION,FOLLOW_6); 

            			current.merge(this_FONCTION_0);
            		

            			newLeafNode(this_FONCTION_0, grammarAccess.getDECLARATION_FONCTIONAccess().getFONCTIONTerminalRuleCall_0());
            		
            this_CHAINE_1=(Token)match(input,RULE_CHAINE,FOLLOW_10); 

            			current.merge(this_CHAINE_1);
            		

            			newLeafNode(this_CHAINE_1, grammarAccess.getDECLARATION_FONCTIONAccess().getCHAINETerminalRuleCall_1());
            		
            kw=(Token)match(input,19,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDECLARATION_FONCTIONAccess().getLeftParenthesisKeyword_2());
            		
            kw=(Token)match(input,20,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDECLARATION_FONCTIONAccess().getRightParenthesisKeyword_3());
            		
            kw=(Token)match(input,16,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDECLARATION_FONCTIONAccess().getLeftCurlyBracketKeyword_4());
            		
            kw=(Token)match(input,17,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDECLARATION_FONCTIONAccess().getRightCurlyBracketKeyword_5());
            		
            kw=(Token)match(input,18,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDECLARATION_FONCTIONAccess().getSemicolonKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDECLARATION_FONCTION"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000132L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010130L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});

}