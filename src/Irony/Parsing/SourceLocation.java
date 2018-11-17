package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import Irony.Parsing.*;public class SourceLocation extends ValueType {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public static SourceLocation getEmpty (){ try { return Javonet.getType("SourceLocation").<NObject>get("Empty");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetFiled
	 */
            public java.lang.Integer getPosition (){ try { return javonetHandle.get("Position");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setPosition (java.lang.Integer param){ try { javonetHandle.set("Position",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getLine (){ try { return javonetHandle.get("Line");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setLine (java.lang.Integer param){ try { javonetHandle.set("Line",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getColumn (){ try { return javonetHandle.get("Column");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setColumn (java.lang.Integer param){ try { javonetHandle.set("Column",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SourceLocation (java.lang.Integer position,java.lang.Integer line,java.lang.Integer column){  super((NObject) null); try {  javonetHandle = Javonet.New("SourceLocation",position,line,column); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SourceLocation(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.String ToString (){ try { return  (java.lang.String) javonetHandle.invoke("ToString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public java.lang.String ToUiString (){ try { return  (java.lang.String) javonetHandle.invoke("ToUiString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public static java.lang.Integer Compare (SourceLocation x,SourceLocation y){ try { return Javonet.getType("SourceLocation").invoke("Compare",x,y);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}