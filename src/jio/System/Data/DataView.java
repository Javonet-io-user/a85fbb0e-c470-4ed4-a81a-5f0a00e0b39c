package jio.System.Data;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.ComponentModel.*;
import jio.System.Data.*;
import jio.System.Collections.*;
import jio.System.*;public class DataView extends MarshalByValueComponent implements IBindingListView,IBindingList,IList,ICollection,IEnumerable,ITypedList,ISupportInitializeNotification,ISupportInitialize {protected NObject javonetHandle; public DataView (){  super((NObject) null); try {  javonetHandle = Javonet.New("DataView"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataView (DataTable table){  super((NObject) null); try {  javonetHandle = Javonet.New("DataView",table); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataView (DataTable table,java.lang.String RowFilter,java.lang.String Sort,DataViewRowState RowState){  super((NObject) null); try {  javonetHandle = Javonet.New("DataView",table,RowFilter,Sort,NEnum.fromJavaEnum(RowState)); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataView(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void ApplySort (ListSortDescriptionCollection sorts){ try { javonetHandle.invoke("ApplySort",sorts);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.String get_Filter (){ try { return  (java.lang.String) javonetHandle.invoke("get_Filter");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public void set_Filter (java.lang.String value){ try { javonetHandle.invoke("set_Filter",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public ListSortDescriptionCollection get_SortDescriptions (){ try { return new ListSortDescriptionCollection((NObject)javonetHandle.invoke("get_SortDescriptions"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void RemoveFilter (){ try { javonetHandle.invoke("RemoveFilter");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean get_SupportsAdvancedSorting (){ try { return javonetHandle.invoke("get_SupportsAdvancedSorting");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean get_SupportsFiltering (){ try { return javonetHandle.invoke("get_SupportsFiltering");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean get_AllowNew (){ try { return javonetHandle.invoke("get_AllowNew");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public NObject AddNew (){ try { return  (NObject) javonetHandle.invoke("AddNew");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Boolean get_AllowEdit (){ try { return javonetHandle.invoke("get_AllowEdit");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean get_AllowRemove (){ try { return javonetHandle.invoke("get_AllowRemove");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean get_SupportsChangeNotification (){ try { return javonetHandle.invoke("get_SupportsChangeNotification");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean get_SupportsSearching (){ try { return javonetHandle.invoke("get_SupportsSearching");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean get_SupportsSorting (){ try { return javonetHandle.invoke("get_SupportsSorting");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean get_IsSorted (){ try { return javonetHandle.invoke("get_IsSorted");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public PropertyDescriptor get_SortProperty (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("get_SortProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ListSortDirection get_SortDirection (){ try { return ListSortDirection.valueOf(((NEnum) javonetHandle.invoke("get_SortDirection")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void AddIndex (PropertyDescriptor property){ try { javonetHandle.invoke("AddIndex",property);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void ApplySort (PropertyDescriptor property,ListSortDirection direction){ try { javonetHandle.invoke("ApplySort",property,NEnum.fromJavaEnum(direction));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Integer Find (PropertyDescriptor property,NObject key){ try { return javonetHandle.invoke("Find",property,key);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public void RemoveIndex (PropertyDescriptor property){ try { javonetHandle.invoke("RemoveIndex",property);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void RemoveSort (){ try { javonetHandle.invoke("RemoveSort");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public NObject get_Item (java.lang.Integer recordIndex){ try { return  (NObject) javonetHandle.invoke("get_Item",recordIndex);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void set_Item (java.lang.Integer recordIndex,NObject value){ try { javonetHandle.invoke("set_Item",recordIndex,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Integer Add (NObject value){ try { return javonetHandle.invoke("Add",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Boolean Contains (NObject value){ try { return javonetHandle.invoke("Contains",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void Clear (){ try { javonetHandle.invoke("Clear");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean get_IsReadOnly (){ try { return javonetHandle.invoke("get_IsReadOnly");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean get_IsFixedSize (){ try { return javonetHandle.invoke("get_IsFixedSize");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Integer IndexOf (NObject value){ try { return javonetHandle.invoke("IndexOf",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public void Insert (java.lang.Integer index,NObject value){ try { javonetHandle.invoke("Insert",index,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Remove (NObject value){ try { javonetHandle.invoke("Remove",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void RemoveAt (java.lang.Integer index){ try { javonetHandle.invoke("RemoveAt",index);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public NObject get_SyncRoot (){ try { return  (NObject) javonetHandle.invoke("get_SyncRoot");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Boolean get_IsSynchronized (){ try { return javonetHandle.invoke("get_IsSynchronized");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.String GetListName (PropertyDescriptor[] listAccessors){ try { return  (java.lang.String) javonetHandle.invoke("GetListName",new Object[] {listAccessors});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public PropertyDescriptorCollection GetItemProperties (PropertyDescriptor[] listAccessors){ try { return new PropertyDescriptorCollection((NObject)javonetHandle.invoke("GetItemProperties",new Object[] {listAccessors}));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}