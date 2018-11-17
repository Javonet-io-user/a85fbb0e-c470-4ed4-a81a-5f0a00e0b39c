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
import jio.System.ComponentModel.*;public class ListLabelRTFControl extends Control implements ILlRtfEventSink {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.Integer getObjectInstance (){ try { return javonetHandle.<NObject>get("ObjectInstance");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setParentComponent (ListLabel value){ try { javonetHandle.set("ParentComponent",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public ListLabel getParentComponent (){ try { return new ListLabel((NObject)javonetHandle.<NObject>get("ParentComponent"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setTextMode (LlRTFTextMode value){ try { javonetHandle.set("TextMode",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlRTFTextMode getTextMode (){ try { return LlRTFTextMode.valueOf(((NEnum) javonetHandle.<NObject>get("TextMode")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setContentMode (LlRTFContentMode value){ try { javonetHandle.set("ContentMode",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlRTFContentMode getContentMode (){ try { return LlRTFContentMode.valueOf(((NEnum) javonetHandle.<NObject>get("ContentMode")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setContent (java.lang.String value){ try { javonetHandle.set("Content",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getContent (){ try { return  (java.lang.String) javonetHandle.get("Content");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setSelectedText (java.lang.String value){ try { javonetHandle.set("SelectedText",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSelectedText (){ try { return  (java.lang.String) javonetHandle.get("SelectedText");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.Integer getRtfControlHandle (){ try { return javonetHandle.<NObject>get("RtfControlHandle");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSelectionStart (java.lang.Integer value){ try { javonetHandle.set("SelectionStart",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getSelectionStart (){ try { return javonetHandle.get("SelectionStart");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setSelectionLength (java.lang.Integer value){ try { javonetHandle.set("SelectionLength",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getSelectionLength (){ try { return javonetHandle.get("SelectionLength");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }public ListLabelRTFControl (IContainer container){  super((NObject) null); try {  javonetHandle = Javonet.New("ListLabelRTFControl",container); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("SelectionChanged", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<EventArgs> handler : _SelectionChangedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], EventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ListLabelRTFControl (){  super((NObject) null); try {  javonetHandle = Javonet.New("ListLabelRTFControl"); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("SelectionChanged", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<EventArgs> handler : _SelectionChangedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], EventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ListLabelRTFControl(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void CopyToClipboard (){ try { javonetHandle.invoke("CopyToClipboard");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void ProhibitAction (java.lang.Integer buttonID){ try { javonetHandle.invoke("ProhibitAction",buttonID);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void InvokeAction (java.lang.Integer buttonID){ try { javonetHandle.invoke("InvokeAction",buttonID);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void ProhibitAction (LlRTFEditorAction action){ try { javonetHandle.invoke("ProhibitAction",NEnum.fromJavaEnum(action));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void InvokeAction (LlRTFEditorAction action){ try { javonetHandle.invoke("InvokeAction",NEnum.fromJavaEnum(action));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void OnSelectionChanged (java.lang.Integer type,java.lang.Integer min,java.lang.Integer max){ try { javonetHandle.invoke("OnSelectionChanged",type,min,max);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void OnContentsChanged (){ try { javonetHandle.invoke("OnContentsChanged");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean OnKeyDown (java.lang.Integer keyCode,java.lang.Integer lParam){ try { return javonetHandle.invoke("OnKeyDown",keyCode,lParam);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean OnKeyUp (java.lang.Integer keyCode,java.lang.Integer lParam){ try { return javonetHandle.invoke("OnKeyUp",keyCode,lParam);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean OnChar (java.lang.Integer character,java.lang.Integer lParam){ try { return javonetHandle.invoke("OnChar",character,lParam);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean OnDialogKey (java.lang.Boolean down,java.lang.Integer keyCode,java.lang.Integer lParam){ try { return javonetHandle.invoke("OnDialogKey",down,keyCode,lParam);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Event
	 */
            private java.util.ArrayList< EventHandler<EventArgs>> _SelectionChangedListeners = new java.util.ArrayList<EventHandler<EventArgs>>();

            public void addSelectionChanged(EventHandler<EventArgs> toAdd)
            {
                _SelectionChangedListeners.add(toAdd);
            }
            public void removeSelectionChanged(EventHandler<EventArgs> toRemove)
            {
                _SelectionChangedListeners.remove(toRemove);
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}