package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyIconRanges extends DomItem {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setAutomatic (java.lang.String value){ try { javonetHandle.set("Automatic",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getAutomatic (){ try { return  (java.lang.String) javonetHandle.get("Automatic");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setAbsoluteValues (java.lang.String value){ try { javonetHandle.set("AbsoluteValues",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getAbsoluteValues (){ try { return  (java.lang.String) javonetHandle.get("AbsoluteValues");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public CollectionIconRangeItems getList (){ try { return new CollectionIconRangeItems((NObject)javonetHandle.<NObject>get("List"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PropertyIconRanges(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}