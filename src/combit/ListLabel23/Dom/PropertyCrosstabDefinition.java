package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyCrosstabDefinition extends DomItem {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setSubCellCount (java.lang.String value){ try { javonetHandle.set("SubCellCount",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSubCellCount (){ try { return  (java.lang.String) javonetHandle.get("SubCellCount");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyCrosstabDimension getRows (){ try { return new PropertyCrosstabDimension((NObject)javonetHandle.<NObject>get("Rows"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyCrosstabDimension getColumns (){ try { return new PropertyCrosstabDimension((NObject)javonetHandle.<NObject>get("Columns"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyCrosstabCells getCells (){ try { return new PropertyCrosstabCells((NObject)javonetHandle.<NObject>get("Cells"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyFrame getDefaultFrame (){ try { return new PropertyFrame((NObject)javonetHandle.<NObject>get("DefaultFrame"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyFontExt getDefaultFont (){ try { return new PropertyFontExt((NObject)javonetHandle.<NObject>get("DefaultFont"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyFillingExt getFilling (){ try { return new PropertyFillingExt((NObject)javonetHandle.<NObject>get("Filling"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setLinkUrl (java.lang.String value){ try { javonetHandle.set("LinkUrl",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getLinkUrl (){ try { return  (java.lang.String) javonetHandle.get("LinkUrl");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMinHeight (java.lang.String value){ try { javonetHandle.set("MinHeight",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMinHeight (){ try { return  (java.lang.String) javonetHandle.get("MinHeight");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setWrapPercentage (java.lang.String value){ try { javonetHandle.set("WrapPercentage",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getWrapPercentage (){ try { return  (java.lang.String) javonetHandle.get("WrapPercentage");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setHarmonicLineHeights (java.lang.String value){ try { javonetHandle.set("HarmonicLineHeights",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getHarmonicLineHeights (){ try { return  (java.lang.String) javonetHandle.get("HarmonicLineHeights");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyCrosstabColumnWrapping getColumnWrapping (){ try { return new PropertyCrosstabColumnWrapping((NObject)javonetHandle.<NObject>get("ColumnWrapping"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyCrosstabWrapping getRowWrapping (){ try { return new PropertyCrosstabWrapping((NObject)javonetHandle.<NObject>get("RowWrapping"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setDesignScheme (java.lang.String value){ try { javonetHandle.set("DesignScheme",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDesignScheme (){ try { return  (java.lang.String) javonetHandle.get("DesignScheme");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PropertyCrosstabDefinition(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}