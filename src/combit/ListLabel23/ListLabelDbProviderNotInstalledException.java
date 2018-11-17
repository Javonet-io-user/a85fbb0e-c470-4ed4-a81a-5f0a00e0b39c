package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.*;
import jio.System.Runtime.Serialization.*;
import jio.System.Runtime.InteropServices.*;public class ListLabelDbProviderNotInstalledException extends ListLabelException implements ISerializable,_Exception {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.String getRequestedProviderName (){ try { return  (java.lang.String) javonetHandle.get("RequestedProviderName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public ListLabelDbProviderNotInstalledException (){  super((NObject) null); try {  javonetHandle = Javonet.New("ListLabelDbProviderNotInstalledException"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ListLabelDbProviderNotInstalledException (java.lang.String requestedProviderName){  super((NObject) null); try {  javonetHandle = Javonet.New("ListLabelDbProviderNotInstalledException",requestedProviderName); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ListLabelDbProviderNotInstalledException(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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