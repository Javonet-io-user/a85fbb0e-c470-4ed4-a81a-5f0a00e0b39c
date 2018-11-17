package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyAnimation extends DomItem {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setAnimation (java.lang.String value){ try { javonetHandle.set("Animation",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getAnimation (){ try { return  (java.lang.String) javonetHandle.get("Animation");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setAnimationTime (java.lang.String value){ try { javonetHandle.set("AnimationTime",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getAnimationTime (){ try { return  (java.lang.String) javonetHandle.get("AnimationTime");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setColor (java.lang.String value){ try { javonetHandle.set("Color",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getColor (){ try { return  (java.lang.String) javonetHandle.get("Color");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setPartialAreaOnly (java.lang.String value){ try { javonetHandle.set("PartialAreaOnly",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPartialAreaOnly (){ try { return  (java.lang.String) javonetHandle.get("PartialAreaOnly");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyAnimationTrigger getTrigger (){ try { return new PropertyAnimationTrigger((NObject)javonetHandle.<NObject>get("Trigger"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PropertyAnimation(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}