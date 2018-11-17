package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public abstract class PropertyChartEngineBar3DBase extends PropertyChartEngineBarBase {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setIsotropic (java.lang.String value){ try { javonetHandle.set("Isotropic",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getIsotropic (){ try { return  (java.lang.String) javonetHandle.get("Isotropic");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setPerspective (java.lang.String value){ try { javonetHandle.set("Perspective",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPerspective (){ try { return  (java.lang.String) javonetHandle.get("Perspective");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setXRotation (java.lang.String value){ try { javonetHandle.set("XRotation",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getXRotation (){ try { return  (java.lang.String) javonetHandle.get("XRotation");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setZRotation (java.lang.String value){ try { javonetHandle.set("ZRotation",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getZRotation (){ try { return  (java.lang.String) javonetHandle.get("ZRotation");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PropertyChartEngineBar3DBase(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}