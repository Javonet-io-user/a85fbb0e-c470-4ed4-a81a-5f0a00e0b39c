package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;public class ParserData {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public LanguageData getLanguage (){ try { return new LanguageData((NObject)javonetHandle.<NObject>get("Language"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setLanguage (LanguageData param){ try { javonetHandle.set("Language",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public ParserState getInitialState (){ try { return new ParserState((NObject)javonetHandle.<NObject>get("InitialState"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setInitialState (ParserState param){ try { javonetHandle.set("InitialState",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public ParserStateTable getInitialStates (){ try { return new ParserStateTable((NObject)javonetHandle.<NObject>get("InitialStates"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setInitialStates (ParserStateTable param){ try { javonetHandle.set("InitialStates",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public ParserStateList getStates (){ try { return new ParserStateList((NObject)javonetHandle.<NObject>get("States"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setStates (ParserStateList param){ try { javonetHandle.set("States",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public ParserAction getErrorAction (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("ErrorAction"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setErrorAction (ParserAction param){ try { javonetHandle.set("ErrorAction",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ParserData (LanguageData language){ try {  javonetHandle = Javonet.New("ParserData",language);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ParserData(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}