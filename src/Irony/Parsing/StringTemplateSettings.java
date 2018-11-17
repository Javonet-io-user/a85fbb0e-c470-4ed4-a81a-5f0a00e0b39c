package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;public class StringTemplateSettings {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public java.lang.String getStartTag (){ try { return  (java.lang.String) javonetHandle.get("StartTag");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setStartTag (java.lang.String param){ try { javonetHandle.set("StartTag",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getEndTag (){ try { return  (java.lang.String) javonetHandle.get("EndTag");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setEndTag (java.lang.String param){ try { javonetHandle.set("EndTag",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public NonTerminal getExpressionRoot (){ try { return new NonTerminal((NObject)javonetHandle.<NObject>get("ExpressionRoot"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setExpressionRoot (NonTerminal param){ try { javonetHandle.set("ExpressionRoot",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public StringTemplateSettings (){ try {  javonetHandle = Javonet.New("StringTemplateSettings");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public StringTemplateSettings(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}