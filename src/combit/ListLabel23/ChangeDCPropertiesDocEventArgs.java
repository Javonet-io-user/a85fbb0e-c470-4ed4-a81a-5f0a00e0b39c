package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.*;public class ChangeDCPropertiesDocEventArgs extends EventArgs {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public LlPrinter getCallbackData (){ try { return javonetHandle.<NObject>get("CallbackData");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setHandle (java.lang.Integer value){ try { javonetHandle.set("Handle",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getHandle (){ try { return javonetHandle.<NObject>get("Handle");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public ChangeDCPropertiesDocEventArgs (LlPrinter callbackData){  super((NObject) null); try {  javonetHandle = Javonet.New("ChangeDCPropertiesDocEventArgs",callbackData); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ChangeDCPropertiesDocEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}