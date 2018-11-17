package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Windows.Forms.*;
import combit.ListLabel23.*;
import jio.System.*;
import jio.System.Drawing.*;
import jio.System.ComponentModel.*;public class ListLabelPreviewControl extends Control {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setFileName (java.lang.String value){ try { javonetHandle.set("FileName",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFileName (){ try { return  (java.lang.String) javonetHandle.get("FileName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setCloseMode (LlPreviewControlCloseMode value){ try { javonetHandle.set("CloseMode",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlPreviewControlCloseMode getCloseMode (){ try { return LlPreviewControlCloseMode.valueOf(((NEnum) javonetHandle.<NObject>get("CloseMode")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setLanguage (LlLanguage value){ try { javonetHandle.set("Language",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlLanguage getLanguage (){ try { return LlLanguage.valueOf(((NEnum) javonetHandle.<NObject>get("Language")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSaveAsFileName (java.lang.String value){ try { javonetHandle.set("SaveAsFileName",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSaveAsFileName (){ try { return  (java.lang.String) javonetHandle.get("SaveAsFileName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setShowUnprintableArea (java.lang.Boolean value){ try { javonetHandle.set("ShowUnprintableArea",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getShowUnprintableArea (){ try { return javonetHandle.get("ShowUnprintableArea");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setAllowRbuttonUsage (java.lang.Boolean value){ try { javonetHandle.set("AllowRbuttonUsage",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getAllowRbuttonUsage (){ try { return javonetHandle.get("AllowRbuttonUsage");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setShowToolbar (java.lang.Boolean value){ try { javonetHandle.set("ShowToolbar",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getShowToolbar (){ try { return javonetHandle.get("ShowToolbar");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setShowThumbnails (java.lang.Boolean value){ try { javonetHandle.set("ShowThumbnails",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getShowThumbnails (){ try { return javonetHandle.get("ShowThumbnails");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setBackColor (Color value){ try { javonetHandle.set("BackColor",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Color getBackColor (){ try { return javonetHandle.<NObject>get("BackColor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setCurrentPage (java.lang.Integer value){ try { javonetHandle.set("CurrentPage",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getCurrentPage (){ try { return javonetHandle.get("CurrentPage");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getPageCount (){ try { return javonetHandle.get("PageCount");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setForceReadOnly (java.lang.Boolean value){ try { javonetHandle.set("ForceReadOnly",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getForceReadOnly (){ try { return javonetHandle.get("ForceReadOnly");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setToolbarButtons (ListLabelPreviewButtons value){ try { javonetHandle.set("ToolbarButtons",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public ListLabelPreviewButtons getToolbarButtons (){ try { return new ListLabelPreviewButtons((NObject)javonetHandle.<NObject>get("ToolbarButtons"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSlideshowMode (java.lang.Boolean value){ try { javonetHandle.set("SlideshowMode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getSlideshowMode (){ try { return javonetHandle.get("SlideshowMode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public ListLabelPreviewControl (IContainer container){  super((NObject) null); try {  javonetHandle = Javonet.New("ListLabelPreviewControl",container); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("PageChanged", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (PageChangedHandler handler : _PageChangedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], PageChangedEventArgs.class));}}});javonetHandle.addEventListener("ZoomChanged", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<EventArgs> handler : _ZoomChangedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], EventArgs.class));}}});javonetHandle.addEventListener("ButtonPress", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (ButtonPressHandler handler : _ButtonPressListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ButtonPressEventArgs.class));}}});javonetHandle.addEventListener("LoadFinished", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (LoadFinishedHandler handler : _LoadFinishedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], LoadFinishedEventArgs.class));}}});javonetHandle.addEventListener("ViewerActionResult", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<ViewerActionResultEventArgs> handler : _ViewerActionResultListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ViewerActionResultEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ListLabelPreviewControl (){  super((NObject) null); try {  javonetHandle = Javonet.New("ListLabelPreviewControl"); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("PageChanged", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (PageChangedHandler handler : _PageChangedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], PageChangedEventArgs.class));}}});javonetHandle.addEventListener("ZoomChanged", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<EventArgs> handler : _ZoomChangedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], EventArgs.class));}}});javonetHandle.addEventListener("ButtonPress", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (ButtonPressHandler handler : _ButtonPressListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ButtonPressEventArgs.class));}}});javonetHandle.addEventListener("LoadFinished", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (LoadFinishedHandler handler : _LoadFinishedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], LoadFinishedEventArgs.class));}}});javonetHandle.addEventListener("ViewerActionResult", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<ViewerActionResultEventArgs> handler : _ViewerActionResultListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ViewerActionResultEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ListLabelPreviewControl (ILlLogger logger){  super((NObject) null); try {  javonetHandle = Javonet.New("ListLabelPreviewControl",logger); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("PageChanged", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (PageChangedHandler handler : _PageChangedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], PageChangedEventArgs.class));}}});javonetHandle.addEventListener("ZoomChanged", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<EventArgs> handler : _ZoomChangedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], EventArgs.class));}}});javonetHandle.addEventListener("ButtonPress", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (ButtonPressHandler handler : _ButtonPressListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ButtonPressEventArgs.class));}}});javonetHandle.addEventListener("LoadFinished", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (LoadFinishedHandler handler : _LoadFinishedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], LoadFinishedEventArgs.class));}}});javonetHandle.addEventListener("ViewerActionResult", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<ViewerActionResultEventArgs> handler : _ViewerActionResultListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ViewerActionResultEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ListLabelPreviewControl(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void ZoomTimes2 (){ try { javonetHandle.invoke("ZoomTimes2");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void ZoomRevert (){ try { javonetHandle.invoke("ZoomRevert");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void ZoomReset (){ try { javonetHandle.invoke("ZoomReset");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void SelectSlideshowTransition (){ try { javonetHandle.invoke("SelectSlideshowTransition");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void PrintCurrentPage (java.lang.Boolean showPrintOptions){ try { javonetHandle.invoke("PrintCurrentPage",showPrintOptions);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void PrintAllPages (java.lang.Boolean showPrintOptions){ try { javonetHandle.invoke("PrintAllPages",showPrintOptions);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void GotoFirst (){ try { javonetHandle.invoke("GotoFirst");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void GotoLast (){ try { javonetHandle.invoke("GotoLast");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void GotoNext (){ try { javonetHandle.invoke("GotoNext");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void GotoPrevious (){ try { javonetHandle.invoke("GotoPrevious");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void SetZoom (LlZoomMode zoomMode,java.lang.Double value){ try { javonetHandle.invoke("SetZoom",NEnum.fromJavaEnum(zoomMode),value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void SetZoom (LlZoomPredefined zoomPredefined){ try { javonetHandle.invoke("SetZoom",NEnum.fromJavaEnum(zoomPredefined));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Double GetZoom (LlZoomMode zoomMode){ try { return javonetHandle.invoke("GetZoom",NEnum.fromJavaEnum(zoomMode));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * Method
	 */
            public void SetOption (java.lang.Integer option,java.lang.Integer value){ try { javonetHandle.invoke("SetOption",option,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void SetOptionString (java.lang.String option,java.lang.String value){ try { javonetHandle.invoke("SetOptionString",option,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.String GetOptionString (java.lang.String option){ try { return  (java.lang.String) javonetHandle.invoke("GetOptionString",option);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public void RefreshToolbar (){ try { javonetHandle.invoke("RefreshToolbar");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Integer GetActualButtonState (java.lang.Integer buttonID){ try { return javonetHandle.invoke("GetActualButtonState",buttonID);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Boolean CanClose (){ try { return javonetHandle.invoke("CanClose");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void SaveAs (){ try { javonetHandle.invoke("SaveAs");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void SendTo (){ try { javonetHandle.invoke("SendTo");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean SearchLink (java.lang.String searchText){ try { return javonetHandle.invoke("SearchLink",searchText);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void SearchFirst (java.lang.String searchText,java.lang.Boolean caseSensitive){ try { javonetHandle.invoke("SearchFirst",searchText,caseSensitive);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void SearchNext (){ try { javonetHandle.invoke("SearchNext");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void MoveToNextFile (){ try { javonetHandle.invoke("MoveToNextFile");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void MoveToPreviousFile (){ try { javonetHandle.invoke("MoveToPreviousFile");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Event
	 */
            private java.util.ArrayList< PageChangedHandler> _PageChangedListeners = new java.util.ArrayList<PageChangedHandler>();

            public void addPageChanged(PageChangedHandler toAdd)
            {
                _PageChangedListeners.add(toAdd);
            }
            public void removePageChanged(PageChangedHandler toRemove)
            {
                _PageChangedListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< EventHandler<EventArgs>> _ZoomChangedListeners = new java.util.ArrayList<EventHandler<EventArgs>>();

            public void addZoomChanged(EventHandler<EventArgs> toAdd)
            {
                _ZoomChangedListeners.add(toAdd);
            }
            public void removeZoomChanged(EventHandler<EventArgs> toRemove)
            {
                _ZoomChangedListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< ButtonPressHandler> _ButtonPressListeners = new java.util.ArrayList<ButtonPressHandler>();

            public void addButtonPress(ButtonPressHandler toAdd)
            {
                _ButtonPressListeners.add(toAdd);
            }
            public void removeButtonPress(ButtonPressHandler toRemove)
            {
                _ButtonPressListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< LoadFinishedHandler> _LoadFinishedListeners = new java.util.ArrayList<LoadFinishedHandler>();

            public void addLoadFinished(LoadFinishedHandler toAdd)
            {
                _LoadFinishedListeners.add(toAdd);
            }
            public void removeLoadFinished(LoadFinishedHandler toRemove)
            {
                _LoadFinishedListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< EventHandler<ViewerActionResultEventArgs>> _ViewerActionResultListeners = new java.util.ArrayList<EventHandler<ViewerActionResultEventArgs>>();

            public void addViewerActionResult(EventHandler<ViewerActionResultEventArgs> toAdd)
            {
                _ViewerActionResultListeners.add(toAdd);
            }
            public void removeViewerActionResult(EventHandler<ViewerActionResultEventArgs> toRemove)
            {
                _ViewerActionResultListeners.remove(toRemove);
            }public static class PageChangedEventArgs extends EventArgs {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setNewIndex (java.lang.Integer value){ try { javonetHandle.set("NewIndex",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getNewIndex (){ try { return javonetHandle.get("NewIndex");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }public PageChangedEventArgs (){  super((NObject) null); try {  javonetHandle = Javonet.New("PageChangedEventArgs"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PageChangedEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }}public static class ButtonPressEventArgs extends EventArgs {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setButtonID (java.lang.Integer value){ try { javonetHandle.set("ButtonID",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getButtonID (){ try { return javonetHandle.get("ButtonID");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setIgnore (java.lang.Boolean value){ try { javonetHandle.set("Ignore",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getIgnore (){ try { return javonetHandle.get("Ignore");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public ButtonPressEventArgs (){  super((NObject) null); try {  javonetHandle = Javonet.New("ButtonPressEventArgs"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ButtonPressEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }}public static class LoadFinishedEventArgs extends EventArgs {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public java.lang.Boolean getisSuccessful (){ try { return javonetHandle.get("isSuccessful");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetFiled
	 */
            public void setisSuccessful (java.lang.Boolean param){ try { javonetHandle.set("isSuccessful",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LoadFinishedEventArgs (){  super((NObject) null); try {  javonetHandle = Javonet.New("LoadFinishedEventArgs"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LoadFinishedEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }}public interface PageChangedHandler { public void Invoke (NObject sender,PageChangedEventArgs e);}public interface ButtonPressHandler { public void Invoke (NObject sender,ButtonPressEventArgs e);}public interface LoadFinishedHandler { public void Invoke (NObject sender,LoadFinishedEventArgs e);}	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}