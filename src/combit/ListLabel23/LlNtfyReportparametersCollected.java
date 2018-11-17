package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.*;public class LlNtfyReportparametersCollected extends ValueType {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public java.lang.String gettriggerPrintID (){ try { return  (java.lang.String) javonetHandle.get("triggerPrintID");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void settriggerPrintID (java.lang.String param){ try { javonetHandle.set("triggerPrintID",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getneedDataError (){ try { return  (java.lang.String) javonetHandle.get("needDataError");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setneedDataError (java.lang.String param){ try { javonetHandle.set("needDataError",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getneedDataErrorClient (){ try { return  (java.lang.String) javonetHandle.get("needDataErrorClient");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setneedDataErrorClient (java.lang.String param){ try { javonetHandle.set("needDataErrorClient",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getstreamRPDefinitions (){ try { return javonetHandle.<NObject>get("streamRPDefinitions");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setstreamRPDefinitions (java.lang.Integer param){ try { javonetHandle.set("streamRPDefinitions",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getstreamRPContents (){ try { return javonetHandle.<NObject>get("streamRPContents");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setstreamRPContents (java.lang.Integer param){ try { javonetHandle.set("streamRPContents",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LlNtfyReportparametersCollected(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}