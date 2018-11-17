package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyInputButtonActionSendTo extends PropertyInputButtonActionBase {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setFormat (java.lang.String value){ try { javonetHandle.set("Format",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFormat (){ try { return  (java.lang.String) javonetHandle.get("Format");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setBCC (java.lang.String value){ try { javonetHandle.set("BCC",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getBCC (){ try { return  (java.lang.String) javonetHandle.get("BCC");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setBody (java.lang.String value){ try { javonetHandle.set("Body",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getBody (){ try { return  (java.lang.String) javonetHandle.get("Body");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setCC (java.lang.String value){ try { javonetHandle.set("CC",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getCC (){ try { return  (java.lang.String) javonetHandle.get("CC");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setShowDialog (java.lang.String value){ try { javonetHandle.set("ShowDialog",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getShowDialog (){ try { return  (java.lang.String) javonetHandle.get("ShowDialog");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setSubject (java.lang.String value){ try { javonetHandle.set("Subject",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSubject (){ try { return  (java.lang.String) javonetHandle.get("Subject");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setTo (java.lang.String value){ try { javonetHandle.set("To",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTo (){ try { return  (java.lang.String) javonetHandle.get("To");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PropertyInputButtonActionSendTo (PropertyInputButtonActionBase item){  super((NObject) null); try {  javonetHandle = Javonet.New("PropertyInputButtonActionSendTo",item); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PropertyInputButtonActionSendTo(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}