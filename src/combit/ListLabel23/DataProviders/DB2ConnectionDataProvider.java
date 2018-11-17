package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DataProviders.*;
import jio.System.Runtime.Serialization.*;
import jio.System.Collections.ObjectModel.*;public class DB2ConnectionDataProvider extends DbConnectionDataProvider implements ISerializable {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setSupportedElementTypes (DbConnectionElementTypes value){ try { javonetHandle.set("SupportedElementTypes",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public DbConnectionElementTypes getSupportedElementTypes (){ try { return DbConnectionElementTypes.valueOf(((NEnum) javonetHandle.<NObject>get("SupportedElementTypes")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setPrefixTableNameWithSchema (java.lang.Boolean value){ try { javonetHandle.set("PrefixTableNameWithSchema",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getPrefixTableNameWithSchema (){ try { return javonetHandle.get("PrefixTableNameWithSchema");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setget_DB2ConnectionDataProviderDB2ConnectionDataProviderSupportsAdvancedFiltering (java.lang.Boolean value){ try { javonetHandle.set("get_DB2ConnectionDataProviderDB2ConnectionDataProviderSupportsAdvancedFiltering",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getDB2ConnectionDataProviderDB2ConnectionDataProviderSupportsAdvancedFiltering (){ try { return javonetHandle.get("DB2ConnectionDataProviderDB2ConnectionDataProviderSupportsAdvancedFiltering");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public DB2ConnectionDataProvider (java.lang.String connectionString){  super((NObject) null); try {  javonetHandle = Javonet.New("DB2ConnectionDataProvider",connectionString); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DB2ConnectionDataProvider (java.lang.String connectionString,ReadOnlyCollection<java.lang.String> tableSchemas){  super((NObject) null); try {  javonetHandle = Javonet.New("DB2ConnectionDataProvider",connectionString,tableSchemas); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DB2ConnectionDataProvider (java.lang.String connectionString,java.lang.String tableSchema){  super((NObject) null); try {  javonetHandle = Javonet.New("DB2ConnectionDataProvider",connectionString,tableSchema); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DB2ConnectionDataProvider(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.String SplitString (java.lang.String input){ try { return  (java.lang.String) javonetHandle.invoke("SplitString",input);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public void GetObjectData (SerializationInfo info,StreamingContext context){ try { javonetHandle.invoke("GetObjectData",info,context);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}