package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;
import jio.System.Collections.Generic.*;public class IdentifierTerminal extends CompoundTerminalBase {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public java.lang.String getAllFirstChars (){ try { return  (java.lang.String) javonetHandle.get("AllFirstChars");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setAllFirstChars (java.lang.String param){ try { javonetHandle.set("AllFirstChars",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getAllChars (){ try { return  (java.lang.String) javonetHandle.get("AllChars");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setAllChars (java.lang.String param){ try { javonetHandle.set("AllChars",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public TokenEditorInfo getKeywordEditorInfo (){ try { return new TokenEditorInfo((NObject)javonetHandle.<NObject>get("KeywordEditorInfo"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setKeywordEditorInfo (TokenEditorInfo param){ try { javonetHandle.set("KeywordEditorInfo",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public IdOptions getOptions (){ try { return IdOptions.valueOf(((NEnum) javonetHandle.<NObject>get("Options")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setOptions (IdOptions param){ try { javonetHandle.set("Options",NEnum.fromJavaEnum(param));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public CaseRestriction getCaseRestriction (){ try { return CaseRestriction.valueOf(((NEnum) javonetHandle.<NObject>get("CaseRestriction")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setCaseRestriction (CaseRestriction param){ try { javonetHandle.set("CaseRestriction",NEnum.fromJavaEnum(param));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public UnicodeCategoryList getStartCharCategories (){ try { return new UnicodeCategoryList((NObject)javonetHandle.<NObject>get("StartCharCategories"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setStartCharCategories (UnicodeCategoryList param){ try { javonetHandle.set("StartCharCategories",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public UnicodeCategoryList getCharCategories (){ try { return new UnicodeCategoryList((NObject)javonetHandle.<NObject>get("CharCategories"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setCharCategories (UnicodeCategoryList param){ try { javonetHandle.set("CharCategories",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public UnicodeCategoryList getCharsToRemoveCategories (){ try { return new UnicodeCategoryList((NObject)javonetHandle.<NObject>get("CharsToRemoveCategories"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setCharsToRemoveCategories (UnicodeCategoryList param){ try { javonetHandle.set("CharsToRemoveCategories",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public IdentifierTerminal (java.lang.String name){  super((NObject) null); try {  javonetHandle = Javonet.New("IdentifierTerminal",name); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public IdentifierTerminal (java.lang.String name,IdOptions options){  super((NObject) null); try {  javonetHandle = Javonet.New("IdentifierTerminal",name,NEnum.fromJavaEnum(options)); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public IdentifierTerminal (java.lang.String name,java.lang.String extraChars,java.lang.String extraFirstChars){  super((NObject) null); try {  javonetHandle = Javonet.New("IdentifierTerminal",name,extraChars,extraFirstChars); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public IdentifierTerminal(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void AddPrefix (java.lang.String prefix,IdOptions options){ try { javonetHandle.invoke("AddPrefix",prefix,NEnum.fromJavaEnum(options));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Init (GrammarData grammarData){ try { javonetHandle.invoke("Init",grammarData);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public IList<java.lang.String> GetFirsts (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetFirsts"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}