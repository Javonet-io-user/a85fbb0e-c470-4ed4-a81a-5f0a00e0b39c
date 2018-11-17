package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class ReportParameter extends DomItem {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setAllowBlank (java.lang.String value){ try { javonetHandle.set("AllowBlank",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getAllowBlank (){ try { return  (java.lang.String) javonetHandle.get("AllowBlank");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setAllowMultipleValues (java.lang.String value){ try { javonetHandle.set("AllowMultipleValues",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getAllowMultipleValues (){ try { return  (java.lang.String) javonetHandle.get("AllowMultipleValues");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setAllowNull (java.lang.String value){ try { javonetHandle.set("AllowNull",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getAllowNull (){ try { return  (java.lang.String) javonetHandle.get("AllowNull");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyDefaultValues getDefaultValues (){ try { return new PropertyDefaultValues((NObject)javonetHandle.<NObject>get("DefaultValues"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.String getId (){ try { return  (java.lang.String) javonetHandle.get("Id");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setIdentifier (java.lang.String value){ try { javonetHandle.set("Identifier",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getIdentifier (){ try { return  (java.lang.String) javonetHandle.get("Identifier");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setParentId (java.lang.String value){ try { javonetHandle.set("ParentId",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getParentId (){ try { return  (java.lang.String) javonetHandle.get("ParentId");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setPrompt (java.lang.String value){ try { javonetHandle.set("Prompt",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPrompt (){ try { return  (java.lang.String) javonetHandle.get("Prompt");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertySource getSource (){ try { return new PropertySource((NObject)javonetHandle.<NObject>get("Source"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setTooltip (java.lang.String value){ try { javonetHandle.set("Tooltip",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTooltip (){ try { return  (java.lang.String) javonetHandle.get("Tooltip");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setControlType (LlDomControlType value){ try { javonetHandle.set("ControlType",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlDomControlType getControlType (){ try { return LlDomControlType.valueOf(((NEnum) javonetHandle.<NObject>get("ControlType")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setVisible (java.lang.String value){ try { javonetHandle.set("Visible",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getVisible (){ try { return  (java.lang.String) javonetHandle.get("Visible");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public ReportParameter (CollectionReportParameters reportParametersCollection){  super((NObject) null); try {  javonetHandle = Javonet.New("ReportParameter",reportParametersCollection); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ReportParameter (CollectionReportParameters reportParametersCollection,java.lang.Integer index){  super((NObject) null); try {  javonetHandle = Javonet.New("ReportParameter",reportParametersCollection,index); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ReportParameter(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void SetCurrentContents (java.lang.String contents){ try { javonetHandle.invoke("SetCurrentContents",contents);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void CopyFrom (DomItem source){ try { javonetHandle.invoke("CopyFrom",source);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean Equals (ReportParameter other){ try { return javonetHandle.invoke("Equals",other);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}