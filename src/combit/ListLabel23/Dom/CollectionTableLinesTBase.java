package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public abstract class CollectionTableLinesTBase<T> extends CollectionTableLinesBase {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public T get_Item (java.lang.Integer index, Class<?> returnType){ try { return (T)Convert(javonetHandle.generic(getReturnObjectName(returnType)).invoke("get_Item",index), returnType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public T get_Item (java.lang.String itemName, Class<?> returnType){ try { return (T)Convert(javonetHandle.generic(getReturnObjectName(returnType)).invoke("get_Item",itemName), returnType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public CollectionTableLinesTBase(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public CollectionEnumerator<T> GetEnumerator (){ try { return new CollectionEnumerator<T>((NObject)javonetHandle.invoke("GetEnumerator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}