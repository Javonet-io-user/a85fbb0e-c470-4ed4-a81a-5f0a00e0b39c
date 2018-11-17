package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;
import jio.System.Xml.*;public class ParseTreeExtensions {protected NObject javonetHandle; public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static java.lang.String ToXml (ParseTree parseTree){ try { return  (java.lang.String) Javonet.getType("ParseTreeExtensions").invoke("ToXml",parseTree);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public static XmlDocument ToXmlDocument (ParseTree parseTree){ try { return new XmlDocument((NObject)Javonet.getType("ParseTreeExtensions").invoke("ToXmlDocument",parseTree));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static XmlElement ToXmlElement (ParseTreeNode node,XmlDocument ownerDocument){ try { return new XmlElement((NObject)Javonet.getType("ParseTreeExtensions").invoke("ToXmlElement",node,ownerDocument));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}