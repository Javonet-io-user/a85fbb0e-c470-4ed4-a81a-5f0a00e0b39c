package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.*;public class ListLabelPreviewButtons {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setSearchOptions (LlButtonState value){ try { javonetHandle.set("SearchOptions",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlButtonState getSearchOptions (){ try { return LlButtonState.valueOf(((NEnum) javonetHandle.<NObject>get("SearchOptions")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setPrintToFax (LlButtonState value){ try { javonetHandle.set("PrintToFax",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlButtonState getPrintToFax (){ try { return LlButtonState.valueOf(((NEnum) javonetHandle.<NObject>get("PrintToFax")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setPrintAllPages (LlButtonState value){ try { javonetHandle.set("PrintAllPages",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlButtonState getPrintAllPages (){ try { return LlButtonState.valueOf(((NEnum) javonetHandle.<NObject>get("PrintAllPages")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setGotoFirst (LlButtonState value){ try { javonetHandle.set("GotoFirst",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlButtonState getGotoFirst (){ try { return LlButtonState.valueOf(((NEnum) javonetHandle.<NObject>get("GotoFirst")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSendTo (LlButtonState value){ try { javonetHandle.set("SendTo",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlButtonState getSendTo (){ try { return LlButtonState.valueOf(((NEnum) javonetHandle.<NObject>get("SendTo")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setPrintCurrentPage (LlButtonState value){ try { javonetHandle.set("PrintCurrentPage",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlButtonState getPrintCurrentPage (){ try { return LlButtonState.valueOf(((NEnum) javonetHandle.<NObject>get("PrintCurrentPage")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setGotoPrev (LlButtonState value){ try { javonetHandle.set("GotoPrev",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlButtonState getGotoPrev (){ try { return LlButtonState.valueOf(((NEnum) javonetHandle.<NObject>get("GotoPrev")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setGotoLast (LlButtonState value){ try { javonetHandle.set("GotoLast",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlButtonState getGotoLast (){ try { return LlButtonState.valueOf(((NEnum) javonetHandle.<NObject>get("GotoLast")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setExit (LlButtonState value){ try { javonetHandle.set("Exit",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlButtonState getExit (){ try { return LlButtonState.valueOf(((NEnum) javonetHandle.<NObject>get("Exit")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSaveAs (LlButtonState value){ try { javonetHandle.set("SaveAs",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlButtonState getSaveAs (){ try { return LlButtonState.valueOf(((NEnum) javonetHandle.<NObject>get("SaveAs")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setGotoNext (LlButtonState value){ try { javonetHandle.set("GotoNext",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlButtonState getGotoNext (){ try { return LlButtonState.valueOf(((NEnum) javonetHandle.<NObject>get("GotoNext")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSearchNext (LlButtonState value){ try { javonetHandle.set("SearchNext",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlButtonState getSearchNext (){ try { return LlButtonState.valueOf(((NEnum) javonetHandle.<NObject>get("SearchNext")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setZoomTimes2 (LlButtonState value){ try { javonetHandle.set("ZoomTimes2",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlButtonState getZoomTimes2 (){ try { return LlButtonState.valueOf(((NEnum) javonetHandle.<NObject>get("ZoomTimes2")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setZoomRevert (LlButtonState value){ try { javonetHandle.set("ZoomRevert",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlButtonState getZoomRevert (){ try { return LlButtonState.valueOf(((NEnum) javonetHandle.<NObject>get("ZoomRevert")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSearchStart (LlButtonState value){ try { javonetHandle.set("SearchStart",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlButtonState getSearchStart (){ try { return LlButtonState.valueOf(((NEnum) javonetHandle.<NObject>get("SearchStart")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setZoomReset (LlButtonState value){ try { javonetHandle.set("ZoomReset",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlButtonState getZoomReset (){ try { return LlButtonState.valueOf(((NEnum) javonetHandle.<NObject>get("ZoomReset")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSearchText (LlButtonState value){ try { javonetHandle.set("SearchText",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlButtonState getSearchText (){ try { return LlButtonState.valueOf(((NEnum) javonetHandle.<NObject>get("SearchText")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setPageRange (LlButtonState value){ try { javonetHandle.set("PageRange",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlButtonState getPageRange (){ try { return LlButtonState.valueOf(((NEnum) javonetHandle.<NObject>get("PageRange")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setZoomCombo (LlButtonState value){ try { javonetHandle.set("ZoomCombo",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlButtonState getZoomCombo (){ try { return LlButtonState.valueOf(((NEnum) javonetHandle.<NObject>get("ZoomCombo")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSlideshowMode (LlButtonState value){ try { javonetHandle.set("SlideshowMode",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlButtonState getSlideshowMode (){ try { return LlButtonState.valueOf(((NEnum) javonetHandle.<NObject>get("SlideshowMode")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setPreviousFile (LlButtonState value){ try { javonetHandle.set("PreviousFile",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlButtonState getPreviousFile (){ try { return LlButtonState.valueOf(((NEnum) javonetHandle.<NObject>get("PreviousFile")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setNextFile (LlButtonState value){ try { javonetHandle.set("NextFile",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlButtonState getNextFile (){ try { return LlButtonState.valueOf(((NEnum) javonetHandle.<NObject>get("NextFile")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setMouseModeMove (LlButtonState value){ try { javonetHandle.set("MouseModeMove",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlButtonState getMouseModeMove (){ try { return LlButtonState.valueOf(((NEnum) javonetHandle.<NObject>get("MouseModeMove")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setMouseModeZoom (LlButtonState value){ try { javonetHandle.set("MouseModeZoom",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlButtonState getMouseModeZoom (){ try { return LlButtonState.valueOf(((NEnum) javonetHandle.<NObject>get("MouseModeZoom")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public ListLabelPreviewButtons (ListLabelPreviewControl parent){ try {  javonetHandle = Javonet.New("ListLabelPreviewButtons",parent);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ListLabelPreviewButtons(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}