package Irony.Ast;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Ast.*;
import jio.System.*;public class AstNodeConfig {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public Class getNodeType (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("NodeType"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setNodeType (Class param){ try { javonetHandle.set("NodeType",Javonet.getType(getReturnObjectName(param).getTypeName()));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public NObject getData (){ try { return  (NObject) javonetHandle.<NObject>get("Data");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setData (NObject param){ try { javonetHandle.set("Data",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public AstNodeCreator getNodeCreator (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("NodeCreator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setNodeCreator (AstNodeCreator param){ try { javonetHandle.set("NodeCreator",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public DefaultAstNodeCreator getDefaultNodeCreator (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("DefaultNodeCreator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setDefaultNodeCreator (DefaultAstNodeCreator param){ try { javonetHandle.set("DefaultNodeCreator",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer[] getPartsMap (){ try { return Helper.ConvertNObjectToDestinationType((NObject[])javonetHandle.get("PartsMap"),java.lang.Integer[].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setPartsMap (java.lang.Integer[] param){ try { javonetHandle.set("PartsMap",new Object[] {param});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public AstNodeConfig (){ try {  javonetHandle = Javonet.New("AstNodeConfig");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public AstNodeConfig(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Boolean CanCreateNode (){ try { return javonetHandle.invoke("CanCreateNode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}