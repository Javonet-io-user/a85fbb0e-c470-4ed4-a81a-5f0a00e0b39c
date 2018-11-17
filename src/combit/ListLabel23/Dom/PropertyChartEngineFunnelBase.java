package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public abstract class PropertyChartEngineFunnelBase extends PropertyChartEngineBase {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setColorMode (java.lang.String value){ try { javonetHandle.set("ColorMode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getColorMode (){ try { return  (java.lang.String) javonetHandle.get("ColorMode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setShowSeparatorLines (java.lang.String value){ try { javonetHandle.set("ShowSeparatorLines",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getShowSeparatorLines (){ try { return  (java.lang.String) javonetHandle.get("ShowSeparatorLines");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setRelativeRadiusOfStart (java.lang.String value){ try { javonetHandle.set("RelativeRadiusOfStart",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getRelativeRadiusOfStart (){ try { return  (java.lang.String) javonetHandle.get("RelativeRadiusOfStart");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyRelativeRadiusOfParallelPart getRelativeRadiusOfParallelPart (){ try { return new PropertyRelativeRadiusOfParallelPart((NObject)javonetHandle.<NObject>get("RelativeRadiusOfParallelPart"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyValueAxisFunnel getYAxis (){ try { return new PropertyValueAxisFunnel((NObject)javonetHandle.<NObject>get("YAxis"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyCategoryAxisFunnel getXAxis (){ try { return new PropertyCategoryAxisFunnel((NObject)javonetHandle.<NObject>get("XAxis"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PropertyChartEngineFunnelBase(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}