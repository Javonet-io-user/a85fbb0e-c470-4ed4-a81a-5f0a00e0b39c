package Irony.Parsing.Construction;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.Construction.*;
import jio.System.Collections.Generic.*;
import Irony.Parsing.*;public class LRItemSet extends HashSet<LRItem> {protected NObject javonetHandle; public LRItemSet (){  super((NObject) null); try {  javonetHandle = Javonet.New("LRItemSet"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LRItemSet(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public LRItem FindByCore (LR0Item core){ try { return new LRItem((NObject)javonetHandle.invoke("FindByCore",core));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public LRItemSet SelectByCurrent (BnfTerm current){ try { return new LRItemSet((NObject)javonetHandle.invoke("SelectByCurrent",current));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public LR0ItemSet GetShiftedCores (){ try { return new LR0ItemSet((NObject)javonetHandle.invoke("GetShiftedCores"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public LRItemSet SelectByLookahead (Terminal lookahead){ try { return new LRItemSet((NObject)javonetHandle.invoke("SelectByLookahead",lookahead));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}