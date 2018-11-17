package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;
import jio.System.Collections.Generic.*;
import Irony.*;public class LineContinuationTerminal extends Terminal {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public StringList getStartSymbols (){ try { return new StringList((NObject)javonetHandle.<NObject>get("StartSymbols"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setStartSymbols (StringList param){ try { javonetHandle.set("StartSymbols",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getLineTerminators (){ try { return  (java.lang.String) javonetHandle.get("LineTerminators");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setLineTerminators (java.lang.String param){ try { javonetHandle.set("LineTerminators",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LineContinuationTerminal (java.lang.String name,java.lang.String[] startSymbols){  super((NObject) null); try {  javonetHandle = Javonet.New("LineContinuationTerminal",name,new Object[] {startSymbols}); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LineContinuationTerminal(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Init (GrammarData grammarData){ try { javonetHandle.invoke("Init",grammarData);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public Token TryMatch (ParsingContext context,ISourceStream source){ try { return new Token((NObject)javonetHandle.invoke("TryMatch",context,source));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public IList<java.lang.String> GetFirsts (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetFirsts"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}