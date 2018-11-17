package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.DataProviders.*;public class DataProviderThreadSafenessAttribute extends Attribute {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setDataProviderThreadSafeness (DataProviderThreadSafeness value){ try { javonetHandle.set("DataProviderThreadSafeness",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public DataProviderThreadSafeness getDataProviderThreadSafeness (){ try { return DataProviderThreadSafeness.valueOf(((NEnum) javonetHandle.<NObject>get("DataProviderThreadSafeness")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public DataProviderThreadSafenessAttribute (){  super((NObject) null); try {  javonetHandle = Javonet.New("DataProviderThreadSafenessAttribute"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataProviderThreadSafenessAttribute(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}