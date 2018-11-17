package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.*;
import jio.System.Collections.*;
import jio.System.Collections.Generic.*;public class ReportParametersCollectedEventArgs extends EventArgs {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.String getNeedDataError (){ try { return  (java.lang.String) javonetHandle.get("NeedDataError");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getParameterToErrorTextMapping (){ try { return  (java.lang.String) javonetHandle.get("ParameterToErrorTextMapping");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public Dictionary<java.lang.String,jio.System.Collections.IEnumerable> getReportParameterDependencies (){ try { return new Dictionary<java.lang.String,jio.System.Collections.IEnumerable>((NObject)javonetHandle.<NObject>get("ReportParameterDependencies"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public List<ReportParameterWithData> getReportParameters (){ try { return new List<ReportParameterWithData>((NObject)javonetHandle.<NObject>get("ReportParameters"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setReturnType (ReportParametersCollectedReturnType value){ try { javonetHandle.set("ReturnType",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public ReportParametersCollectedReturnType getReturnType (){ try { return ReportParametersCollectedReturnType.valueOf(((NEnum) javonetHandle.<NObject>get("ReturnType")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.String getTriggerPrintID (){ try { return  (java.lang.String) javonetHandle.get("TriggerPrintID");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public ReportParametersCollectedEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}