package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;
import jio.System.Collections.*;
import jio.System.*;public class CollectionEnumerator<T> implements IEnumerator {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public T get_Current (Class<?> returnType){ try { return (T)Convert(javonetHandle.generic(getReturnObjectName(returnType)).invoke("get_Current"), returnType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public CollectionEnumerator(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Object Reset (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("Reset"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Object MoveNext (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("MoveNext"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public NObject get_Current (){ try { return  (NObject) javonetHandle.invoke("get_Current");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}