package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class TableLineGroupFooter extends TableLineBase {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setGroupBy (java.lang.String value){ try { javonetHandle.set("GroupBy",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getGroupBy (){ try { return  (java.lang.String) javonetHandle.get("GroupBy");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setGroupSums (java.lang.String value){ try { javonetHandle.set("GroupSums",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getGroupSums (){ try { return  (java.lang.String) javonetHandle.get("GroupSums");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setTriggerNewPage (java.lang.String value){ try { javonetHandle.set("TriggerNewPage",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTriggerNewPage (){ try { return  (java.lang.String) javonetHandle.get("TriggerNewPage");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public TableLineGroupFooter (CollectionTableLinesGroupFooter itemCollection){  super((NObject) null); try {  javonetHandle = Javonet.New("TableLineGroupFooter",itemCollection); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public TableLineGroupFooter (CollectionTableLinesGroupFooter itemCollection,java.lang.Integer index){  super((NObject) null); try {  javonetHandle = Javonet.New("TableLineGroupFooter",itemCollection,index); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public TableLineGroupFooter(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}