package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class ObjectTemplate extends ObjectBase {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setColorFade (java.lang.String value){ try { javonetHandle.set("ColorFade",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getColorFade (){ try { return  (java.lang.String) javonetHandle.get("ColorFade");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setIsotropic (java.lang.String value){ try { javonetHandle.set("Isotropic",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getIsotropic (){ try { return  (java.lang.String) javonetHandle.get("Isotropic");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyDrawingFileInfo getFileInfo (){ try { return new PropertyDrawingFileInfo((NObject)javonetHandle.<NObject>get("FileInfo"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setShowOnPreview (java.lang.String value){ try { javonetHandle.set("ShowOnPreview",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getShowOnPreview (){ try { return  (java.lang.String) javonetHandle.get("ShowOnPreview");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public ObjectTemplate (CollectionObjectBases objectCollection){  super((NObject) null); try {  javonetHandle = Javonet.New("ObjectTemplate",objectCollection); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ObjectTemplate (CollectionObjectBases objectCollection,java.lang.Integer index){  super((NObject) null); try {  javonetHandle = Javonet.New("ObjectTemplate",objectCollection,index); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ObjectTemplate(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}