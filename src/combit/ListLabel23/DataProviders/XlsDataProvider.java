package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DataProviders.*;
import jio.System.Collections.ObjectModel.*;
import jio.System.Runtime.Serialization.*;
import jio.System.*;public class XlsDataProvider implements IDataProvider,ISerializable,IFileList,IDisposable {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.String getFileName (){ try { return  (java.lang.String) javonetHandle.get("FileName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getFirstRowContainsColumnNames (){ try { return javonetHandle.get("FirstRowContainsColumnNames");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public ReadOnlyCollection<java.lang.String> getSheetNames (){ try { return new ReadOnlyCollection<java.lang.String>((NObject)javonetHandle.<NObject>get("SheetNames"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public XlsDataProvider (java.lang.String fileName,java.lang.Boolean firstRowContainsColumnNames,ReadOnlyCollection<java.lang.String> sheetNames){ try {  javonetHandle = Javonet.New("XlsDataProvider",fileName,firstRowContainsColumnNames,sheetNames);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public XlsDataProvider (java.lang.String fileName,java.lang.Boolean firstRowContainsColumnNames){ try {  javonetHandle = Javonet.New("XlsDataProvider",fileName,firstRowContainsColumnNames);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public XlsDataProvider(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public ReadOnlyCollection<java.lang.String> GetSheetNames (){ try { return new ReadOnlyCollection<java.lang.String>((NObject)javonetHandle.invoke("GetSheetNames"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ReadOnlyCollection<java.lang.String> GetFileList (){ try { return new ReadOnlyCollection<java.lang.String>((NObject)javonetHandle.invoke("GetFileList"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void SetFileList (ReadOnlyCollection<java.lang.String> fileList){ try { javonetHandle.invoke("SetFileList",fileList);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void GetObjectData (SerializationInfo info,StreamingContext context){ try { javonetHandle.invoke("GetObjectData",info,context);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Dispose (){ try { javonetHandle.invoke("Dispose");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
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