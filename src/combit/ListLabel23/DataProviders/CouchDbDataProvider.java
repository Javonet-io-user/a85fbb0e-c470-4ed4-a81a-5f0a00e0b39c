package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DataProviders.*;
import jio.System.Collections.ObjectModel.*;public class CouchDbDataProvider implements IDataProvider {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setFlattenStructure (java.lang.Boolean value){ try { javonetHandle.set("FlattenStructure",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getFlattenStructure (){ try { return javonetHandle.get("FlattenStructure");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setConnectionTimeout (java.lang.Integer value){ try { javonetHandle.set("ConnectionTimeout",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getConnectionTimeout (){ try { return javonetHandle.get("ConnectionTimeout");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setUsername (java.lang.String value){ try { javonetHandle.set("Username",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getUsername (){ try { return  (java.lang.String) javonetHandle.get("Username");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setPassword (java.lang.String value){ try { javonetHandle.set("Password",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPassword (){ try { return  (java.lang.String) javonetHandle.get("Password");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDomain (java.lang.String value){ try { javonetHandle.set("Domain",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDomain (){ try { return  (java.lang.String) javonetHandle.get("Domain");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setQueryParameters (java.lang.String value){ try { javonetHandle.set("QueryParameters",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getQueryParameters (){ try { return  (java.lang.String) javonetHandle.get("QueryParameters");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public CouchDbDataProvider (java.lang.String serverUrl,java.lang.String databaseName,java.lang.String viewName,java.lang.String serverPort,java.lang.String username,java.lang.String password,java.lang.String domain){ try {  javonetHandle = Javonet.New("CouchDbDataProvider",serverUrl,databaseName,viewName,serverPort,username,password,domain);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CouchDbDataProvider (java.lang.String serverUrl,java.lang.String databaseName,java.lang.String viewName,java.lang.String serverPort){ try {  javonetHandle = Javonet.New("CouchDbDataProvider",serverUrl,databaseName,viewName,serverPort);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CouchDbDataProvider (java.lang.String serverUrl,java.lang.String databaseName,java.lang.String viewName){ try {  javonetHandle = Javonet.New("CouchDbDataProvider",serverUrl,databaseName,viewName);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CouchDbDataProvider(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
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
            public ITableRelation GetRelation (java.lang.String relationName){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetRelation",relationName));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}