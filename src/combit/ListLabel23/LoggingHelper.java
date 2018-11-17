package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.*;public class LoggingHelper {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public static ILlLogger getDummyLogger (){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LoggingHelper").<NObject>get("DummyLogger"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setDummyLogger (ILlLogger param){ try { Javonet.getType("LoggingHelper").set("DummyLogger",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static ILlLogger getLlCoreDebugOutputLogger (){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LoggingHelper").<NObject>get("LlCoreDebugOutputLogger"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setLlCoreDebugOutputLogger (ILlLogger param){ try { Javonet.getType("LoggingHelper").set("LlCoreDebugOutputLogger",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static void LogExceptionDetails (jio.System.Exception ex,ILlLogger logger){ try { Javonet.getType("LoggingHelper").invoke("LogExceptionDetails",ex,logger);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}