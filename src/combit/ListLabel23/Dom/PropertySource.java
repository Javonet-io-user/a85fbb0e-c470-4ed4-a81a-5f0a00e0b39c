package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertySource extends DomItem {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setSourceType (LlDomSourceType value){ try { javonetHandle.set("SourceType",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlDomSourceType getSourceType (){ try { return LlDomSourceType.valueOf(((NEnum) javonetHandle.<NObject>get("SourceType")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setContentsType (LlDomSourceContentsType value){ try { javonetHandle.set("ContentsType",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlDomSourceContentsType getContentsType (){ try { return LlDomSourceContentsType.valueOf(((NEnum) javonetHandle.<NObject>get("ContentsType")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setDisplayFormula (java.lang.String value){ try { javonetHandle.set("DisplayFormula",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDisplayFormula (){ try { return  (java.lang.String) javonetHandle.get("DisplayFormula");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setField (java.lang.String value){ try { javonetHandle.set("Field",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getField (){ try { return  (java.lang.String) javonetHandle.get("Field");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setFilter (java.lang.String value){ try { javonetHandle.set("Filter",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFilter (){ try { return  (java.lang.String) javonetHandle.get("Filter");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public SeparatedStringCollection getManualItems (){ try { return new SeparatedStringCollection((NObject)javonetHandle.<NObject>get("ManualItems"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyOutputFormatterBase getOutputFormatter (){ try { return new PropertyOutputFormatterBase((NObject)javonetHandle.<NObject>get("OutputFormatter"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSortOrderId (java.lang.String value){ try { javonetHandle.set("SortOrderId",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSortOrderId (){ try { return  (java.lang.String) javonetHandle.get("SortOrderId");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setTableId (java.lang.String value){ try { javonetHandle.set("TableId",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTableId (){ try { return  (java.lang.String) javonetHandle.get("TableId");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PropertySource(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void CopyFrom (DomItem source){ try { javonetHandle.invoke("CopyFrom",source);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}