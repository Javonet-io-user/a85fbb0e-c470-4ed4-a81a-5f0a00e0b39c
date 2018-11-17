package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DataProviders.*;
import jio.System.Runtime.Serialization.*;
import jio.System.Text.*;
import jio.System.IO.*;
import jio.System.*;
import jio.System.Collections.ObjectModel.*;public class CsvDataProvider implements IDataProvider,IDisposable,ISerializable {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.String getFileName (){ try { return  (java.lang.String) javonetHandle.get("FileName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setContentEncoding (Encoding value){ try { javonetHandle.set("ContentEncoding",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Encoding getContentEncoding (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("ContentEncoding"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setTableName (java.lang.String value){ try { javonetHandle.set("TableName",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTableName (){ try { return  (java.lang.String) javonetHandle.get("TableName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setFirstLineIsHeader (java.lang.Boolean value){ try { javonetHandle.set("FirstLineIsHeader",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getFirstLineIsHeader (){ try { return javonetHandle.get("FirstLineIsHeader");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setSeparator (java.lang.Character value){ try { javonetHandle.set("Separator",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Character getSeparator (){ try { return javonetHandle.get("Separator");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setLinesToSkip (java.lang.Integer value){ try { javonetHandle.set("LinesToSkip",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getLinesToSkip (){ try { return javonetHandle.get("LinesToSkip");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setSupportsCount (java.lang.Boolean value){ try { javonetHandle.set("SupportsCount",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getSupportsCount (){ try { return javonetHandle.get("SupportsCount");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setFramingCharacter (java.lang.Character value){ try { javonetHandle.set("FramingCharacter",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Character getFramingCharacter (){ try { return javonetHandle.get("FramingCharacter");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public CsvDataProvider (java.lang.String fileName){ try {  javonetHandle = Javonet.New("CsvDataProvider",fileName);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CsvDataProvider (java.lang.String fileName,java.lang.Boolean firstLineIsHeader){ try {  javonetHandle = Javonet.New("CsvDataProvider",fileName,firstLineIsHeader);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CsvDataProvider (java.lang.String fileName,java.lang.Boolean firstLineIsHeader,java.lang.String tableName){ try {  javonetHandle = Javonet.New("CsvDataProvider",fileName,firstLineIsHeader,tableName);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CsvDataProvider (java.lang.String fileName,java.lang.Boolean firstLineIsHeader,java.lang.String tableName,java.lang.Character separator){ try {  javonetHandle = Javonet.New("CsvDataProvider",fileName,firstLineIsHeader,tableName,separator);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CsvDataProvider (java.lang.String fileName,java.lang.Boolean firstLineIsHeader,java.lang.String tableName,java.lang.Character separator,java.lang.Integer linesToSkip){ try {  javonetHandle = Javonet.New("CsvDataProvider",fileName,firstLineIsHeader,tableName,separator,linesToSkip);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CsvDataProvider (java.lang.String fileName,java.lang.Boolean firstLineIsHeader,java.lang.String tableName,java.lang.Character separator,java.lang.Integer linesToSkip,java.lang.Boolean supportsCount){ try {  javonetHandle = Javonet.New("CsvDataProvider",fileName,firstLineIsHeader,tableName,separator,linesToSkip,supportsCount);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CsvDataProvider (Stream stream,java.lang.Boolean firstLineIsHeader,java.lang.String tableName,java.lang.Character separator,java.lang.Integer linesToSkip,java.lang.Boolean supportsCount){ try {  javonetHandle = Javonet.New("CsvDataProvider",stream,firstLineIsHeader,tableName,separator,linesToSkip,supportsCount);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CsvDataProvider(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
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