package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.*;public class DesignerFunctionParameter {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setType (LlParamType value){ try { javonetHandle.set("Type",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlParamType getType (){ try { return LlParamType.valueOf(((NEnum) javonetHandle.<NObject>get("Type")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setDescription (java.lang.String value){ try { javonetHandle.set("Description",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDescription (){ try { return  (java.lang.String) javonetHandle.get("Description");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public DesignerFunctionParameter (){ try {  javonetHandle = Javonet.New("DesignerFunctionParameter");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DesignerFunctionParameter (java.lang.String description){ try {  javonetHandle = Javonet.New("DesignerFunctionParameter",description);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DesignerFunctionParameter(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}