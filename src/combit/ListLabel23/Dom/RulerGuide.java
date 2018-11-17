package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class RulerGuide extends DomItem {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setCatchRangePixels (java.lang.Integer value){ try { javonetHandle.set("CatchRangePixels",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getCatchRangePixels (){ try { return javonetHandle.get("CatchRangePixels");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setLocked (java.lang.Boolean value){ try { javonetHandle.set("Locked",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getLocked (){ try { return javonetHandle.get("Locked");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setPosition (java.lang.Integer value){ try { javonetHandle.set("Position",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getPosition (){ try { return javonetHandle.get("Position");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }public RulerGuide (CollectionRulerGuides rulerGuideCollection){  super((NObject) null); try {  javonetHandle = Javonet.New("RulerGuide",rulerGuideCollection); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public RulerGuide (CollectionRulerGuides rulerGuideCollection,java.lang.Integer index){  super((NObject) null); try {  javonetHandle = Javonet.New("RulerGuide",rulerGuideCollection,index); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public RulerGuide(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}