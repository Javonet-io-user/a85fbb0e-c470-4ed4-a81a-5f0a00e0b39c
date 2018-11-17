package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DataProviders.*;
import jio.System.Collections.ObjectModel.*;
import jio.System.*;public class CheckNativeAggregateFunctionSyntaxArguments extends ExecuteNativeAggregateFunctionArguments {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setErrorText (java.lang.String value){ try { javonetHandle.set("ErrorText",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getErrorText (){ try { return  (java.lang.String) javonetHandle.get("ErrorText");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public CheckNativeAggregateFunctionSyntaxArguments (NativeAggregateFunction function,java.lang.String tableName,java.lang.String expression,ReadOnlyCollection<java.lang.String> usedIdentifiers,java.lang.Boolean distinct,java.lang.String filter,NObject[] filterParameters,java.lang.String parameter1,java.lang.String parameter2){  super((NObject) null); try {  javonetHandle = Javonet.New("CheckNativeAggregateFunctionSyntaxArguments",NEnum.fromJavaEnum(function),tableName,expression,usedIdentifiers,distinct,filter,new Object[] {filterParameters},parameter1,parameter2); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CheckNativeAggregateFunctionSyntaxArguments(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}