package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyLayout extends DomItem {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setPrintOrder (java.lang.String value){ try { javonetHandle.set("PrintOrder",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPrintOrder (){ try { return  (java.lang.String) javonetHandle.get("PrintOrder");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setXCount (java.lang.String value){ try { javonetHandle.set("XCount",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getXCount (){ try { return  (java.lang.String) javonetHandle.get("XCount");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setXDistance (java.lang.String value){ try { javonetHandle.set("XDistance",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getXDistance (){ try { return  (java.lang.String) javonetHandle.get("XDistance");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setXOffset (java.lang.String value){ try { javonetHandle.set("XOffset",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getXOffset (){ try { return  (java.lang.String) javonetHandle.get("XOffset");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setXSize (java.lang.String value){ try { javonetHandle.set("XSize",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getXSize (){ try { return  (java.lang.String) javonetHandle.get("XSize");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setYCount (java.lang.String value){ try { javonetHandle.set("YCount",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getYCount (){ try { return  (java.lang.String) javonetHandle.get("YCount");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setYDistance (java.lang.String value){ try { javonetHandle.set("YDistance",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getYDistance (){ try { return  (java.lang.String) javonetHandle.get("YDistance");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setYOffset (java.lang.String value){ try { javonetHandle.set("YOffset",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getYOffset (){ try { return  (java.lang.String) javonetHandle.get("YOffset");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setYSize (java.lang.String value){ try { javonetHandle.set("YSize",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getYSize (){ try { return  (java.lang.String) javonetHandle.get("YSize");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PropertyLayout(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}