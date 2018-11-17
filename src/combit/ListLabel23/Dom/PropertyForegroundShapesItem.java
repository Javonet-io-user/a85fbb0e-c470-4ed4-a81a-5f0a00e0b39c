package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyForegroundShapesItem extends PropertyShapeItemBase {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setRestrictToDataRegion (java.lang.Boolean value){ try { javonetHandle.set("RestrictToDataRegion",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getRestrictToDataRegion (){ try { return javonetHandle.get("RestrictToDataRegion");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public PropertyForegroundShapesItem (CollectionForegroundShapesItems collectionForegroundShapesItems){  super((NObject) null); try {  javonetHandle = Javonet.New("PropertyForegroundShapesItem",collectionForegroundShapesItems); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PropertyForegroundShapesItem (CollectionForegroundShapesItems collectionForegroundShapesItems,java.lang.Integer index){  super((NObject) null); try {  javonetHandle = Javonet.New("PropertyForegroundShapesItem",collectionForegroundShapesItems,index); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PropertyForegroundShapesItem(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}