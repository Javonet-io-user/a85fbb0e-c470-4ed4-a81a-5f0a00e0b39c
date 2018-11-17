package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.*;
import jio.System.Collections.Generic.*;public class ReportParameterWithData {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setName (java.lang.String value){ try { javonetHandle.set("Name",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getName (){ try { return  (java.lang.String) javonetHandle.get("Name");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setControlType (ReportParameterControlType value){ try { javonetHandle.set("ControlType",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public ReportParameterControlType getControlType (){ try { return ReportParameterControlType.valueOf(((NEnum) javonetHandle.<NObject>get("ControlType")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSourceType (ReportParameterSourceType value){ try { javonetHandle.set("SourceType",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public ReportParameterSourceType getSourceType (){ try { return ReportParameterSourceType.valueOf(((NEnum) javonetHandle.<NObject>get("SourceType")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSourceMode (ReportParameterSourceMode value){ try { javonetHandle.set("SourceMode",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public ReportParameterSourceMode getSourceMode (){ try { return ReportParameterSourceMode.valueOf(((NEnum) javonetHandle.<NObject>get("SourceMode")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setMayBeNull (java.lang.Boolean value){ try { javonetHandle.set("MayBeNull",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getMayBeNull (){ try { return javonetHandle.get("MayBeNull");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setMayBeEmpty (java.lang.Boolean value){ try { javonetHandle.set("MayBeEmpty",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getMayBeEmpty (){ try { return javonetHandle.get("MayBeEmpty");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setMultipleChoice (java.lang.Boolean value){ try { javonetHandle.set("MultipleChoice",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getMultipleChoice (){ try { return javonetHandle.get("MultipleChoice");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setVisibleInControlGroup (java.lang.Boolean value){ try { javonetHandle.set("VisibleInControlGroup",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getVisibleInControlGroup (){ try { return javonetHandle.get("VisibleInControlGroup");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setGuid (java.lang.String value){ try { javonetHandle.set("Guid",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getGuid (){ try { return  (java.lang.String) javonetHandle.get("Guid");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setParentGuid (java.lang.String value){ try { javonetHandle.set("ParentGuid",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getParentGuid (){ try { return  (java.lang.String) javonetHandle.get("ParentGuid");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setTooltip (java.lang.String value){ try { javonetHandle.set("Tooltip",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTooltip (){ try { return  (java.lang.String) javonetHandle.get("Tooltip");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setLabel (java.lang.String value){ try { javonetHandle.set("Label",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getLabel (){ try { return  (java.lang.String) javonetHandle.get("Label");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setChoices (Dictionary<java.lang.String,java.lang.String> value){ try { javonetHandle.set("Choices",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Dictionary<java.lang.String,java.lang.String> getChoices (){ try { return new Dictionary<java.lang.String,java.lang.String>((NObject)javonetHandle.<NObject>get("Choices"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSelection (List<java.lang.String> value){ try { javonetHandle.set("Selection",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public List<java.lang.String> getSelection (){ try { return new List<java.lang.String>((NObject)javonetHandle.<NObject>get("Selection"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setNullKey (java.lang.String value){ try { javonetHandle.set("NullKey",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getNullKey (){ try { return  (java.lang.String) javonetHandle.get("NullKey");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setNullUiValue (java.lang.String value){ try { javonetHandle.set("NullUiValue",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getNullUiValue (){ try { return  (java.lang.String) javonetHandle.get("NullUiValue");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public ReportParameterWithData (){ try {  javonetHandle = Javonet.New("ReportParameterWithData");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ReportParameterWithData(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}