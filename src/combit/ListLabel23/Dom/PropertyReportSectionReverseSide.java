package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyReportSectionReverseSide extends PropertyReportSection {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setDuplexReverseSideMode (java.lang.String value){ try { javonetHandle.set("DuplexReverseSideMode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDuplexReverseSideMode (){ try { return  (java.lang.String) javonetHandle.get("DuplexReverseSideMode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setIssueCondition (java.lang.String value){ try { javonetHandle.set("IssueCondition",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getIssueCondition (){ try { return  (java.lang.String) javonetHandle.get("IssueCondition");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setSimplexReverseSideMode (java.lang.String value){ try { javonetHandle.set("SimplexReverseSideMode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSimplexReverseSideMode (){ try { return  (java.lang.String) javonetHandle.get("SimplexReverseSideMode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PropertyReportSectionReverseSide(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}