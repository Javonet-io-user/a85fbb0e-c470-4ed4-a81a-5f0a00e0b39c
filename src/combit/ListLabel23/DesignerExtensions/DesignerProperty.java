package combit.ListLabel23.DesignerExtensions;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DesignerExtensions.*;
import jio.System.*;public abstract class DesignerProperty implements IDesignerProperty,IDisposable {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setName (java.lang.String value){ try { javonetHandle.set("Name",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getName (){ try { return  (java.lang.String) javonetHandle.get("Name");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDisplayName (java.lang.String value){ try { javonetHandle.set("DisplayName",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDisplayName (){ try { return  (java.lang.String) javonetHandle.get("DisplayName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDescription (java.lang.String value){ try { javonetHandle.set("Description",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDescription (){ try { return  (java.lang.String) javonetHandle.get("Description");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setGroup (java.lang.String value){ try { javonetHandle.set("Group",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getGroup (){ try { return  (java.lang.String) javonetHandle.get("Group");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDefaultValue (NObject value){ try { javonetHandle.set("DefaultValue",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public NObject getDefaultValue (){ try { return  (NObject) javonetHandle.<NObject>get("DefaultValue");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setAllowFormula (java.lang.Boolean value){ try { javonetHandle.set("AllowFormula",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getAllowFormula (){ try { return javonetHandle.get("AllowFormula");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setEnabled (java.lang.Boolean value){ try { javonetHandle.set("Enabled",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getEnabled (){ try { return javonetHandle.get("Enabled");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setFormula (NObject value){ try { javonetHandle.set("Formula",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public NObject getFormula (){ try { return  (NObject) javonetHandle.<NObject>get("Formula");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getHasChanged (){ try { return javonetHandle.get("HasChanged");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public NObject getValue (){ try { return  (NObject) javonetHandle.<NObject>get("Value");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public DesignerProperty(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Dispose (){ try { javonetHandle.invoke("Dispose");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Integer GetHashCode (){ try { return javonetHandle.invoke("GetHashCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer SetLLJob (java.lang.Integer jobHandle,java.lang.Integer baseInterface){ try { return javonetHandle.invoke("SetLLJob",jobHandle,baseInterface);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer GetName (AtomicReference<java.lang.String> name){ try { return javonetHandle.invoke("GetName",new NOut(name, Helper.JavaToDotnetType.get(java.lang.String.class)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer SetPropertyItem (NObject propertyItem){ try { return javonetHandle.invoke("SetPropertyItem",propertyItem);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer GetOption (java.lang.String option,NObject value){ try { return javonetHandle.invoke("GetOption",option,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer NotifyChanged (){ try { return javonetHandle.invoke("NotifyChanged");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer NotifyButtonClicked (){ try { return javonetHandle.invoke("NotifyButtonClicked");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Event
	 */
            private java.util.ArrayList< EventHandler<EventArgs>> _ValueChangedListeners = new java.util.ArrayList<EventHandler<EventArgs>>();

            public void addValueChanged(EventHandler<EventArgs> toAdd)
            {
                _ValueChangedListeners.add(toAdd);
            }
            public void removeValueChanged(EventHandler<EventArgs> toRemove)
            {
                _ValueChangedListeners.remove(toRemove);
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}