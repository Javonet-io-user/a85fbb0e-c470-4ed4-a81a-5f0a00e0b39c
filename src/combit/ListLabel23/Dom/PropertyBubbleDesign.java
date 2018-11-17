package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyBubbleDesign extends DomItem {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setDesignMode (java.lang.String value){ try { javonetHandle.set("DesignMode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDesignMode (){ try { return  (java.lang.String) javonetHandle.get("DesignMode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyDrawingFileInfo getFileInfo (){ try { return new PropertyDrawingFileInfo((NObject)javonetHandle.<NObject>get("FileInfo"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSizeFactor (java.lang.String value){ try { javonetHandle.set("SizeFactor",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSizeFactor (){ try { return  (java.lang.String) javonetHandle.get("SizeFactor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PropertyBubbleDesign(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}