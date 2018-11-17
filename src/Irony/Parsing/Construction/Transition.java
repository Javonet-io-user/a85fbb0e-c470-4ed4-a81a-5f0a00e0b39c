package Irony.Parsing.Construction;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.Construction.*;
import Irony.Parsing.*;public class Transition {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public ParserState getFromState (){ try { return new ParserState((NObject)javonetHandle.<NObject>get("FromState"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setFromState (ParserState param){ try { javonetHandle.set("FromState",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public ParserState getToState (){ try { return new ParserState((NObject)javonetHandle.<NObject>get("ToState"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setToState (ParserState param){ try { javonetHandle.set("ToState",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public NonTerminal getOverNonTerminal (){ try { return new NonTerminal((NObject)javonetHandle.<NObject>get("OverNonTerminal"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setOverNonTerminal (NonTerminal param){ try { javonetHandle.set("OverNonTerminal",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public LRItemSet getItems (){ try { return new LRItemSet((NObject)javonetHandle.<NObject>get("Items"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setItems (LRItemSet param){ try { javonetHandle.set("Items",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public TransitionSet getIncludes (){ try { return new TransitionSet((NObject)javonetHandle.<NObject>get("Includes"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setIncludes (TransitionSet param){ try { javonetHandle.set("Includes",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public TransitionSet getIncludedBy (){ try { return new TransitionSet((NObject)javonetHandle.<NObject>get("IncludedBy"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setIncludedBy (TransitionSet param){ try { javonetHandle.set("IncludedBy",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Transition (ParserState fromState,NonTerminal overNonTerminal){ try {  javonetHandle = Javonet.New("Transition",fromState,overNonTerminal);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Transition(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Include (Transition other){ try { javonetHandle.invoke("Include",other);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.String ToString (){ try { return  (java.lang.String) javonetHandle.invoke("ToString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public java.lang.Integer GetHashCode (){ try { return javonetHandle.invoke("GetHashCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}