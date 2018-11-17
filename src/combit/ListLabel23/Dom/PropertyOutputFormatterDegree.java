package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyOutputFormatterDegree extends PropertyOutputFormatterBase {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setCountOfDecimals (java.lang.String value){ try { javonetHandle.set("CountOfDecimals",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getCountOfDecimals (){ try { return  (java.lang.String) javonetHandle.get("CountOfDecimals");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDecimalSeparatorCharType (java.lang.String value){ try { javonetHandle.set("DecimalSeparatorCharType",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDecimalSeparatorCharType (){ try { return  (java.lang.String) javonetHandle.get("DecimalSeparatorCharType");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setEmptyStringIfZero (java.lang.String value){ try { javonetHandle.set("EmptyStringIfZero",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getEmptyStringIfZero (){ try { return  (java.lang.String) javonetHandle.get("EmptyStringIfZero");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setFormatType (java.lang.String value){ try { javonetHandle.set("FormatType",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFormatType (){ try { return  (java.lang.String) javonetHandle.get("FormatType");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setInputDataType (java.lang.String value){ try { javonetHandle.set("InputDataType",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getInputDataType (){ try { return  (java.lang.String) javonetHandle.get("InputDataType");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setOmitEmptyParts (java.lang.String value){ try { javonetHandle.set("OmitEmptyParts",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getOmitEmptyParts (){ try { return  (java.lang.String) javonetHandle.get("OmitEmptyParts");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PropertyOutputFormatterDegree (PropertyOutputFormatterBase item){  super((NObject) null); try {  javonetHandle = Javonet.New("PropertyOutputFormatterDegree",item); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PropertyOutputFormatterDegree(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}