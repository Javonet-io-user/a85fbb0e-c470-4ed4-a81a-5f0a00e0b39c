package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class ConditionalFormatterItem extends DomItem {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public ConditionalFormatterModifiers getModifiers (){ try { return new ConditionalFormatterModifiers((NObject)javonetHandle.<NObject>get("Modifiers"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setStopIteration (java.lang.String value){ try { javonetHandle.set("StopIteration",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getStopIteration (){ try { return  (java.lang.String) javonetHandle.get("StopIteration");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setCondition (java.lang.String value){ try { javonetHandle.set("Condition",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getCondition (){ try { return  (java.lang.String) javonetHandle.get("Condition");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public ConditionalFormatterItem (DomItem item){  super((NObject) null); try {  javonetHandle = Javonet.New("ConditionalFormatterItem",item); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ConditionalFormatterItem (CollectionConditionalFormatterItems itemsCollection){  super((NObject) null); try {  javonetHandle = Javonet.New("ConditionalFormatterItem",itemsCollection); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ConditionalFormatterItem (CollectionConditionalFormatterItems itemsCollection,java.lang.Integer index){  super((NObject) null); try {  javonetHandle = Javonet.New("ConditionalFormatterItem",itemsCollection,index); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ConditionalFormatterItem(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}