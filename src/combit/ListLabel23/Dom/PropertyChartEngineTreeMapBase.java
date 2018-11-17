package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyChartEngineTreeMapBase extends PropertyChartEngineBase {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public PropertyFilling getFilling (){ try { return new PropertyFilling((NObject)javonetHandle.<NObject>get("Filling"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setTreemapAlgorithm (java.lang.String value){ try { javonetHandle.set("TreemapAlgorithm",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTreemapAlgorithm (){ try { return  (java.lang.String) javonetHandle.get("TreemapAlgorithm");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setTreemapLightFactor (java.lang.String value){ try { javonetHandle.set("TreemapLightFactor",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTreemapLightFactor (){ try { return  (java.lang.String) javonetHandle.get("TreemapLightFactor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyCategoryAxisXTreeMap getXAxis (){ try { return new PropertyCategoryAxisXTreeMap((NObject)javonetHandle.<NObject>get("XAxis"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSorted (java.lang.String value){ try { javonetHandle.set("Sorted",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSorted (){ try { return  (java.lang.String) javonetHandle.get("Sorted");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PropertyChartEngineTreeMapBase(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}