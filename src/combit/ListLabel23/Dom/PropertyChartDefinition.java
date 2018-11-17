package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyChartDefinition extends DomItem {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setTitlePosition (java.lang.String value){ try { javonetHandle.set("TitlePosition",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTitlePosition (){ try { return  (java.lang.String) javonetHandle.get("TitlePosition");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyBackground getBackground (){ try { return new PropertyBackground((NObject)javonetHandle.<NObject>get("Background"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyChartEngineBase getChartEngine (){ try { return new PropertyChartEngineBase((NObject)javonetHandle.<NObject>get("ChartEngine"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyChartColorArray getColors (){ try { return new PropertyChartColorArray((NObject)javonetHandle.<NObject>get("Colors"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public CollectionChartConditionalColors getConditionalColors (){ try { return new CollectionChartConditionalColors((NObject)javonetHandle.<NObject>get("ConditionalColors"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyChartTitle getTitle (){ try { return new PropertyChartTitle((NObject)javonetHandle.<NObject>get("Title"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public CollectionManualLegend getManualLegend (){ try { return new CollectionManualLegend((NObject)javonetHandle.<NObject>get("ManualLegend"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PropertyChartDefinition(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}