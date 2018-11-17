package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;public class ParserTraceEntry {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public ParserState getState (){ try { return new ParserState((NObject)javonetHandle.<NObject>get("State"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setState (ParserState param){ try { javonetHandle.set("State",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public ParseTreeNode getStackTop (){ try { return new ParseTreeNode((NObject)javonetHandle.<NObject>get("StackTop"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setStackTop (ParseTreeNode param){ try { javonetHandle.set("StackTop",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public ParseTreeNode getInput (){ try { return new ParseTreeNode((NObject)javonetHandle.<NObject>get("Input"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setInput (ParseTreeNode param){ try { javonetHandle.set("Input",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getMessage (){ try { return  (java.lang.String) javonetHandle.get("Message");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setMessage (java.lang.String param){ try { javonetHandle.set("Message",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Boolean getIsError (){ try { return javonetHandle.get("IsError");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetFiled
	 */
            public void setIsError (java.lang.Boolean param){ try { javonetHandle.set("IsError",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ParserTraceEntry (ParserState state,ParseTreeNode stackTop,ParseTreeNode input,java.lang.String message,java.lang.Boolean isError){ try {  javonetHandle = Javonet.New("ParserTraceEntry",state,stackTop,input,message,isError);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ParserTraceEntry(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}