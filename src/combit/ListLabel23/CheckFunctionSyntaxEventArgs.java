package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.*;
import jio.System.*;public class CheckFunctionSyntaxEventArgs extends EvaluateFunctionEventArgs {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setIsValid (java.lang.Boolean value){ try { javonetHandle.set("IsValid",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getIsValid (){ try { return javonetHandle.get("IsValid");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setErrorText (java.lang.String value){ try { javonetHandle.set("ErrorText",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getErrorText (){ try { return  (java.lang.String) javonetHandle.get("ErrorText");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public CheckFunctionSyntaxEventArgs (LlParamType resultType,java.lang.Integer decimalPositions,java.lang.Integer parameters,NObject parameter1,NObject parameter2,NObject parameter3,NObject parameter4,java.lang.String functionName){  super((NObject) null); try {  javonetHandle = Javonet.New("CheckFunctionSyntaxEventArgs",NEnum.fromJavaEnum(resultType),decimalPositions,parameters,parameter1,parameter2,parameter3,parameter4,functionName); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CheckFunctionSyntaxEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}