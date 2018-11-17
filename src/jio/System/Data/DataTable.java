package jio.System.Data;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.ComponentModel.*;
import jio.System.Data.*;
import jio.System.Runtime.Serialization.*;
import jio.System.Xml.Serialization.*;
import jio.System.Collections.*;
import jio.System.Xml.Schema.*;
import jio.System.Xml.*;public class DataTable extends MarshalByValueComponent implements IComponent,IListSource,ISupportInitializeNotification,ISupportInitialize,ISerializable,IXmlSerializable {protected NObject javonetHandle; public DataTable (){  super((NObject) null); try {  javonetHandle = Javonet.New("DataTable"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataTable (java.lang.String tableName){  super((NObject) null); try {  javonetHandle = Javonet.New("DataTable",tableName); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataTable (java.lang.String tableName,java.lang.String tableNamespace){  super((NObject) null); try {  javonetHandle = Javonet.New("DataTable",tableName,tableNamespace); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataTable(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Boolean get_ContainsListCollection (){ try { return javonetHandle.invoke("get_ContainsListCollection");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public IList GetList (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetList"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public XmlSchema GetSchema (){ try { return new XmlSchema((NObject)javonetHandle.invoke("GetSchema"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void ReadXml (XmlReader reader){ try { javonetHandle.invoke("ReadXml",reader);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void WriteXml (XmlWriter writer){ try { javonetHandle.invoke("WriteXml",writer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}