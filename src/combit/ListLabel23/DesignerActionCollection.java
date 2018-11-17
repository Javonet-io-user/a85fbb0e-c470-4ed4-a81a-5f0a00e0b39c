package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Collections.*;
import combit.ListLabel23.*;public class DesignerActionCollection extends CollectionBase {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void set_Item (java.lang.Integer index,DesignerAction value){ try { javonetHandle.invoke("set_Item",index,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public DesignerAction get_Item (java.lang.Integer index){ try { return new DesignerAction((NObject)javonetHandle.invoke("get_Item",index));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public DesignerActionCollection (){  super((NObject) null); try {  javonetHandle = Javonet.New("DesignerActionCollection"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DesignerActionCollection(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Integer Add (DesignerAction value){ try { return javonetHandle.invoke("Add",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public void AddRange (DesignerAction[] value){ try { javonetHandle.invoke("AddRange",new Object[] {value});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddRange (DesignerActionCollection value){ try { javonetHandle.invoke("AddRange",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean Contains (DesignerAction value){ try { return javonetHandle.invoke("Contains",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void CopyTo (DesignerAction[] array,java.lang.Integer index){ try { javonetHandle.invoke("CopyTo",new Object[] {array},index);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Integer IndexOf (DesignerAction value){ try { return javonetHandle.invoke("IndexOf",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public void Insert (java.lang.Integer index,DesignerAction value){ try { javonetHandle.invoke("Insert",index,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public DesignerActionEnumerator DesignerActionCollection___GetEnumerator (){ try { return new DesignerActionEnumerator((NObject)javonetHandle.invoke("GetEnumerator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void Remove (DesignerAction value){ try { javonetHandle.invoke("Remove",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public static class DesignerActionEnumerator implements IEnumerator {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public DesignerAction getCurrent (){ try { return new DesignerAction((NObject)javonetHandle.<NObject>get("Current"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public DesignerActionEnumerator (DesignerActionCollection mappings){ try {  javonetHandle = Javonet.New("DesignerActionEnumerator",mappings);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DesignerActionEnumerator(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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