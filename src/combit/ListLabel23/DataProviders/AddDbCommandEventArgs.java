package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.DataProviders.*;
import jio.System.Data.*;public class AddDbCommandEventArgs extends EventArgs {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.String getTableName (){ try { return  (java.lang.String) javonetHandle.get("TableName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public IDbCommand getDbCommand (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("DbCommand"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public AddDbCommandEventArgs (IDbCommand dbCommand,java.lang.String tableName){  super((NObject) null); try {  javonetHandle = Javonet.New("AddDbCommandEventArgs",dbCommand,tableName); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public AddDbCommandEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}