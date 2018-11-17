package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Collections.ObjectModel.*;
import combit.ListLabel23.Dom.*;
import jio.System.*;public class SeparatedStringCollection extends Collection<java.lang.String> {protected NObject javonetHandle; public SeparatedStringCollection (DomItem parent,java.lang.String propertyName){  super((NObject) null); try {  javonetHandle = Javonet.New("SeparatedStringCollection",parent,propertyName); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SeparatedStringCollection (DomItem parent,java.lang.String propertyName,java.lang.String separator){  super((NObject) null); try {  javonetHandle = Javonet.New("SeparatedStringCollection",parent,propertyName,separator); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SeparatedStringCollection(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void CopyFrom (SeparatedStringCollection source){ try { javonetHandle.invoke("CopyFrom",source);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}