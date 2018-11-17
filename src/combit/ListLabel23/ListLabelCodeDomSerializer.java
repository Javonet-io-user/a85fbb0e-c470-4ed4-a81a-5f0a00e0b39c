package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.ComponentModel.Design.Serialization.*;
import combit.ListLabel23.*;
import jio.System.*;
import jio.System.CodeDom.Compiler.*;public class ListLabelCodeDomSerializer extends CodeDomSerializer {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setProvider (CodeDomProvider value){ try { javonetHandle.set("Provider",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public CodeDomProvider getProvider (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("Provider"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public ListLabelCodeDomSerializer (){  super((NObject) null); try {  javonetHandle = Javonet.New("ListLabelCodeDomSerializer"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ListLabelCodeDomSerializer(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public NObject Serialize (IDesignerSerializationManager manager,NObject value){ try { return  (NObject) javonetHandle.invoke("Serialize",manager,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}