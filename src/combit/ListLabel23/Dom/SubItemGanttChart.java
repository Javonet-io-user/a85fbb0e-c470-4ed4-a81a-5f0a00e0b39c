package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class SubItemGanttChart extends SubItemBase {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public PropertyGanttChartDefinition getDefinition (){ try { return new PropertyGanttChartDefinition((NObject)javonetHandle.<NObject>get("Definition"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyReservedSpace getBorderDistance (){ try { return new PropertyReservedSpace((NObject)javonetHandle.<NObject>get("BorderDistance"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSourceTablePath (java.lang.String value){ try { javonetHandle.set("SourceTablePath",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSourceTablePath (){ try { return  (java.lang.String) javonetHandle.get("SourceTablePath");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setSortOrderId (java.lang.String value){ try { javonetHandle.set("SortOrderId",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSortOrderId (){ try { return  (java.lang.String) javonetHandle.get("SortOrderId");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public SubItemGanttChart (CollectionSubItemBases itemCollection){  super((NObject) null); try {  javonetHandle = Javonet.New("SubItemGanttChart",itemCollection); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SubItemGanttChart (CollectionSubItemBases itemCollection,java.lang.Integer index){  super((NObject) null); try {  javonetHandle = Javonet.New("SubItemGanttChart",itemCollection,index); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SubItemGanttChart(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}