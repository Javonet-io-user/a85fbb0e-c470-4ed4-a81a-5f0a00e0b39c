package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;
import jio.System.*;public class Token {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public Terminal getTerminal (){ try { return new Terminal((NObject)javonetHandle.<NObject>get("Terminal"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.String getValueString (){ try { return  (java.lang.String) javonetHandle.get("ValueString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public TokenCategory getCategory (){ try { return TokenCategory.valueOf(((NEnum) javonetHandle.<NObject>get("Category")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getLength (){ try { return javonetHandle.get("Length");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetFiled
	 */
            public KeyTerm getKeyTerm (){ try { return new KeyTerm((NObject)javonetHandle.<NObject>get("KeyTerm"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setKeyTerm (KeyTerm param){ try { javonetHandle.set("KeyTerm",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public SourceLocation getLocation (){ try { return javonetHandle.<NObject>get("Location");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setLocation (SourceLocation param){ try { javonetHandle.set("Location",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getText (){ try { return  (java.lang.String) javonetHandle.get("Text");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setText (java.lang.String param){ try { javonetHandle.set("Text",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public NObject getValue (){ try { return  (NObject) javonetHandle.<NObject>get("Value");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setValue (NObject param){ try { javonetHandle.set("Value",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public NObject getDetails (){ try { return  (NObject) javonetHandle.<NObject>get("Details");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setDetails (NObject param){ try { javonetHandle.set("Details",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public TokenFlags getFlags (){ try { return TokenFlags.valueOf(((NEnum) javonetHandle.<NObject>get("Flags")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setFlags (TokenFlags param){ try { javonetHandle.set("Flags",NEnum.fromJavaEnum(param));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public TokenEditorInfo getEditorInfo (){ try { return new TokenEditorInfo((NObject)javonetHandle.<NObject>get("EditorInfo"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setEditorInfo (TokenEditorInfo param){ try { javonetHandle.set("EditorInfo",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Token getOtherBrace (){ try { return new Token((NObject)javonetHandle.<NObject>get("OtherBrace"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setOtherBrace (Token param){ try { javonetHandle.set("OtherBrace",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Short getScannerState (){ try { return javonetHandle.get("ScannerState");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setScannerState (java.lang.Short param){ try { javonetHandle.set("ScannerState",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Token (Terminal term,SourceLocation location,java.lang.String text,NObject value){ try {  javonetHandle = Javonet.New("Token",term,location,text,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Token(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void SetTerminal (Terminal terminal){ try { javonetHandle.invoke("SetTerminal",terminal);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean IsSet (TokenFlags flag){ try { return javonetHandle.invoke("IsSet",NEnum.fromJavaEnum(flag));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean IsError (){ try { return javonetHandle.invoke("IsError");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.String ToString (){ try { return  (java.lang.String) javonetHandle.invoke("ToString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}