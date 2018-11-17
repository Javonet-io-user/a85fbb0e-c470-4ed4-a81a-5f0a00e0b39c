package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.*;public class AutoDefineElementEventArgs extends EventArgs {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.Boolean getIsDesignMode (){ try { return javonetHandle.get("IsDesignMode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setName (java.lang.String value){ try { javonetHandle.set("Name",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getName (){ try { return  (java.lang.String) javonetHandle.get("Name");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setValue (NObject value){ try { javonetHandle.set("Value",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public NObject getValue (){ try { return  (NObject) javonetHandle.<NObject>get("Value");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSuppress (java.lang.Boolean value){ try { javonetHandle.set("Suppress",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getSuppress (){ try { return javonetHandle.get("Suppress");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setProgressPercent (java.lang.Integer value){ try { javonetHandle.set("ProgressPercent",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getProgressPercent (){ try { return javonetHandle.get("ProgressPercent");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setFieldType (LlFieldType value){ try { javonetHandle.set("FieldType",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlFieldType getFieldType (){ try { return LlFieldType.valueOf(((NEnum) javonetHandle.<NObject>get("FieldType")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public AutoDefineElementEventArgs (java.lang.Boolean isDesignMode,java.lang.String name,NObject value,java.lang.Integer progressPercent,LlFieldType fieldType){  super((NObject) null); try {  javonetHandle = Javonet.New("AutoDefineElementEventArgs",isDesignMode,name,value,progressPercent,NEnum.fromJavaEnum(fieldType)); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public AutoDefineElementEventArgs (java.lang.Boolean isDesignMode,java.lang.String name,NObject value,java.lang.Integer progressPercent){  super((NObject) null); try {  javonetHandle = Javonet.New("AutoDefineElementEventArgs",isDesignMode,name,value,progressPercent); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public AutoDefineElementEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}