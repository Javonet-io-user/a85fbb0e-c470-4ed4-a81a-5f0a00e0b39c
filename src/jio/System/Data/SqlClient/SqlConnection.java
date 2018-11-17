package jio.System.Data.SqlClient;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Data.Common.*;
import jio.System.Data.SqlClient.*;
import jio.System.Data.*;
import jio.System.*;public class SqlConnection extends DbConnection implements IDbConnection,ICloneable {protected NObject javonetHandle; public SqlConnection (java.lang.String connectionString){  super((NObject) null); try {  javonetHandle = Javonet.New("SqlConnection",connectionString); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SqlConnection (java.lang.String connectionString,SqlCredential credential){  super((NObject) null); try {  javonetHandle = Javonet.New("SqlConnection",connectionString,credential); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SqlConnection (){  super((NObject) null); try {  javonetHandle = Javonet.New("SqlConnection"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SqlConnection(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public NObject Clone (){ try { return  (NObject) javonetHandle.invoke("Clone");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}