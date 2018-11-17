package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;
import jio.System.Collections.Generic.*;public class ConditionalParserAction extends ParserAction {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public ConditionalEntryList getConditionalEntries (){ try { return new ConditionalEntryList((NObject)javonetHandle.<NObject>get("ConditionalEntries"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setConditionalEntries (ConditionalEntryList param){ try { javonetHandle.set("ConditionalEntries",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public ParserAction getDefaultAction (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("DefaultAction"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setDefaultAction (ParserAction param){ try { javonetHandle.set("DefaultAction",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ConditionalParserAction (){  super((NObject) null); try {  javonetHandle = Javonet.New("ConditionalParserAction"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ConditionalParserAction(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Execute (ParsingContext context){ try { javonetHandle.invoke("Execute",context);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public static class ConditionalEntry {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public ConditionChecker getCondition (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("Condition"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setCondition (ConditionChecker param){ try { javonetHandle.set("Condition",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public ParserAction getAction (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("Action"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setAction (ParserAction param){ try { javonetHandle.set("Action",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getDescription (){ try { return  (java.lang.String) javonetHandle.get("Description");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setDescription (java.lang.String param){ try { javonetHandle.set("Description",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ConditionalEntry (ConditionChecker condition,ParserAction action,java.lang.String description){ try {  javonetHandle = Javonet.New("ConditionalEntry",condition,action,description);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ConditionalEntry(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.String ToString (){ try { return  (java.lang.String) javonetHandle.invoke("ToString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }}public static class ConditionalEntryList extends List<ConditionalEntry> {public NObject javonetHandle; public ConditionalEntryList (){  super((NObject) null); try {  javonetHandle = Javonet.New("ConditionalEntryList"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ConditionalEntryList(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }}public interface ConditionChecker { public java.lang.Boolean Invoke (ParsingContext context);}	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}