package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.*;
import jio.System.Drawing.*;public class DrawProjectEventArgs extends EventArgs implements IDisposable {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public LlProjectStruct getCallbackData (){ try { return javonetHandle.<NObject>get("CallbackData");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public Graphics getGraphics (){ try { return new Graphics((NObject)javonetHandle.<NObject>get("Graphics"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public Rectangle getClipRectangle (){ try { return javonetHandle.<NObject>get("ClipRectangle");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getIsBeforePaint (){ try { return javonetHandle.get("IsBeforePaint");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getIsDesignerPreview (){ try { return javonetHandle.get("IsDesignerPreview");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public DrawProjectEventArgs (LlProjectStruct callbackData,java.lang.Boolean scale){  super((NObject) null); try {  javonetHandle = Javonet.New("DrawProjectEventArgs",callbackData,scale); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DrawProjectEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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