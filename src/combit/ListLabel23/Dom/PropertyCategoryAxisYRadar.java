package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyCategoryAxisYRadar extends PropertyCategoryAxisBase {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setSorted (java.lang.String value){ try { javonetHandle.set("Sorted",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSorted (){ try { return  (java.lang.String) javonetHandle.get("Sorted");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyChartLabel getLabel (){ try { return new PropertyChartLabel((NObject)javonetHandle.<NObject>get("Label"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public CollectionChartRows getRows (){ try { return new CollectionChartRows((NObject)javonetHandle.<NObject>get("Rows"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PropertyCategoryAxisYRadar(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}