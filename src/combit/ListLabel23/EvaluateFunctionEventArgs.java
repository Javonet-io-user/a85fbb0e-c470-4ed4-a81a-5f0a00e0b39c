package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.*;public class EvaluateFunctionEventArgs extends EventArgs {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setResultType (LlParamType value){ try { javonetHandle.set("ResultType",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlParamType getResultType (){ try { return LlParamType.valueOf(((NEnum) javonetHandle.<NObject>get("ResultType")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setDecimalPositions (java.lang.Integer value){ try { javonetHandle.set("DecimalPositions",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getDecimalPositions (){ try { return javonetHandle.get("DecimalPositions");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getParameters (){ try { return javonetHandle.get("Parameters");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public NObject getParameter1 (){ try { return  (NObject) javonetHandle.<NObject>get("Parameter1");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public NObject getParameter2 (){ try { return  (NObject) javonetHandle.<NObject>get("Parameter2");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public NObject getParameter3 (){ try { return  (NObject) javonetHandle.<NObject>get("Parameter3");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public NObject getParameter4 (){ try { return  (NObject) javonetHandle.<NObject>get("Parameter4");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setResultValue (NObject value){ try { javonetHandle.set("ResultValue",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public NObject getResultValue (){ try { return  (NObject) javonetHandle.<NObject>get("ResultValue");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.String getFunctionName (){ try { return  (java.lang.String) javonetHandle.get("FunctionName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public EvaluateFunctionEventArgs (LlParamType resultType,java.lang.Integer decimalPositions,java.lang.Integer parameters,NObject parameter1,NObject parameter2,NObject parameter3,NObject parameter4,java.lang.String functionName){  super((NObject) null); try {  javonetHandle = Javonet.New("EvaluateFunctionEventArgs",NEnum.fromJavaEnum(resultType),decimalPositions,parameters,parameter1,parameter2,parameter3,parameter4,functionName); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public EvaluateFunctionEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}