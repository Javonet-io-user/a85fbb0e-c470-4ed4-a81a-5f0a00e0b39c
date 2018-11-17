package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.*;public class BeforeProjectImportEventArgs extends EventArgs {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.Integer getDesignerWindowHandle (){ try { return javonetHandle.<NObject>get("DesignerWindowHandle");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getLanguageLCID (){ try { return javonetHandle.get("LanguageLCID");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setFilepathForImport (java.lang.String value){ try { javonetHandle.set("FilepathForImport",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFilepathForImport (){ try { return  (java.lang.String) javonetHandle.get("FilepathForImport");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setCancelImport (java.lang.Boolean value){ try { javonetHandle.set("CancelImport",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getCancelImport (){ try { return javonetHandle.get("CancelImport");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public BeforeProjectImportEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}