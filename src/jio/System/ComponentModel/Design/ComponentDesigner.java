package jio.System.ComponentModel.Design;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.ComponentModel.Design.*;
import jio.System.*;
import jio.System.Collections.*;public class ComponentDesigner implements ITreeDesigner,IDesigner,IDisposable,IDesignerFilter,IComponentInitializer {protected NObject javonetHandle; public ComponentDesigner (){ try {  javonetHandle = Javonet.New("ComponentDesigner");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ComponentDesigner(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public ICollection get_Children (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("get_Children"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public IDesigner get_Parent (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("get_Parent"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void PostFilterAttributes (IDictionary attributes){ try { javonetHandle.invoke("PostFilterAttributes",attributes);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void PostFilterEvents (IDictionary events){ try { javonetHandle.invoke("PostFilterEvents",events);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void PostFilterProperties (IDictionary properties){ try { javonetHandle.invoke("PostFilterProperties",properties);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void PreFilterAttributes (IDictionary attributes){ try { javonetHandle.invoke("PreFilterAttributes",attributes);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void PreFilterEvents (IDictionary events){ try { javonetHandle.invoke("PreFilterEvents",events);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void PreFilterProperties (IDictionary properties){ try { javonetHandle.invoke("PreFilterProperties",properties);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}