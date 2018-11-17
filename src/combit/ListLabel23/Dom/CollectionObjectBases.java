package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class CollectionObjectBases extends DomCollectionBase {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public ObjectBase get_Item (java.lang.Integer index){ try { return new ObjectBase((NObject)javonetHandle.invoke("get_Item",index));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public ObjectBase get_Item (java.lang.String objectName){ try { return new ObjectBase((NObject)javonetHandle.invoke("get_Item",objectName));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public CollectionObjectBases(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void CopyFrom (DomCollectionBase source){ try { javonetHandle.invoke("CopyFrom",source);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public CollectionEnumerator<ObjectBase> GetEnumerator (){ try { return new CollectionEnumerator<ObjectBase>((NObject)javonetHandle.invoke("GetEnumerator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ObjectBarcode AddNewBarcode (){ try { return new ObjectBarcode((NObject)javonetHandle.invoke("AddNewBarcode"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ObjectEllipse AddNewEllipse (){ try { return new ObjectEllipse((NObject)javonetHandle.invoke("AddNewEllipse"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ObjectDrawing AddNewDrawing (){ try { return new ObjectDrawing((NObject)javonetHandle.invoke("AddNewDrawing"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ObjectHtml AddNewHtml (){ try { return new ObjectHtml((NObject)javonetHandle.invoke("AddNewHtml"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ObjectInputButton AddNewInputButton (){ try { return new ObjectInputButton((NObject)javonetHandle.invoke("AddNewInputButton"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ObjectInputCheckbox AddNewInputCheckbox (){ try { return new ObjectInputCheckbox((NObject)javonetHandle.invoke("AddNewInputCheckbox"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ObjectInputCombobox AddNewInputCombobox (){ try { return new ObjectInputCombobox((NObject)javonetHandle.invoke("AddNewInputCombobox"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ObjectInputEdit AddNewInputEdit (){ try { return new ObjectInputEdit((NObject)javonetHandle.invoke("AddNewInputEdit"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ObjectLine AddNewLine (){ try { return new ObjectLine((NObject)javonetHandle.invoke("AddNewLine"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ObjectRectangle AddNewRectangle (){ try { return new ObjectRectangle((NObject)javonetHandle.invoke("AddNewRectangle"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ObjectReportContainer AddNewReportContainer (){ try { return new ObjectReportContainer((NObject)javonetHandle.invoke("AddNewReportContainer"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ObjectRtf AddNewRtf (){ try { return new ObjectRtf((NObject)javonetHandle.invoke("AddNewRtf"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ObjectText AddNewText (){ try { return new ObjectText((NObject)javonetHandle.invoke("AddNewText"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ObjectTemplate AddNewTemplate (){ try { return new ObjectTemplate((NObject)javonetHandle.invoke("AddNewTemplate"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ObjectGauge AddNewGauge (LlDomGaugeType gaugeType){ try { return new ObjectGauge((NObject)javonetHandle.invoke("AddNewGauge",NEnum.fromJavaEnum(gaugeType)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ObjectDataGraphic AddNewDataGraphic (){ try { return new ObjectDataGraphic((NObject)javonetHandle.invoke("AddNewDataGraphic"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ObjectPdf AddNewPdf (){ try { return new ObjectPdf((NObject)javonetHandle.invoke("AddNewPdf"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}