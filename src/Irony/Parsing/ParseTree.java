package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;
import Irony.*;
import jio.System.*;public class ParseTree {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public ParseTreeStatus getStatus (){ try { return ParseTreeStatus.valueOf(((NEnum) javonetHandle.<NObject>get("Status")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetFiled
	 */
            public java.lang.String getSourceText (){ try { return  (java.lang.String) javonetHandle.get("SourceText");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setSourceText (java.lang.String param){ try { javonetHandle.set("SourceText",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getFileName (){ try { return  (java.lang.String) javonetHandle.get("FileName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setFileName (java.lang.String param){ try { javonetHandle.set("FileName",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public TokenList getTokens (){ try { return new TokenList((NObject)javonetHandle.<NObject>get("Tokens"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setTokens (TokenList param){ try { javonetHandle.set("Tokens",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public TokenList getOpenBraces (){ try { return new TokenList((NObject)javonetHandle.<NObject>get("OpenBraces"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setOpenBraces (TokenList param){ try { javonetHandle.set("OpenBraces",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public ParseTreeNode getRoot (){ try { return new ParseTreeNode((NObject)javonetHandle.<NObject>get("Root"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setRoot (ParseTreeNode param){ try { javonetHandle.set("Root",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public LogMessageList getParserMessages (){ try { return new LogMessageList((NObject)javonetHandle.<NObject>get("ParserMessages"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setParserMessages (LogMessageList param){ try { javonetHandle.set("ParserMessages",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Long getParseTimeMilliseconds (){ try { return javonetHandle.get("ParseTimeMilliseconds");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setParseTimeMilliseconds (java.lang.Long param){ try { javonetHandle.set("ParseTimeMilliseconds",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public NObject getTag (){ try { return  (NObject) javonetHandle.<NObject>get("Tag");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setTag (NObject param){ try { javonetHandle.set("Tag",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ParseTree (java.lang.String sourceText,java.lang.String fileName){ try {  javonetHandle = Javonet.New("ParseTree",sourceText,fileName);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ParseTree(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Boolean HasErrors (){ try { return javonetHandle.invoke("HasErrors");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}