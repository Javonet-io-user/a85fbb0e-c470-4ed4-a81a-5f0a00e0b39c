package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class SubItemStaticTable extends SubItemTableBase {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public PropertyLineOptionsStaticTable getLineOptions (){ try { return new PropertyLineOptionsStaticTable((NObject)javonetHandle.<NObject>get("LineOptions"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyTableLinesStaticTable getLines (){ try { return new PropertyTableLinesStaticTable((NObject)javonetHandle.<NObject>get("Lines"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public SubItemStaticTable (CollectionSubItemBasesBase itemCollection){  super((NObject) null); try {  javonetHandle = Javonet.New("SubItemStaticTable",itemCollection); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SubItemStaticTable (CollectionSubItemBasesBase itemCollection,java.lang.Integer index){  super((NObject) null); try {  javonetHandle = Javonet.New("SubItemStaticTable",itemCollection,index); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SubItemStaticTable(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}