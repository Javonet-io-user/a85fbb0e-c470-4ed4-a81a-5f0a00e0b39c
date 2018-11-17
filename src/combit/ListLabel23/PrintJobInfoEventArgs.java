package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.*;public class PrintJobInfoEventArgs extends EventArgs {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.Integer getLlJobID (){ try { return javonetHandle.get("LlJobID");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getJobID (){ try { return javonetHandle.get("JobID");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getJobStatus (){ try { return javonetHandle.get("JobStatus");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.String getDeviceName (){ try { return  (java.lang.String) javonetHandle.get("DeviceName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PrintJobInfoEventArgs (LlPrintJobInfo callbackData){  super((NObject) null); try {  javonetHandle = Javonet.New("PrintJobInfoEventArgs",callbackData); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PrintJobInfoEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}