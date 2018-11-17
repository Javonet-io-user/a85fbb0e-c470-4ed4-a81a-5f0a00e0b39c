package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyShapeDefinition extends DomItem {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setProjection (java.lang.String value){ try { javonetHandle.set("Projection",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getProjection (){ try { return  (java.lang.String) javonetHandle.get("Projection");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyShapeDefinitionData getData (){ try { return new PropertyShapeDefinitionData((NObject)javonetHandle.<NObject>get("Data"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public ForegroundShapes getForegroundShapes (){ try { return new ForegroundShapes((NObject)javonetHandle.<NObject>get("ForegroundShapes"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public BackgroundShapes getBackgroundShapes (){ try { return new BackgroundShapes((NObject)javonetHandle.<NObject>get("BackgroundShapes"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PropertyShapeDefinition(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}