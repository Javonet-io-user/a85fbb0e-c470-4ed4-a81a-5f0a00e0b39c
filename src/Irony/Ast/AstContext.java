package Irony.Ast;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Ast.*;
import Irony.*;
import Irony.Parsing.*;
import jio.System.*;
import jio.System.Collections.Generic.*;public class AstContext {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public LanguageData getLanguage (){ try { return new LanguageData((NObject)javonetHandle.<NObject>get("Language"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setLanguage (LanguageData param){ try { javonetHandle.set("Language",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Class getDefaultNodeType (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("DefaultNodeType"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setDefaultNodeType (Class param){ try { javonetHandle.set("DefaultNodeType",Javonet.getType(getReturnObjectName(param).getTypeName()));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Class getDefaultLiteralNodeType (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("DefaultLiteralNodeType"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setDefaultLiteralNodeType (Class param){ try { javonetHandle.set("DefaultLiteralNodeType",Javonet.getType(getReturnObjectName(param).getTypeName()));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Class getDefaultIdentifierNodeType (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("DefaultIdentifierNodeType"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setDefaultIdentifierNodeType (Class param){ try { javonetHandle.set("DefaultIdentifierNodeType",Javonet.getType(getReturnObjectName(param).getTypeName()));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Dictionary<NObject,NObject> getValues (){ try { return new Dictionary<NObject,NObject>((NObject)javonetHandle.<NObject>get("Values"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setValues (Dictionary<NObject,NObject> param){ try { javonetHandle.set("Values",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public LogMessageList getMessages (){ try { return new LogMessageList((NObject)javonetHandle.<NObject>get("Messages"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setMessages (LogMessageList param){ try { javonetHandle.set("Messages",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public AstContext (LanguageData language){ try {  javonetHandle = Javonet.New("AstContext",language);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public AstContext(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void AddMessage (ErrorLevel level,SourceLocation location,java.lang.String message,NObject[] args){ try { javonetHandle.invoke("AddMessage",NEnum.fromJavaEnum(level),location,message,new Object[] {args});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}