package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.*;
import combit.ListLabel23.DataProviders.*;public class DbConnectionDataProviderInitializedEventArgs extends EventArgs {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public DbCommandSetDataProvider getInternalDbCommandSetProvider (){ try { return new DbCommandSetDataProvider((NObject)javonetHandle.<NObject>get("InternalDbCommandSetProvider"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public DbConnectionDataProviderInitializedEventArgs (DbCommandSetDataProvider cmdSetProvider){  super((NObject) null); try {  javonetHandle = Javonet.New("DbConnectionDataProviderInitializedEventArgs",cmdSetProvider); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DbConnectionDataProviderInitializedEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}