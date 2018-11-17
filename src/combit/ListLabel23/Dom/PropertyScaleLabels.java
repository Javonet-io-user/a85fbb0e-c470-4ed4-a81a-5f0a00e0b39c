package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyScaleLabels extends DomItem {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setVisible (java.lang.String value){ try { javonetHandle.set("Visible",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getVisible (){ try { return  (java.lang.String) javonetHandle.get("Visible");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setAlignment (java.lang.String value){ try { javonetHandle.set("Alignment",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getAlignment (){ try { return  (java.lang.String) javonetHandle.get("Alignment");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyOutputFormatterBase getOutputFormatter (){ try { return new PropertyOutputFormatterBase((NObject)javonetHandle.<NObject>get("OutputFormatter"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setRotated (java.lang.String value){ try { javonetHandle.set("Rotated",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getRotated (){ try { return  (java.lang.String) javonetHandle.get("Rotated");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setSizeAdjustment (java.lang.String value){ try { javonetHandle.set("SizeAdjustment",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSizeAdjustment (){ try { return  (java.lang.String) javonetHandle.get("SizeAdjustment");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyDisplayRange getDisplayRange (){ try { return new PropertyDisplayRange((NObject)javonetHandle.<NObject>get("DisplayRange"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyFont getFont (){ try { return new PropertyFont((NObject)javonetHandle.<NObject>get("Font"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PropertyScaleLabels(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}