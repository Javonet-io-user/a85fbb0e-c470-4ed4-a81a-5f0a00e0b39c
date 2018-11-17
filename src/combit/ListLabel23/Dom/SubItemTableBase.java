package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class SubItemTableBase extends SubItemBase {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setPageBreakCondition (java.lang.String value){ try { javonetHandle.set("PageBreakCondition",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPageBreakCondition (){ try { return  (java.lang.String) javonetHandle.get("PageBreakCondition");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyFrame getDefaultFrame (){ try { return new PropertyFrame((NObject)javonetHandle.<NObject>get("DefaultFrame"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyFixedSize getFixedSize (){ try { return new PropertyFixedSize((NObject)javonetHandle.<NObject>get("FixedSize"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setShowSeparatorTickmarks (java.lang.String value){ try { javonetHandle.set("ShowSeparatorTickmarks",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getShowSeparatorTickmarks (){ try { return  (java.lang.String) javonetHandle.get("ShowSeparatorTickmarks");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setSortOrderId (java.lang.String value){ try { javonetHandle.set("SortOrderId",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSortOrderId (){ try { return  (java.lang.String) javonetHandle.get("SortOrderId");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDesignScheme (java.lang.String value){ try { javonetHandle.set("DesignScheme",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDesignScheme (){ try { return  (java.lang.String) javonetHandle.get("DesignScheme");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public SubItemTableBase (CollectionSubItemBasesBase itemCollection){  super((NObject) null); try {  javonetHandle = Javonet.New("SubItemTableBase",itemCollection); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SubItemTableBase (CollectionSubItemBasesBase itemCollection,java.lang.Integer index){  super((NObject) null); try {  javonetHandle = Javonet.New("SubItemTableBase",itemCollection,index); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SubItemTableBase(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}