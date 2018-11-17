package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DataProviders.*;
import jio.System.Runtime.Serialization.*;
import jio.System.Data.*;public class SQLiteConnectionDataProvider extends DbConnectionDataProvider implements ISerializable {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setget_SQLiteConnectionDataProviderSQLiteConnectionDataProviderSupportsAdvancedFiltering (java.lang.Boolean value){ try { javonetHandle.set("get_SQLiteConnectionDataProviderSQLiteConnectionDataProviderSupportsAdvancedFiltering",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getSQLiteConnectionDataProviderSQLiteConnectionDataProviderSupportsAdvancedFiltering (){ try { return javonetHandle.get("SQLiteConnectionDataProviderSQLiteConnectionDataProviderSupportsAdvancedFiltering");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public SQLiteConnectionDataProvider (IDbConnection connection){  super((NObject) null); try {  javonetHandle = Javonet.New("SQLiteConnectionDataProvider",connection); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SQLiteConnectionDataProvider (java.lang.String connectionString){  super((NObject) null); try {  javonetHandle = Javonet.New("SQLiteConnectionDataProvider",connectionString); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SQLiteConnectionDataProvider(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void GetObjectData (SerializationInfo info,StreamingContext context){ try { javonetHandle.invoke("GetObjectData",info,context);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}