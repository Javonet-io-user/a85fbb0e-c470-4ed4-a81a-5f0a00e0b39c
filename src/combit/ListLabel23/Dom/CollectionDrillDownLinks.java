package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class CollectionDrillDownLinks extends DomCollectionBase {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public DrillDownLinkBase get_Item (java.lang.Integer index){ try { return new DrillDownLinkBase((NObject)javonetHandle.invoke("get_Item",index));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public CollectionDrillDownLinks(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public DrillDownLink AddNewDrillDownLink (){ try { return new DrillDownLink((NObject)javonetHandle.invoke("AddNewDrillDownLink"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public DrillDownLinkForParameterizedSubreport AddNewDrillDownLinkForParameterizedSubreport (){ try { return new DrillDownLinkForParameterizedSubreport((NObject)javonetHandle.invoke("AddNewDrillDownLinkForParameterizedSubreport"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public CollectionEnumerator<DrillDownLink> GetEnumerator (){ try { return new CollectionEnumerator<DrillDownLink>((NObject)javonetHandle.invoke("GetEnumerator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void CopyFrom (DomCollectionBase source){ try { javonetHandle.invoke("CopyFrom",source);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}