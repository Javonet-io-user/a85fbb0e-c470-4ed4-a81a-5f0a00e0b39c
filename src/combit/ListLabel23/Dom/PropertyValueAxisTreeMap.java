package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyValueAxisTreeMap extends PropertyValueAxisBaseMinimal {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public PropertyChartLabelCoordinateOnObject getCoordinateLabelOnObject (){ try { return new PropertyChartLabelCoordinateOnObject((NObject)javonetHandle.<NObject>get("CoordinateLabelOnObject"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setFixedColorGroup (java.lang.String value){ try { javonetHandle.set("FixedColorGroup",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFixedColorGroup (){ try { return  (java.lang.String) javonetHandle.get("FixedColorGroup");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyGridLines getGridLines (){ try { return new PropertyGridLines((NObject)javonetHandle.<NObject>get("GridLines"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyVisual getVisual (){ try { return new PropertyVisual((NObject)javonetHandle.<NObject>get("Visual"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public CollectionDrillDownLinks getDrillDownLinks (){ try { return new CollectionDrillDownLinks((NObject)javonetHandle.<NObject>get("DrillDownLinks"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PropertyValueAxisTreeMap(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}