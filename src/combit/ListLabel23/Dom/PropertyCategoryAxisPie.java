package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyCategoryAxisPie extends DomItem {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public PropertyChartLabelPie getCoordinateLabelPie (){ try { return new PropertyChartLabelPie((NObject)javonetHandle.<NObject>get("CoordinateLabelPie"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyChartLabelCoordinateOthers getCoordinateLabelOthers (){ try { return new PropertyChartLabelCoordinateOthers((NObject)javonetHandle.<NObject>get("CoordinateLabelOthers"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public CoordinateLabelPlacement getCoordinateLabelPlacement (){ try { return new CoordinateLabelPlacement((NObject)javonetHandle.<NObject>get("CoordinateLabelPlacement"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setMinimumPercentage (java.lang.String value){ try { javonetHandle.set("MinimumPercentage",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMinimumPercentage (){ try { return  (java.lang.String) javonetHandle.get("MinimumPercentage");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setSamplesForDesigner (java.lang.String value){ try { javonetHandle.set("SamplesForDesigner",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSamplesForDesigner (){ try { return  (java.lang.String) javonetHandle.get("SamplesForDesigner");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setSorted (java.lang.String value){ try { javonetHandle.set("Sorted",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSorted (){ try { return  (java.lang.String) javonetHandle.get("Sorted");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setValue (java.lang.String value){ try { javonetHandle.set("Value",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getValue (){ try { return  (java.lang.String) javonetHandle.get("Value");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setFilter (java.lang.String value){ try { javonetHandle.set("Filter",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFilter (){ try { return  (java.lang.String) javonetHandle.get("Filter");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PropertyCategoryAxisPie(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}