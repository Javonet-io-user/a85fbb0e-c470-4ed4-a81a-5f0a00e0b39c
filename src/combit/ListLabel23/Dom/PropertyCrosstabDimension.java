package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyCrosstabDimension extends DomItem {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public CollectionFormulas getGroupings (){ try { return new CollectionFormulas((NObject)javonetHandle.<NObject>get("Groupings"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public CollectionCrosstabCellGroupLabels getGroupLabel (){ try { return new CollectionCrosstabCellGroupLabels((NObject)javonetHandle.<NObject>get("GroupLabel"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public CollectionCrosstabCellSumLabels getSumLabel (){ try { return new CollectionCrosstabCellSumLabels((NObject)javonetHandle.<NObject>get("SumLabel"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PropertyCrosstabDimension(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}