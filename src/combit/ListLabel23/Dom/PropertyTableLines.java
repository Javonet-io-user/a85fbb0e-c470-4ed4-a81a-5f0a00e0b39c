package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyTableLines extends DomItem {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public CollectionTableLinesData getData (){ try { return new CollectionTableLinesData((NObject)javonetHandle.<NObject>get("Data"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public CollectionTableLinesHeader getHeader (){ try { return new CollectionTableLinesHeader((NObject)javonetHandle.<NObject>get("Header"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public CollectionTableLinesGroupHeader getGroupHeader (){ try { return new CollectionTableLinesGroupHeader((NObject)javonetHandle.<NObject>get("GroupHeader"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public CollectionTableLinesGroupFooter getGroupFooter (){ try { return new CollectionTableLinesGroupFooter((NObject)javonetHandle.<NObject>get("GroupFooter"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public CollectionTableLinesFooter getFooter (){ try { return new CollectionTableLinesFooter((NObject)javonetHandle.<NObject>get("Footer"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PropertyTableLines(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}