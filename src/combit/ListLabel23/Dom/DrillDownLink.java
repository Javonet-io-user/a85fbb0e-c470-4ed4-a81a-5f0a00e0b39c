package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class DrillDownLink extends DrillDownLinkBase {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setParentKeyField (java.lang.String value){ try { javonetHandle.set("ParentKeyField",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getParentKeyField (){ try { return  (java.lang.String) javonetHandle.get("ParentKeyField");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setParentTableId (java.lang.String value){ try { javonetHandle.set("ParentTableId",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getParentTableId (){ try { return  (java.lang.String) javonetHandle.get("ParentTableId");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setRelationId (java.lang.String value){ try { javonetHandle.set("RelationId",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getRelationId (){ try { return  (java.lang.String) javonetHandle.get("RelationId");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setChildKeyField (java.lang.String value){ try { javonetHandle.set("ChildKeyField",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getChildKeyField (){ try { return  (java.lang.String) javonetHandle.get("ChildKeyField");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setChildTableId (java.lang.String value){ try { javonetHandle.set("ChildTableId",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getChildTableId (){ try { return  (java.lang.String) javonetHandle.get("ChildTableId");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public DrillDownLink (CollectionDrillDownLinks drillDownLinkCollection){  super((NObject) null); try {  javonetHandle = Javonet.New("DrillDownLink",drillDownLinkCollection); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DrillDownLink (CollectionDrillDownLinks drillDownLinkCollection,java.lang.Integer index){  super((NObject) null); try {  javonetHandle = Javonet.New("DrillDownLink",drillDownLinkCollection,index); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DrillDownLink(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}