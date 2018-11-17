package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyCategoryAxisXTreeMap extends PropertyCategoryAxisBase {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setget_PropertyCategoryAxisXTreeMapPropertyCategoryAxisXTreeMapRoundLimits (java.lang.String value){ try { javonetHandle.set("get_PropertyCategoryAxisXTreeMapPropertyCategoryAxisXTreeMapRoundLimits",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPropertyCategoryAxisXTreeMapPropertyCategoryAxisXTreeMapRoundLimits (){ try { return  (java.lang.String) javonetHandle.get("PropertyCategoryAxisXTreeMapPropertyCategoryAxisXTreeMapRoundLimits");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setFixedColorGroup (java.lang.String value){ try { javonetHandle.set("FixedColorGroup",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFixedColorGroup (){ try { return  (java.lang.String) javonetHandle.get("FixedColorGroup");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyMaxEntryCount getMaxEntryCount (){ try { return new PropertyMaxEntryCount((NObject)javonetHandle.<NObject>get("MaxEntryCount"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyGridLines getGridLines (){ try { return new PropertyGridLines((NObject)javonetHandle.<NObject>get("GridLines"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PropertyCategoryAxisXTreeMap(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}