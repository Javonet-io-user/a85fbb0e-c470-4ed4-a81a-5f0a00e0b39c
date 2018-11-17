package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;
import jio.System.Drawing.*;public class PropertyRect extends DomItem {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setLeft (java.lang.String value){ try { javonetHandle.set("Left",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getLeft (){ try { return  (java.lang.String) javonetHandle.get("Left");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setTop (java.lang.String value){ try { javonetHandle.set("Top",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTop (){ try { return  (java.lang.String) javonetHandle.get("Top");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setWidth (java.lang.String value){ try { javonetHandle.set("Width",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getWidth (){ try { return  (java.lang.String) javonetHandle.get("Width");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setHeight (java.lang.String value){ try { javonetHandle.set("Height",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getHeight (){ try { return  (java.lang.String) javonetHandle.get("Height");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PropertyRect(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Set (Rectangle rect){ try { javonetHandle.invoke("Set",rect);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Set (java.lang.Integer left,java.lang.Integer top,java.lang.Integer width,java.lang.Integer height){ try { javonetHandle.invoke("Set",left,top,width,height);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Set (java.lang.String left,java.lang.String top,java.lang.String width,java.lang.String height){ try { javonetHandle.invoke("Set",left,top,width,height);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public Rectangle Get (){ try { return javonetHandle.invoke("Get");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}