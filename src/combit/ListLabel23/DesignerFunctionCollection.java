package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Collections.*;
import combit.ListLabel23.*;
import combit.ListLabel23.DesignerExtensions.*;public class DesignerFunctionCollection extends CollectionBase {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void set_Item (java.lang.Integer index,IDesignerFunction value){ try { javonetHandle.invoke("set_Item",index,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public IDesignerFunction get_Item (java.lang.Integer index){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("get_Item",index));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public DesignerFunctionCollection (){  super((NObject) null); try {  javonetHandle = Javonet.New("DesignerFunctionCollection"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DesignerFunctionCollection(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Integer Add (IDesignerFunction value){ try { return javonetHandle.invoke("Add",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public void AddRange (IDesignerFunction[] value){ try { javonetHandle.invoke("AddRange",new Object[] {value});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddRange (DesignerFunctionCollection value){ try { javonetHandle.invoke("AddRange",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean Contains (IDesignerFunction value){ try { return javonetHandle.invoke("Contains",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void CopyTo (IDesignerFunction[] array,java.lang.Integer index){ try { javonetHandle.invoke("CopyTo",new Object[] {array},index);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Integer IndexOf (IDesignerFunction value){ try { return javonetHandle.invoke("IndexOf",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public void Insert (java.lang.Integer index,IDesignerFunction value){ try { javonetHandle.invoke("Insert",index,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public DesignerFunctionEnumerator DesignerFunctionCollection___GetEnumerator (){ try { return new DesignerFunctionEnumerator((NObject)javonetHandle.invoke("GetEnumerator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void Remove (IDesignerFunction value){ try { javonetHandle.invoke("Remove",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public static class DesignerFunctionEnumerator implements IEnumerator {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public IDesignerFunction getCurrent (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("Current"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public DesignerFunctionEnumerator (DesignerFunctionCollection mappings){ try {  javonetHandle = Javonet.New("DesignerFunctionEnumerator",mappings);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DesignerFunctionEnumerator(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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
            public NObject get_Current (){ try { return  (NObject) javonetHandle.invoke("get_Current");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }}	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}