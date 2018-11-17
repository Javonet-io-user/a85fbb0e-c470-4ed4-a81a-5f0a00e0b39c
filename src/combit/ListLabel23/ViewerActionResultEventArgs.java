package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.*;
import jio.System.Collections.Generic.*;public class ViewerActionResultEventArgs extends EventArgs {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public LlViewerAction getAction (){ try { return LlViewerAction.valueOf(((NEnum) javonetHandle.<NObject>get("Action")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public Dictionary<java.lang.String,java.lang.String> getParameters (){ try { return new Dictionary<java.lang.String,java.lang.String>((NObject)javonetHandle.<NObject>get("Parameters"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public ViewerActionResultEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}