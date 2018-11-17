package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyFrame extends DomItem {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setLayout (java.lang.String value){ try { javonetHandle.set("Layout",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getLayout (){ try { return  (java.lang.String) javonetHandle.get("Layout");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyFrameLine getLeft (){ try { return new PropertyFrameLine((NObject)javonetHandle.<NObject>get("Left"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyFrameLine getTop (){ try { return new PropertyFrameLine((NObject)javonetHandle.<NObject>get("Top"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyFrameLine getRight (){ try { return new PropertyFrameLine((NObject)javonetHandle.<NObject>get("Right"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyFrameLine getBottom (){ try { return new PropertyFrameLine((NObject)javonetHandle.<NObject>get("Bottom"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PropertyFrame(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}