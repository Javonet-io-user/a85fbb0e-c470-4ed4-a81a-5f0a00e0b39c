package Irony;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.*;
import Irony.Parsing.*;public class LogMessage {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public ErrorLevel getLevel (){ try { return ErrorLevel.valueOf(((NEnum) javonetHandle.<NObject>get("Level")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setLevel (ErrorLevel param){ try { javonetHandle.set("Level",NEnum.fromJavaEnum(param));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public ParserState getParserState (){ try { return new ParserState((NObject)javonetHandle.<NObject>get("ParserState"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setParserState (ParserState param){ try { javonetHandle.set("ParserState",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public SourceLocation getLocation (){ try { return javonetHandle.<NObject>get("Location");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setLocation (SourceLocation param){ try { javonetHandle.set("Location",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getMessage (){ try { return  (java.lang.String) javonetHandle.get("Message");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setMessage (java.lang.String param){ try { javonetHandle.set("Message",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LogMessage (ErrorLevel level,SourceLocation location,java.lang.String message,ParserState parserState){ try {  javonetHandle = Javonet.New("LogMessage",NEnum.fromJavaEnum(level),location,message,parserState);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LogMessage(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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