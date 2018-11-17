package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.*;
import combit.ListLabel23.DataProviders.*;public class DefineDatastructureEventArgs extends EventArgs {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setHandled (java.lang.Boolean value){ try { javonetHandle.set("Handled",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getHandled (){ try { return javonetHandle.get("Handled");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public IDataProvider getDataSource (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("DataSource"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public LlCore getLlCore (){ try { return new LlCore((NObject)javonetHandle.<NObject>get("LlCore"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getIsDesignMode (){ try { return javonetHandle.get("IsDesignMode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public DefineDatastructureEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}