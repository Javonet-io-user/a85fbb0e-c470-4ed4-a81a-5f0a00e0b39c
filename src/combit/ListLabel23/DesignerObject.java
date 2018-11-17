package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.ComponentModel.*;
import combit.ListLabel23.*;
import jio.System.Drawing.*;
import jio.System.Collections.*;
import combit.ListLabel23.DesignerExtensions.*;
import jio.System.*;public class DesignerObject extends Component implements IDesignerObject,IPropertyEnumeration {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setSupportsContentDialog (java.lang.Boolean value){ try { javonetHandle.set("SupportsContentDialog",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getSupportsContentDialog (){ try { return javonetHandle.get("SupportsContentDialog");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public LlUnits getUnitSystem (){ try { return LlUnits.valueOf(((NEnum) javonetHandle.<NObject>get("UnitSystem")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.String getExportFormat (){ try { return  (java.lang.String) javonetHandle.get("ExportFormat");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getPageIsOutOfPrintingRange (){ try { return javonetHandle.get("PageIsOutOfPrintingRange");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setObjectName (java.lang.String value){ try { javonetHandle.set("ObjectName",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getObjectName (){ try { return  (java.lang.String) javonetHandle.get("ObjectName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDescription (java.lang.String value){ try { javonetHandle.set("Description",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDescription (){ try { return  (java.lang.String) javonetHandle.get("Description");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setAllowPageBreak (java.lang.Boolean value){ try { javonetHandle.set("AllowPageBreak",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getAllowPageBreak (){ try { return javonetHandle.get("AllowPageBreak");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setIcon (Icon value){ try { javonetHandle.set("Icon",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Icon getIcon (){ try { return new Icon((NObject)javonetHandle.<NObject>get("Icon"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSmallRibbonImage (Image value){ try { javonetHandle.set("SmallRibbonImage",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Image getSmallRibbonImage (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("SmallRibbonImage"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setLargeRibbonImage (Image value){ try { javonetHandle.set("LargeRibbonImage",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Image getLargeRibbonImage (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("LargeRibbonImage"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setTooltipDescription (java.lang.String value){ try { javonetHandle.set("TooltipDescription",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTooltipDescription (){ try { return  (java.lang.String) javonetHandle.get("TooltipDescription");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setFont (Font value){ try { javonetHandle.set("Font",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Font getFont (){ try { return new Font((NObject)javonetHandle.<NObject>get("Font"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public IDictionary getObjectProperties (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("ObjectProperties"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getIsInTableCell (){ try { return javonetHandle.get("IsInTableCell");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public DesignerPropertyCollection getDesignerProperties (){ try { return new DesignerPropertyCollection((NObject)javonetHandle.<NObject>get("DesignerProperties"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public DesignerObject (){  super((NObject) null); try {  javonetHandle = Javonet.New("DesignerObject"); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("SetOptionString", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (SetOptionStringHandler handler : _SetOptionStringListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], SetOptionStringEventArgs.class));}}});javonetHandle.addEventListener("PostCloneDesignerObject", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (PostCloneDesignerObjectHandler handler : _PostCloneDesignerObjectListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], PostCloneDesignerObjectEventArgs.class));}}});javonetHandle.addEventListener("DrawDesignerObject", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (DrawDesignerObjectHandler handler : _DrawDesignerObjectListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], DrawDesignerObjectEventArgs.class));}}});javonetHandle.addEventListener("EditDesignerObject", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EditDesignerObjectHandler handler : _EditDesignerObjectListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], EditDesignerObjectEventArgs.class));}}});javonetHandle.addEventListener("CreateDesignerObject", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (CreateDesignerObjectHandler handler : _CreateDesignerObjectListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], CreateDesignerObjectEventArgs.class));}}});javonetHandle.addEventListener("ResetPrintState", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (ResetPrintStateDesignerObjectHandler handler : _ResetPrintStateListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], EventArgs.class));}}});javonetHandle.addEventListener("GetFieldHeightInformation", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (GetFieldHeightInformationHandler handler : _GetFieldHeightInformationListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], GetFieldHeightInformationEventArgs.class));}}});javonetHandle.addEventListener("InitializationFinished", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<EventArgs> handler : _InitializationFinishedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], EventArgs.class));}}});javonetHandle.addEventListener("PrintStartDesignerObject", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (PrintStartDesignerObjectHandler handler : _PrintStartDesignerObjectListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], EventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DesignerObject(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void UpdateView (java.lang.Boolean changed){ try { javonetHandle.invoke("UpdateView",changed);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void UpdateView (java.lang.Boolean changed,java.lang.Boolean immediate){ try { javonetHandle.invoke("UpdateView",changed,immediate);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Integer SetLLJob (java.lang.Integer hLLJob,java.lang.Integer pLLBase){ try { return javonetHandle.invoke("SetLLJob",hLLJob,pLLBase);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer GetName (AtomicReference<java.lang.String> pbsName){ try { return javonetHandle.invoke("GetName",new NOut(pbsName, Helper.JavaToDotnetType.get(java.lang.String.class)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer GetDescr (AtomicReference<java.lang.String> pbsDescr){ try { return javonetHandle.invoke("GetDescr",new NOut(pbsDescr, Helper.JavaToDotnetType.get(java.lang.String.class)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer GetIcon (java.lang.Integer phIcon){ try { return javonetHandle.invoke("GetIcon",phIcon);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer IsProjectSupported (java.lang.Integer nProjType,AtomicReference<java.lang.Boolean> pbSupported){ try { return javonetHandle.invoke("IsProjectSupported",nProjType,new NOut(pbSupported, Helper.JavaToDotnetType.get(java.lang.Boolean.class)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer SetOption (java.lang.Integer nOption,java.lang.Integer nValue){ try { return javonetHandle.invoke("SetOption",nOption,nValue);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer GetOption (java.lang.Integer nOption,java.lang.Integer pnValue){ try { return javonetHandle.invoke("GetOption",nOption,pnValue);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer SetOptionString (java.lang.String sOption,java.lang.String sText){ try { return javonetHandle.invoke("SetOptionString",sOption,sText);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer GetOptionString (java.lang.String sOption,AtomicReference<java.lang.String> psText){ try { return javonetHandle.invoke("GetOptionString",sOption,new NOut(psText, Helper.JavaToDotnetType.get(java.lang.String.class)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer SetParameters (NObject pUnk){ try { return javonetHandle.invoke("SetParameters",pUnk);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer GetParameters (NObject pUnk){ try { return javonetHandle.invoke("GetParameters",pUnk);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer Clone (NObject ppNewObj){ try { return javonetHandle.invoke("Clone",ppNewObj);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer FirstCreation (java.lang.Integer hWndParent){ try { return javonetHandle.invoke("FirstCreation",hWndParent);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer GetMinDimensionsSCM (java.lang.Boolean bForNew,AtomicReference<java.lang.Integer> ptMinSize){ try { return javonetHandle.invoke("GetMinDimensionsSCM",bForNew,new NRef(ptMinSize));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer Show (java.lang.Integer hDC,RECT prcPaint,java.lang.Integer hExportProfJob,java.lang.Integer hExportProfList,java.lang.Integer nExportVerbosity,java.lang.Integer nDestination,java.lang.Boolean bSelected){ try { return javonetHandle.invoke("Show",hDC,prcPaint,hExportProfJob,hExportProfList,nExportVerbosity,nDestination,bSelected);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer GetTrueRect (RECT prc){ try { return javonetHandle.invoke("GetTrueRect",prc);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer GetErrorcode (){ try { return javonetHandle.invoke("GetErrorcode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer AllowPageBreak (){ try { return javonetHandle.invoke("AllowPageBreak");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer ResetPrintState (){ try { return javonetHandle.invoke("ResetPrintState");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer ForceResetPrintState (){ try { return javonetHandle.invoke("ForceResetPrintState");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer PrintWaiting (){ try { return javonetHandle.invoke("PrintWaiting");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer PrintUnfinished (){ try { return javonetHandle.invoke("PrintUnfinished");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer PrintFinished (){ try { return javonetHandle.invoke("PrintFinished");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer PrintPastFinished (){ try { return javonetHandle.invoke("PrintPastFinished");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer SetNtfySink (NObject pNtfySink){ try { return javonetHandle.invoke("SetNtfySink",pNtfySink);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer Edit (java.lang.Integer hWnd,PointInt ptMouse){ try { return javonetHandle.invoke("Edit",hWnd,ptMouse);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer ClearEditPartInfo (){ try { return javonetHandle.invoke("ClearEditPartInfo");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer CanEditPart (PointInt ptMouse,java.lang.Integer phMenu){ try { return javonetHandle.invoke("CanEditPart",ptMouse,phMenu);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer EditPart (java.lang.Integer hWnd,PointInt ptMouse,java.lang.Integer nMenuID){ try { return javonetHandle.invoke("EditPart",hWnd,ptMouse,nMenuID);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer CancelEditPart (){ try { return javonetHandle.invoke("CancelEditPart");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer OnDragDrop (java.lang.Integer pDataObj,java.lang.Integer grfKeyState,PointInt p,java.lang.Integer pdwEffect,java.lang.Boolean bQuery){ try { return javonetHandle.invoke("OnDragDrop",pDataObj,grfKeyState,p,pdwEffect,bQuery);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer IsSetFontSupported (AtomicReference<java.lang.Boolean> pbSupported){ try { return javonetHandle.invoke("IsSetFontSupported",new NOut(pbSupported, Helper.JavaToDotnetType.get(java.lang.Boolean.class)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer SetFont (java.lang.Integer pLF,java.lang.Integer nSize,java.lang.Integer rgbColor){ try { return javonetHandle.invoke("SetFont",pLF,nSize,rgbColor);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer OnObject (java.lang.Integer hDC,PointInt ptMouse){ try { return javonetHandle.invoke("OnObject",hDC,ptMouse);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer InObject (java.lang.Integer hDC,PointInt ptMouse){ try { return javonetHandle.invoke("InObject",hDC,ptMouse);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer CalcDistanceToFrame (java.lang.Integer hDC,PointInt ptMouse,AtomicReference<java.lang.Integer> pnDistance){ try { return javonetHandle.invoke("CalcDistanceToFrame",hDC,ptMouse,new NRef(pnDistance));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer OnMouseMove (java.lang.Integer hDC,PointInt ptMouse,java.lang.Integer phCrs){ try { return javonetHandle.invoke("OnMouseMove",hDC,ptMouse,phCrs);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer OnMouseLButton (java.lang.Integer hDC,PointInt ptMouse,java.lang.Integer hWnd){ try { return javonetHandle.invoke("OnMouseLButton",hDC,ptMouse,hWnd);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer OnDeclareChartRow (java.lang.String sActiveTable){ try { return javonetHandle.invoke("OnDeclareChartRow",sActiveTable);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer CanCreateObjectFromType (java.lang.Integer nLLType,java.lang.String sVarName,RECT prcCreate){ try { return javonetHandle.invoke("CanCreateObjectFromType",nLLType,sVarName,prcCreate);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer GetVarSizeInfo (java.lang.Integer hDC,java.lang.Integer prcSpaceAvailable,AtomicReference<java.lang.Integer> pnMinHeight,AtomicReference<java.lang.Integer> pnIdealHeight){ try { return javonetHandle.invoke("GetVarSizeInfo",hDC,prcSpaceAvailable,new NRef(pnMinHeight),new NRef(pnIdealHeight));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer Next (java.lang.Integer size,NObject property,AtomicReference<java.lang.Integer> count){ try { return javonetHandle.invoke("Next",size,property,new NOut(count, Helper.JavaToDotnetType.get(java.lang.Integer.class)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer Skip (java.lang.Integer value){ try { return javonetHandle.invoke("Skip",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer Reset (){ try { return javonetHandle.invoke("Reset");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public IPropertyEnumeration Clone (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("Clone"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Event
	 */
            private java.util.ArrayList< SetOptionStringHandler> _SetOptionStringListeners = new java.util.ArrayList<SetOptionStringHandler>();

            public void addSetOptionString(SetOptionStringHandler toAdd)
            {
                _SetOptionStringListeners.add(toAdd);
            }
            public void removeSetOptionString(SetOptionStringHandler toRemove)
            {
                _SetOptionStringListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< PostCloneDesignerObjectHandler> _PostCloneDesignerObjectListeners = new java.util.ArrayList<PostCloneDesignerObjectHandler>();

            public void addPostCloneDesignerObject(PostCloneDesignerObjectHandler toAdd)
            {
                _PostCloneDesignerObjectListeners.add(toAdd);
            }
            public void removePostCloneDesignerObject(PostCloneDesignerObjectHandler toRemove)
            {
                _PostCloneDesignerObjectListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< DrawDesignerObjectHandler> _DrawDesignerObjectListeners = new java.util.ArrayList<DrawDesignerObjectHandler>();

            public void addDrawDesignerObject(DrawDesignerObjectHandler toAdd)
            {
                _DrawDesignerObjectListeners.add(toAdd);
            }
            public void removeDrawDesignerObject(DrawDesignerObjectHandler toRemove)
            {
                _DrawDesignerObjectListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< EditDesignerObjectHandler> _EditDesignerObjectListeners = new java.util.ArrayList<EditDesignerObjectHandler>();

            public void addEditDesignerObject(EditDesignerObjectHandler toAdd)
            {
                _EditDesignerObjectListeners.add(toAdd);
            }
            public void removeEditDesignerObject(EditDesignerObjectHandler toRemove)
            {
                _EditDesignerObjectListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< CreateDesignerObjectHandler> _CreateDesignerObjectListeners = new java.util.ArrayList<CreateDesignerObjectHandler>();

            public void addCreateDesignerObject(CreateDesignerObjectHandler toAdd)
            {
                _CreateDesignerObjectListeners.add(toAdd);
            }
            public void removeCreateDesignerObject(CreateDesignerObjectHandler toRemove)
            {
                _CreateDesignerObjectListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< ResetPrintStateDesignerObjectHandler> _ResetPrintStateListeners = new java.util.ArrayList<ResetPrintStateDesignerObjectHandler>();

            public void addResetPrintState(ResetPrintStateDesignerObjectHandler toAdd)
            {
                _ResetPrintStateListeners.add(toAdd);
            }
            public void removeResetPrintState(ResetPrintStateDesignerObjectHandler toRemove)
            {
                _ResetPrintStateListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< GetFieldHeightInformationHandler> _GetFieldHeightInformationListeners = new java.util.ArrayList<GetFieldHeightInformationHandler>();

            public void addGetFieldHeightInformation(GetFieldHeightInformationHandler toAdd)
            {
                _GetFieldHeightInformationListeners.add(toAdd);
            }
            public void removeGetFieldHeightInformation(GetFieldHeightInformationHandler toRemove)
            {
                _GetFieldHeightInformationListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< EventHandler<EventArgs>> _InitializationFinishedListeners = new java.util.ArrayList<EventHandler<EventArgs>>();

            public void addInitializationFinished(EventHandler<EventArgs> toAdd)
            {
                _InitializationFinishedListeners.add(toAdd);
            }
            public void removeInitializationFinished(EventHandler<EventArgs> toRemove)
            {
                _InitializationFinishedListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< PrintStartDesignerObjectHandler> _PrintStartDesignerObjectListeners = new java.util.ArrayList<PrintStartDesignerObjectHandler>();

            public void addPrintStartDesignerObject(PrintStartDesignerObjectHandler toAdd)
            {
                _PrintStartDesignerObjectListeners.add(toAdd);
            }
            public void removePrintStartDesignerObject(PrintStartDesignerObjectHandler toRemove)
            {
                _PrintStartDesignerObjectListeners.remove(toRemove);
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}