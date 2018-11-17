package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;
import jio.System.Collections.Generic.*;public class ParserStack extends List<ParseTreeNode> {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public ParseTreeNode getTop (){ try { return new ParseTreeNode((NObject)javonetHandle.<NObject>get("Top"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public ParserStack (){  super((NObject) null); try {  javonetHandle = Javonet.New("ParserStack"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ParserStack(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Push (ParseTreeNode nodeInfo){ try { javonetHandle.invoke("Push",nodeInfo);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Push (ParseTreeNode nodeInfo,ParserState state){ try { javonetHandle.invoke("Push",nodeInfo,state);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public ParseTreeNode Pop (){ try { return new ParseTreeNode((NObject)javonetHandle.invoke("Pop"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void Pop (java.lang.Integer count){ try { javonetHandle.invoke("Pop",count);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void PopUntil (java.lang.Integer finalCount){ try { javonetHandle.invoke("PopUntil",finalCount);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}