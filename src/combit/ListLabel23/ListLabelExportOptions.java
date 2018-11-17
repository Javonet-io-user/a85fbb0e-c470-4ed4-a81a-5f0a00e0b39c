package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.*;
import jio.System.Collections.*;public class ListLabelExportOptions {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void set_Item (java.lang.String option,java.lang.String value){ try { javonetHandle.invoke("set_Item",option,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String get_Item (java.lang.String option){ try { return  (java.lang.String) javonetHandle.invoke("get_Item",option);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void set_Item (LlExportOption option,java.lang.String value){ try { javonetHandle.invoke("set_Item",NEnum.fromJavaEnum(option),value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String get_Item (LlExportOption option){ try { return  (java.lang.String) javonetHandle.invoke("get_Item",NEnum.fromJavaEnum(option));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.Integer getCount (){ try { return javonetHandle.get("Count");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public ICollection getKeys (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("Keys"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public ListLabelExportOptions (ListLabel parent){ try {  javonetHandle = Javonet.New("ListLabelExportOptions",parent);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ListLabelExportOptions(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Clear (){ try { javonetHandle.invoke("Clear");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean Contains (java.lang.String option){ try { return javonetHandle.invoke("Contains",option);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean Contains (LlExportOption option){ try { return javonetHandle.invoke("Contains",NEnum.fromJavaEnum(option));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void Add (java.lang.String option,java.lang.String value){ try { javonetHandle.invoke("Add",option,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (LlExportOption option,java.lang.String value){ try { javonetHandle.invoke("Add",NEnum.fromJavaEnum(option),value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}