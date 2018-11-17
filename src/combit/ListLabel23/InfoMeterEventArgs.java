package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.*;
import jio.System.Windows.Forms.*;public class InfoMeterEventArgs extends EventArgs implements IDisposable {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public LlMeterInfo getCallbackData (){ try { return javonetHandle.<NObject>get("CallbackData");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public IWin32Window getDesignerWindow (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("DesignerWindow"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public LlMeterJob getJobType (){ try { return LlMeterJob.valueOf(((NEnum) javonetHandle.<NObject>get("JobType")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getCurrentObject (){ try { return javonetHandle.get("CurrentObject");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getObjectCount (){ try { return javonetHandle.get("ObjectCount");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getProgressPercent (){ try { return javonetHandle.get("ProgressPercent");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }public InfoMeterEventArgs (LlMeterInfo callbackData){  super((NObject) null); try {  javonetHandle = Javonet.New("InfoMeterEventArgs",callbackData); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public InfoMeterEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Dispose (){ try { javonetHandle.invoke("Dispose");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}