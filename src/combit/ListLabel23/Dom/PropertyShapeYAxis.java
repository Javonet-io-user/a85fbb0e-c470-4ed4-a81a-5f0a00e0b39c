package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyShapeYAxis extends DomItem {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public PropertyChartLabelCoordinateOnObject getCoordinateLabelOnObject (){ try { return new PropertyChartLabelCoordinateOnObject((NObject)javonetHandle.<NObject>get("CoordinateLabelOnObject"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setValue (java.lang.String value){ try { javonetHandle.set("Value",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getValue (){ try { return  (java.lang.String) javonetHandle.get("Value");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PropertyShapeYAxis (CollectionPropertyShapeAxis collectionPropertyShapeAxis){  super((NObject) null); try {  javonetHandle = Javonet.New("PropertyShapeYAxis",collectionPropertyShapeAxis); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PropertyShapeYAxis (CollectionPropertyShapeAxis collectionPropertyShapeAxis,java.lang.Integer index){  super((NObject) null); try {  javonetHandle = Javonet.New("PropertyShapeYAxis",collectionPropertyShapeAxis,index); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PropertyShapeYAxis(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}