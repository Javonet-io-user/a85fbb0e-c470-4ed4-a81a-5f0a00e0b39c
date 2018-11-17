package Irony;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.*;
import jio.System.Collections.Generic.*;public class Strings {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public static java.lang.String getAllLatinLetters (){ try { return  (java.lang.String) Javonet.getType("Strings").get("AllLatinLetters");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public static void setAllLatinLetters (java.lang.String param){ try { Javonet.getType("Strings").set("AllLatinLetters",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static java.lang.String getDecimalDigits (){ try { return  (java.lang.String) Javonet.getType("Strings").get("DecimalDigits");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public static void setDecimalDigits (java.lang.String param){ try { Javonet.getType("Strings").set("DecimalDigits",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static java.lang.String getOctalDigits (){ try { return  (java.lang.String) Javonet.getType("Strings").get("OctalDigits");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public static void setOctalDigits (java.lang.String param){ try { Javonet.getType("Strings").set("OctalDigits",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static java.lang.String getHexDigits (){ try { return  (java.lang.String) Javonet.getType("Strings").get("HexDigits");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public static void setHexDigits (java.lang.String param){ try { Javonet.getType("Strings").set("HexDigits",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static java.lang.String getBinaryDigits (){ try { return  (java.lang.String) Javonet.getType("Strings").get("BinaryDigits");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public static void setBinaryDigits (java.lang.String param){ try { Javonet.getType("Strings").set("BinaryDigits",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static java.lang.String JoinStrings (java.lang.String separator,IEnumerable<java.lang.String> values){ try { return  (java.lang.String) Javonet.getType("Strings").invoke("JoinStrings",separator,values);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}