package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class Paragraph extends DomItem {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setAdjusted (java.lang.String value){ try { javonetHandle.set("Adjusted",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getAdjusted (){ try { return  (java.lang.String) javonetHandle.get("Adjusted");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setAlignment (java.lang.String value){ try { javonetHandle.set("Alignment",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getAlignment (){ try { return  (java.lang.String) javonetHandle.get("Alignment");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setCondition (java.lang.String value){ try { javonetHandle.set("Condition",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getCondition (){ try { return  (java.lang.String) javonetHandle.get("Condition");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setContents (java.lang.String value){ try { javonetHandle.set("Contents",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getContents (){ try { return  (java.lang.String) javonetHandle.get("Contents");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyFontExt getFont (){ try { return new PropertyFontExt((NObject)javonetHandle.<NObject>get("Font"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public CollectionConditionalFormatterItems getConditionalFormatter (){ try { return new CollectionConditionalFormatterItems((NObject)javonetHandle.<NObject>get("ConditionalFormatter"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setLineSpacing (java.lang.String value){ try { javonetHandle.set("LineSpacing",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getLineSpacing (){ try { return  (java.lang.String) javonetHandle.get("LineSpacing");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyParagraphWrapping getWrapping (){ try { return new PropertyParagraphWrapping((NObject)javonetHandle.<NObject>get("Wrapping"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyOutputFormatterBase getOutputFormatter (){ try { return new PropertyOutputFormatterBase((NObject)javonetHandle.<NObject>get("OutputFormatter"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setOptimizeSpaces (java.lang.String value){ try { javonetHandle.set("OptimizeSpaces",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getOptimizeSpaces (){ try { return  (java.lang.String) javonetHandle.get("OptimizeSpaces");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setParagraphSpacing (java.lang.String value){ try { javonetHandle.set("ParagraphSpacing",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getParagraphSpacing (){ try { return  (java.lang.String) javonetHandle.get("ParagraphSpacing");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setTabAlignment (java.lang.String value){ try { javonetHandle.set("TabAlignment",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTabAlignment (){ try { return  (java.lang.String) javonetHandle.get("TabAlignment");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setTabPosition (java.lang.String value){ try { javonetHandle.set("TabPosition",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTabPosition (){ try { return  (java.lang.String) javonetHandle.get("TabPosition");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setUnerasable (java.lang.String value){ try { javonetHandle.set("Unerasable",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getUnerasable (){ try { return  (java.lang.String) javonetHandle.get("Unerasable");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public Paragraph (CollectionParagraphs paragraphCollection){  super((NObject) null); try {  javonetHandle = Javonet.New("Paragraph",paragraphCollection); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Paragraph (CollectionParagraphs paragraphCollection,java.lang.Integer index){  super((NObject) null); try {  javonetHandle = Javonet.New("Paragraph",paragraphCollection,index); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Paragraph(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}