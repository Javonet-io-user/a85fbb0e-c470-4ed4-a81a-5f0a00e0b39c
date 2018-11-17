package combit.ListLabel23.Design;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.ComponentModel.Design.*;
import combit.ListLabel23.Design.*;
import jio.System.ComponentModel.*;public class ListLabelPreviewControlActionList extends DesignerActionList {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setShowThumbnails (java.lang.Boolean value){ try { javonetHandle.set("ShowThumbnails",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getShowThumbnails (){ try { return javonetHandle.get("ShowThumbnails");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setShowToolbar (java.lang.Boolean value){ try { javonetHandle.set("ShowToolbar",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getShowToolbar (){ try { return javonetHandle.get("ShowToolbar");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setFileName (java.lang.String value){ try { javonetHandle.set("FileName",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFileName (){ try { return  (java.lang.String) javonetHandle.get("FileName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public ListLabelPreviewControlActionList (IComponent component){  super((NObject) null); try {  javonetHandle = Javonet.New("ListLabelPreviewControlActionList",component); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ListLabelPreviewControlActionList(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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