package jio.System.Data.Common;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.ComponentModel.*;
import jio.System.Data.*;
import jio.System.Data.Common.*;public abstract class DbConnection extends Component implements IDbConnection {protected NObject javonetHandle; public DbConnection(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public IDbTransaction BeginTransaction (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("BeginTransaction"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public IDbTransaction BeginTransaction (IsolationLevel isolationLevel){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("BeginTransaction",NEnum.fromJavaEnum(isolationLevel)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public IDbCommand CreateCommand (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("CreateCommand"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}