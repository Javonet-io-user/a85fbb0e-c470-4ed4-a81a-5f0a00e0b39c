package combit.ListLabel23.DesignerExtensions;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DesignerExtensions.*;
import jio.System.Collections.ObjectModel.*;public class DesignerPropertyCollection extends Collection<DesignerProperty> {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.Boolean getHasChanged (){ try { return javonetHandle.get("HasChanged");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public DesignerProperty get_DesignerPropertyCollectionDesignerPropertyCollectionItem (java.lang.String name){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("get_DesignerPropertyCollectionDesignerPropertyCollectionItem",name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public DesignerPropertyCollection(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Integer GetHashCode (){ try { return javonetHandle.invoke("GetHashCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}