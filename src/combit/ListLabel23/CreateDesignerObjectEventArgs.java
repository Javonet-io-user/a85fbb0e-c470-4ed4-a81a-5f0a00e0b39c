package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.*;
import jio.System.Windows.Forms.*;public class CreateDesignerObjectEventArgs extends EventArgs implements IDisposable {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public IWin32Window getDesignerWindow (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("DesignerWindow"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setCreated (java.lang.Boolean value){ try { javonetHandle.set("Created",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getCreated (){ try { return javonetHandle.get("Created");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public CreateDesignerObjectEventArgs (java.lang.Integer hWnd){  super((NObject) null); try {  javonetHandle = Javonet.New("CreateDesignerObjectEventArgs",hWnd); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CreateDesignerObjectEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Dispose (){ try { javonetHandle.invoke("Dispose");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}