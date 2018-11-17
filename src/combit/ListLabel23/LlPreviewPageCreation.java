package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.*;public class LlPreviewPageCreation extends ValueType {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public java.util.Date getDate (){ try { return javonetHandle.<NObject>get("Date");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setDate (java.util.Date param){ try { javonetHandle.set("Date",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getApplication (){ try { return  (java.lang.String) javonetHandle.get("Application");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setApplication (java.lang.String param){ try { javonetHandle.set("Application",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getDll (){ try { return  (java.lang.String) javonetHandle.get("Dll");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setDll (java.lang.String param){ try { javonetHandle.set("Dll",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getUser (){ try { return  (java.lang.String) javonetHandle.get("User");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setUser (java.lang.String param){ try { javonetHandle.set("User",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LlPreviewPageCreation (java.util.Date date,java.lang.String application,java.lang.String dll,java.lang.String user){  super((NObject) null); try {  javonetHandle = Javonet.New("LlPreviewPageCreation",date,application,dll,user); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LlPreviewPageCreation(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}