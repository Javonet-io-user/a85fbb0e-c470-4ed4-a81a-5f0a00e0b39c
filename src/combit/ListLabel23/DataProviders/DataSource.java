package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.ComponentModel.*;
import combit.ListLabel23.DataProviders.*;
import jio.System.Collections.ObjectModel.*;
import jio.System.Collections.*;public class DataSource extends Component implements IDataProvider,IListSource,ICanHandleUsedIdentifiers {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setConnectionProperties (DataSourceConnectionProperties value){ try { javonetHandle.set("ConnectionProperties",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public DataSourceConnectionProperties getConnectionProperties (){ try { return new DataSourceConnectionProperties((NObject)javonetHandle.<NObject>get("ConnectionProperties"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setIdentifierDelimiterFormat (java.lang.String value){ try { javonetHandle.set("IdentifierDelimiterFormat",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getIdentifierDelimiterFormat (){ try { return  (java.lang.String) javonetHandle.get("IdentifierDelimiterFormat");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setSupportedElementTypes (DbConnectionElementTypes value){ try { javonetHandle.set("SupportedElementTypes",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public DbConnectionElementTypes getSupportedElementTypes (){ try { return DbConnectionElementTypes.valueOf(((NEnum) javonetHandle.<NObject>get("SupportedElementTypes")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSupportsAdvancedFiltering (java.lang.Boolean value){ try { javonetHandle.set("SupportsAdvancedFiltering",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getSupportsAdvancedFiltering (){ try { return javonetHandle.get("SupportsAdvancedFiltering");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public DataSource (IContainer container){  super((NObject) null); try {  javonetHandle = Javonet.New("DataSource",container); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataSource(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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
            public ITableRelation GetRelation (java.lang.String relationName){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetRelation",relationName));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Boolean get_ContainsListCollection (){ try { return javonetHandle.invoke("get_ContainsListCollection");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public IList GetList (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetList"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void SetUsedIdentifiers (ReadOnlyCollection<java.lang.String> identifiers){ try { javonetHandle.invoke("SetUsedIdentifiers",identifiers);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}