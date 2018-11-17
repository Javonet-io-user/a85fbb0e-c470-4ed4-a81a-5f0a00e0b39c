package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;
import Irony.Parsing.Construction.*;public class TokenPreviewHint extends GrammarHint {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public java.lang.Integer getMaxPreviewTokens (){ try { return javonetHandle.get("MaxPreviewTokens");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setMaxPreviewTokens (java.lang.Integer param){ try { javonetHandle.set("MaxPreviewTokens",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public TokenPreviewHint (PreferredActionType actionType,java.lang.String thisSymbol,java.lang.String[] comesBefore){  super((NObject) null); try {  javonetHandle = Javonet.New("TokenPreviewHint",NEnum.fromJavaEnum(actionType),thisSymbol,new Object[] {comesBefore}); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public TokenPreviewHint (PreferredActionType actionType,Terminal thisTerm,Terminal[] comesBefore){  super((NObject) null); try {  javonetHandle = Javonet.New("TokenPreviewHint",NEnum.fromJavaEnum(actionType),thisTerm,new Object[] {comesBefore}); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public TokenPreviewHint(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Init (GrammarData grammarData){ try { javonetHandle.invoke("Init",grammarData);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.String ToString (){ try { return  (java.lang.String) javonetHandle.invoke("ToString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public void Apply (LanguageData language,LRItem owner){ try { javonetHandle.invoke("Apply",language,owner);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}