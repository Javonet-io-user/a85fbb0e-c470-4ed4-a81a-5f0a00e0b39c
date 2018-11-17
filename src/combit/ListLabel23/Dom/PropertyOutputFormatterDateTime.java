package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyOutputFormatterDateTime extends PropertyOutputFormatterBase {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public PropertyDateTimeFormat getDate (){ try { return new PropertyDateTimeFormat((NObject)javonetHandle.<NObject>get("Date"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyDateTimeFormat getTime (){ try { return new PropertyDateTimeFormat((NObject)javonetHandle.<NObject>get("Time"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSeparator (java.lang.String value){ try { javonetHandle.set("Separator",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSeparator (){ try { return  (java.lang.String) javonetHandle.get("Separator");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setTimeAtLeft (java.lang.String value){ try { javonetHandle.set("TimeAtLeft",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTimeAtLeft (){ try { return  (java.lang.String) javonetHandle.get("TimeAtLeft");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PropertyOutputFormatterDateTime (PropertyOutputFormatterBase item){  super((NObject) null); try {  javonetHandle = Javonet.New("PropertyOutputFormatterDateTime",item); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PropertyOutputFormatterDateTime(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}