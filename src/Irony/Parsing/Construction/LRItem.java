package Irony.Parsing.Construction;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.Construction.*;
import Irony.Parsing.*;public class LRItem {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public ParserState getState (){ try { return new ParserState((NObject)javonetHandle.<NObject>get("State"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setState (ParserState param){ try { javonetHandle.set("State",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public LR0Item getCore (){ try { return new LR0Item((NObject)javonetHandle.<NObject>get("Core"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setCore (LR0Item param){ try { javonetHandle.set("Core",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public LRItem getShiftedItem (){ try { return new LRItem((NObject)javonetHandle.<NObject>get("ShiftedItem"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setShiftedItem (LRItem param){ try { javonetHandle.set("ShiftedItem",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Transition getTransition (){ try { return new Transition((NObject)javonetHandle.<NObject>get("Transition"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setTransition (Transition param){ try { javonetHandle.set("Transition",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public TransitionSet getLookbacks (){ try { return new TransitionSet((NObject)javonetHandle.<NObject>get("Lookbacks"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setLookbacks (TransitionSet param){ try { javonetHandle.set("Lookbacks",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public TerminalSet getLookaheads (){ try { return new TerminalSet((NObject)javonetHandle.<NObject>get("Lookaheads"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setLookaheads (TerminalSet param){ try { javonetHandle.set("Lookaheads",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LRItem (ParserState state,LR0Item core){ try {  javonetHandle = Javonet.New("LRItem",state,core);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LRItem(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.String ToString (){ try { return  (java.lang.String) javonetHandle.invoke("ToString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public java.lang.Integer GetHashCode (){ try { return javonetHandle.invoke("GetHashCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public TerminalSet GetLookaheadsInConflict (){ try { return new TerminalSet((NObject)javonetHandle.invoke("GetLookaheadsInConflict"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}