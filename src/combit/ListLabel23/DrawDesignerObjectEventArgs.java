package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.*;
import jio.System.Drawing.*;public class DrawDesignerObjectEventArgs extends EventArgs implements IDisposable {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public Graphics getGraphics (){ try { return new Graphics((NObject)javonetHandle.<NObject>get("Graphics"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setClipRectangle (Rectangle value){ try { javonetHandle.set("ClipRectangle",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Rectangle getClipRectangle (){ try { return javonetHandle.<NObject>get("ClipRectangle");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setPrintFinished (java.lang.Boolean value){ try { javonetHandle.set("PrintFinished",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getPrintFinished (){ try { return javonetHandle.get("PrintFinished");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getIsDesignMode (){ try { return javonetHandle.get("IsDesignMode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public DrawDesignerObjectEventArgs (java.lang.Integer hDC,java.lang.Integer refhDC,Rectangle clipRectangle,java.lang.Boolean printFinished,java.lang.Boolean isDesignMode,java.lang.Boolean scale){  super((NObject) null); try {  javonetHandle = Javonet.New("DrawDesignerObjectEventArgs",hDC,refhDC,clipRectangle,printFinished,isDesignMode,scale); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DrawDesignerObjectEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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