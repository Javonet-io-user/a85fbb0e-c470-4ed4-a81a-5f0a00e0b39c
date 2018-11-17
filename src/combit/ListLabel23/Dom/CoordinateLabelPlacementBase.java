package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public abstract class CoordinateLabelPlacementBase extends DomItem {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setPlacement (java.lang.String value){ try { javonetHandle.set("Placement",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPlacement (){ try { return  (java.lang.String) javonetHandle.get("Placement");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setEquidistant (java.lang.String value){ try { javonetHandle.set("Equidistant",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getEquidistant (){ try { return  (java.lang.String) javonetHandle.get("Equidistant");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyFrame getFrame (){ try { return new PropertyFrame((NObject)javonetHandle.<NObject>get("Frame"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public CoordinateLabelPlacementBase(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}