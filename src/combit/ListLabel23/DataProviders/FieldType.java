package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.DataProviders.*;
import combit.ListLabel23.*;public class FieldType extends Attribute {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public LlFieldType getLlFieldType (){ try { return LlFieldType.valueOf(((NEnum) javonetHandle.<NObject>get("LlFieldType")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public FieldType (LlFieldType fieldType){  super((NObject) null); try {  javonetHandle = Javonet.New("FieldType",NEnum.fromJavaEnum(fieldType)); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public FieldType(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}