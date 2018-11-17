package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DataProviders.*;
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;
import jio.System.Collections.ObjectModel.*;public class DataProviderCollection implements IDataProvider,ICanHandleUsedIdentifiers,jio.System.Collections.IEnumerable,ISupplyBaseTables,ICanHandleUsedRelations,ICrossRelationProvider {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.Integer getCount (){ try { return javonetHandle.get("Count");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getIsReadOnly (){ try { return javonetHandle.get("IsReadOnly");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public DataProviderCollection (){ try {  javonetHandle = Javonet.New("DataProviderCollection");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataProviderCollection(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Add (IDataProvider item){ try { javonetHandle.invoke("Add",item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Clear (){ try { javonetHandle.invoke("Clear");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean Contains (IDataProvider item){ try { return javonetHandle.invoke("Contains",item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void CopyTo (IDataProvider[] array,java.lang.Integer arrayIndex){ try { javonetHandle.invoke("CopyTo",new Object[] {array},arrayIndex);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean Remove (IDataProvider item){ try { return javonetHandle.invoke("Remove",item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Object GetEnumerator (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetEnumerator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void AddCrossProviderRelation (java.lang.String relationName,IDataProvider parentProvider,java.lang.String parentTableName,java.lang.String parentColumnName,IDataProvider childProvider,java.lang.String childTableName,java.lang.String childColumnName){ try { javonetHandle.invoke("AddCrossProviderRelation",relationName,parentProvider,parentTableName,parentColumnName,childProvider,childTableName,childColumnName);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean get_SupportsAnyBaseTable (){ try { return javonetHandle.invoke("get_SupportsAnyBaseTable");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public ReadOnlyCollection<ITable> get_Tables (){ try { return new ReadOnlyCollection<ITable>((NObject)javonetHandle.invoke("get_Tables"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ReadOnlyCollection<ITableRelation> get_Relations (){ try { return new ReadOnlyCollection<ITableRelation>((NObject)javonetHandle.invoke("get_Relations"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ITable GetTable (java.lang.String tableName){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetTable",tableName));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ITableRelation GetRelation (java.lang.String relationName){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetRelation",relationName));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void SetUsedIdentifiers (ReadOnlyCollection<java.lang.String> identifiers){ try { javonetHandle.invoke("SetUsedIdentifiers",identifiers);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public ReadOnlyCollection<java.lang.String> GetBaseTableList (){ try { return new ReadOnlyCollection<java.lang.String>((NObject)javonetHandle.invoke("GetBaseTableList"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void SetUsedRelations (ReadOnlyCollection<java.lang.String> relations){ try { javonetHandle.invoke("SetUsedRelations",relations);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean IsCrossRelationIdentifier (java.lang.String identifier){ try { return javonetHandle.invoke("IsCrossRelationIdentifier",identifier);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void NotifyTableUsedIdentifiersChanged (java.lang.String tableName){ try { javonetHandle.invoke("NotifyTableUsedIdentifiersChanged",tableName);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}