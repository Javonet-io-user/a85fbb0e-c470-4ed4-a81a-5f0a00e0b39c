package jio.System;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import jio.System.Collections.*;
import jio.System.Runtime.CompilerServices.*;public class Tuple<T1,T2> implements IStructuralEquatable,IStructuralComparable,IComparable,ITuple {protected NObject javonetHandle; /**
	 * GenericConstructor
	 */
            public Tuple (T1 item1,T2 item2) { try { javonetHandle = Javonet.getType(this.getClass().getName(),getGetObjectName(item1),getGetObjectName(item2)).create();} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Tuple(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Boolean Equals (NObject other,IEqualityComparer comparer){ try { return javonetHandle.invoke("Equals",other,comparer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Integer GetHashCode (IEqualityComparer comparer){ try { return javonetHandle.invoke("GetHashCode",comparer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer CompareTo (NObject other,IComparer comparer){ try { return javonetHandle.invoke("CompareTo",other,comparer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer CompareTo (NObject obj){ try { return javonetHandle.invoke("CompareTo",obj);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer get_Length (){ try { return javonetHandle.invoke("get_Length");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public NObject get_Item (java.lang.Integer index){ try { return  (NObject) javonetHandle.invoke("get_Item",index);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}