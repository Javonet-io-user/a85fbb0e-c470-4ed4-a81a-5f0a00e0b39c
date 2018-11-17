package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import Irony.Parsing.*;public class SourceSpan extends ValueType {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.Integer getEndPosition (){ try { return javonetHandle.get("EndPosition");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetFiled
	 */
            public SourceLocation getLocation (){ try { return javonetHandle.<NObject>get("Location");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setLocation (SourceLocation param){ try { javonetHandle.set("Location",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getLength (){ try { return javonetHandle.get("Length");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setLength (java.lang.Integer param){ try { javonetHandle.set("Length",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SourceSpan (SourceLocation location,java.lang.Integer length){  super((NObject) null); try {  javonetHandle = Javonet.New("SourceSpan",location,length); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SourceSpan(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Boolean InRange (java.lang.Integer position){ try { return javonetHandle.invoke("InRange",position);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}