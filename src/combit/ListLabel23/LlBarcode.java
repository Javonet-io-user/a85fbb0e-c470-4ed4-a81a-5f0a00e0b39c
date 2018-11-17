package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.*;public class LlBarcode {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setContent (java.lang.String value){ try { javonetHandle.set("Content",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getContent (){ try { return  (java.lang.String) javonetHandle.get("Content");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setBarcodeType (LlBarcodeType value){ try { javonetHandle.set("BarcodeType",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlBarcodeType getBarcodeType (){ try { return LlBarcodeType.valueOf(((NEnum) javonetHandle.<NObject>get("BarcodeType")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setTextmode (LlBarcodeTextmode value){ try { javonetHandle.set("Textmode",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlBarcodeTextmode getTextmode (){ try { return LlBarcodeTextmode.valueOf(((NEnum) javonetHandle.<NObject>get("Textmode")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public LlBarcode (java.lang.String content,LlBarcodeType barcodeType){ try {  javonetHandle = Javonet.New("LlBarcode",content,NEnum.fromJavaEnum(barcodeType));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LlBarcode (java.lang.String content,LlBarcodeType barcodeType,java.lang.Boolean applyFormat){ try {  javonetHandle = Javonet.New("LlBarcode",content,NEnum.fromJavaEnum(barcodeType),applyFormat);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LlBarcode(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static java.lang.Boolean IsWellformed (java.lang.String content,LlBarcodeType barcodeType){ try { return Javonet.getType("LlBarcode").invoke("IsWellformed",content,NEnum.fromJavaEnum(barcodeType));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean IsWellformed (){ try { return javonetHandle.invoke("IsWellformed");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}