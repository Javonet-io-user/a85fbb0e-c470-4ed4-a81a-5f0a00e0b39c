package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertySettings extends DomItem {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.String getCreated (){ try { return  (java.lang.String) javonetHandle.get("Created");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDecimals (java.lang.String value){ try { javonetHandle.set("Decimals",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDecimals (){ try { return  (java.lang.String) javonetHandle.get("Decimals");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDefaultDestination (java.lang.String value){ try { javonetHandle.set("DefaultDestination",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDefaultDestination (){ try { return  (java.lang.String) javonetHandle.get("DefaultDestination");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getFileVersion (){ try { return  (java.lang.String) javonetHandle.get("FileVersion");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getLocaleID (){ try { return  (java.lang.String) javonetHandle.get("LocaleID");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMaxPdfOutlineDepth (java.lang.String value){ try { javonetHandle.set("MaxPdfOutlineDepth",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMaxPdfOutlineDepth (){ try { return  (java.lang.String) javonetHandle.get("MaxPdfOutlineDepth");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMaxPdfIndexDepth (java.lang.String value){ try { javonetHandle.set("MaxPdfIndexDepth",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMaxPdfIndexDepth (){ try { return  (java.lang.String) javonetHandle.get("MaxPdfIndexDepth");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getMetrics (){ try { return  (java.lang.String) javonetHandle.get("Metrics");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyFont getDefaultFont (){ try { return new PropertyFont((NObject)javonetHandle.<NObject>get("DefaultFont"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyRepresentationCodes getRepresentationCodes (){ try { return new PropertyRepresentationCodes((NObject)javonetHandle.<NObject>get("RepresentationCodes"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyTextQuoteCodes getTextQuoteCodes (){ try { return new PropertyTextQuoteCodes((NObject)javonetHandle.<NObject>get("TextQuoteCodes"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PropertySettings(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}