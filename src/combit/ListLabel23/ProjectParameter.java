package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.*;public class ProjectParameter {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setName (java.lang.String value){ try { javonetHandle.set("Name",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getName (){ try { return  (java.lang.String) javonetHandle.get("Name");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setVisibility (LlProjectParameterVisibility value){ try { javonetHandle.set("Visibility",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlProjectParameterVisibility getVisibility (){ try { return LlProjectParameterVisibility.valueOf(((NEnum) javonetHandle.<NObject>get("Visibility")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setScope (LlProjectParameterScope value){ try { javonetHandle.set("Scope",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlProjectParameterScope getScope (){ try { return LlProjectParameterScope.valueOf(((NEnum) javonetHandle.<NObject>get("Scope")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setParameterType (LlProjectParameterType value){ try { javonetHandle.set("ParameterType",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlProjectParameterType getParameterType (){ try { return LlProjectParameterType.valueOf(((NEnum) javonetHandle.<NObject>get("ParameterType")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSaveDefaultValue (java.lang.Boolean value){ try { javonetHandle.set("SaveDefaultValue",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getSaveDefaultValue (){ try { return javonetHandle.get("SaveDefaultValue");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setCategory (LlProjectParameterCategory value){ try { javonetHandle.set("Category",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlProjectParameterCategory getCategory (){ try { return LlProjectParameterCategory.valueOf(((NEnum) javonetHandle.<NObject>get("Category")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setValue (java.lang.String value){ try { javonetHandle.set("Value",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getValue (){ try { return  (java.lang.String) javonetHandle.get("Value");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getEvaluatedValue (){ try { return  (java.lang.String) javonetHandle.get("EvaluatedValue");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public ProjectParameter(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.String ValueFromProjectFile (java.lang.String projectFile){ try { return  (java.lang.String) javonetHandle.invoke("ValueFromProjectFile",projectFile);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}