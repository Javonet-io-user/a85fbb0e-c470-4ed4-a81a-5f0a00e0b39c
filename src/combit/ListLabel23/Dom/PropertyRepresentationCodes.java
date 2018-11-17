package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyRepresentationCodes extends DomItem {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setCondEnd (java.lang.String value){ try { javonetHandle.set("CondEnd",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getCondEnd (){ try { return  (java.lang.String) javonetHandle.get("CondEnd");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setCondSep (java.lang.String value){ try { javonetHandle.set("CondSep",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getCondSep (){ try { return  (java.lang.String) javonetHandle.get("CondSep");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setCondStart (java.lang.String value){ try { javonetHandle.set("CondStart",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getCondStart (){ try { return  (java.lang.String) javonetHandle.get("CondStart");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setExprSep (java.lang.String value){ try { javonetHandle.set("ExprSep",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getExprSep (){ try { return  (java.lang.String) javonetHandle.get("ExprSep");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setLockNextChar (java.lang.String value){ try { javonetHandle.set("LockNextChar",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getLockNextChar (){ try { return  (java.lang.String) javonetHandle.get("LockNextChar");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setPhantomSpace (java.lang.String value){ try { javonetHandle.set("PhantomSpace",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPhantomSpace (){ try { return  (java.lang.String) javonetHandle.get("PhantomSpace");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setRet (java.lang.String value){ try { javonetHandle.set("Ret",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getRet (){ try { return  (java.lang.String) javonetHandle.get("Ret");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setTab (java.lang.String value){ try { javonetHandle.set("Tab",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTab (){ try { return  (java.lang.String) javonetHandle.get("Tab");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PropertyRepresentationCodes(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}