package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyLineOptions extends DomItem {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public PropertyFooterLinesOptions getFooter (){ try { return new PropertyFooterLinesOptions((NObject)javonetHandle.<NObject>get("Footer"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyGroupFooterLinesOptions getGroupFooter (){ try { return new PropertyGroupFooterLinesOptions((NObject)javonetHandle.<NObject>get("GroupFooter"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyGroupHeaderLinesOptions getGroupHeader (){ try { return new PropertyGroupHeaderLinesOptions((NObject)javonetHandle.<NObject>get("GroupHeader"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyDataLinesOptions getData (){ try { return new PropertyDataLinesOptions((NObject)javonetHandle.<NObject>get("Data"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PropertyLineOptions(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}