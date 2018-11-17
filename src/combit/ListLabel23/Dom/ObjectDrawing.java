package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class ObjectDrawing extends ObjectBase {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public PropertyFrame getFrame (){ try { return new PropertyFrame((NObject)javonetHandle.<NObject>get("Frame"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyDrawingContents getSource (){ try { return new PropertyDrawingContents((NObject)javonetHandle.<NObject>get("Source"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setExportAsPicture (java.lang.String value){ try { javonetHandle.set("ExportAsPicture",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getExportAsPicture (){ try { return  (java.lang.String) javonetHandle.get("ExportAsPicture");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public ObjectDrawing (CollectionObjectBases objectCollection){  super((NObject) null); try {  javonetHandle = Javonet.New("ObjectDrawing",objectCollection); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ObjectDrawing (CollectionObjectBases objectCollection,java.lang.Integer index){  super((NObject) null); try {  javonetHandle = Javonet.New("ObjectDrawing",objectCollection,index); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ObjectDrawing(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}