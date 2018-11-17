package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyDataGraphicDefinition extends DomItem {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setMinimumValue (java.lang.String value){ try { javonetHandle.set("MinimumValue",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMinimumValue (){ try { return  (java.lang.String) javonetHandle.get("MinimumValue");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMaximumValue (java.lang.String value){ try { javonetHandle.set("MaximumValue",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMaximumValue (){ try { return  (java.lang.String) javonetHandle.get("MaximumValue");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyDataGraphicBar getBar (){ try { return new PropertyDataGraphicBar((NObject)javonetHandle.<NObject>get("Bar"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyDataGraphicData getData (){ try { return new PropertyDataGraphicData((NObject)javonetHandle.<NObject>get("Data"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyDataGraphicIcon getIcon (){ try { return new PropertyDataGraphicIcon((NObject)javonetHandle.<NObject>get("Icon"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PropertyDataGraphicDefinition(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}