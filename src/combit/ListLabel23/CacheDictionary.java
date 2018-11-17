package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.*;public class CacheDictionary<TKey,TValue> {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public TValue get_Item (TKey key, Class<?> returnType){ try { return (TValue)Convert(javonetHandle.generic(getGetObjectName(key),getReturnObjectName(returnType)).invoke("get_Item",key), returnType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public CacheDictionary (java.lang.Integer capacity){ try {  javonetHandle = Javonet.New("CacheDictionary",capacity);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CacheDictionary(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Add (TKey key,TValue value){ try { javonetHandle.generic(getGetObjectName(key),getGetObjectName(value)).invoke("Add",key,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean ContainsKey (TKey key){ try { return javonetHandle.generic(getGetObjectName(key)).invoke("ContainsKey",key);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}