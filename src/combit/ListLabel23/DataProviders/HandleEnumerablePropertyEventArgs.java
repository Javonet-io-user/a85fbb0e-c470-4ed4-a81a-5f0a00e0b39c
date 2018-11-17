package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.DataProviders.*;public class HandleEnumerablePropertyEventArgs extends EventArgs {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.String getPropertyPath (){ try { return  (java.lang.String) javonetHandle.get("PropertyPath");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getPropertyOriginalPath (){ try { return  (java.lang.String) javonetHandle.get("PropertyOriginalPath");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setCancelRecursion (java.lang.Boolean value){ try { javonetHandle.set("CancelRecursion",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getCancelRecursion (){ try { return javonetHandle.get("CancelRecursion");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public HandleEnumerablePropertyEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}