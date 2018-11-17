package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DataProviders.*;
import jio.System.Runtime.Serialization.*;public class AccessDataProvider extends OleDbConnectionDataProvider implements ISerializable {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.String getFileName (){ try { return  (java.lang.String) javonetHandle.get("FileName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public AccessDataProvider (java.lang.String fileName){  super((NObject) null); try {  javonetHandle = Javonet.New("AccessDataProvider",fileName); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public AccessDataProvider (java.lang.String fileName,java.lang.String password){  super((NObject) null); try {  javonetHandle = Javonet.New("AccessDataProvider",fileName,password); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public AccessDataProvider(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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