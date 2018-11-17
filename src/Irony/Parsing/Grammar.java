package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;
import Irony.*;
import jio.System.Globalization.*;public class Grammar {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public static Grammar getCurrentGrammar (){ try { return new Grammar((NObject)Javonet.getType("Grammar").<NObject>get("CurrentGrammar"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetFiled
	 */
            public java.lang.Boolean getCaseSensitive (){ try { return javonetHandle.get("CaseSensitive");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetFiled
	 */
            public void setCaseSensitive (java.lang.Boolean param){ try { javonetHandle.set("CaseSensitive",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getDelimiters (){ try { return  (java.lang.String) javonetHandle.get("Delimiters");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setDelimiters (java.lang.String param){ try { javonetHandle.set("Delimiters",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getWhitespaceChars (){ try { return  (java.lang.String) javonetHandle.get("WhitespaceChars");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setWhitespaceChars (java.lang.String param){ try { javonetHandle.set("WhitespaceChars",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public LanguageFlags getLanguageFlags (){ try { return LanguageFlags.valueOf(((NEnum) javonetHandle.<NObject>get("LanguageFlags")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setLanguageFlags (LanguageFlags param){ try { javonetHandle.set("LanguageFlags",NEnum.fromJavaEnum(param));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public TermReportGroupList getTermReportGroups (){ try { return new TermReportGroupList((NObject)javonetHandle.<NObject>get("TermReportGroups"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setTermReportGroups (TermReportGroupList param){ try { javonetHandle.set("TermReportGroups",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public TerminalSet getNonGrammarTerminals (){ try { return new TerminalSet((NObject)javonetHandle.<NObject>get("NonGrammarTerminals"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setNonGrammarTerminals (TerminalSet param){ try { javonetHandle.set("NonGrammarTerminals",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public NonTerminal getRoot (){ try { return new NonTerminal((NObject)javonetHandle.<NObject>get("Root"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setRoot (NonTerminal param){ try { javonetHandle.set("Root",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public NonTerminalSet getSnippetRoots (){ try { return new NonTerminalSet((NObject)javonetHandle.<NObject>get("SnippetRoots"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setSnippetRoots (NonTerminalSet param){ try { javonetHandle.set("SnippetRoots",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getGrammarComments (){ try { return  (java.lang.String) javonetHandle.get("GrammarComments");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setGrammarComments (java.lang.String param){ try { javonetHandle.set("GrammarComments",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public CultureInfo getDefaultCulture (){ try { return new CultureInfo((NObject)javonetHandle.<NObject>get("DefaultCulture"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setDefaultCulture (CultureInfo param){ try { javonetHandle.set("DefaultCulture",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getConsoleTitle (){ try { return  (java.lang.String) javonetHandle.get("ConsoleTitle");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setConsoleTitle (java.lang.String param){ try { javonetHandle.set("ConsoleTitle",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getConsoleGreeting (){ try { return  (java.lang.String) javonetHandle.get("ConsoleGreeting");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setConsoleGreeting (java.lang.String param){ try { javonetHandle.set("ConsoleGreeting",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getConsolePrompt (){ try { return  (java.lang.String) javonetHandle.get("ConsolePrompt");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setConsolePrompt (java.lang.String param){ try { javonetHandle.set("ConsolePrompt",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getConsolePromptMoreInput (){ try { return  (java.lang.String) javonetHandle.get("ConsolePromptMoreInput");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setConsolePromptMoreInput (java.lang.String param){ try { javonetHandle.set("ConsolePromptMoreInput",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Terminal getEmpty (){ try { return new Terminal((NObject)javonetHandle.<NObject>get("Empty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setEmpty (Terminal param){ try { javonetHandle.set("Empty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Boolean getUsesNewLine (){ try { return javonetHandle.get("UsesNewLine");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetFiled
	 */
            public void setUsesNewLine (java.lang.Boolean param){ try { javonetHandle.set("UsesNewLine",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Terminal getIndent (){ try { return new Terminal((NObject)javonetHandle.<NObject>get("Indent"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setIndent (Terminal param){ try { javonetHandle.set("Indent",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Terminal getDedent (){ try { return new Terminal((NObject)javonetHandle.<NObject>get("Dedent"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setDedent (Terminal param){ try { javonetHandle.set("Dedent",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Terminal getEof (){ try { return new Terminal((NObject)javonetHandle.<NObject>get("Eof"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setEof (Terminal param){ try { javonetHandle.set("Eof",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Terminal getSkip (){ try { return new Terminal((NObject)javonetHandle.<NObject>get("Skip"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setSkip (Terminal param){ try { javonetHandle.set("Skip",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Terminal getLineStartTerminal (){ try { return new Terminal((NObject)javonetHandle.<NObject>get("LineStartTerminal"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setLineStartTerminal (Terminal param){ try { javonetHandle.set("LineStartTerminal",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Terminal getSyntaxError (){ try { return new Terminal((NObject)javonetHandle.<NObject>get("SyntaxError"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setSyntaxError (Terminal param){ try { javonetHandle.set("SyntaxError",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public KeyTermTable getKeyTerms (){ try { return new KeyTermTable((NObject)javonetHandle.<NObject>get("KeyTerms"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setKeyTerms (KeyTermTable param){ try { javonetHandle.set("KeyTerms",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Grammar (){ try {  javonetHandle = Javonet.New("Grammar");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Grammar (java.lang.Boolean caseSensitive){ try {  javonetHandle = Javonet.New("Grammar",caseSensitive);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Grammar(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void MarkReservedWords (java.lang.String[] reservedWords){ try { javonetHandle.invoke("MarkReservedWords",new Object[] {reservedWords});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void RegisterOperators (java.lang.Integer precedence,java.lang.String[] opSymbols){ try { javonetHandle.invoke("RegisterOperators",precedence,new Object[] {opSymbols});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void RegisterOperators (java.lang.Integer precedence,Associativity associativity,java.lang.String[] opSymbols){ try { javonetHandle.invoke("RegisterOperators",precedence,NEnum.fromJavaEnum(associativity),new Object[] {opSymbols});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void RegisterOperators (java.lang.Integer precedence,BnfTerm[] opTerms){ try { javonetHandle.invoke("RegisterOperators",precedence,new Object[] {opTerms});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void RegisterOperators (java.lang.Integer precedence,Associativity associativity,BnfTerm[] opTerms){ try { javonetHandle.invoke("RegisterOperators",precedence,NEnum.fromJavaEnum(associativity),new Object[] {opTerms});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void RegisterBracePair (java.lang.String openBrace,java.lang.String closeBrace){ try { javonetHandle.invoke("RegisterBracePair",openBrace,closeBrace);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void MarkPunctuation (java.lang.String[] symbols){ try { javonetHandle.invoke("MarkPunctuation",new Object[] {symbols});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void MarkPunctuation (BnfTerm[] terms){ try { javonetHandle.invoke("MarkPunctuation",new Object[] {terms});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void MarkTransient (NonTerminal[] nonTerminals){ try { javonetHandle.invoke("MarkTransient",new Object[] {nonTerminals});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void MarkMemberSelect (java.lang.String[] symbols){ try { javonetHandle.invoke("MarkMemberSelect",new Object[] {symbols});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void MarkNotReported (BnfTerm[] terms){ try { javonetHandle.invoke("MarkNotReported",new Object[] {terms});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void MarkNotReported (java.lang.String[] symbols){ try { javonetHandle.invoke("MarkNotReported",new Object[] {symbols});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void CreateTokenFilters (LanguageData language,TokenFilterList filters){ try { javonetHandle.invoke("CreateTokenFilters",language,filters);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public Token TryMatch (ParsingContext context,ISourceStream source){ try { return new Token((NObject)javonetHandle.invoke("TryMatch",context,source));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.String GetParseNodeCaption (ParseTreeNode node){ try { return  (java.lang.String) javonetHandle.invoke("GetParseNodeCaption",node);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public void OnScannerSelectTerminal (ParsingContext context){ try { javonetHandle.invoke("OnScannerSelectTerminal",context);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void SkipWhitespace (ISourceStream source){ try { javonetHandle.invoke("SkipWhitespace",source);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean IsWhitespaceOrDelimiter (java.lang.Character ch){ try { return javonetHandle.invoke("IsWhitespaceOrDelimiter",ch);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void OnGrammarDataConstructed (LanguageData language){ try { javonetHandle.invoke("OnGrammarDataConstructed",language);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void OnLanguageDataConstructed (LanguageData language){ try { javonetHandle.invoke("OnLanguageDataConstructed",language);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.String ConstructParserErrorMessage (ParsingContext context,StringSet expectedTerms){ try { return  (java.lang.String) javonetHandle.invoke("ConstructParserErrorMessage",context,expectedTerms);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public void ReportParseError (ParsingContext context){ try { javonetHandle.invoke("ReportParseError",context);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public BnfExpression MakePlusRule (NonTerminal listNonTerminal,BnfTerm listMember){ try { return new BnfExpression((NObject)javonetHandle.invoke("MakePlusRule",listNonTerminal,listMember));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public BnfExpression MakePlusRule (NonTerminal listNonTerminal,BnfTerm delimiter,BnfTerm listMember){ try { return new BnfExpression((NObject)javonetHandle.invoke("MakePlusRule",listNonTerminal,delimiter,listMember));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public BnfExpression MakeStarRule (NonTerminal listNonTerminal,BnfTerm listMember){ try { return new BnfExpression((NObject)javonetHandle.invoke("MakeStarRule",listNonTerminal,listMember));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public BnfExpression MakeStarRule (NonTerminal listNonTerminal,BnfTerm delimiter,BnfTerm listMember){ try { return new BnfExpression((NObject)javonetHandle.invoke("MakeStarRule",listNonTerminal,delimiter,listMember));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public KeyTerm ToTerm (java.lang.String text){ try { return new KeyTerm((NObject)javonetHandle.invoke("ToTerm",text));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public KeyTerm ToTerm (java.lang.String text,java.lang.String name){ try { return new KeyTerm((NObject)javonetHandle.invoke("ToTerm",text,name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void BuildAst (LanguageData language,ParseTree parseTree){ try { javonetHandle.invoke("BuildAst",language,parseTree);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}