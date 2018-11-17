package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyDataGraphicBar extends DomItem {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setAlignmentVertical (java.lang.String value){ try { javonetHandle.set("AlignmentVertical",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getAlignmentVertical (){ try { return  (java.lang.String) javonetHandle.get("AlignmentVertical");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setCondition (java.lang.String value){ try { javonetHandle.set("Condition",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getCondition (){ try { return  (java.lang.String) javonetHandle.get("Condition");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setHeight (java.lang.String value){ try { javonetHandle.set("Height",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getHeight (){ try { return  (java.lang.String) javonetHandle.get("Height");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setRounding (java.lang.String value){ try { javonetHandle.set("Rounding",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getRounding (){ try { return  (java.lang.String) javonetHandle.get("Rounding");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyAlignment getAlignment (){ try { return new PropertyAlignment((NObject)javonetHandle.<NObject>get("Alignment"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyColorRanges getColorRanges (){ try { return new PropertyColorRanges((NObject)javonetHandle.<NObject>get("ColorRanges"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PropertyDataGraphicBar(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}