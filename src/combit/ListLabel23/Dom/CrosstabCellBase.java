package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class CrosstabCellBase extends DomItem {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public PropertyAlignmentHorizontal getAlignmentHorizontal (){ try { return new PropertyAlignmentHorizontal((NObject)javonetHandle.<NObject>get("AlignmentHorizontal"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setAlignmentVertical (java.lang.String value){ try { javonetHandle.set("AlignmentVertical",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getAlignmentVertical (){ try { return  (java.lang.String) javonetHandle.get("AlignmentVertical");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDirection (java.lang.String value){ try { javonetHandle.set("Direction",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDirection (){ try { return  (java.lang.String) javonetHandle.get("Direction");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyFillingExt getFilling (){ try { return new PropertyFillingExt((NObject)javonetHandle.<NObject>get("Filling"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyFontExt getFont (){ try { return new PropertyFontExt((NObject)javonetHandle.<NObject>get("Font"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setFormula (java.lang.String value){ try { javonetHandle.set("Formula",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFormula (){ try { return  (java.lang.String) javonetHandle.get("Formula");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyFrameExt getFrame (){ try { return new PropertyFrameExt((NObject)javonetHandle.<NObject>get("Frame"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setLinkUrl (java.lang.String value){ try { javonetHandle.set("LinkUrl",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getLinkUrl (){ try { return  (java.lang.String) javonetHandle.get("LinkUrl");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyOutputFormatterBase getOutputFormatter (){ try { return new PropertyOutputFormatterBase((NObject)javonetHandle.<NObject>get("OutputFormatter"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setMaxCellWidth (java.lang.String value){ try { javonetHandle.set("MaxCellWidth",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMaxCellWidth (){ try { return  (java.lang.String) javonetHandle.get("MaxCellWidth");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMinHeight (java.lang.String value){ try { javonetHandle.set("MinHeight",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMinHeight (){ try { return  (java.lang.String) javonetHandle.get("MinHeight");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMinWidth (java.lang.String value){ try { javonetHandle.set("MinWidth",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMinWidth (){ try { return  (java.lang.String) javonetHandle.get("MinWidth");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public CollectionConditionalFormatterItems getConditionalFormatter (){ try { return new CollectionConditionalFormatterItems((NObject)javonetHandle.<NObject>get("ConditionalFormatter"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public CrosstabCellBase(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}