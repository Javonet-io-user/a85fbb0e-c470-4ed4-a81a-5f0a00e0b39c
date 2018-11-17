package jio.System.Data;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.ComponentModel.*;
import jio.System.Data.*;
import jio.System.Xml.Serialization.*;
import jio.System.Runtime.Serialization.*;
import jio.System.Collections.*;
import jio.System.Xml.Schema.*;
import jio.System.Xml.*;public class DataSet extends MarshalByValueComponent implements IComponent,IListSource,IXmlSerializable,ISupportInitializeNotification,ISupportInitialize,ISerializable {protected NObject javonetHandle; public DataSet (){  super((NObject) null); try {  javonetHandle = Javonet.New("DataSet"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataSet (java.lang.String dataSetName){  super((NObject) null); try {  javonetHandle = Javonet.New("DataSet",dataSetName); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataSet(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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