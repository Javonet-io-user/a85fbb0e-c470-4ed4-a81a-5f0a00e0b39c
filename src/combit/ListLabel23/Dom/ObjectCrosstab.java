package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class ObjectCrosstab extends ObjectBase {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public PropertyFrame getFrame (){ try { return new PropertyFrame((NObject)javonetHandle.<NObject>get("Frame"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyCrosstabDefinition getDefinition (){ try { return new PropertyCrosstabDefinition((NObject)javonetHandle.<NObject>get("Definition"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSourceTablePath (java.lang.String value){ try { javonetHandle.set("SourceTablePath",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSourceTablePath (){ try { return  (java.lang.String) javonetHandle.get("SourceTablePath");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public ObjectCrosstab (CollectionObjectBases objectCollection){  super((NObject) null); try {  javonetHandle = Javonet.New("ObjectCrosstab",objectCollection); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ObjectCrosstab (CollectionObjectBases objectCollection,java.lang.Integer index){  super((NObject) null); try {  javonetHandle = Javonet.New("ObjectCrosstab",objectCollection,index); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ObjectCrosstab(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}