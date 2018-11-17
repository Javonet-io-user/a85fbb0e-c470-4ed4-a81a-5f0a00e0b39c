package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.*;
import jio.System.*;
import jio.System.Drawing.*;
import jio.System.Drawing.Imaging.*;
import jio.System.IO.*;
import jio.System.Collections.Specialized.*;
import jio.System.Collections.*;
import jio.System.Data.*;
import combit.ListLabel23.DataProviders.*;public abstract class ElementBaseCollection implements IDictionary,ICollection,IEnumerable,IDisposable {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.Integer getCount (){ try { return javonetHandle.get("Count");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public ICollection getKeys (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("Keys"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void set_Item (java.lang.String name,NObject value){ try { javonetHandle.invoke("set_Item",name,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public NObject get_Item (java.lang.String name){ try { return  (NObject) javonetHandle.invoke("get_Item",name);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public ElementBaseCollection(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Dispose (){ try { javonetHandle.invoke("Dispose");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Clear (){ try { javonetHandle.invoke("Clear");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean Contains (java.lang.String name){ try { return javonetHandle.invoke("Contains",name);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Object GetEnumerator (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetEnumerator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void Add (java.lang.String name,java.lang.String value){ try { javonetHandle.invoke("Add",name,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String name,java.lang.Character[] value){ try { javonetHandle.invoke("Add",name,new Object[] {value});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String name,jio.System.Text.StringBuilder value){ try { javonetHandle.invoke("Add",name,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String name,java.lang.Short value){ try { javonetHandle.invoke("Add",name,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String name,java.lang.Integer value){ try { javonetHandle.invoke("Add",name,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String name,java.lang.Long value){ try { javonetHandle.invoke("Add",name,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String name,java.lang.Float value){ try { javonetHandle.invoke("Add",name,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String name,java.lang.Double value){ try { javonetHandle.invoke("Add",name,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String name,java.lang.Byte value){ try { javonetHandle.invoke("Add",name,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String name,java.math.BigDecimal value){ try { javonetHandle.invoke("Add",name,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String name,java.lang.Boolean value){ try { javonetHandle.invoke("Add",name,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String name,java.util.Date value){ try { javonetHandle.invoke("Add",name,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String name,TimeSpan value){ try { javonetHandle.invoke("Add",name,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String name,Bitmap value){ try { javonetHandle.invoke("Add",name,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String name,Icon value){ try { javonetHandle.invoke("Add",name,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String name,Metafile value){ try { javonetHandle.invoke("Add",name,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String name,Image value){ try { javonetHandle.invoke("Add",name,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String name,LlBarcode value){ try { javonetHandle.invoke("Add",name,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String name,NObject value){ try { javonetHandle.invoke("Add",name,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String name,java.lang.String value,LlFieldType fieldType){ try { javonetHandle.invoke("Add",name,value,NEnum.fromJavaEnum(fieldType));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromStream (java.lang.String name,Stream value){ try { javonetHandle.invoke("AddFromStream",name,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromStream (java.lang.String name,Stream value,LlFieldType fieldType){ try { javonetHandle.invoke("AddFromStream",name,value,NEnum.fromJavaEnum(fieldType));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromTextReader (java.lang.String name,TextReader value){ try { javonetHandle.invoke("AddFromTextReader",name,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromTextReader (java.lang.String name,TextReader value,LlFieldType fieldType){ try { javonetHandle.invoke("AddFromTextReader",name,value,NEnum.fromJavaEnum(fieldType));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromDictionary (NameObjectCollectionBase value){ try { javonetHandle.invoke("AddFromDictionary",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromDictionary (java.lang.String namePrefix,NameObjectCollectionBase value){ try { javonetHandle.invoke("AddFromDictionary",namePrefix,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromDictionary (java.lang.String namePrefix,NameObjectCollectionBase value,java.lang.Boolean useReflection){ try { javonetHandle.invoke("AddFromDictionary",namePrefix,value,useReflection);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromDictionary (IDictionary value){ try { javonetHandle.invoke("AddFromDictionary",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromDictionary (java.lang.String namePrefix,IDictionary value){ try { javonetHandle.invoke("AddFromDictionary",namePrefix,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromDictionary (java.lang.String namePrefix,IDictionary value,java.lang.Boolean useReflection){ try { javonetHandle.invoke("AddFromDictionary",namePrefix,value,useReflection);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromDataRecord (IDataRecord value){ try { javonetHandle.invoke("AddFromDataRecord",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromDataRecord (java.lang.String namePrefix,IDataRecord value){ try { javonetHandle.invoke("AddFromDataRecord",namePrefix,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromDataRecord (DataRow value){ try { javonetHandle.invoke("AddFromDataRecord",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromDataRecord (java.lang.String namePrefix,DataRow value){ try { javonetHandle.invoke("AddFromDataRecord",namePrefix,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromObject (NObject value){ try { javonetHandle.invoke("AddFromObject",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromObject (java.lang.String namePrefix,NObject value){ try { javonetHandle.invoke("AddFromObject",namePrefix,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromObject (java.lang.String namePrefix,NObject value,java.lang.Boolean onlyBrowsableProperties){ try { javonetHandle.invoke("AddFromObject",namePrefix,value,onlyBrowsableProperties);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromHandle (java.lang.String name,java.lang.Integer value,LlFieldType fieldType){ try { javonetHandle.invoke("AddFromHandle",name,value,NEnum.fromJavaEnum(fieldType));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromDataRow (DataRow value){ try { javonetHandle.invoke("AddFromDataRow",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromDataRow (DataRow value,java.lang.String Prefix){ try { javonetHandle.invoke("AddFromDataRow",value,Prefix);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromInterface (ITableRow value){ try { javonetHandle.invoke("AddFromInterface",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFromInterface (ITableRow value,java.lang.String Prefix){ try { javonetHandle.invoke("AddFromInterface",value,Prefix);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddUserObject (java.lang.String name,java.lang.String value){ try { javonetHandle.invoke("AddUserObject",name,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddUserObject (java.lang.String name,java.lang.String value,DrawUserObjectHandler drawHandler){ try { javonetHandle.invoke("AddUserObject",name,value,drawHandler);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public <A> void Add (java.lang.String name,Nullable<A> value){ try { javonetHandle.invoke("Add",name,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public NObject get_Item (NObject name){ try { return  (NObject) javonetHandle.invoke("get_Item",name);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void set_Item (NObject name,NObject value){ try { javonetHandle.invoke("set_Item",name,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public ICollection get_Keys (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("get_Keys"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ICollection get_Values (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("get_Values"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Boolean Contains (NObject name){ try { return javonetHandle.invoke("Contains",name);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void Add (NObject name,NObject value){ try { javonetHandle.invoke("Add",name,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean get_IsReadOnly (){ try { return javonetHandle.invoke("get_IsReadOnly");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean get_IsFixedSize (){ try { return javonetHandle.invoke("get_IsFixedSize");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void Remove (NObject name){ try { javonetHandle.invoke("Remove",name);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void CopyTo (java.lang.reflect.Array array,java.lang.Integer index){ try { javonetHandle.invoke("CopyTo",array,index);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Integer get_Count (){ try { return javonetHandle.invoke("get_Count");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public NObject get_SyncRoot (){ try { return  (NObject) javonetHandle.invoke("get_SyncRoot");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Boolean get_IsSynchronized (){ try { return javonetHandle.invoke("get_IsSynchronized");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}