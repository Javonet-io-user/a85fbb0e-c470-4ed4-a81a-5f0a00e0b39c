package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import Irony.Parsing.*;public class ParsingEventArgs extends EventArgs {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public ParsingContext getContext (){ try { return new ParsingContext((NObject)javonetHandle.<NObject>get("Context"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setContext (ParsingContext param){ try { javonetHandle.set("Context",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ParsingEventArgs (ParsingContext context){  super((NObject) null); try {  javonetHandle = Javonet.New("ParsingEventArgs",context); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ParsingEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}