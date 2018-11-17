package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyValueAxisPie2D extends DomItem {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public PropertyChartLabelCoordinateOnObjectPie getCoordinateLabelOnObject (){ try { return new PropertyChartLabelCoordinateOnObjectPie((NObject)javonetHandle.<NObject>get("CoordinateLabelOnObject"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setExplosionPercentage (java.lang.String value){ try { javonetHandle.set("ExplosionPercentage",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getExplosionPercentage (){ try { return  (java.lang.String) javonetHandle.get("ExplosionPercentage");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setValue (java.lang.String value){ try { javonetHandle.set("Value",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getValue (){ try { return  (java.lang.String) javonetHandle.get("Value");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setAggregateType (java.lang.String value){ try { javonetHandle.set("AggregateType",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getAggregateType (){ try { return  (java.lang.String) javonetHandle.get("AggregateType");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PropertyValueAxisPie2D(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}