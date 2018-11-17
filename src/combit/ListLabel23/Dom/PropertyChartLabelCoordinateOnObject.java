package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyChartLabelCoordinateOnObject extends DomItem {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public PropertyFillingExt getFilling (){ try { return new PropertyFillingExt((NObject)javonetHandle.<NObject>get("Filling"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyFontExt getFont (){ try { return new PropertyFontExt((NObject)javonetHandle.<NObject>get("Font"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyOutputFormatterBase getOutputFormatter (){ try { return new PropertyOutputFormatterBase((NObject)javonetHandle.<NObject>get("OutputFormatter"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setPlacement (java.lang.String value){ try { javonetHandle.set("Placement",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPlacement (){ try { return  (java.lang.String) javonetHandle.get("Placement");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setContents (java.lang.String value){ try { javonetHandle.set("Contents",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getContents (){ try { return  (java.lang.String) javonetHandle.get("Contents");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setRotation (java.lang.String value){ try { javonetHandle.set("Rotation",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getRotation (){ try { return  (java.lang.String) javonetHandle.get("Rotation");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PropertyChartLabelCoordinateOnObject(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}