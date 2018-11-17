package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.*;
import jio.System.Collections.ObjectModel.*;
import jio.System.*;
import jio.System.Collections.*;public class ExpressionEvaluator implements IDisposable {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public VariableCollection getVariables (){ try { return new VariableCollection((NObject)javonetHandle.<NObject>get("Variables"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public ExpressionEvaluator (){ try {  javonetHandle = Javonet.New("ExpressionEvaluator");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ExpressionEvaluator (ListLabel LL){ try {  javonetHandle = Javonet.New("ExpressionEvaluator",LL);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ExpressionEvaluator (ListLabel LL,IDictionary variables){ try {  javonetHandle = Javonet.New("ExpressionEvaluator",LL,variables);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ExpressionEvaluator (IDictionary variables){ try {  javonetHandle = Javonet.New("ExpressionEvaluator",variables);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ExpressionEvaluator(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.String EditExpression (java.lang.String defaultExpression,java.lang.String title,LlFieldType returnType){ try { return  (java.lang.String) javonetHandle.invoke("EditExpression",defaultExpression,title,NEnum.fromJavaEnum(returnType));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public java.lang.String EditExpression (java.lang.String defaultExpression,java.lang.String title){ try { return  (java.lang.String) javonetHandle.invoke("EditExpression",defaultExpression,title);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public ReadOnlyCollection<java.lang.String> GetUsedIdentifiers (java.lang.String expression,java.lang.Boolean orginalName){ try { return new ReadOnlyCollection<java.lang.String>((NObject)javonetHandle.invoke("GetUsedIdentifiers",expression,orginalName));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ReadOnlyCollection<java.lang.String> GetUsedIdentifiers (java.lang.String expression){ try { return new ReadOnlyCollection<java.lang.String>((NObject)javonetHandle.invoke("GetUsedIdentifiers",expression));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public NObject Evaluate (java.lang.String expression){ try { return  (NObject) javonetHandle.invoke("Evaluate",expression);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void Dispose (){ try { javonetHandle.invoke("Dispose");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}