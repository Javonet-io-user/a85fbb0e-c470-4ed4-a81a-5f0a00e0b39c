package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.*;
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;public abstract class ListLabelLocalizationHelperBase implements ITranslationList,IQueryableTranslationList,jio.System.Collections.IEnumerable {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public jio.System.Collections.Generic.IEnumerable<java.lang.Integer> getLCIDs (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("LCIDs"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public UniqueValueDictionary<java.lang.String,java.lang.String> get_Item (java.lang.Integer LCID){ try { return new UniqueValueDictionary<java.lang.String,java.lang.String>((NObject)javonetHandle.invoke("get_Item",LCID));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getEmpty (){ try { return javonetHandle.get("Empty");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public ListLabelLocalizationHelperBase(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Object GetEnumerator (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetEnumerator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void Add (java.lang.String itemName,java.lang.String itemDisplayName){ try { javonetHandle.invoke("Add",itemName,itemDisplayName);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String itemName,java.lang.String itemDisplayName,java.lang.Integer LCID){ try { javonetHandle.invoke("Add",itemName,itemDisplayName,LCID);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean Contains (java.lang.String itemName){ try { return javonetHandle.invoke("Contains",itemName);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean Contains (java.lang.String itemName,java.lang.Integer LCID){ try { return javonetHandle.invoke("Contains",itemName,LCID);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void Clear (){ try { javonetHandle.invoke("Clear");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.String GetItemDisplayName (java.lang.String itemName,java.lang.Boolean returnItemIfNotFound,java.lang.Integer LCID){ try { return  (java.lang.String) javonetHandle.invoke("GetItemDisplayName",itemName,returnItemIfNotFound,LCID);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public java.lang.String GetItemDisplayName (java.lang.String itemName,java.lang.Boolean returnItemIfNotFound){ try { return  (java.lang.String) javonetHandle.invoke("GetItemDisplayName",itemName,returnItemIfNotFound);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public java.lang.String GetItemDisplayName (java.lang.String itemName){ try { return  (java.lang.String) javonetHandle.invoke("GetItemDisplayName",itemName);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public jio.System.Collections.Generic.ICollection<KeyValuePair<java.lang.String,java.lang.String>> get_Item (java.lang.Integer lcid){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("get_Item",lcid));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}