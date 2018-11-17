package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class TableInputFieldBase extends TableField {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public CollectionConditionalFormatterItems getConditionalFormatter (){ try { return new CollectionConditionalFormatterItems((NObject)javonetHandle.<NObject>get("ConditionalFormatter"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyFontExt getFont (){ try { return new PropertyFontExt((NObject)javonetHandle.<NObject>get("Font"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setFixedHeight (java.lang.String value){ try { javonetHandle.set("FixedHeight",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFixedHeight (){ try { return  (java.lang.String) javonetHandle.get("FixedHeight");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyFillingWithBitmap getTableInputFieldBaseTableInputFieldBaseFilling (){ try { return new PropertyFillingWithBitmap((NObject)javonetHandle.<NObject>get("TableInputFieldBaseTableInputFieldBaseFilling"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setToolTip (java.lang.String value){ try { javonetHandle.set("ToolTip",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getToolTip (){ try { return  (java.lang.String) javonetHandle.get("ToolTip");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public TableInputFieldBase (java.lang.String objectType,CollectionTableFieldBases itemCollection,java.lang.Integer index){  super((NObject) null); try {  javonetHandle = Javonet.New("TableInputFieldBase",objectType,itemCollection,index); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public TableInputFieldBase (java.lang.String objectType,DomItem item){  super((NObject) null); try {  javonetHandle = Javonet.New("TableInputFieldBase",objectType,item); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public TableInputFieldBase(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}