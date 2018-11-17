package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DataProviders.*;
import jio.System.Data.Common.*;
import jio.System.Runtime.Serialization.*;
import jio.System.Collections.ObjectModel.*;public class OracleConnectionDataProvider extends DbConnectionDataProvider implements ISerializable {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setPrefixTableNameWithOwner (java.lang.Boolean value){ try { javonetHandle.set("PrefixTableNameWithOwner",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getPrefixTableNameWithOwner (){ try { return javonetHandle.get("PrefixTableNameWithOwner");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setget_OracleConnectionDataProviderOracleConnectionDataProviderSupportsAdvancedFiltering (java.lang.Boolean value){ try { javonetHandle.set("get_OracleConnectionDataProviderOracleConnectionDataProviderSupportsAdvancedFiltering",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getOracleConnectionDataProviderOracleConnectionDataProviderSupportsAdvancedFiltering (){ try { return javonetHandle.get("OracleConnectionDataProviderOracleConnectionDataProviderSupportsAdvancedFiltering");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setDisableRelations (java.lang.Boolean value){ try { javonetHandle.set("DisableRelations",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getDisableRelations (){ try { return javonetHandle.get("DisableRelations");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setSupportedElementTypes (DbConnectionElementTypes value){ try { javonetHandle.set("SupportedElementTypes",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public DbConnectionElementTypes getSupportedElementTypes (){ try { return DbConnectionElementTypes.valueOf(((NEnum) javonetHandle.<NObject>get("SupportedElementTypes")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public OracleConnectionDataProvider (java.lang.String connectionString){  super((NObject) null); try {  javonetHandle = Javonet.New("OracleConnectionDataProvider",connectionString); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public OracleConnectionDataProvider (java.lang.String connectionString,java.lang.String tableOwner){  super((NObject) null); try {  javonetHandle = Javonet.New("OracleConnectionDataProvider",connectionString,tableOwner); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public OracleConnectionDataProvider (java.lang.String connectionString,ReadOnlyCollection<java.lang.String> tableOwners){  super((NObject) null); try {  javonetHandle = Javonet.New("OracleConnectionDataProvider",connectionString,tableOwners); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public OracleConnectionDataProvider(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static DbProviderFactory GetOracleConnectionFactory (){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("OracleConnectionDataProvider").invoke("GetOracleConnectionFactory"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void GetObjectData (SerializationInfo info,StreamingContext context){ try { javonetHandle.invoke("GetObjectData",info,context);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}