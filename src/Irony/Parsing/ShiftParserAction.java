package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;
import Irony.Parsing.Construction.*;public class ShiftParserAction extends ParserAction {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public BnfTerm getTerm (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("Term"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setTerm (BnfTerm param){ try { javonetHandle.set("Term",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public ParserState getNewState (){ try { return new ParserState((NObject)javonetHandle.<NObject>get("NewState"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setNewState (ParserState param){ try { javonetHandle.set("NewState",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ShiftParserAction (LRItem item){  super((NObject) null); try {  javonetHandle = Javonet.New("ShiftParserAction",item); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ShiftParserAction (BnfTerm term,ParserState newState){  super((NObject) null); try {  javonetHandle = Javonet.New("ShiftParserAction",term,newState); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ShiftParserAction(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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