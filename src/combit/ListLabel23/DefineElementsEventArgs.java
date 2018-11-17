package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.*;public class DefineElementsEventArgs extends EventArgs {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public NObject getUserData (){ try { return  (NObject) javonetHandle.<NObject>get("UserData");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getIsDesignMode (){ try { return javonetHandle.get("IsDesignMode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setProgressPercent (java.lang.Integer value){ try { javonetHandle.set("ProgressPercent",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getProgressPercent (){ try { return javonetHandle.get("ProgressPercent");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setIsLastRecord (java.lang.Boolean value){ try { javonetHandle.set("IsLastRecord",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getIsLastRecord (){ try { return javonetHandle.get("IsLastRecord");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setResetProjectState (java.lang.Boolean value){ try { javonetHandle.set("ResetProjectState",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getResetProjectState (){ try { return javonetHandle.get("ResetProjectState");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public DefineElementsEventArgs (NObject userData,java.lang.Boolean isDesignMode,java.lang.Integer progressPercent,java.lang.Boolean isLastRecord,java.lang.Boolean resetProjectState){  super((NObject) null); try {  javonetHandle = Javonet.New("DefineElementsEventArgs",userData,isDesignMode,progressPercent,isLastRecord,resetProjectState); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DefineElementsEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}