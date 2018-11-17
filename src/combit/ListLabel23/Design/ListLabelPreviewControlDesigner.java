package combit.ListLabel23.Design;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Windows.Forms.Design.*;
import combit.ListLabel23.Design.*;
import jio.System.ComponentModel.Design.*;public class ListLabelPreviewControlDesigner extends ControlDesigner {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public DesignerActionListCollection getActionLists (){ try { return new DesignerActionListCollection((NObject)javonetHandle.<NObject>get("ActionLists"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public ListLabelPreviewControlDesigner (){  super((NObject) null); try {  javonetHandle = Javonet.New("ListLabelPreviewControlDesigner"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ListLabelPreviewControlDesigner(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}