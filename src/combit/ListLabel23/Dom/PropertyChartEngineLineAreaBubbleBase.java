package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public abstract class PropertyChartEngineLineAreaBubbleBase extends PropertyChartEngineBase {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public PropertyFilling getFilling (){ try { return new PropertyFilling((NObject)javonetHandle.<NObject>get("Filling"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyChartSecondaryValueAxis getSecondaryValueAxis (){ try { return new PropertyChartSecondaryValueAxis((NObject)javonetHandle.<NObject>get("SecondaryValueAxis"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyCategoryAxisX getXAxis (){ try { return new PropertyCategoryAxisX((NObject)javonetHandle.<NObject>get("XAxis"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyCategoryAxisY getYAxis (){ try { return new PropertyCategoryAxisY((NObject)javonetHandle.<NObject>get("YAxis"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyValueZAxisArray getZAxes (){ try { return new PropertyValueZAxisArray((NObject)javonetHandle.<NObject>get("ZAxes"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PropertyChartEngineLineAreaBubbleBase(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}