package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;
import combit.ListLabel23.*;public class PropertyBarcodeSource extends DomItem {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setFormula (java.lang.String value){ try { javonetHandle.set("Formula",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFormula (){ try { return  (java.lang.String) javonetHandle.get("Formula");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMode (java.lang.String value){ try { javonetHandle.set("Mode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMode (){ try { return  (java.lang.String) javonetHandle.get("Mode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setText (java.lang.String value){ try { javonetHandle.set("Text",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getText (){ try { return  (java.lang.String) javonetHandle.get("Text");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setBarcodeType (LlBarcodeType value){ try { javonetHandle.set("BarcodeType",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlBarcodeType getBarcodeType (){ try { return LlBarcodeType.valueOf(((NEnum) javonetHandle.<NObject>get("BarcodeType")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setVariable (java.lang.String value){ try { javonetHandle.set("Variable",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getVariable (){ try { return  (java.lang.String) javonetHandle.get("Variable");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyPremiumAdress getPremiumAdress (){ try { return new PropertyPremiumAdress((NObject)javonetHandle.<NObject>get("PremiumAdress"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PropertyBarcodeSource(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}