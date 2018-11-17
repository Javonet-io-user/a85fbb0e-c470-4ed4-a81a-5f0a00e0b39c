package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyOutputFormatterCurrency extends PropertyOutputFormatterDouble {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setCurrencySymbol (java.lang.String value){ try { javonetHandle.set("CurrencySymbol",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getCurrencySymbol (){ try { return  (java.lang.String) javonetHandle.get("CurrencySymbol");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setPositiveFormatType (java.lang.String value){ try { javonetHandle.set("PositiveFormatType",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPositiveFormatType (){ try { return  (java.lang.String) javonetHandle.get("PositiveFormatType");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setget_PropertyOutputFormatterCurrencyPropertyOutputFormatterCurrencyUnit (java.lang.String value){ try { javonetHandle.set("get_PropertyOutputFormatterCurrencyPropertyOutputFormatterCurrencyUnit",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPropertyOutputFormatterCurrencyPropertyOutputFormatterCurrencyUnit (){ try { return  (java.lang.String) javonetHandle.get("PropertyOutputFormatterCurrencyPropertyOutputFormatterCurrencyUnit");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PropertyOutputFormatterCurrency (PropertyOutputFormatterBase item){  super((NObject) null); try {  javonetHandle = Javonet.New("PropertyOutputFormatterCurrency",item); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PropertyOutputFormatterCurrency(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}