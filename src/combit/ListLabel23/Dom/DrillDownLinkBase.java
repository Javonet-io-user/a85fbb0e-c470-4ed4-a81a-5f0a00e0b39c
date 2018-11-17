package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class DrillDownLinkBase extends DomItem {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setMenuText (java.lang.String value){ try { javonetHandle.set("MenuText",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMenuText (){ try { return  (java.lang.String) javonetHandle.get("MenuText");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setProjectFileName (java.lang.String value){ try { javonetHandle.set("ProjectFileName",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getProjectFileName (){ try { return  (java.lang.String) javonetHandle.get("ProjectFileName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public DrillDownLinkBase (DomItem item){  super((NObject) null); try {  javonetHandle = Javonet.New("DrillDownLinkBase",item); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DrillDownLinkBase (CollectionDrillDownLinks drillDownLinkCollection,java.lang.Integer objectType){  super((NObject) null); try {  javonetHandle = Javonet.New("DrillDownLinkBase",drillDownLinkCollection,objectType); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DrillDownLinkBase (CollectionDrillDownLinks drillDownLinkCollection,java.lang.Integer objectType,java.lang.Integer index){  super((NObject) null); try {  javonetHandle = Javonet.New("DrillDownLinkBase",drillDownLinkCollection,objectType,index); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DrillDownLinkBase(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}