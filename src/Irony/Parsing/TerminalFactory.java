package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;public class TerminalFactory {protected NObject javonetHandle; public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static StringLiteral CreateCSharpString (java.lang.String name){ try { return new StringLiteral((NObject)Javonet.getType("TerminalFactory").invoke("CreateCSharpString",name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static StringLiteral CreateCSharpChar (java.lang.String name){ try { return new StringLiteral((NObject)Javonet.getType("TerminalFactory").invoke("CreateCSharpChar",name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static StringLiteral CreateVbString (java.lang.String name){ try { return new StringLiteral((NObject)Javonet.getType("TerminalFactory").invoke("CreateVbString",name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static StringLiteral CreatePythonString (java.lang.String name){ try { return new StringLiteral((NObject)Javonet.getType("TerminalFactory").invoke("CreatePythonString",name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static NumberLiteral CreateCSharpNumber (java.lang.String name){ try { return new NumberLiteral((NObject)Javonet.getType("TerminalFactory").invoke("CreateCSharpNumber",name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static NumberLiteral CreateVbNumber (java.lang.String name){ try { return new NumberLiteral((NObject)Javonet.getType("TerminalFactory").invoke("CreateVbNumber",name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static NumberLiteral CreatePythonNumber (java.lang.String name){ try { return new NumberLiteral((NObject)Javonet.getType("TerminalFactory").invoke("CreatePythonNumber",name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static NumberLiteral CreateSchemeNumber (java.lang.String name){ try { return new NumberLiteral((NObject)Javonet.getType("TerminalFactory").invoke("CreateSchemeNumber",name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static IdentifierTerminal CreateCSharpIdentifier (java.lang.String name){ try { return new IdentifierTerminal((NObject)Javonet.getType("TerminalFactory").invoke("CreateCSharpIdentifier",name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static IdentifierTerminal CreatePythonIdentifier (java.lang.String name){ try { return new IdentifierTerminal((NObject)Javonet.getType("TerminalFactory").invoke("CreatePythonIdentifier",name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static IdentifierTerminal CreateSqlExtIdentifier (Grammar grammar,java.lang.String name){ try { return new IdentifierTerminal((NObject)Javonet.getType("TerminalFactory").invoke("CreateSqlExtIdentifier",grammar,name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}