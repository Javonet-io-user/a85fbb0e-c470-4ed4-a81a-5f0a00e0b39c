package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.*;public class NtfyExprErrorEx extends ValueType {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public java.lang.Integer getnSize (){ try { return javonetHandle.get("nSize");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setnSize (java.lang.Integer param){ try { javonetHandle.set("nSize",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getpszExpr (){ try { return  (java.lang.String) javonetHandle.get("pszExpr");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setpszExpr (java.lang.String param){ try { javonetHandle.set("pszExpr",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getpszError (){ try { return  (java.lang.String) javonetHandle.get("pszError");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setpszError (java.lang.String param){ try { javonetHandle.set("pszError",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getpHierarchy (){ try { return javonetHandle.<NObject>get("pHierarchy");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setpHierarchy (java.lang.Integer param){ try { javonetHandle.set("pHierarchy",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public NtfyExprErrorEx(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}