package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DataProviders.*;
import jio.System.Collections.ObjectModel.*;
import jio.System.Data.*;
import jio.System.*;public class AdoDataProvider implements IDataProvider,IDisposable,ICanHandleUsedIdentifiers {protected NObject javonetHandle; public AdoDataProvider (DataView dataView){ try {  javonetHandle = Javonet.New("AdoDataProvider",dataView);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public AdoDataProvider (DataTable dataTable){ try {  javonetHandle = Javonet.New("AdoDataProvider",dataTable);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public AdoDataProvider (DataViewManager dataViewManager){ try {  javonetHandle = Javonet.New("AdoDataProvider",dataViewManager);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public AdoDataProvider (DataSet dataSet){ try {  javonetHandle = Javonet.New("AdoDataProvider",dataSet);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public AdoDataProvider(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Dispose (){ try { javonetHandle.invoke("Dispose");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void SetUsedIdentifiers (ReadOnlyCollection<java.lang.String> identifiers){ try { javonetHandle.invoke("SetUsedIdentifiers",identifiers);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
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