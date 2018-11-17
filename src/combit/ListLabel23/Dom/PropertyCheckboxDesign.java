package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyCheckboxDesign extends DomItem {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public PropertyCheckboxItemFor getItemForFalse (){ try { return new PropertyCheckboxItemFor((NObject)javonetHandle.<NObject>get("ItemForFalse"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyCheckboxItemFor getItemForNull (){ try { return new PropertyCheckboxItemFor((NObject)javonetHandle.<NObject>get("ItemForNull"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyCheckboxItemFor getItemForTrue (){ try { return new PropertyCheckboxItemFor((NObject)javonetHandle.<NObject>get("ItemForTrue"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PropertyCheckboxDesign(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}