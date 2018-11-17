package combit.ListLabel23.DesignerExtensions;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DesignerExtensions.*;
import jio.System.*;
import jio.System.Collections.Generic.*;public class DictionaryDesignerProperty extends DesignerProperty implements IDictionaryItemsEnumeration {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public Dictionary<NObject,java.lang.String> getDictionary (){ try { return new Dictionary<NObject,java.lang.String>((NObject)javonetHandle.<NObject>get("Dictionary"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public DictionaryDesignerProperty (java.lang.String name,NObject defaultValue){  super((NObject) null); try {  javonetHandle = Javonet.New("DictionaryDesignerProperty",name,defaultValue); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DictionaryDesignerProperty(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Integer Next (java.lang.Integer size,NObject key,AtomicReference<java.lang.String> value,AtomicReference<java.lang.Integer> count){ try { return javonetHandle.invoke("Next",size,key,new NOut(value, Helper.JavaToDotnetType.get(java.lang.String.class)),new NOut(count, Helper.JavaToDotnetType.get(java.lang.Integer.class)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer Skip (java.lang.Integer value){ try { return javonetHandle.invoke("Skip",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer Reset (){ try { return javonetHandle.invoke("Reset");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}