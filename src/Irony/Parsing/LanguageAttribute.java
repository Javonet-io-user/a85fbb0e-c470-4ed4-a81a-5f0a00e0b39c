package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import Irony.Parsing.*;public class LanguageAttribute extends Attribute {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.String getLanguageName (){ try { return  (java.lang.String) javonetHandle.get("LanguageName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getVersion (){ try { return  (java.lang.String) javonetHandle.get("Version");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getDescription (){ try { return  (java.lang.String) javonetHandle.get("Description");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public LanguageAttribute (){  super((NObject) null); try {  javonetHandle = Javonet.New("LanguageAttribute"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LanguageAttribute (java.lang.String languageName){  super((NObject) null); try {  javonetHandle = Javonet.New("LanguageAttribute",languageName); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LanguageAttribute (java.lang.String languageName,java.lang.String version,java.lang.String description){  super((NObject) null); try {  javonetHandle = Javonet.New("LanguageAttribute",languageName,version,description); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LanguageAttribute(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static LanguageAttribute GetValue (Class grammarClass){ try { return new LanguageAttribute((NObject)Javonet.getType("LanguageAttribute").invoke("GetValue",Javonet.getType(getReturnObjectName(grammarClass).getTypeName())));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}