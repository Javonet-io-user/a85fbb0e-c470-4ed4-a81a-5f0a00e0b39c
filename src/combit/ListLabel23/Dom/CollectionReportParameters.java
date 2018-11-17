package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class CollectionReportParameters extends DomCollectionBase {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public ReportParameter get_Item (java.lang.Integer index){ try { return new ReportParameter((NObject)javonetHandle.invoke("get_Item",index));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public CollectionReportParameters(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public ReportParameter AddNew (){ try { return new ReportParameter((NObject)javonetHandle.invoke("AddNew"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public CollectionEnumerator<ReportParameter> GetEnumerator (){ try { return new CollectionEnumerator<ReportParameter>((NObject)javonetHandle.invoke("GetEnumerator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}