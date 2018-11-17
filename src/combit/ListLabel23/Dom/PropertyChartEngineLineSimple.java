package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyChartEngineLineSimple extends PropertyChartEngineBase {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public PropertyChartSecondaryValueAxis getSecondaryValueAxis (){ try { return new PropertyChartSecondaryValueAxis((NObject)javonetHandle.<NObject>get("SecondaryValueAxis"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyFilling getFilling (){ try { return new PropertyFilling((NObject)javonetHandle.<NObject>get("Filling"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyCategoryAxisX getXAxis (){ try { return new PropertyCategoryAxisX((NObject)javonetHandle.<NObject>get("XAxis"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyValueAxisArray getYAxes (){ try { return new PropertyValueAxisArray((NObject)javonetHandle.<NObject>get("YAxes"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setLinearAxis (java.lang.String value){ try { javonetHandle.set("LinearAxis",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getLinearAxis (){ try { return  (java.lang.String) javonetHandle.get("LinearAxis");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PropertyChartEngineLineSimple (PropertyChartEngineBase item){  super((NObject) null); try {  javonetHandle = Javonet.New("PropertyChartEngineLineSimple",item); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PropertyChartEngineLineSimple(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}