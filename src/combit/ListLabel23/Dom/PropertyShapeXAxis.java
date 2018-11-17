package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyShapeXAxis extends DomItem {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public PropertyChartLabelCoordinate getCoordinateLabel (){ try { return new PropertyChartLabelCoordinate((NObject)javonetHandle.<NObject>get("CoordinateLabel"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public CoordinateLabelPlacement getCoordinateLabelPlacement (){ try { return new CoordinateLabelPlacement((NObject)javonetHandle.<NObject>get("CoordinateLabelPlacement"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setFilter (java.lang.Boolean value){ try { javonetHandle.set("Filter",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getFilter (){ try { return javonetHandle.get("Filter");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public PropertyChartLabel getLabel (){ try { return new PropertyChartLabel((NObject)javonetHandle.<NObject>get("Label"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setShapeAttribute (java.lang.String value){ try { javonetHandle.set("ShapeAttribute",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getShapeAttribute (){ try { return  (java.lang.String) javonetHandle.get("ShapeAttribute");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setValue (java.lang.String value){ try { javonetHandle.set("Value",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getValue (){ try { return  (java.lang.String) javonetHandle.get("Value");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PropertyShapeXAxis(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}