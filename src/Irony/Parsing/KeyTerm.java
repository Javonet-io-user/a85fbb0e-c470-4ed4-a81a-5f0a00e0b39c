package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;
import jio.System.Collections.Generic.*;
import jio.System.*;public class KeyTerm extends Terminal {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.String getText (){ try { return  (java.lang.String) javonetHandle.get("Text");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetFiled
	 */
            public java.lang.Boolean getAllowAlphaAfterKeyword (){ try { return javonetHandle.get("AllowAlphaAfterKeyword");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetFiled
	 */
            public void setAllowAlphaAfterKeyword (java.lang.Boolean param){ try { javonetHandle.set("AllowAlphaAfterKeyword",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public KeyTerm (java.lang.String text,java.lang.String name){  super((NObject) null); try {  javonetHandle = Javonet.New("KeyTerm",text,name); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public KeyTerm(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Init (GrammarData grammarData){ try { javonetHandle.invoke("Init",grammarData);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public Token TryMatch (ParsingContext context,ISourceStream source){ try { return new Token((NObject)javonetHandle.invoke("TryMatch",context,source));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public IList<java.lang.String> GetFirsts (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetFirsts"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.String ToString (){ try { return  (java.lang.String) javonetHandle.invoke("ToString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public java.lang.String TokenToString (Token token){ try { return  (java.lang.String) javonetHandle.invoke("TokenToString",token);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public java.lang.Boolean Equals (NObject obj){ try { return javonetHandle.invoke("Equals",obj);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Integer GetHashCode (){ try { return javonetHandle.invoke("GetHashCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}