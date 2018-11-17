package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;
import jio.System.Collections.Generic.*;
import jio.System.*;public class CustomParserAction extends ParserAction {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public LanguageData getLanguage (){ try { return new LanguageData((NObject)javonetHandle.<NObject>get("Language"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setLanguage (LanguageData param){ try { javonetHandle.set("Language",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public ParserState getState (){ try { return new ParserState((NObject)javonetHandle.<NObject>get("State"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setState (ParserState param){ try { javonetHandle.set("State",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public ExecuteActionMethod getExecuteRef (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("ExecuteRef"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setExecuteRef (ExecuteActionMethod param){ try { javonetHandle.set("ExecuteRef",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public TerminalSet getConflicts (){ try { return new TerminalSet((NObject)javonetHandle.<NObject>get("Conflicts"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setConflicts (TerminalSet param){ try { javonetHandle.set("Conflicts",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public IList<ShiftParserAction> getShiftActions (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("ShiftActions"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setShiftActions (IList<ShiftParserAction> param){ try { javonetHandle.set("ShiftActions",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public IList<ReduceParserAction> getReduceActions (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("ReduceActions"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setReduceActions (IList<ReduceParserAction> param){ try { javonetHandle.set("ReduceActions",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public NObject getCustomData (){ try { return  (NObject) javonetHandle.<NObject>get("CustomData");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setCustomData (NObject param){ try { javonetHandle.set("CustomData",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CustomParserAction (LanguageData language,ParserState state,ExecuteActionMethod executeRef){  super((NObject) null); try {  javonetHandle = Javonet.New("CustomParserAction",language,state,executeRef); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CustomParserAction(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Execute (ParsingContext context){ try { javonetHandle.invoke("Execute",context);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.String ToString (){ try { return  (java.lang.String) javonetHandle.invoke("ToString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}