package org.provus.atm.command.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.provus.atm.command.services.CommandGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCommandParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ENC'", "'{'", "'}'", "'pas'", "'='", "'user'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalCommandParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCommandParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCommandParser.tokenNames; }
    public String getGrammarFileName() { return "../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g"; }



     	private CommandGrammarAccess grammarAccess;
     	
        public InternalCommandParser(TokenStream input, CommandGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected CommandGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:76:1: ruleModel returns [EObject current=null] : ( () ( (lv_commands_1_0= ruleCommand ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_commands_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:79:28: ( ( () ( (lv_commands_1_0= ruleCommand ) )* ) )
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:80:1: ( () ( (lv_commands_1_0= ruleCommand ) )* )
            {
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:80:1: ( () ( (lv_commands_1_0= ruleCommand ) )* )
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:80:2: () ( (lv_commands_1_0= ruleCommand ) )*
            {
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:80:2: ()
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:86:2: ( (lv_commands_1_0= ruleCommand ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==14||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:87:1: (lv_commands_1_0= ruleCommand )
            	    {
            	    // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:87:1: (lv_commands_1_0= ruleCommand )
            	    // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:88:3: lv_commands_1_0= ruleCommand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommand_in_ruleModel140);
            	    lv_commands_1_0=ruleCommand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"commands",
            	            		lv_commands_1_0, 
            	            		"Command");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCommand"
    // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:112:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:113:2: (iv_ruleCommand= ruleCommand EOF )
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:114:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand177);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand187); 

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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:121:1: ruleCommand returns [EObject current=null] : (this_ENC_0= ruleENC | this_PASS_1= rulePASS | this_USER_2= ruleUSER ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_ENC_0 = null;

        EObject this_PASS_1 = null;

        EObject this_USER_2 = null;


         enterRule(); 
            
        try {
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:124:28: ( (this_ENC_0= ruleENC | this_PASS_1= rulePASS | this_USER_2= ruleUSER ) )
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:125:1: (this_ENC_0= ruleENC | this_PASS_1= rulePASS | this_USER_2= ruleUSER )
            {
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:125:1: (this_ENC_0= ruleENC | this_PASS_1= rulePASS | this_USER_2= ruleUSER )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:126:5: this_ENC_0= ruleENC
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getENCParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleENC_in_ruleCommand234);
                    this_ENC_0=ruleENC();

                    state._fsp--;

                     
                            current = this_ENC_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:136:5: this_PASS_1= rulePASS
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getPASSParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePASS_in_ruleCommand261);
                    this_PASS_1=rulePASS();

                    state._fsp--;

                     
                            current = this_PASS_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:146:5: this_USER_2= ruleUSER
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getUSERParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleUSER_in_ruleCommand288);
                    this_USER_2=ruleUSER();

                    state._fsp--;

                     
                            current = this_USER_2; 
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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleENC"
    // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:162:1: entryRuleENC returns [EObject current=null] : iv_ruleENC= ruleENC EOF ;
    public final EObject entryRuleENC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENC = null;


        try {
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:163:2: (iv_ruleENC= ruleENC EOF )
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:164:2: iv_ruleENC= ruleENC EOF
            {
             newCompositeNode(grammarAccess.getENCRule()); 
            pushFollow(FOLLOW_ruleENC_in_entryRuleENC323);
            iv_ruleENC=ruleENC();

            state._fsp--;

             current =iv_ruleENC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleENC333); 

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
    // $ANTLR end "entryRuleENC"


    // $ANTLR start "ruleENC"
    // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:171:1: ruleENC returns [EObject current=null] : ( () otherlv_1= 'ENC' otherlv_2= '{' ( (lv_pass_3_0= RULE_STRING ) ) otherlv_4= '}' ) ;
    public final EObject ruleENC() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_pass_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:174:28: ( ( () otherlv_1= 'ENC' otherlv_2= '{' ( (lv_pass_3_0= RULE_STRING ) ) otherlv_4= '}' ) )
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:175:1: ( () otherlv_1= 'ENC' otherlv_2= '{' ( (lv_pass_3_0= RULE_STRING ) ) otherlv_4= '}' )
            {
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:175:1: ( () otherlv_1= 'ENC' otherlv_2= '{' ( (lv_pass_3_0= RULE_STRING ) ) otherlv_4= '}' )
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:175:2: () otherlv_1= 'ENC' otherlv_2= '{' ( (lv_pass_3_0= RULE_STRING ) ) otherlv_4= '}'
            {
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:175:2: ()
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:176:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getENCAccess().getENCAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleENC379); 

                	newLeafNode(otherlv_1, grammarAccess.getENCAccess().getENCKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleENC391); 

                	newLeafNode(otherlv_2, grammarAccess.getENCAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:189:1: ( (lv_pass_3_0= RULE_STRING ) )
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:190:1: (lv_pass_3_0= RULE_STRING )
            {
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:190:1: (lv_pass_3_0= RULE_STRING )
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:191:3: lv_pass_3_0= RULE_STRING
            {
            lv_pass_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleENC408); 

            			newLeafNode(lv_pass_3_0, grammarAccess.getENCAccess().getPassSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getENCRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"pass",
                    		lv_pass_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleENC425); 

                	newLeafNode(otherlv_4, grammarAccess.getENCAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleENC"


    // $ANTLR start "entryRulePASS"
    // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:219:1: entryRulePASS returns [EObject current=null] : iv_rulePASS= rulePASS EOF ;
    public final EObject entryRulePASS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePASS = null;


        try {
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:220:2: (iv_rulePASS= rulePASS EOF )
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:221:2: iv_rulePASS= rulePASS EOF
            {
             newCompositeNode(grammarAccess.getPASSRule()); 
            pushFollow(FOLLOW_rulePASS_in_entryRulePASS461);
            iv_rulePASS=rulePASS();

            state._fsp--;

             current =iv_rulePASS; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePASS471); 

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
    // $ANTLR end "entryRulePASS"


    // $ANTLR start "rulePASS"
    // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:228:1: rulePASS returns [EObject current=null] : ( () otherlv_1= 'pas' otherlv_2= '=' ( (lv_pass_3_0= RULE_STRING ) ) ) ;
    public final EObject rulePASS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_pass_3_0=null;

         enterRule(); 
            
        try {
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:231:28: ( ( () otherlv_1= 'pas' otherlv_2= '=' ( (lv_pass_3_0= RULE_STRING ) ) ) )
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:232:1: ( () otherlv_1= 'pas' otherlv_2= '=' ( (lv_pass_3_0= RULE_STRING ) ) )
            {
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:232:1: ( () otherlv_1= 'pas' otherlv_2= '=' ( (lv_pass_3_0= RULE_STRING ) ) )
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:232:2: () otherlv_1= 'pas' otherlv_2= '=' ( (lv_pass_3_0= RULE_STRING ) )
            {
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:232:2: ()
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:233:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPASSAccess().getPASSAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_rulePASS517); 

                	newLeafNode(otherlv_1, grammarAccess.getPASSAccess().getPasKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePASS529); 

                	newLeafNode(otherlv_2, grammarAccess.getPASSAccess().getEqualsSignKeyword_2());
                
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:246:1: ( (lv_pass_3_0= RULE_STRING ) )
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:247:1: (lv_pass_3_0= RULE_STRING )
            {
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:247:1: (lv_pass_3_0= RULE_STRING )
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:248:3: lv_pass_3_0= RULE_STRING
            {
            lv_pass_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePASS546); 

            			newLeafNode(lv_pass_3_0, grammarAccess.getPASSAccess().getPassSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPASSRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"pass",
                    		lv_pass_3_0, 
                    		"STRING");
            	    

            }


            }


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
    // $ANTLR end "rulePASS"


    // $ANTLR start "entryRuleUSER"
    // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:272:1: entryRuleUSER returns [EObject current=null] : iv_ruleUSER= ruleUSER EOF ;
    public final EObject entryRuleUSER() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUSER = null;


        try {
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:273:2: (iv_ruleUSER= ruleUSER EOF )
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:274:2: iv_ruleUSER= ruleUSER EOF
            {
             newCompositeNode(grammarAccess.getUSERRule()); 
            pushFollow(FOLLOW_ruleUSER_in_entryRuleUSER587);
            iv_ruleUSER=ruleUSER();

            state._fsp--;

             current =iv_ruleUSER; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUSER597); 

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
    // $ANTLR end "entryRuleUSER"


    // $ANTLR start "ruleUSER"
    // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:281:1: ruleUSER returns [EObject current=null] : ( () otherlv_1= 'user' otherlv_2= '=' ( (lv_user_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleUSER() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_user_3_0=null;

         enterRule(); 
            
        try {
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:284:28: ( ( () otherlv_1= 'user' otherlv_2= '=' ( (lv_user_3_0= RULE_STRING ) ) ) )
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:285:1: ( () otherlv_1= 'user' otherlv_2= '=' ( (lv_user_3_0= RULE_STRING ) ) )
            {
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:285:1: ( () otherlv_1= 'user' otherlv_2= '=' ( (lv_user_3_0= RULE_STRING ) ) )
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:285:2: () otherlv_1= 'user' otherlv_2= '=' ( (lv_user_3_0= RULE_STRING ) )
            {
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:285:2: ()
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:286:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUSERAccess().getUSERAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleUSER643); 

                	newLeafNode(otherlv_1, grammarAccess.getUSERAccess().getUserKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleUSER655); 

                	newLeafNode(otherlv_2, grammarAccess.getUSERAccess().getEqualsSignKeyword_2());
                
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:299:1: ( (lv_user_3_0= RULE_STRING ) )
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:300:1: (lv_user_3_0= RULE_STRING )
            {
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:300:1: (lv_user_3_0= RULE_STRING )
            // ../org.provus.atm.command/src-gen/org/provus/atm/command/parser/antlr/internal/InternalCommand.g:301:3: lv_user_3_0= RULE_STRING
            {
            lv_user_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUSER672); 

            			newLeafNode(lv_user_3_0, grammarAccess.getUSERAccess().getUserSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUSERRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"user",
                    		lv_user_3_0, 
                    		"STRING");
            	    

            }


            }


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
    // $ANTLR end "ruleUSER"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleModel140 = new BitSet(new long[]{0x0000000000014802L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENC_in_ruleCommand234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePASS_in_ruleCommand261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUSER_in_ruleCommand288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENC_in_entryRuleENC323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleENC333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleENC379 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleENC391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleENC408 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleENC425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePASS_in_entryRulePASS461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePASS471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePASS517 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePASS529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePASS546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUSER_in_entryRuleUSER587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUSER597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleUSER643 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleUSER655 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUSER672 = new BitSet(new long[]{0x0000000000000002L});

}