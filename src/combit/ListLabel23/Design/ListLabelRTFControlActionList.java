package combit.ListLabel23.Design;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.ComponentModel.Design.*;
import combit.ListLabel23.Design.*;
import combit.ListLabel23.*;
import jio.System.ComponentModel.*;public class ListLabelRTFControlActionList extends DesignerActionList {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setParentComponent (ListLabel value){ try { javonetHandle.set("ParentComponent",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public ListLabel getParentComponent (){ try { return new ListLabel((NObject)javonetHandle.<NObject>get("ParentComponent"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setTextMode (LlRTFTextMode value){ try { javonetHandle.set("TextMode",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlRTFTextMode getTextMode (){ try { return LlRTFTextMode.valueOf(((NEnum) javonetHandle.<NObject>get("TextMode")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public ListLabelRTFControlActionList (IComponent component){  super((NObject) null); try {  javonetHandle = Javonet.New("ListLabelRTFControlActionList",component); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ListLabelRTFControlActionList(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public DesignerActionItemCollection GetSortedActionItems (){ try { return new DesignerActionItemCollection((NObject)javonetHandle.invoke("GetSortedActionItems"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}