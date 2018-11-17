package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DataProviders.*;public class CrossProviderTableRelation implements ICrossProviderTableRelation,ITableRelation {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.String getRelationName (){ try { return  (java.lang.String) javonetHandle.get("RelationName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getParentTableName (){ try { return  (java.lang.String) javonetHandle.get("ParentTableName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getParentColumnName (){ try { return  (java.lang.String) javonetHandle.get("ParentColumnName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getChildTableName (){ try { return  (java.lang.String) javonetHandle.get("ChildTableName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getChildColumnName (){ try { return  (java.lang.String) javonetHandle.get("ChildColumnName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public IDataProvider getParentTableProvider (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("ParentTableProvider"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public IDataProvider getChildTableProvider (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("ChildTableProvider"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getSupportsGetParentRow (){ try { return javonetHandle.get("SupportsGetParentRow");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public CrossProviderTableRelation (java.lang.String relationName,IDataProvider parentProvider,java.lang.String parentTableName,java.lang.String parentColumnName,IDataProvider childProvider,java.lang.String childTableName,java.lang.String childColumnName){ try {  javonetHandle = Javonet.New("CrossProviderTableRelation",relationName,parentProvider,parentTableName,parentColumnName,childProvider,childTableName,childColumnName);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CrossProviderTableRelation(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void InvalidateColumnsLayoutCache (java.lang.String tableName){ try { javonetHandle.invoke("InvalidateColumnsLayoutCache",tableName);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean Matches1to1Identifier (java.lang.String identifier){ try { return javonetHandle.invoke("Matches1to1Identifier",identifier);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public ITable ResolveChildTable (ITableRow parentRow){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("ResolveChildTable",parentRow));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ITableRow ResolveParentRow (ITableRow childRow){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("ResolveParentRow",childRow));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}