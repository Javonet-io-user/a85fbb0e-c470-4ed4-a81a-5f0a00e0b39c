package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;public class Parser {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public ParsingContext getContext (){ try { return new ParsingContext((NObject)javonetHandle.<NObject>get("Context"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetFiled
	 */
            public LanguageData getLanguage (){ try { return new LanguageData((NObject)javonetHandle.<NObject>get("Language"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setLanguage (LanguageData param){ try { javonetHandle.set("Language",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public ParserData getData (){ try { return new ParserData((NObject)javonetHandle.<NObject>get("Data"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setData (ParserData param){ try { javonetHandle.set("Data",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Scanner getScanner (){ try { return new Scanner((NObject)javonetHandle.<NObject>get("Scanner"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setScanner (Scanner param){ try { javonetHandle.set("Scanner",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public NonTerminal getRoot (){ try { return new NonTerminal((NObject)javonetHandle.<NObject>get("Root"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setRoot (NonTerminal param){ try { javonetHandle.set("Root",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Parser (Grammar grammar){ try {  javonetHandle = Javonet.New("Parser",grammar);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Parser (LanguageData language){ try {  javonetHandle = Javonet.New("Parser",language);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Parser (LanguageData language,NonTerminal root){ try {  javonetHandle = Javonet.New("Parser",language,root);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Parser(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public ParseTree Parse (java.lang.String sourceText){ try { return new ParseTree((NObject)javonetHandle.invoke("Parse",sourceText));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ParseTree Parse (java.lang.String sourceText,java.lang.String fileName){ try { return new ParseTree((NObject)javonetHandle.invoke("Parse",sourceText,fileName));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ParseTree ScanOnly (java.lang.String sourceText,java.lang.String fileName){ try { return new ParseTree((NObject)javonetHandle.invoke("ScanOnly",sourceText,fileName));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void ReadInput (){ try { javonetHandle.invoke("ReadInput");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void RecoverFromError (){ try { javonetHandle.invoke("RecoverFromError");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}