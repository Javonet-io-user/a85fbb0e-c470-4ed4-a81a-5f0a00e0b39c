package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyInputButtonActionHttpPost extends PropertyInputButtonActionBase {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setExtraFields (java.lang.String value){ try { javonetHandle.set("ExtraFields",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getExtraFields (){ try { return  (java.lang.String) javonetHandle.get("ExtraFields");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setUrl (java.lang.String value){ try { javonetHandle.set("Url",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getUrl (){ try { return  (java.lang.String) javonetHandle.get("Url");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PropertyInputButtonActionHttpPost (PropertyInputButtonActionBase item){  super((NObject) null); try {  javonetHandle = Javonet.New("PropertyInputButtonActionHttpPost",item); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PropertyInputButtonActionHttpPost(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}