package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.*;public class QueryFileNameReplacementEventArgs extends EventArgs {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public LlProjectLoadType getLoadType (){ try { return LlProjectLoadType.valueOf(((NEnum) javonetHandle.<NObject>get("LoadType")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.String getObjectIdentifier (){ try { return  (java.lang.String) javonetHandle.get("ObjectIdentifier");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public LlItemPathReplaceFileType getItemType (){ try { return LlItemPathReplaceFileType.valueOf(((NEnum) javonetHandle.<NObject>get("ItemType")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setFilepathOrRepositoryId (java.lang.String value){ try { javonetHandle.set("FilepathOrRepositoryId",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFilepathOrRepositoryId (){ try { return  (java.lang.String) javonetHandle.get("FilepathOrRepositoryId");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public QueryFileNameReplacementEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}