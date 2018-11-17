package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyTableArea extends DomItem {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public PropertyCell getDurationCell (){ try { return new PropertyCell((NObject)javonetHandle.<NObject>get("DurationCell"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyCell getEndDateCell (){ try { return new PropertyCell((NObject)javonetHandle.<NObject>get("EndDateCell"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyIndexCell getIndexCell (){ try { return new PropertyIndexCell((NObject)javonetHandle.<NObject>get("IndexCell"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyLabelCell getLabelCell (){ try { return new PropertyLabelCell((NObject)javonetHandle.<NObject>get("LabelCell"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyCell getPercentageCompleteCell (){ try { return new PropertyCell((NObject)javonetHandle.<NObject>get("PercentageCompleteCell"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyCell getStartDateCell (){ try { return new PropertyCell((NObject)javonetHandle.<NObject>get("StartDateCell"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PropertyTableArea(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}