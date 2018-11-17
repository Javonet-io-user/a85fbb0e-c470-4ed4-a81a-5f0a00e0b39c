package combit.ListLabel23.Design;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Drawing.Design.*;
import combit.ListLabel23.Design.*;
import jio.System.ComponentModel.*;
import jio.System.*;public class IconIdEditor extends UITypeEditor implements IDisposable {protected NObject javonetHandle; public IconIdEditor (){  super((NObject) null); try {  javonetHandle = Javonet.New("IconIdEditor"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public IconIdEditor(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Boolean GetPaintValueSupported (ITypeDescriptorContext context){ try { return javonetHandle.invoke("GetPaintValueSupported",context);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void PaintValue (PaintValueEventArgs e){ try { javonetHandle.invoke("PaintValue",e);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public UITypeEditorEditStyle GetEditStyle (ITypeDescriptorContext context){ try { return UITypeEditorEditStyle.valueOf(((NEnum) javonetHandle.invoke("GetEditStyle",context)).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public NObject EditValue (ITypeDescriptorContext context,IServiceProvider provider,NObject value){ try { return  (NObject) javonetHandle.invoke("EditValue",context,provider,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void Dispose (){ try { javonetHandle.invoke("Dispose");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}