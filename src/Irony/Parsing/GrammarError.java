package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;public class GrammarError {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public GrammarErrorLevel getLevel (){ try { return GrammarErrorLevel.valueOf(((NEnum) javonetHandle.<NObject>get("Level")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setLevel (GrammarErrorLevel param){ try { javonetHandle.set("Level",NEnum.fromJavaEnum(param));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getMessage (){ try { return  (java.lang.String) javonetHandle.get("Message");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setMessage (java.lang.String param){ try { javonetHandle.set("Message",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public ParserState getState (){ try { return new ParserState((NObject)javonetHandle.<NObject>get("State"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setState (ParserState param){ try { javonetHandle.set("State",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public GrammarError (GrammarErrorLevel level,ParserState state,java.lang.String message){ try {  javonetHandle = Javonet.New("GrammarError",NEnum.fromJavaEnum(level),state,message);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public GrammarError(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.String ToString (){ try { return  (java.lang.String) javonetHandle.invoke("ToString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}