package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class SignalItem extends DomItem {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setMax (java.lang.String value){ try { javonetHandle.set("Max",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMax (){ try { return  (java.lang.String) javonetHandle.get("Max");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMaxColor (java.lang.String value){ try { javonetHandle.set("MaxColor",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMaxColor (){ try { return  (java.lang.String) javonetHandle.get("MaxColor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMin (java.lang.String value){ try { javonetHandle.set("Min",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMin (){ try { return  (java.lang.String) javonetHandle.get("Min");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMinColor (java.lang.String value){ try { javonetHandle.set("MinColor",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMinColor (){ try { return  (java.lang.String) javonetHandle.get("MinColor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public SignalItem (CollectionSignalItems signalRegionCollection){  super((NObject) null); try {  javonetHandle = Javonet.New("SignalItem",signalRegionCollection); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SignalItem (CollectionSignalItems signalItemsCollection,java.lang.Integer index){  super((NObject) null); try {  javonetHandle = Javonet.New("SignalItem",signalItemsCollection,index); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SignalItem(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}