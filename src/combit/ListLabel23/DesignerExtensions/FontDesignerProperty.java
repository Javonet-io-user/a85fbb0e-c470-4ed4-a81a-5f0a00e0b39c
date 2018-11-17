package combit.ListLabel23.DesignerExtensions;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DesignerExtensions.*;
import jio.System.Drawing.*;
import jio.System.*;public class FontDesignerProperty extends DesignerProperty {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public Font getFont (){ try { return new Font((NObject)javonetHandle.<NObject>get("Font"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public Color getColor (){ try { return javonetHandle.<NObject>get("Color");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public FontDesignerProperty (java.lang.String name,NObject defaultValue){  super((NObject) null); try {  javonetHandle = Javonet.New("FontDesignerProperty",name,defaultValue); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public FontDesignerProperty(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public Font GetScaledFont (Graphics g){ try { return new Font((NObject)javonetHandle.invoke("GetScaledFont",g));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}