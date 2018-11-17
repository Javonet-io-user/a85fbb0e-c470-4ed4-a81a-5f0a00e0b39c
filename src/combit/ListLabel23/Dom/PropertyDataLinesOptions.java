package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyDataLinesOptions extends DomItem {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setKeepTogether (java.lang.String value){ try { javonetHandle.set("KeepTogether",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getKeepTogether (){ try { return  (java.lang.String) javonetHandle.get("KeepTogether");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setKeepTogetherDataLine (java.lang.String value){ try { javonetHandle.set("KeepTogetherDataLine",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getKeepTogetherDataLine (){ try { return  (java.lang.String) javonetHandle.get("KeepTogetherDataLine");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setSuppress (java.lang.String value){ try { javonetHandle.set("Suppress",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSuppress (){ try { return  (java.lang.String) javonetHandle.get("Suppress");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setForceSumCalculation (java.lang.String value){ try { javonetHandle.set("ForceSumCalculation",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getForceSumCalculation (){ try { return  (java.lang.String) javonetHandle.get("ForceSumCalculation");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyFillingExt getZebraPattern (){ try { return new PropertyFillingExt((NObject)javonetHandle.<NObject>get("ZebraPattern"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PropertyDataLinesOptions(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}