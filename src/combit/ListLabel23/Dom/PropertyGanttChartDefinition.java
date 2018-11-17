package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyGanttChartDefinition extends DomItem {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public PropertyFillingWithBitmap getFilling (){ try { return new PropertyFillingWithBitmap((NObject)javonetHandle.<NObject>get("Filling"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setAssumeDayResolution (java.lang.String value){ try { javonetHandle.set("AssumeDayResolution",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getAssumeDayResolution (){ try { return  (java.lang.String) javonetHandle.get("AssumeDayResolution");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setBarLabel (java.lang.String value){ try { javonetHandle.set("BarLabel",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getBarLabel (){ try { return  (java.lang.String) javonetHandle.get("BarLabel");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyChartArea getChartArea (){ try { return new PropertyChartArea((NObject)javonetHandle.<NObject>get("ChartArea"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setDistanceTop (java.lang.String value){ try { javonetHandle.set("DistanceTop",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDistanceTop (){ try { return  (java.lang.String) javonetHandle.get("DistanceTop");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDuration (java.lang.String value){ try { javonetHandle.set("Duration",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDuration (){ try { return  (java.lang.String) javonetHandle.get("Duration");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setEndDate (java.lang.String value){ try { javonetHandle.set("EndDate",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getEndDate (){ try { return  (java.lang.String) javonetHandle.get("EndDate");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyFontExt getFont (){ try { return new PropertyFontExt((NObject)javonetHandle.<NObject>get("Font"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setGridMode (java.lang.String value){ try { javonetHandle.set("GridMode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getGridMode (){ try { return  (java.lang.String) javonetHandle.get("GridMode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyHighlightRange getHighlightRange (){ try { return new PropertyHighlightRange((NObject)javonetHandle.<NObject>get("HighlightRange"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
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
            public void setPercentageComplete (java.lang.String value){ try { javonetHandle.set("PercentageComplete",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPercentageComplete (){ try { return  (java.lang.String) javonetHandle.get("PercentageComplete");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyGanttShadowPages getShadowPages (){ try { return new PropertyGanttShadowPages((NObject)javonetHandle.<NObject>get("ShadowPages"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setStartDate (java.lang.String value){ try { javonetHandle.set("StartDate",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getStartDate (){ try { return  (java.lang.String) javonetHandle.get("StartDate");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setSummaryTaskDescription (java.lang.String value){ try { javonetHandle.set("SummaryTaskDescription",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSummaryTaskDescription (){ try { return  (java.lang.String) javonetHandle.get("SummaryTaskDescription");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyTaskRows getSummaryTaskRows (){ try { return new PropertyTaskRows((NObject)javonetHandle.<NObject>get("SummaryTaskRows"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyTableArea getTableArea (){ try { return new PropertyTableArea((NObject)javonetHandle.<NObject>get("TableArea"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setTaskDescription (java.lang.String value){ try { javonetHandle.set("TaskDescription",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTaskDescription (){ try { return  (java.lang.String) javonetHandle.get("TaskDescription");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyTaskRows getTaskRows (){ try { return new PropertyTaskRows((NObject)javonetHandle.<NObject>get("TaskRows"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyTitleRow getTitleRow (){ try { return new PropertyTitleRow((NObject)javonetHandle.<NObject>get("TitleRow"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setWrapGrouped (java.lang.String value){ try { javonetHandle.set("WrapGrouped",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getWrapGrouped (){ try { return  (java.lang.String) javonetHandle.get("WrapGrouped");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setSkipTopLevelSingularities (java.lang.String value){ try { javonetHandle.set("SkipTopLevelSingularities",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSkipTopLevelSingularities (){ try { return  (java.lang.String) javonetHandle.get("SkipTopLevelSingularities");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PropertyGanttChartDefinition(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}