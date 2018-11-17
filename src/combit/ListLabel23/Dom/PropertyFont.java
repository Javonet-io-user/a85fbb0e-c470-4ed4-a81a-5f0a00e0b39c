package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;
import jio.System.Drawing.*;public class PropertyFont extends DomItem {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setBold (java.lang.String value){ try { javonetHandle.set("Bold",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getBold (){ try { return  (java.lang.String) javonetHandle.get("Bold");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setColor (java.lang.String value){ try { javonetHandle.set("Color",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getColor (){ try { return  (java.lang.String) javonetHandle.get("Color");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setFaceName (java.lang.String value){ try { javonetHandle.set("FaceName",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFaceName (){ try { return  (java.lang.String) javonetHandle.get("FaceName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setGdiCharSet (java.lang.String value){ try { javonetHandle.set("GdiCharSet",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getGdiCharSet (){ try { return  (java.lang.String) javonetHandle.get("GdiCharSet");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setItalic (java.lang.String value){ try { javonetHandle.set("Italic",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getItalic (){ try { return  (java.lang.String) javonetHandle.get("Italic");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setSize (java.lang.String value){ try { javonetHandle.set("Size",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSize (){ try { return  (java.lang.String) javonetHandle.get("Size");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setStrikeout (java.lang.String value){ try { javonetHandle.set("Strikeout",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getStrikeout (){ try { return  (java.lang.String) javonetHandle.get("Strikeout");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setUnderline (java.lang.String value){ try { javonetHandle.set("Underline",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getUnderline (){ try { return  (java.lang.String) javonetHandle.get("Underline");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setWidth (java.lang.String value){ try { javonetHandle.set("Width",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getWidth (){ try { return  (java.lang.String) javonetHandle.get("Width");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PropertyFont(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void SetFont (Font newFont){ try { javonetHandle.invoke("SetFont",newFont);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}