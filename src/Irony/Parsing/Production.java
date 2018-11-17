package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;public class Production {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public ProductionFlags getFlags (){ try { return ProductionFlags.valueOf(((NEnum) javonetHandle.<NObject>get("Flags")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setFlags (ProductionFlags param){ try { javonetHandle.set("Flags",NEnum.fromJavaEnum(param));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public NonTerminal getLValue (){ try { return new NonTerminal((NObject)javonetHandle.<NObject>get("LValue"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setLValue (NonTerminal param){ try { javonetHandle.set("LValue",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public BnfTermList getRValues (){ try { return new BnfTermList((NObject)javonetHandle.<NObject>get("RValues"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setRValues (BnfTermList param){ try { javonetHandle.set("RValues",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Production (NonTerminal lvalue){ try {  javonetHandle = Javonet.New("Production",lvalue);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Production(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.String ToStringQuoted (){ try { return  (java.lang.String) javonetHandle.invoke("ToStringQuoted");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public java.lang.String ToString (){ try { return  (java.lang.String) javonetHandle.invoke("ToString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public static java.lang.String ProductionToString (Production production,java.lang.Integer dotPosition){ try { return  (java.lang.String) Javonet.getType("Production").invoke("ProductionToString",production,dotPosition);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}