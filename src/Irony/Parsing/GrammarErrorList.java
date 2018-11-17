package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;
import jio.System.Collections.Generic.*;
import jio.System.*;public class GrammarErrorList extends List<GrammarError> {protected NObject javonetHandle; public GrammarErrorList (){  super((NObject) null); try {  javonetHandle = Javonet.New("GrammarErrorList"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public GrammarErrorList(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Add (GrammarErrorLevel level,ParserState state,java.lang.String message,NObject[] args){ try { javonetHandle.invoke("Add",NEnum.fromJavaEnum(level),state,message,new Object[] {args});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddAndThrow (GrammarErrorLevel level,ParserState state,java.lang.String message,NObject[] args){ try { javonetHandle.invoke("AddAndThrow",NEnum.fromJavaEnum(level),state,message,new Object[] {args});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public GrammarErrorLevel GetMaxLevel (){ try { return GrammarErrorLevel.valueOf(((NEnum) javonetHandle.invoke("GetMaxLevel")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}