package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.*;
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;public class UniqueValueDictionary<TKey,TValue> implements jio.System.Collections.IEnumerable {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void set_Item (TKey key,TValue value){ try { javonetHandle.generic(getGetObjectName(key),getGetObjectName(value)).invoke("set_Item",key,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public TValue get_Item (TKey key, Class<?> returnType){ try { return (TValue)Convert(javonetHandle.generic(getGetObjectName(key),getReturnObjectName(returnType)).invoke("get_Item",key), returnType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getCount (){ try { return javonetHandle.get("Count");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getIsReadOnly (){ try { return javonetHandle.get("IsReadOnly");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public jio.System.Collections.Generic.ICollection<TKey> getKeys (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("Keys"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public jio.System.Collections.Generic.ICollection<TValue> getValues (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("Values"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public UniqueValueDictionary (ILlLogger logger){ try {  javonetHandle = Javonet.New("UniqueValueDictionary",logger);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public UniqueValueDictionary(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Add (KeyValuePair<TKey,TValue> item){ try { javonetHandle.invoke("Add",item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (TKey key,TValue value){ try { javonetHandle.generic(getGetObjectName(key),getGetObjectName(value)).invoke("Add",key,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Clear (){ try { javonetHandle.invoke("Clear");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean Contains (KeyValuePair<TKey,TValue> item){ try { return javonetHandle.invoke("Contains",item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean ContainsKey (TKey key){ try { return javonetHandle.generic(getGetObjectName(key)).invoke("ContainsKey",key);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void CopyTo (KeyValuePair[] array,java.lang.Integer arrayIndex){ try { javonetHandle.invoke("CopyTo",new Object[] {array},arrayIndex);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Object GetEnumerator (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetEnumerator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Boolean Remove (KeyValuePair<TKey,TValue> item){ try { return javonetHandle.invoke("Remove",item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean Remove (TKey key){ try { return javonetHandle.generic(getGetObjectName(key)).invoke("Remove",key);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean TryGetValue (TKey key,TValue value){ try { return javonetHandle.generic(getGetObjectName(key),getGetObjectName(value)).invoke("TryGetValue",key,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}