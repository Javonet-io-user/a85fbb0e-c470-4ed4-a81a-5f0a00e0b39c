package combit.ListLabel23.DesignerExtensions;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DesignerExtensions.*;
import jio.System.Drawing.*;public class ColorDesignerProperty extends DesignerProperty {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public Color getColorDesignerPropertyColorDesignerPropertyValue (){ try { return javonetHandle.<NObject>get("ColorDesignerPropertyColorDesignerPropertyValue");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setget_ColorDesignerPropertyColorDesignerPropertyDefaultValue (Color value){ try { javonetHandle.set("get_ColorDesignerPropertyColorDesignerPropertyDefaultValue",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Color getColorDesignerPropertyColorDesignerPropertyDefaultValue (){ try { return javonetHandle.<NObject>get("ColorDesignerPropertyColorDesignerPropertyDefaultValue");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public ColorDesignerProperty (java.lang.String name,Color defaultValue){  super((NObject) null); try {  javonetHandle = Javonet.New("ColorDesignerProperty",name,defaultValue); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ColorDesignerProperty(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}