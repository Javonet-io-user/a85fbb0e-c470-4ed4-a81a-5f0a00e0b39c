package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.*;
import jio.System.Collections.*;
import jio.System.Data.*;public class ChartFieldCollection extends ElementBaseCollection implements IDictionary {protected NObject javonetHandle; public ChartFieldCollection (ListLabel ll){  super((NObject) null); try {  javonetHandle = Javonet.New("ChartFieldCollection",ll); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ChartFieldCollection(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public ElementBaseEnumerator GetEnumerator (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetEnumerator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void Clear (){ try { javonetHandle.invoke("Clear");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromEnumerable (IEnumerable value){ try { javonetHandle.invoke("AddFromEnumerable",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromEnumerable (IEnumerable value,java.lang.Boolean designMode){ try { javonetHandle.invoke("AddFromEnumerable",value,designMode);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromEnumerable (java.lang.String namePrefix,IEnumerable value){ try { javonetHandle.invoke("AddFromEnumerable",namePrefix,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromEnumerable (java.lang.String namePrefix,IEnumerable value,java.lang.Boolean designMode){ try { javonetHandle.invoke("AddFromEnumerable",namePrefix,value,designMode);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromEnumerable (java.lang.String namePrefix,IEnumerable value,java.lang.Boolean designMode,LlDeclareChartRow chartType){ try { javonetHandle.invoke("AddFromEnumerable",namePrefix,value,designMode,NEnum.fromJavaEnum(chartType));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromDataTable (DataTable value){ try { javonetHandle.invoke("AddFromDataTable",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromDataTable (DataTable value,java.lang.Boolean designMode){ try { javonetHandle.invoke("AddFromDataTable",value,designMode);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromDataTable (java.lang.String namePrefix,DataTable value){ try { javonetHandle.invoke("AddFromDataTable",namePrefix,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromDataTable (java.lang.String namePrefix,DataTable value,java.lang.Boolean designMode){ try { javonetHandle.invoke("AddFromDataTable",namePrefix,value,designMode);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromDataTable (java.lang.String namePrefix,DataTable value,java.lang.Boolean designMode,LlDeclareChartRow chartType){ try { javonetHandle.invoke("AddFromDataTable",namePrefix,value,designMode,NEnum.fromJavaEnum(chartType));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}