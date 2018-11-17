package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DataProviders.*;
import jio.System.Runtime.Serialization.*;
import jio.System.Collections.ObjectModel.*;
import jio.System.Data.OleDb.*;public class OleDbConnectionDataProvider extends DbConnectionDataProvider implements ISerializable,IFileList {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setget_OleDbConnectionDataProviderOleDbConnectionDataProviderSupportsAdvancedFiltering (java.lang.Boolean value){ try { javonetHandle.set("get_OleDbConnectionDataProviderOleDbConnectionDataProviderSupportsAdvancedFiltering",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getOleDbConnectionDataProviderOleDbConnectionDataProviderSupportsAdvancedFiltering (){ try { return javonetHandle.get("OleDbConnectionDataProviderOleDbConnectionDataProviderSupportsAdvancedFiltering");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setSupportedElementTypes (DbConnectionElementTypes value){ try { javonetHandle.set("SupportedElementTypes",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public DbConnectionElementTypes getSupportedElementTypes (){ try { return DbConnectionElementTypes.valueOf(((NEnum) javonetHandle.<NObject>get("SupportedElementTypes")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setIdentifierDelimiterFormat (java.lang.String value){ try { javonetHandle.set("IdentifierDelimiterFormat",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getIdentifierDelimiterFormat (){ try { return  (java.lang.String) javonetHandle.get("IdentifierDelimiterFormat");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setConnection (OleDbConnection value){ try { javonetHandle.set("Connection",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public OleDbConnection getConnection (){ try { return new OleDbConnection((NObject)javonetHandle.<NObject>get("Connection"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setUseMsAccessSqlSyntax (java.lang.Boolean value){ try { javonetHandle.set("UseMsAccessSqlSyntax",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getUseMsAccessSqlSyntax (){ try { return javonetHandle.get("UseMsAccessSqlSyntax");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public OleDbConnectionDataProvider (){  super((NObject) null); try {  javonetHandle = Javonet.New("OleDbConnectionDataProvider"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public OleDbConnectionDataProvider (OleDbConnection connection){  super((NObject) null); try {  javonetHandle = Javonet.New("OleDbConnectionDataProvider",connection); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public OleDbConnectionDataProvider (OleDbConnection connection,java.lang.String identifierDelimiterFormat){  super((NObject) null); try {  javonetHandle = Javonet.New("OleDbConnectionDataProvider",connection,identifierDelimiterFormat); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public OleDbConnectionDataProvider(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void GetObjectData (SerializationInfo info,StreamingContext context){ try { javonetHandle.invoke("GetObjectData",info,context);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public ReadOnlyCollection<java.lang.String> GetFileList (){ try { return new ReadOnlyCollection<java.lang.String>((NObject)javonetHandle.invoke("GetFileList"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void SetFileList (ReadOnlyCollection<java.lang.String> fileList){ try { javonetHandle.invoke("SetFileList",fileList);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}