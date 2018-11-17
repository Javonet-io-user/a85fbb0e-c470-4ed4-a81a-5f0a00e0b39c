package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DataProviders.*;
import jio.System.Collections.ObjectModel.*;
import jio.System.*;public class ExecuteNativeAggregateFunctionArguments {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public NativeAggregateFunction getFunction (){ try { return NativeAggregateFunction.valueOf(((NEnum) javonetHandle.<NObject>get("Function")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.String getTableName (){ try { return  (java.lang.String) javonetHandle.get("TableName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getExpression (){ try { return  (java.lang.String) javonetHandle.get("Expression");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public ReadOnlyCollection<java.lang.String> getUsedIdentifiers (){ try { return new ReadOnlyCollection<java.lang.String>((NObject)javonetHandle.<NObject>get("UsedIdentifiers"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.String getFilter (){ try { return  (java.lang.String) javonetHandle.get("Filter");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public NObject[] getFilterParameters (){ try { return Helper.ConvertNObjectToDestinationType((NObject[])javonetHandle.<NObject>get("FilterParameters"),NObject[].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getDistinct (){ try { return javonetHandle.get("Distinct");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public java.lang.String getParameter1 (){ try { return  (java.lang.String) javonetHandle.get("Parameter1");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getParameter2 (){ try { return  (java.lang.String) javonetHandle.get("Parameter2");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getCurrentId (){ try { return  (java.lang.String) javonetHandle.get("CurrentId");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public ExecuteNativeAggregateFunctionArguments (NativeAggregateFunction function,java.lang.String tableName,java.lang.String expression,ReadOnlyCollection<java.lang.String> usedIdentifiers,java.lang.Boolean distinct,java.lang.String filter,NObject[] filterParameters,java.lang.String parameter1,java.lang.String parameter2,java.lang.String currentId){ try {  javonetHandle = Javonet.New("ExecuteNativeAggregateFunctionArguments",NEnum.fromJavaEnum(function),tableName,expression,usedIdentifiers,distinct,filter,new Object[] {filterParameters},parameter1,parameter2,currentId);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ExecuteNativeAggregateFunctionArguments(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}