package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class ObjectInputEdit extends ObjectInputBase {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setAlignment (java.lang.String value){ try { javonetHandle.set("Alignment",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getAlignment (){ try { return  (java.lang.String) javonetHandle.get("Alignment");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDefaultValue (java.lang.String value){ try { javonetHandle.set("DefaultValue",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDefaultValue (){ try { return  (java.lang.String) javonetHandle.get("DefaultValue");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setFieldName (java.lang.String value){ try { javonetHandle.set("FieldName",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFieldName (){ try { return  (java.lang.String) javonetHandle.get("FieldName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyFilling getFilling (){ try { return new PropertyFilling((NObject)javonetHandle.<NObject>get("Filling"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyFontExt getFont (){ try { return new PropertyFontExt((NObject)javonetHandle.<NObject>get("Font"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyRectangleFrame getFrame (){ try { return new PropertyRectangleFrame((NObject)javonetHandle.<NObject>get("Frame"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setMultiline (java.lang.String value){ try { javonetHandle.set("Multiline",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMultiline (){ try { return  (java.lang.String) javonetHandle.get("Multiline");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setNeedInput (java.lang.String value){ try { javonetHandle.set("NeedInput",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getNeedInput (){ try { return  (java.lang.String) javonetHandle.get("NeedInput");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyInputEditVerification getVerification (){ try { return new PropertyInputEditVerification((NObject)javonetHandle.<NObject>get("Verification"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public ObjectInputEdit (CollectionObjectBases objectCollection){  super((NObject) null); try {  javonetHandle = Javonet.New("ObjectInputEdit",objectCollection); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ObjectInputEdit (CollectionObjectBases objectCollection,java.lang.Integer index){  super((NObject) null); try {  javonetHandle = Javonet.New("ObjectInputEdit",objectCollection,index); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ObjectInputEdit(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Boolean PropertyExists (java.lang.String propertyName){ try { return javonetHandle.invoke("PropertyExists",propertyName);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}