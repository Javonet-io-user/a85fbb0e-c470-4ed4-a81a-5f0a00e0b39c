package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;
import combit.ListLabel23.*;public class SubItemChart extends SubItemBase {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public PropertyChartDefinition getDefinition (){ try { return new PropertyChartDefinition((NObject)javonetHandle.<NObject>get("Definition"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyReservedSpace getBorderDistance (){ try { return new PropertyReservedSpace((NObject)javonetHandle.<NObject>get("BorderDistance"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setReserveSpaceForSubtitle (java.lang.String value){ try { javonetHandle.set("ReserveSpaceForSubtitle",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getReserveSpaceForSubtitle (){ try { return  (java.lang.String) javonetHandle.get("ReserveSpaceForSubtitle");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
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
            public java.lang.String getSortOrderId (){ try { return  (java.lang.String) javonetHandle.get("SortOrderId");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setHeight (java.lang.String value){ try { javonetHandle.set("Height",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getHeight (){ try { return  (java.lang.String) javonetHandle.get("Height");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public SubItemChart (LlChartType chartType,CollectionSubItemBases itemCollection){  super((NObject) null); try {  javonetHandle = Javonet.New("SubItemChart",NEnum.fromJavaEnum(chartType),itemCollection); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SubItemChart (LlChartType chartType,CollectionSubItemBases itemCollection,java.lang.Integer index){  super((NObject) null); try {  javonetHandle = Javonet.New("SubItemChart",NEnum.fromJavaEnum(chartType),itemCollection,index); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SubItemChart(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}