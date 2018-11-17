package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyOutputFormatterDouble extends PropertyOutputFormatterBase {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setForceSign (java.lang.String value){ try { javonetHandle.set("ForceSign",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getForceSign (){ try { return  (java.lang.String) javonetHandle.get("ForceSign");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
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
            public void setForceZeroBeforeDecimalSeparator (java.lang.String value){ try { javonetHandle.set("ForceZeroBeforeDecimalSeparator",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getForceZeroBeforeDecimalSeparator (){ try { return  (java.lang.String) javonetHandle.get("ForceZeroBeforeDecimalSeparator");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setNegativeFormatType (java.lang.String value){ try { javonetHandle.set("NegativeFormatType",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getNegativeFormatType (){ try { return  (java.lang.String) javonetHandle.get("NegativeFormatType");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setThousandsSeparatorCharType (java.lang.String value){ try { javonetHandle.set("ThousandsSeparatorCharType",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getThousandsSeparatorCharType (){ try { return  (java.lang.String) javonetHandle.get("ThousandsSeparatorCharType");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setExponentialFormat (java.lang.String value){ try { javonetHandle.set("ExponentialFormat",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getExponentialFormat (){ try { return  (java.lang.String) javonetHandle.get("ExponentialFormat");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setUnit (java.lang.String value){ try { javonetHandle.set("Unit",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getUnit (){ try { return  (java.lang.String) javonetHandle.get("Unit");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setRemoveTrailingZeroes (java.lang.String value){ try { javonetHandle.set("RemoveTrailingZeroes",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getRemoveTrailingZeroes (){ try { return  (java.lang.String) javonetHandle.get("RemoveTrailingZeroes");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PropertyOutputFormatterDouble (PropertyOutputFormatterBase item){  super((NObject) null); try {  javonetHandle = Javonet.New("PropertyOutputFormatterDouble",item); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PropertyOutputFormatterDouble(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}