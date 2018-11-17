package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;public class TokenEditorInfo {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public TokenType getType (){ try { return TokenType.valueOf(((NEnum) javonetHandle.<NObject>get("Type")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setType (TokenType param){ try { javonetHandle.set("Type",NEnum.fromJavaEnum(param));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public TokenColor getColor (){ try { return TokenColor.valueOf(((NEnum) javonetHandle.<NObject>get("Color")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setColor (TokenColor param){ try { javonetHandle.set("Color",NEnum.fromJavaEnum(param));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public TokenTriggers getTriggers (){ try { return TokenTriggers.valueOf(((NEnum) javonetHandle.<NObject>get("Triggers")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setTriggers (TokenTriggers param){ try { javonetHandle.set("Triggers",NEnum.fromJavaEnum(param));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getToolTip (){ try { return  (java.lang.String) javonetHandle.get("ToolTip");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setToolTip (java.lang.String param){ try { javonetHandle.set("ToolTip",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getUnderlineType (){ try { return javonetHandle.get("UnderlineType");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setUnderlineType (java.lang.Integer param){ try { javonetHandle.set("UnderlineType",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public TokenEditorInfo (TokenType type,TokenColor color,TokenTriggers triggers){ try {  javonetHandle = Javonet.New("TokenEditorInfo",NEnum.fromJavaEnum(type),NEnum.fromJavaEnum(color),NEnum.fromJavaEnum(triggers));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public TokenEditorInfo(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}