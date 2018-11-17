package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.*;public class ExportEnumHelper {protected NObject javonetHandle; public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static java.lang.String GetString (LlExportTarget exportTarget){ try { return  (java.lang.String) Javonet.getType("ExportEnumHelper").invoke("GetString",NEnum.fromJavaEnum(exportTarget));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public static java.lang.String GetExtensionFromExportTarget (LlExportTarget exportTarget){ try { return  (java.lang.String) Javonet.getType("ExportEnumHelper").invoke("GetExtensionFromExportTarget",NEnum.fromJavaEnum(exportTarget));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public static LlExportTarget GetTargetFromString (java.lang.String target){ try { return LlExportTarget.valueOf(((NEnum) Javonet.getType("ExportEnumHelper").invoke("GetTargetFromString",target)).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}