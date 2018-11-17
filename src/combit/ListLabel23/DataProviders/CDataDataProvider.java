package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DataProviders.*;
import jio.System.*;
import jio.System.Runtime.Serialization.*;
import jio.System.Collections.ObjectModel.*;public class CDataDataProvider extends DbConnectionDataProvider implements ISerializable {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public ReadOnlyCollection<java.lang.String> getTableNames (){ try { return new ReadOnlyCollection<java.lang.String>((NObject)javonetHandle.<NObject>get("TableNames"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSupportedElementTypes (DbConnectionElementTypes value){ try { javonetHandle.set("SupportedElementTypes",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public DbConnectionElementTypes getSupportedElementTypes (){ try { return DbConnectionElementTypes.valueOf(((NEnum) javonetHandle.<NObject>get("SupportedElementTypes")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setget_CDataDataProviderCDataDataProviderSupportsAdvancedFiltering (java.lang.Boolean value){ try { javonetHandle.set("get_CDataDataProviderCDataDataProviderSupportsAdvancedFiltering",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getCDataDataProviderCDataDataProviderSupportsAdvancedFiltering (){ try { return javonetHandle.get("CDataDataProviderCDataDataProviderSupportsAdvancedFiltering");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public CDataDataProvider (java.lang.String connectionString,CDataProviderInvariantName providerInvariantName,ReadOnlyCollection<java.lang.String> tableNames){  super((NObject) null); try {  javonetHandle = Javonet.New("CDataDataProvider",connectionString,NEnum.fromJavaEnum(providerInvariantName),tableNames); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CDataDataProvider (java.lang.String connectionString,CDataProviderInvariantName providerInvariantName){  super((NObject) null); try {  javonetHandle = Javonet.New("CDataDataProvider",connectionString,NEnum.fromJavaEnum(providerInvariantName)); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CDataDataProvider(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static Nullable<CDataProviderInvariantName> GetInvariantNameFromString (java.lang.String invariantName){ try { return Javonet.getType("CDataDataProvider").invoke("GetInvariantNameFromString",invariantName);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void GetObjectData (SerializationInfo info,StreamingContext context){ try { javonetHandle.invoke("GetObjectData",info,context);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } } public enum CDataProviderInvariantName{Excel(0L),Core(1L),QuickBooks(2L),SharePoint(3L),OData(4L),PowerShell(5L),GoogleSheets(6L),Twitter(7L),Salesforce(8L),Google(9L),SAP(10L),OFX(11L),SimpleDB(12L),Email(13L),DynamicsCRM(14L),LDAP(15L),Facebook(16L),RSS(17L),GMAIL(18L),GoogleApps(19L),QuickBooksIDS(20L),RSSBusExcel(21L),RSSBusCore(22L),RSSBusQuickBooks(23L),RSSBusSharePoint(24L),RSSBusOData(25L),RSSBusPowerShell(26L),RSSBusGoogleSheets(27L),RSSBusTwitter(28L),RSSBusSalesforce(29L),RSSBusGoogle(30L),RSSBusSAP(31L),RSSBusOFX(32L),RSSBusSimpleDB(33L),RSSBusEmail(34L),RSSBusDynamicsCRM(35L),RSSBusLDAP(36L),RSSBusacebook(37L),RSSBusRSS(38L),RSSBusGMAIL(39L),RSSBusGoogleApps(40L),RSSBusQuickBooksIDS(41L),; private long numVal;CDataProviderInvariantName(long numVal) {
		        this.numVal = numVal;
		    }
		
		    public long getNumVal() {
		        return numVal;
		    }
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}