package Irony.Parsing.Construction;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.Construction.*;
import Irony.Parsing.*;public class LR0Item {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public LR0Item getShiftedItem (){ try { return new LR0Item((NObject)javonetHandle.<NObject>get("ShiftedItem"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getIsKernel (){ try { return javonetHandle.get("IsKernel");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getIsInitial (){ try { return javonetHandle.get("IsInitial");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getIsFinal (){ try { return javonetHandle.get("IsFinal");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetFiled
	 */
            public Production getProduction (){ try { return new Production((NObject)javonetHandle.<NObject>get("Production"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setProduction (Production param){ try { javonetHandle.set("Production",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getPosition (){ try { return javonetHandle.get("Position");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setPosition (java.lang.Integer param){ try { javonetHandle.set("Position",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public BnfTerm getCurrent (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("Current"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setCurrent (BnfTerm param){ try { javonetHandle.set("Current",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Boolean getTailIsNullable (){ try { return javonetHandle.get("TailIsNullable");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetFiled
	 */
            public void setTailIsNullable (java.lang.Boolean param){ try { javonetHandle.set("TailIsNullable",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public GrammarHintList getHints (){ try { return new GrammarHintList((NObject)javonetHandle.<NObject>get("Hints"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setHints (GrammarHintList param){ try { javonetHandle.set("Hints",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LR0Item (java.lang.Integer id,Production production,java.lang.Integer position,GrammarHintList hints){ try {  javonetHandle = Javonet.New("LR0Item",id,production,position,hints);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LR0Item(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
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