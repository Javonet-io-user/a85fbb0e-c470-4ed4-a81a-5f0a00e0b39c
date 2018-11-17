package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyShapeDefinitionData extends PropertyShapeItemBase {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setCentered (java.lang.String value){ try { javonetHandle.set("Centered",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getCentered (){ try { return  (java.lang.String) javonetHandle.get("Centered");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyShapeBoundarySelection getBoundarySelection (){ try { return new PropertyShapeBoundarySelection((NObject)javonetHandle.<NObject>get("BoundarySelection"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PropertyShapeDefinitionData(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}