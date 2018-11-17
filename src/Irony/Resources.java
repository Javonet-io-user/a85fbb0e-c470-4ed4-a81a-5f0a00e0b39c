package Irony;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.*;
import jio.System.Resources.*;
import jio.System.Globalization.*;public class Resources {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public static ResourceManager getResourceManager (){ try { return new ResourceManager((NObject)Javonet.getType("Resources").<NObject>get("ResourceManager"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public static void setCulture (CultureInfo value){ try { Javonet.getType("Resources").set("Culture",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public static CultureInfo getCulture (){ try { return new CultureInfo((NObject)Javonet.getType("Resources").<NObject>get("Culture"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public static java.lang.String getConsoleNoChars (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ConsoleNoChars");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getConsoleYesChars (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ConsoleYesChars");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrAmbigGrammarRR (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrAmbigGrammarRR");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrAmbigGrammarSR (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrAmbigGrammarSR");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrArgListNotFound (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrArgListNotFound");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrAssignLiteralValue (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrAssignLiteralValue");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrBadChar (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrBadChar");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrBadStrLiteral (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrBadStrLiteral");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrBadUnEscape (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrBadUnEscape");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrBadXEscape (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrBadXEscape");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrCannotConvertValue (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrCannotConvertValue");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrCannotConvertValueToType (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrCannotConvertValueToType");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrCannotMoveBackInSource (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrCannotMoveBackInSource");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrConflictMsgTemplate (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrConflictMsgTemplate");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrConsoleFatalError (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrConsoleFatalError");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrConstructNotSupported (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrConstructNotSupported");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrDsvNoClosingQuote (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrDsvNoClosingQuote");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrDupRegexSwitch (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrDupRegexSwitch");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrDupStartSymbolStr (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrDupStartSymbolStr");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrFailedCreateNode (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrFailedCreateNode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrFreeTextNoEndTag (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrFreeTextNoEndTag");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrImpliedOpUseParserLink (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrImpliedOpUseParserLink");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrInternalErrDataPopFailed (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrInternalErrDataPopFailed");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrInterpreterIsBusy (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrInterpreterIsBusy");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrInvalidArgsForIncDec (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrInvalidArgsForIncDec");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrInvalidAstMode (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrInvalidAstMode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrInvalidChar (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrInvalidChar");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrInvalidEmbeddedPrefix (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrInvalidEmbeddedPrefix");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrInvDedent (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrInvDedent");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrInvEscape (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrInvEscape");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrInvEscSeq (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrInvEscSeq");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrInvEscSymbol (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrInvEscSymbol");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrInvNumber (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrInvNumber");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrInvRegexSwitch (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrInvRegexSwitch");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrInvStrDef (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrInvStrDef");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrLastTermOfErrorProd (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrLastTermOfErrorProd");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrListCannotBeTransient (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrListCannotBeTransient");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrNewLineExpected (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrNewLineExpected");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrNoClosingBrace (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrNoClosingBrace");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrNodeTypeNotSetOn (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrNodeTypeNotSetOn");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrNoEndForRegex (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrNoEndForRegex");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrNoEndTagInEmbExpr (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrNoEndTagInEmbExpr");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrNoImplForUnaryOp (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrNoImplForUnaryOp");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrNoLetterAfterNum (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrNoLetterAfterNum");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrNoLkhds (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrNoLkhds");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrNtRuleIsNull (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrNtRuleIsNull");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrNullNodeEval (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrNullNodeEval");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrOpNotDefinedForType (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrOpNotDefinedForType");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrOpNotDefinedForTypes (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrOpNotDefinedForTypes");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrOpNotImplemented (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrOpNotImplemented");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrOutErrorPrintFormat (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrOutErrorPrintFormat");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrOutlineFilterContSymbol (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrOutlineFilterContSymbol");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrParserUnexpectedInput (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrParserUnexpectedInput");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrParseTreeNull (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrParseTreeNull");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrParseTreeRootNull (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrParseTreeRootNull");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrRootAstNodeNull (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrRootAstNodeNull");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrRootAstNoInterface (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrRootAstNoInterface");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrRootNotRegistered (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrRootNotRegistered");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrRootNotSet (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrRootNotSet");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrRRConflict (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrRRConflict");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrRuleContainsNull (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrRuleContainsNull");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrSRConflict (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrSRConflict");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrSyntaxErrorExpected (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrSyntaxErrorExpected");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrSyntaxErrorNoInfo (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrSyntaxErrorNoInfo");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrTemplExprNotRoot (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrTemplExprNotRoot");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrTemplMissingExprRoot (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrTemplMissingExprRoot");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrTemplNoSettings (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrTemplNoSettings");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrTerminalHasEmptyPrefix (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrTerminalHasEmptyPrefix");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrTransientNtMustHaveOneTerm (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrTransientNtMustHaveOneTerm");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrUnclosedComment (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrUnclosedComment");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrUnexpEof (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrUnexpEof");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrUnexpIndent (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrUnexpIndent");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrUnmatchedCloseBrace (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrUnmatchedCloseBrace");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrVarIsNotCallable (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrVarIsNotCallable");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrVarNotDefined (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrVarNotDefined");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getErrWrongArgCount (){ try { return  (java.lang.String) Javonet.getType("Resources").get("ErrWrongArgCount");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getFmtRowCol (){ try { return  (java.lang.String) Javonet.getType("Resources").get("FmtRowCol");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getLabelActionAccept (){ try { return  (java.lang.String) Javonet.getType("Resources").get("LabelActionAccept");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getLabelActionOp (){ try { return  (java.lang.String) Javonet.getType("Resources").get("LabelActionOp");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getLabelActionReduce (){ try { return  (java.lang.String) Javonet.getType("Resources").get("LabelActionReduce");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getLabelActionShift (){ try { return  (java.lang.String) Javonet.getType("Resources").get("LabelActionShift");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getLabelActionUnknown (){ try { return  (java.lang.String) Javonet.getType("Resources").get("LabelActionUnknown");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getLabelEofMark (){ try { return  (java.lang.String) Javonet.getType("Resources").get("LabelEofMark");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getLabelEosLabel (){ try { return  (java.lang.String) Javonet.getType("Resources").get("LabelEosLabel");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getLabelInitialState (){ try { return  (java.lang.String) Javonet.getType("Resources").get("LabelInitialState");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getLabelKeySymbol (){ try { return  (java.lang.String) Javonet.getType("Resources").get("LabelKeySymbol");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getLabelKeyword (){ try { return  (java.lang.String) Javonet.getType("Resources").get("LabelKeyword");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getLabelLineBreak (){ try { return  (java.lang.String) Javonet.getType("Resources").get("LabelLineBreak");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getLabelLocation (){ try { return  (java.lang.String) Javonet.getType("Resources").get("LabelLocation");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getLabelNone (){ try { return  (java.lang.String) Javonet.getType("Resources").get("LabelNone");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getLabelSrcHaveMore (){ try { return  (java.lang.String) Javonet.getType("Resources").get("LabelSrcHaveMore");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getLabelUnnamed (){ try { return  (java.lang.String) Javonet.getType("Resources").get("LabelUnnamed");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getMsgAbortScriptYN (){ try { return  (java.lang.String) Javonet.getType("Resources").get("MsgAbortScriptYN");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getMsgDefaultConsoleGreeting (){ try { return  (java.lang.String) Javonet.getType("Resources").get("MsgDefaultConsoleGreeting");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getMsgDefaultConsoleTitle (){ try { return  (java.lang.String) Javonet.getType("Resources").get("MsgDefaultConsoleTitle");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getMsgErrorCustomActionDidNotAdvance (){ try { return  (java.lang.String) Javonet.getType("Resources").get("MsgErrorCustomActionDidNotAdvance");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getMsgExitConsoleYN (){ try { return  (java.lang.String) Javonet.getType("Resources").get("MsgExitConsoleYN");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getMsgNLALRAdvice (){ try { return  (java.lang.String) Javonet.getType("Resources").get("MsgNLALRAdvice");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getMsgPressAnyKeyToExit (){ try { return  (java.lang.String) Javonet.getType("Resources").get("MsgPressAnyKeyToExit");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getMsgSrcPosToString (){ try { return  (java.lang.String) Javonet.getType("Resources").get("MsgSrcPosToString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getMsgTraceConflictResolved (){ try { return  (java.lang.String) Javonet.getType("Resources").get("MsgTraceConflictResolved");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getMsgTraceExecCustomAction (){ try { return  (java.lang.String) Javonet.getType("Resources").get("MsgTraceExecCustomAction");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getMsgTraceOpResolved (){ try { return  (java.lang.String) Javonet.getType("Resources").get("MsgTraceOpResolved");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getMsgTracePoppedState (){ try { return  (java.lang.String) Javonet.getType("Resources").get("MsgTracePoppedState");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getMsgTraceRecoverAction (){ try { return  (java.lang.String) Javonet.getType("Resources").get("MsgTraceRecoverAction");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getMsgTraceRecoverFailed (){ try { return  (java.lang.String) Javonet.getType("Resources").get("MsgTraceRecoverFailed");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getMsgTraceRecoverFoundState (){ try { return  (java.lang.String) Javonet.getType("Resources").get("MsgTraceRecoverFoundState");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getMsgTraceRecovering (){ try { return  (java.lang.String) Javonet.getType("Resources").get("MsgTraceRecovering");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getMsgTraceRecoverReducing (){ try { return  (java.lang.String) Javonet.getType("Resources").get("MsgTraceRecoverReducing");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getMsgTraceRecoverShiftError (){ try { return  (java.lang.String) Javonet.getType("Resources").get("MsgTraceRecoverShiftError");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getMsgTraceRecoverShiftTillEnd (){ try { return  (java.lang.String) Javonet.getType("Resources").get("MsgTraceRecoverShiftTillEnd");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public static java.lang.String getMsgTraceRecoverSuccess (){ try { return  (java.lang.String) Javonet.getType("Resources").get("MsgTraceRecoverSuccess");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public Resources(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}