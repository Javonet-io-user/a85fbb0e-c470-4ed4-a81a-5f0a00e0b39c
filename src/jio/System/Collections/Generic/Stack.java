package jio.System.Collections.Generic;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Collections.Generic.*;
import jio.System.Collections.*;
import jio.System.*;public class Stack<T> implements jio.System.Collections.IEnumerable,jio.System.Collections.ICollection {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.Integer getCount (){ try { return javonetHandle.get("Count");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }public Stack (){ try {  javonetHandle = Javonet.New("Stack");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Stack (java.lang.Integer capacity){ try {  javonetHandle = Javonet.New("Stack",capacity);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Stack (jio.System.Collections.Generic.IEnumerable<T> collection){ try {  javonetHandle = Javonet.New("Stack",collection);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Stack(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Clear (){ try { javonetHandle.invoke("Clear");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean Contains (T item){ try { return javonetHandle.generic(getGetObjectName(item)).invoke("Contains",item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void CopyTo (T[] array,java.lang.Integer arrayIndex){ try { javonetHandle.generic(getGetObjectName(array)).invoke("CopyTo",new Object[] {array},arrayIndex);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Object GetEnumerator (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetEnumerator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void TrimExcess (){ try { javonetHandle.invoke("TrimExcess");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public T Peek (Class<?> returnType){ try { return (T)Convert(javonetHandle.generic(getReturnObjectName(returnType)).invoke("Peek"), returnType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public T Pop (Class<?> returnType){ try { return (T)Convert(javonetHandle.generic(getReturnObjectName(returnType)).invoke("Pop"), returnType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void Push (T item){ try { javonetHandle.generic(getGetObjectName(item)).invoke("Push",item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public T[] ToArray (Class<?> returnType){ try { return (T[])Convert(javonetHandle.generic(getReturnObjectName(returnType)).invoke("ToArray"), returnType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void CopyTo (java.lang.reflect.Array array,java.lang.Integer arrayIndex){ try { javonetHandle.invoke("CopyTo",array,arrayIndex);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public NObject get_SyncRoot (){ try { return  (NObject) javonetHandle.invoke("get_SyncRoot");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Boolean get_IsSynchronized (){ try { return javonetHandle.invoke("get_IsSynchronized");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public static class Enumerator<T> extends ValueType implements IDisposable,jio.System.Collections.IEnumerator {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public T get_Current (Class<?> returnType){ try { return (T)Convert(javonetHandle.generic(getReturnObjectName(returnType)).invoke("get_Current"), returnType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public Enumerator(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Dispose (){ try { javonetHandle.invoke("Dispose");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean MoveNext (){ try { return javonetHandle.invoke("MoveNext");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public NObject get_Current (){ try { return  (NObject) javonetHandle.invoke("get_Current");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void Reset (){ try { javonetHandle.invoke("Reset");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }}	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}