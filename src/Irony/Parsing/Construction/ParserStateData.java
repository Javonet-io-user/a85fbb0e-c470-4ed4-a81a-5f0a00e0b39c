package Irony.Parsing.Construction;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.Construction.*;
import Irony.Parsing.*;public class ParserStateData {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public TransitionTable getTransitions (){ try { return new TransitionTable((NObject)javonetHandle.<NObject>get("Transitions"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public ParserStateSet getReadStateSet (){ try { return new ParserStateSet((NObject)javonetHandle.<NObject>get("ReadStateSet"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetFiled
	 */
            public ParserState getState (){ try { return new ParserState((NObject)javonetHandle.<NObject>get("State"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setState (ParserState param){ try { javonetHandle.set("State",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public LRItemSet getAllItems (){ try { return new LRItemSet((NObject)javonetHandle.<NObject>get("AllItems"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setAllItems (LRItemSet param){ try { javonetHandle.set("AllItems",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public LRItemSet getShiftItems (){ try { return new LRItemSet((NObject)javonetHandle.<NObject>get("ShiftItems"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setShiftItems (LRItemSet param){ try { javonetHandle.set("ShiftItems",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public LRItemSet getReduceItems (){ try { return new LRItemSet((NObject)javonetHandle.<NObject>get("ReduceItems"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setReduceItems (LRItemSet param){ try { javonetHandle.set("ReduceItems",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public LRItemSet getInitialItems (){ try { return new LRItemSet((NObject)javonetHandle.<NObject>get("InitialItems"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setInitialItems (LRItemSet param){ try { javonetHandle.set("InitialItems",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public BnfTermSet getShiftTerms (){ try { return new BnfTermSet((NObject)javonetHandle.<NObject>get("ShiftTerms"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setShiftTerms (BnfTermSet param){ try { javonetHandle.set("ShiftTerms",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public TerminalSet getShiftTerminals (){ try { return new TerminalSet((NObject)javonetHandle.<NObject>get("ShiftTerminals"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setShiftTerminals (TerminalSet param){ try { javonetHandle.set("ShiftTerminals",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public TerminalSet getConflicts (){ try { return new TerminalSet((NObject)javonetHandle.<NObject>get("Conflicts"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setConflicts (TerminalSet param){ try { javonetHandle.set("Conflicts",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Boolean getIsInadequate (){ try { return javonetHandle.get("IsInadequate");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetFiled
	 */
            public void setIsInadequate (java.lang.Boolean param){ try { javonetHandle.set("IsInadequate",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public LR0ItemSet getAllCores (){ try { return new LR0ItemSet((NObject)javonetHandle.<NObject>get("AllCores"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setAllCores (LR0ItemSet param){ try { javonetHandle.set("AllCores",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ParserStateData (ParserState state,LR0ItemSet kernelCores){ try {  javonetHandle = Javonet.New("ParserStateData",state,kernelCores);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ParserStateData(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void AddItem (LR0Item core){ try { javonetHandle.invoke("AddItem",core);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public ParserState GetNextState (BnfTerm shiftTerm){ try { return new ParserState((NObject)javonetHandle.invoke("GetNextState",shiftTerm));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public TerminalSet GetShiftReduceConflicts (){ try { return new TerminalSet((NObject)javonetHandle.invoke("GetShiftReduceConflicts"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public TerminalSet GetReduceReduceConflicts (){ try { return new TerminalSet((NObject)javonetHandle.invoke("GetReduceReduceConflicts"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}