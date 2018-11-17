package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;
import jio.System.Collections.Generic.*;
import jio.System.Text.RegularExpressions.*;
import Irony.*;public class RegexBasedTerminal extends Terminal {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public Regex getExpression (){ try { return new Regex((NObject)javonetHandle.<NObject>get("Expression"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetFiled
	 */
            public java.lang.String getPattern (){ try { return  (java.lang.String) javonetHandle.get("Pattern");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setPattern (java.lang.String param){ try { javonetHandle.set("Pattern",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public StringList getPrefixes (){ try { return new StringList((NObject)javonetHandle.<NObject>get("Prefixes"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setPrefixes (StringList param){ try { javonetHandle.set("Prefixes",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public RegexBasedTerminal (java.lang.String pattern,java.lang.String[] prefixes){  super((NObject) null); try {  javonetHandle = Javonet.New("RegexBasedTerminal",pattern,new Object[] {prefixes}); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public RegexBasedTerminal (java.lang.String name,java.lang.String pattern,java.lang.String[] prefixes){  super((NObject) null); try {  javonetHandle = Javonet.New("RegexBasedTerminal",name,pattern,new Object[] {prefixes}); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public RegexBasedTerminal(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Init (GrammarData grammarData){ try { javonetHandle.invoke("Init",grammarData);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public IList<java.lang.String> GetFirsts (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetFirsts"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public Token TryMatch (ParsingContext context,ISourceStream source){ try { return new Token((NObject)javonetHandle.invoke("TryMatch",context,source));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}