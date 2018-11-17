package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;
import combit.ListLabel23.*;public class CollectionTableFieldBases extends DomCollectionBase {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public TableField get_Item (java.lang.Integer index){ try { return new TableField((NObject)javonetHandle.invoke("get_Item",index));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public CollectionTableFieldBases(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public CollectionEnumerator<TableField> GetEnumerator (){ try { return new CollectionEnumerator<TableField>((NObject)javonetHandle.invoke("GetEnumerator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public TableFieldTable AddNewTable (){ try { return new TableFieldTable((NObject)javonetHandle.invoke("AddNewTable"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public TableFieldBarcode AddNewBarcode (){ try { return new TableFieldBarcode((NObject)javonetHandle.invoke("AddNewBarcode"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public TableFieldChart AddNewChart (LlChartType type){ try { return new TableFieldChart((NObject)javonetHandle.invoke("AddNewChart",NEnum.fromJavaEnum(type)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public TableFieldExtensionObject AddNewExtensionObject (java.lang.String name){ try { return new TableFieldExtensionObject((NObject)javonetHandle.invoke("AddNewExtensionObject",name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public TableFieldDrawing AddNewDrawing (){ try { return new TableFieldDrawing((NObject)javonetHandle.invoke("AddNewDrawing"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public TableFieldHtml AddNewHtml (){ try { return new TableFieldHtml((NObject)javonetHandle.invoke("AddNewHtml"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public TableFieldRtf AddNewRtf (){ try { return new TableFieldRtf((NObject)javonetHandle.invoke("AddNewRtf"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public TableFieldText AddNewText (){ try { return new TableFieldText((NObject)javonetHandle.invoke("AddNewText"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public TableFieldGauge AddNewGauge (LlDomGaugeType type){ try { return new TableFieldGauge((NObject)javonetHandle.invoke("AddNewGauge",NEnum.fromJavaEnum(type)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public TableFieldPdf AddNewPdf (){ try { return new TableFieldPdf((NObject)javonetHandle.invoke("AddNewPdf"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public TableInputFieldButton AddNewInputButton (){ try { return new TableInputFieldButton((NObject)javonetHandle.invoke("AddNewInputButton"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public TableInputFieldCheckbox AddNewInputCheckbox (){ try { return new TableInputFieldCheckbox((NObject)javonetHandle.invoke("AddNewInputCheckbox"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public TableInputFieldComboBox AddNewInputComboBox (){ try { return new TableInputFieldComboBox((NObject)javonetHandle.invoke("AddNewInputComboBox"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public TableInputFieldEdit AddNewInputEdit (){ try { return new TableInputFieldEdit((NObject)javonetHandle.invoke("AddNewInputEdit"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public CollectionEnumerator<TableFieldBase> AddNewDataGraphic (){ try { return new CollectionEnumerator<TableFieldBase>((NObject)javonetHandle.invoke("AddNewDataGraphic"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}