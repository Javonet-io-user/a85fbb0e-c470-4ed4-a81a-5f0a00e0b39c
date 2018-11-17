package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class TableFieldBarcode extends TableFieldBase {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setAlignmentVertical (java.lang.String value){ try { javonetHandle.set("AlignmentVertical",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getAlignmentVertical (){ try { return  (java.lang.String) javonetHandle.get("AlignmentVertical");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setBarRatio (java.lang.String value){ try { javonetHandle.set("BarRatio",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getBarRatio (){ try { return  (java.lang.String) javonetHandle.get("BarRatio");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDirection (java.lang.String value){ try { javonetHandle.set("Direction",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDirection (){ try { return  (java.lang.String) javonetHandle.get("Direction");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setExportAsPicture (java.lang.String value){ try { javonetHandle.set("ExportAsPicture",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getExportAsPicture (){ try { return  (java.lang.String) javonetHandle.get("ExportAsPicture");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyFixedBarOptions getFixedBarOptions (){ try { return new PropertyFixedBarOptions((NObject)javonetHandle.<NObject>get("FixedBarOptions"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyMatchDevicePixel getMatchDeviePixel (){ try { return new PropertyMatchDevicePixel((NObject)javonetHandle.<NObject>get("MatchDeviePixel"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setBarColor (java.lang.String value){ try { javonetHandle.set("BarColor",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getBarColor (){ try { return  (java.lang.String) javonetHandle.get("BarColor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setContents (java.lang.String value){ try { javonetHandle.set("Contents",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getContents (){ try { return  (java.lang.String) javonetHandle.get("Contents");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyFontExt getFont (){ try { return new PropertyFontExt((NObject)javonetHandle.<NObject>get("Font"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setHeight (java.lang.String value){ try { javonetHandle.set("Height",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getHeight (){ try { return  (java.lang.String) javonetHandle.get("Height");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setWithText (java.lang.String value){ try { javonetHandle.set("WithText",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getWithText (){ try { return  (java.lang.String) javonetHandle.get("WithText");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public TableFieldBarcode (CollectionTableFieldBases itemCollection){  super((NObject) null); try {  javonetHandle = Javonet.New("TableFieldBarcode",itemCollection); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public TableFieldBarcode (CollectionTableFieldBases itemCollection,java.lang.Integer index){  super((NObject) null); try {  javonetHandle = Javonet.New("TableFieldBarcode",itemCollection,index); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public TableFieldBarcode(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}