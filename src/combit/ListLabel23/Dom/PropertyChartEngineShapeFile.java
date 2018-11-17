package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyChartEngineShapeFile extends PropertyChartEngineBase {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public PropertyShapeDefinition getShapeDefinition (){ try { return new PropertyShapeDefinition((NObject)javonetHandle.<NObject>get("ShapeDefinition"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyShapeXAxis getXAxis (){ try { return new PropertyShapeXAxis((NObject)javonetHandle.<NObject>get("XAxis"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public CollectionPropertyShapeAxis getYAxes (){ try { return new CollectionPropertyShapeAxis((NObject)javonetHandle.<NObject>get("YAxes"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PropertyChartEngineShapeFile (PropertyChartEngineBase item){  super((NObject) null); try {  javonetHandle = Javonet.New("PropertyChartEngineShapeFile",item); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PropertyChartEngineShapeFile(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}