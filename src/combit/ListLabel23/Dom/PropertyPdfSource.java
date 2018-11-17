package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyPdfSource extends DomItem {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public PropertyDrawingFileInfo getFileInfo (){ try { return new PropertyDrawingFileInfo((NObject)javonetHandle.<NObject>get("FileInfo"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyDisplay getDisplay (){ try { return new PropertyDisplay((NObject)javonetHandle.<NObject>get("Display"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setMode (java.lang.String value){ try { javonetHandle.set("Mode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMode (){ try { return  (java.lang.String) javonetHandle.get("Mode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setFormula (java.lang.String value){ try { javonetHandle.set("Formula",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFormula (){ try { return  (java.lang.String) javonetHandle.get("Formula");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setPageRange (java.lang.String value){ try { javonetHandle.set("PageRange",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPageRange (){ try { return  (java.lang.String) javonetHandle.get("PageRange");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setPassword (java.lang.String value){ try { javonetHandle.set("Password",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPassword (){ try { return  (java.lang.String) javonetHandle.get("Password");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setEmbedded (java.lang.String value){ try { javonetHandle.set("Embedded",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getEmbedded (){ try { return  (java.lang.String) javonetHandle.get("Embedded");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setPagebreak (java.lang.String value){ try { javonetHandle.set("Pagebreak",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPagebreak (){ try { return  (java.lang.String) javonetHandle.get("Pagebreak");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setFontMode (java.lang.String value){ try { javonetHandle.set("FontMode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFontMode (){ try { return  (java.lang.String) javonetHandle.get("FontMode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PropertyPdfSource(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}