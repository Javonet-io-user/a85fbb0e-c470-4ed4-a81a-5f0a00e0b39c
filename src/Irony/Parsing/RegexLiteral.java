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
import jio.System.*;public class RegexLiteral extends Terminal {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public java.lang.Character getStartSymbol (){ try { return javonetHandle.get("StartSymbol");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setStartSymbol (java.lang.Character param){ try { javonetHandle.set("StartSymbol",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Character getEndSymbol (){ try { return javonetHandle.get("EndSymbol");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setEndSymbol (java.lang.Character param){ try { javonetHandle.set("EndSymbol",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Character getEscapeSymbol (){ try { return javonetHandle.get("EscapeSymbol");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setEscapeSymbol (java.lang.Character param){ try { javonetHandle.set("EscapeSymbol",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public RegexSwitchTable getSwitches (){ try { return new RegexSwitchTable((NObject)javonetHandle.<NObject>get("Switches"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setSwitches (RegexSwitchTable param){ try { javonetHandle.set("Switches",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public RegexOptions getDefaultOptions (){ try { return RegexOptions.valueOf(((NEnum) javonetHandle.<NObject>get("DefaultOptions")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setDefaultOptions (RegexOptions param){ try { javonetHandle.set("DefaultOptions",NEnum.fromJavaEnum(param));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public RegexTermOptions getOptions (){ try { return RegexTermOptions.valueOf(((NEnum) javonetHandle.<NObject>get("Options")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setOptions (RegexTermOptions param){ try { javonetHandle.set("Options",NEnum.fromJavaEnum(param));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public RegexLiteral (java.lang.String name){  super((NObject) null); try {  javonetHandle = Javonet.New("RegexLiteral",name); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public RegexLiteral (java.lang.String name,java.lang.Character startEndSymbol,java.lang.Character escapeSymbol){  super((NObject) null); try {  javonetHandle = Javonet.New("RegexLiteral",name,startEndSymbol,escapeSymbol); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public RegexLiteral(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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
            public Token TryMatch (ParsingContext context,ISourceStream source){ try { return new Token((NObject)javonetHandle.invoke("TryMatch",context,source));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Boolean IsSet (RegexTermOptions option){ try { return javonetHandle.invoke("IsSet",NEnum.fromJavaEnum(option));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public static class RegexSwitchTable extends Dictionary<java.lang.Character,RegexOptions> {public NObject javonetHandle; public RegexSwitchTable (){  super((NObject) null); try {  javonetHandle = Javonet.New("RegexSwitchTable"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public RegexSwitchTable(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }}	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}