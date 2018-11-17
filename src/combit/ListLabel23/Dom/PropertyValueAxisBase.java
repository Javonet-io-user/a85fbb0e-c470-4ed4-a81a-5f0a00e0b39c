package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyValueAxisBase extends PropertyValueAxisBaseMinimal {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public PropertyChartLabelCoordinate getCoordinateLabel (){ try { return new PropertyChartLabelCoordinate((NObject)javonetHandle.<NObject>get("CoordinateLabel"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyChartLabel getLabel (){ try { return new PropertyChartLabel((NObject)javonetHandle.<NObject>get("Label"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyChartLabelCoordinateOnObject getCoordinateLabelOnObject (){ try { return new PropertyChartLabelCoordinateOnObject((NObject)javonetHandle.<NObject>get("CoordinateLabelOnObject"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public CoordinateLabelPlacement getCoordinateLabelPlacement (){ try { return new CoordinateLabelPlacement((NObject)javonetHandle.<NObject>get("CoordinateLabelPlacement"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyGridLines getGridLines (){ try { return new PropertyGridLines((NObject)javonetHandle.<NObject>get("GridLines"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setTickmarkColor (java.lang.String value){ try { javonetHandle.set("TickmarkColor",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTickmarkColor (){ try { return  (java.lang.String) javonetHandle.get("TickmarkColor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyTickmarks getTickmarks (){ try { return new PropertyTickmarks((NObject)javonetHandle.<NObject>get("Tickmarks"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setIntermediateTickCount (java.lang.String value){ try { javonetHandle.set("IntermediateTickCount",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getIntermediateTickCount (){ try { return  (java.lang.String) javonetHandle.get("IntermediateTickCount");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyFillingExt getZebraPattern (){ try { return new PropertyFillingExt((NObject)javonetHandle.<NObject>get("ZebraPattern"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PropertyValueAxisBase(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}