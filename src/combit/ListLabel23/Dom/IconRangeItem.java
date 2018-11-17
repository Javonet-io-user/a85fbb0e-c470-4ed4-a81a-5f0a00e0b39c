package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class IconRangeItem extends DomItem {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setMin (java.lang.String value){ try { javonetHandle.set("Min",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMin (){ try { return  (java.lang.String) javonetHandle.get("Min");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMax (java.lang.String value){ try { javonetHandle.set("Max",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMax (){ try { return  (java.lang.String) javonetHandle.get("Max");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setIndex (java.lang.String value){ try { javonetHandle.set("Index",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getIndex (){ try { return  (java.lang.String) javonetHandle.get("Index");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public IconRangeItem (CollectionIconRangeItems iconRangeCollection){  super((NObject) null); try {  javonetHandle = Javonet.New("IconRangeItem",iconRangeCollection); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public IconRangeItem (CollectionIconRangeItems iconRangeCollection,java.lang.Integer index){  super((NObject) null); try {  javonetHandle = Javonet.New("IconRangeItem",iconRangeCollection,index); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public IconRangeItem(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}