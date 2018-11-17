package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.*;
import jio.System.Drawing.*;public class DrawTableFieldEventArgs extends EventArgs implements IDisposable {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public LlTableField getCallbackData (){ try { return javonetHandle.<NObject>get("CallbackData");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public Graphics getGraphics (){ try { return new Graphics((NObject)javonetHandle.<NObject>get("Graphics"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public Rectangle getClipRectangle (){ try { return javonetHandle.<NObject>get("ClipRectangle");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public LlTableLineType getLineType (){ try { return LlTableLineType.valueOf(((NEnum) javonetHandle.<NObject>get("LineType")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getFieldIndex (){ try { return javonetHandle.get("FieldIndex");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getLineDefinition (){ try { return javonetHandle.get("LineDefinition");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public Rectangle getSpacing (){ try { return javonetHandle.<NObject>get("Spacing");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.String getContents (){ try { return  (java.lang.String) javonetHandle.get("Contents");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public DrawTableFieldEventArgs (LlTableField callbackData,java.lang.Boolean scale){  super((NObject) null); try {  javonetHandle = Javonet.New("DrawTableFieldEventArgs",callbackData,scale); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DrawTableFieldEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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