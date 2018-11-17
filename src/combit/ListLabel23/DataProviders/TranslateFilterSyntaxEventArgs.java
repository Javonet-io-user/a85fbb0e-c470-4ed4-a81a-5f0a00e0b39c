package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.DataProviders.*;
import combit.ListLabel23.*;public class TranslateFilterSyntaxEventArgs extends EventArgs {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public LlExpressionPart getPart (){ try { return LlExpressionPart.valueOf(((NEnum) javonetHandle.<NObject>get("Part")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getArgumentCount (){ try { return javonetHandle.get("ArgumentCount");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public NObject getName (){ try { return  (NObject) javonetHandle.<NObject>get("Name");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public NObject[] getArguments (){ try { return Helper.ConvertNObjectToDestinationType((NObject[])javonetHandle.<NObject>get("Arguments"),NObject[].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setResult (NObject value){ try { javonetHandle.set("Result",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public NObject getResult (){ try { return  (NObject) javonetHandle.<NObject>get("Result");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setHandled (java.lang.Boolean value){ try { javonetHandle.set("Handled",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getHandled (){ try { return javonetHandle.get("Handled");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public TranslateFilterSyntaxEventArgs (LlExpressionPart part,java.lang.Integer argumentCount,NObject name,NObject[] arguments,NObject result){  super((NObject) null); try {  javonetHandle = Javonet.New("TranslateFilterSyntaxEventArgs",NEnum.fromJavaEnum(part),argumentCount,name,new Object[] {arguments},result); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public TranslateFilterSyntaxEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}