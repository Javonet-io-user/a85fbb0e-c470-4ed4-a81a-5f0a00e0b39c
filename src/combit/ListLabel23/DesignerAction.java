package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.ComponentModel.*;
import combit.ListLabel23.*;
import jio.System.Windows.Forms.*;
import jio.System.*;public class DesignerAction extends Component {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setMenuText (java.lang.String value){ try { javonetHandle.set("MenuText",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMenuText (){ try { return  (java.lang.String) javonetHandle.get("MenuText");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setMenuHierarchy (java.lang.String value){ try { javonetHandle.set("MenuHierarchy",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getMenuHierarchy (){ try { return  (java.lang.String) javonetHandle.get("MenuHierarchy");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setTooltipText (java.lang.String value){ try { javonetHandle.set("TooltipText",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTooltipText (){ try { return  (java.lang.String) javonetHandle.get("TooltipText");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setAddToToolbar (java.lang.Boolean value){ try { javonetHandle.set("AddToToolbar",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getAddToToolbar (){ try { return javonetHandle.get("AddToToolbar");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setInsertionType (LlActionInsertionType value){ try { javonetHandle.set("InsertionType",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlActionInsertionType getInsertionType (){ try { return LlActionInsertionType.valueOf(((NEnum) javonetHandle.<NObject>get("InsertionType")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setIconId (java.lang.Integer value){ try { javonetHandle.set("IconId",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getIconId (){ try { return javonetHandle.get("IconId");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setShortcutKeys (Keys value){ try { javonetHandle.set("ShortcutKeys",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Keys getShortcutKeys (){ try { return Keys.valueOf(((NEnum) javonetHandle.<NObject>get("ShortcutKeys")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public DesignerAction (){  super((NObject) null); try {  javonetHandle = Javonet.New("DesignerAction"); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("ExecuteAction", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (ExecuteActionHandler handler : _ExecuteActionListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], EventArgs.class));}}});javonetHandle.addEventListener("GetActionState", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (GetActionStateHandler handler : _GetActionStateListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], GetActionStateEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DesignerAction(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Event
	 */
            private java.util.ArrayList< ExecuteActionHandler> _ExecuteActionListeners = new java.util.ArrayList<ExecuteActionHandler>();

            public void addExecuteAction(ExecuteActionHandler toAdd)
            {
                _ExecuteActionListeners.add(toAdd);
            }
            public void removeExecuteAction(ExecuteActionHandler toRemove)
            {
                _ExecuteActionListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< GetActionStateHandler> _GetActionStateListeners = new java.util.ArrayList<GetActionStateHandler>();

            public void addGetActionState(GetActionStateHandler toAdd)
            {
                _GetActionStateListeners.add(toAdd);
            }
            public void removeGetActionState(GetActionStateHandler toRemove)
            {
                _GetActionStateListeners.remove(toRemove);
            } public enum LlActionInsertionType{Append(0L),Insert(268435456L),; private long numVal;LlActionInsertionType(long numVal) {
		        this.numVal = numVal;
		    }
		
		    public long getNumVal() {
		        return numVal;
		    }
            }public interface ExecuteActionHandler { public void Invoke (NObject sender,EventArgs e);}public interface GetActionStateHandler { public void Invoke (NObject sender,GetActionStateEventArgs e);}	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}