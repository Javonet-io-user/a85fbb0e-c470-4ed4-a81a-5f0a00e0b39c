package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class Template extends DomItem {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.String getUUID (){ try { return  (java.lang.String) javonetHandle.get("UUID");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setFileName (java.lang.String value){ try { javonetHandle.set("FileName",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFileName (){ try { return  (java.lang.String) javonetHandle.get("FileName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setCondition (java.lang.String value){ try { javonetHandle.set("Condition",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getCondition (){ try { return  (java.lang.String) javonetHandle.get("Condition");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public Template (CollectionTemplates templateCollection){  super((NObject) null); try {  javonetHandle = Javonet.New("Template",templateCollection); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Template (CollectionTemplates templateCollection,java.lang.Integer index){  super((NObject) null); try {  javonetHandle = Javonet.New("Template",templateCollection,index); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Template(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}