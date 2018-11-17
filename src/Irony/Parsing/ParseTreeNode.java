package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;
import jio.System.*;public class ParseTreeNode {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public ParseTreeNodeList getChildNodes (){ try { return new ParseTreeNodeList((NObject)javonetHandle.<NObject>get("ChildNodes"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetFiled
	 */
            public NObject getAstNode (){ try { return  (NObject) javonetHandle.<NObject>get("AstNode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setAstNode (NObject param){ try { javonetHandle.set("AstNode",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Token getToken (){ try { return new Token((NObject)javonetHandle.<NObject>get("Token"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setToken (Token param){ try { javonetHandle.set("Token",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public BnfTerm getTerm (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("Term"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setTerm (BnfTerm param){ try { javonetHandle.set("Term",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getPrecedence (){ try { return javonetHandle.get("Precedence");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setPrecedence (java.lang.Integer param){ try { javonetHandle.set("Precedence",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Associativity getAssociativity (){ try { return Associativity.valueOf(((NEnum) javonetHandle.<NObject>get("Associativity")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setAssociativity (Associativity param){ try { javonetHandle.set("Associativity",NEnum.fromJavaEnum(param));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public SourceSpan getSpan (){ try { return javonetHandle.<NObject>get("Span");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setSpan (SourceSpan param){ try { javonetHandle.set("Span",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Boolean getIsError (){ try { return javonetHandle.get("IsError");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetFiled
	 */
            public void setIsError (java.lang.Boolean param){ try { javonetHandle.set("IsError",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public NObject getTag (){ try { return  (NObject) javonetHandle.<NObject>get("Tag");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setTag (NObject param){ try { javonetHandle.set("Tag",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public TokenList getComments (){ try { return new TokenList((NObject)javonetHandle.<NObject>get("Comments"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setComments (TokenList param){ try { javonetHandle.set("Comments",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ParseTreeNode (Token token){ try {  javonetHandle = Javonet.New("ParseTreeNode",token);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ParseTreeNode (ParserState initialState){ try {  javonetHandle = Javonet.New("ParseTreeNode",initialState);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ParseTreeNode (NonTerminal term,SourceSpan span){ try {  javonetHandle = Javonet.New("ParseTreeNode",term,span);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ParseTreeNode(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.String ToString (){ try { return  (java.lang.String) javonetHandle.invoke("ToString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public java.lang.String FindTokenAndGetText (){ try { return  (java.lang.String) javonetHandle.invoke("FindTokenAndGetText");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public Token FindToken (){ try { return new Token((NObject)javonetHandle.invoke("FindToken"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Boolean IsPunctuationOrEmptyTransient (){ try { return javonetHandle.invoke("IsPunctuationOrEmptyTransient");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean IsOperator (){ try { return javonetHandle.invoke("IsOperator");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}