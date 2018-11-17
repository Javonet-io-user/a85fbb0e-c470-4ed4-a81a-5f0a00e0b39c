package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;
import combit.ListLabel23.*;public class CollectionProjectParameters extends DomCollectionBase {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public ProjectParameter get_Item (java.lang.Integer index){ try { return new ProjectParameter((NObject)javonetHandle.invoke("get_Item",index));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public ProjectParameter get_Item (java.lang.String itemName){ try { return new ProjectParameter((NObject)javonetHandle.invoke("get_Item",itemName));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public ProjectParameter get_Item (LlProjectParameter parameter){ try { return new ProjectParameter((NObject)javonetHandle.invoke("get_Item",NEnum.fromJavaEnum(parameter)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public CollectionProjectParameters(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public CollectionEnumerator<ProjectParameter> GetEnumerator (){ try { return new CollectionEnumerator<ProjectParameter>((NObject)javonetHandle.invoke("GetEnumerator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}