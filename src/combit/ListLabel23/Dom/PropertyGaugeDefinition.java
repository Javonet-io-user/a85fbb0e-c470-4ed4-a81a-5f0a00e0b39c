package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyGaugeDefinition extends DomItem {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public PropertyStartValue getStartValue (){ try { return new PropertyStartValue((NObject)javonetHandle.<NObject>get("StartValue"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyAlphaBlendableItem getFrame (){ try { return new PropertyAlphaBlendableItem((NObject)javonetHandle.<NObject>get("Frame"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyAlphaBlendableItem getGlass (){ try { return new PropertyAlphaBlendableItem((NObject)javonetHandle.<NObject>get("Glass"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyScaleLabels getScaleLabels (){ try { return new PropertyScaleLabels((NObject)javonetHandle.<NObject>get("ScaleLabels"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyPointer getPointer (){ try { return new PropertyPointer((NObject)javonetHandle.<NObject>get("Pointer"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyTickmarksExt getTickmarks (){ try { return new PropertyTickmarksExt((NObject)javonetHandle.<NObject>get("Tickmarks"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setWhiteSpaceBeforeScaleRange (java.lang.String value){ try { javonetHandle.set("WhiteSpaceBeforeScaleRange",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getWhiteSpaceBeforeScaleRange (){ try { return  (java.lang.String) javonetHandle.get("WhiteSpaceBeforeScaleRange");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setWhiteSpaceAfterScaleRange (java.lang.String value){ try { javonetHandle.set("WhiteSpaceAfterScaleRange",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getWhiteSpaceAfterScaleRange (){ try { return  (java.lang.String) javonetHandle.get("WhiteSpaceAfterScaleRange");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyScaleLimits getMaximumValue (){ try { return new PropertyScaleLimits((NObject)javonetHandle.<NObject>get("MaximumValue"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyScaleLimits getMinimumValue (){ try { return new PropertyScaleLimits((NObject)javonetHandle.<NObject>get("MinimumValue"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setScaleRangeRotationAngle (java.lang.String value){ try { javonetHandle.set("ScaleRangeRotationAngle",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getScaleRangeRotationAngle (){ try { return  (java.lang.String) javonetHandle.get("ScaleRangeRotationAngle");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertySignalRanges getSignalRanges (){ try { return new PropertySignalRanges((NObject)javonetHandle.<NObject>get("SignalRanges"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyLabels getLabels (){ try { return new PropertyLabels((NObject)javonetHandle.<NObject>get("Labels"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setValue (java.lang.String value){ try { javonetHandle.set("Value",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getValue (){ try { return  (java.lang.String) javonetHandle.get("Value");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setStyle (java.lang.String value){ try { javonetHandle.set("Style",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getStyle (){ try { return  (java.lang.String) javonetHandle.get("Style");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setWidthHeightRelation (java.lang.String value){ try { javonetHandle.set("WidthHeightRelation",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getWidthHeightRelation (){ try { return  (java.lang.String) javonetHandle.get("WidthHeightRelation");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDesignScheme (java.lang.String value){ try { javonetHandle.set("DesignScheme",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDesignScheme (){ try { return  (java.lang.String) javonetHandle.get("DesignScheme");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PropertyGaugeDefinition(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void CopyFrom (DomItem source){ try { javonetHandle.invoke("CopyFrom",source);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}