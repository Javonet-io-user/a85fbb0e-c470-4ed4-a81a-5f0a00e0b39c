package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class CrosstabCellGroupLabel extends CrosstabCellBase {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setShowSpanLabel (java.lang.String value){ try { javonetHandle.set("ShowSpanLabel",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getShowSpanLabel (){ try { return  (java.lang.String) javonetHandle.get("ShowSpanLabel");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertySortOrderAscending getSortOrderAscending (){ try { return new PropertySortOrderAscending((NObject)javonetHandle.<NObject>get("SortOrderAscending"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyMaxEntryCount getMaxEntryCount (){ try { return new PropertyMaxEntryCount((NObject)javonetHandle.<NObject>get("MaxEntryCount"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyAutoFill getAutoFill (){ try { return new PropertyAutoFill((NObject)javonetHandle.<NObject>get("AutoFill"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setExpandable (java.lang.String value){ try { javonetHandle.set("Expandable",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getExpandable (){ try { return  (java.lang.String) javonetHandle.get("Expandable");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public CrosstabCellGroupLabel(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}