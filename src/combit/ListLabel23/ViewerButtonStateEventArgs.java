package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.*;
import jio.System.Windows.Forms.*;public class ViewerButtonStateEventArgs extends EventArgs {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.Integer getId (){ try { return javonetHandle.get("Id");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public LlViewerAction getAction (){ try { return LlViewerAction.valueOf(((NEnum) javonetHandle.<NObject>get("Action")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setState (LlViewerButtonState value){ try { javonetHandle.set("State",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlViewerButtonState getState (){ try { return LlViewerButtonState.valueOf(((NEnum) javonetHandle.<NObject>get("State")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public IWin32Window getViewerWindow (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("ViewerWindow"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public ViewerButtonStateEventArgs (java.lang.Integer id,LlViewerButtonState state,IWin32Window viewerWindow){  super((NObject) null); try {  javonetHandle = Javonet.New("ViewerButtonStateEventArgs",id,NEnum.fromJavaEnum(state),viewerWindow); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ViewerButtonStateEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}