package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class CollectionUserVariables extends DomCollectionBase {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public UserVariable get_Item (java.lang.Integer index){ try { return new UserVariable((NObject)javonetHandle.invoke("get_Item",index));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public UserVariable get_Item (java.lang.String variableName){ try { return new UserVariable((NObject)javonetHandle.invoke("get_Item",variableName));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public CollectionUserVariables(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public CollectionEnumerator<UserVariable> GetEnumerator (){ try { return new CollectionEnumerator<UserVariable>((NObject)javonetHandle.invoke("GetEnumerator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public UserVariable AddNew (){ try { return new UserVariable((NObject)javonetHandle.invoke("AddNew"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public UserVariable AddNew (java.lang.String name,java.lang.String contents){ try { return new UserVariable((NObject)javonetHandle.invoke("AddNew",name,contents));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}