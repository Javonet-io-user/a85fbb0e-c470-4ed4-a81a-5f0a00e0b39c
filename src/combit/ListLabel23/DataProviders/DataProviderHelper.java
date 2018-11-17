package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DataProviders.*;
import jio.System.*;
import combit.ListLabel23.*;
import jio.System.Data.*;public class DataProviderHelper {protected NObject javonetHandle; public DataProviderHelper (){ try {  javonetHandle = Javonet.New("DataProviderHelper");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataProviderHelper(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static Class GetSQLiteConnectionType (){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("DataProviderHelper").invoke("GetSQLiteConnectionType"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static void LogDataTableStructure (ILlLogger logger,DataTable dataTable){ try { Javonet.getType("DataProviderHelper").invoke("LogDataTableStructure",logger,dataTable);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}