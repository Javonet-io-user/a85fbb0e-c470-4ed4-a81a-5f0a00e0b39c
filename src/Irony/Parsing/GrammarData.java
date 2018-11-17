package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;public class GrammarData {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public LanguageData getLanguage (){ try { return new LanguageData((NObject)javonetHandle.<NObject>get("Language"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setLanguage (LanguageData param){ try { javonetHandle.set("Language",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Grammar getGrammar (){ try { return new Grammar((NObject)javonetHandle.<NObject>get("Grammar"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setGrammar (Grammar param){ try { javonetHandle.set("Grammar",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public NonTerminal getAugmentedRoot (){ try { return new NonTerminal((NObject)javonetHandle.<NObject>get("AugmentedRoot"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setAugmentedRoot (NonTerminal param){ try { javonetHandle.set("AugmentedRoot",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public NonTerminalSet getAugmentedSnippetRoots (){ try { return new NonTerminalSet((NObject)javonetHandle.<NObject>get("AugmentedSnippetRoots"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setAugmentedSnippetRoots (NonTerminalSet param){ try { javonetHandle.set("AugmentedSnippetRoots",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public BnfTermSet getAllTerms (){ try { return new BnfTermSet((NObject)javonetHandle.<NObject>get("AllTerms"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setAllTerms (BnfTermSet param){ try { javonetHandle.set("AllTerms",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public TerminalSet getTerminals (){ try { return new TerminalSet((NObject)javonetHandle.<NObject>get("Terminals"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setTerminals (TerminalSet param){ try { javonetHandle.set("Terminals",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public NonTerminalSet getNonTerminals (){ try { return new NonTerminalSet((NObject)javonetHandle.<NObject>get("NonTerminals"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setNonTerminals (NonTerminalSet param){ try { javonetHandle.set("NonTerminals",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public TerminalSet getNoPrefixTerminals (){ try { return new TerminalSet((NObject)javonetHandle.<NObject>get("NoPrefixTerminals"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setNoPrefixTerminals (TerminalSet param){ try { javonetHandle.set("NoPrefixTerminals",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public GrammarData (LanguageData language){ try {  javonetHandle = Javonet.New("GrammarData",language);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public GrammarData(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}