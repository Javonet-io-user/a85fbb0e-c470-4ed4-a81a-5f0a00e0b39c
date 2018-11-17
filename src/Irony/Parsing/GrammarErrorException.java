package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;
import jio.System.*;public class GrammarErrorException extends jio.System.Exception {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public GrammarError getError (){ try { return new GrammarError((NObject)javonetHandle.<NObject>get("Error"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setError (GrammarError param){ try { javonetHandle.set("Error",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public GrammarErrorException (java.lang.String message,GrammarError error){  super((NObject) null); try {  javonetHandle = Javonet.New("GrammarErrorException",message,error); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public GrammarErrorException(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}