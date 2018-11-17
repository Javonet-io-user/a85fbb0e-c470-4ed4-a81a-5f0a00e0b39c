package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;public class ParsingEnumExtensions {protected NObject javonetHandle; public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static java.lang.Boolean IsSet (TermFlags flags,TermFlags flag){ try { return Javonet.getType("ParsingEnumExtensions").invoke("IsSet",NEnum.fromJavaEnum(flags),NEnum.fromJavaEnum(flag));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public static java.lang.Boolean IsSet (LanguageFlags flags,LanguageFlags flag){ try { return Javonet.getType("ParsingEnumExtensions").invoke("IsSet",NEnum.fromJavaEnum(flags),NEnum.fromJavaEnum(flag));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public static java.lang.Boolean IsSet (ParseOptions options,ParseOptions option){ try { return Javonet.getType("ParsingEnumExtensions").invoke("IsSet",NEnum.fromJavaEnum(options),NEnum.fromJavaEnum(option));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public static java.lang.Boolean IsSet (TermListOptions options,TermListOptions option){ try { return Javonet.getType("ParsingEnumExtensions").invoke("IsSet",NEnum.fromJavaEnum(options),NEnum.fromJavaEnum(option));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public static java.lang.Boolean IsSet (ProductionFlags flags,ProductionFlags flag){ try { return Javonet.getType("ParsingEnumExtensions").invoke("IsSet",NEnum.fromJavaEnum(flags),NEnum.fromJavaEnum(flag));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}