package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;
import Irony.*;public class ParserState {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public java.lang.String getName (){ try { return  (java.lang.String) javonetHandle.get("Name");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setName (java.lang.String param){ try { javonetHandle.set("Name",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public ParserActionTable getActions (){ try { return new ParserActionTable((NObject)javonetHandle.<NObject>get("Actions"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setActions (ParserActionTable param){ try { javonetHandle.set("Actions",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public ParserAction getDefaultAction (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("DefaultAction"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setDefaultAction (ParserAction param){ try { javonetHandle.set("DefaultAction",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public TerminalSet getExpectedTerminals (){ try { return new TerminalSet((NObject)javonetHandle.<NObject>get("ExpectedTerminals"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setExpectedTerminals (TerminalSet param){ try { javonetHandle.set("ExpectedTerminals",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public StringSet getReportedExpectedSet (){ try { return new StringSet((NObject)javonetHandle.<NObject>get("ReportedExpectedSet"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setReportedExpectedSet (StringSet param){ try { javonetHandle.set("ReportedExpectedSet",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getCustomFlags (){ try { return javonetHandle.get("CustomFlags");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setCustomFlags (java.lang.Integer param){ try { javonetHandle.set("CustomFlags",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ParserState (java.lang.String name){ try {  javonetHandle = Javonet.New("ParserState",name);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ParserState(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void ClearData (){ try { javonetHandle.invoke("ClearData");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.String ToString (){ try { return  (java.lang.String) javonetHandle.invoke("ToString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public java.lang.Integer GetHashCode (){ try { return javonetHandle.invoke("GetHashCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Boolean CustomFlagIsSet (java.lang.Integer flag){ try { return javonetHandle.invoke("CustomFlagIsSet",flag);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}