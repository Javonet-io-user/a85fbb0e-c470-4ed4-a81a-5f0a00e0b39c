package combit.ListLabel23.Repository;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Repository.*;public class RepositoryItemDescriptor {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.String getType (){ try { return  (java.lang.String) javonetHandle.get("Type");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public RepositoryItemDescriptor(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static RepositoryItemDescriptor LoadFromDescriptorString (java.lang.String descriptor){ try { return new RepositoryItemDescriptor((NObject)Javonet.getType("RepositoryItemDescriptor").invoke("LoadFromDescriptorString",descriptor));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void SetUIName (java.lang.Integer lcid,java.lang.String name){ try { javonetHandle.invoke("SetUIName",lcid,name);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.String GetUIName (java.lang.Integer lcid){ try { return  (java.lang.String) javonetHandle.invoke("GetUIName",lcid);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public void ClearUINames (){ try { javonetHandle.invoke("ClearUINames");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.String SerializeToString (){ try { return  (java.lang.String) javonetHandle.invoke("SerializeToString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public java.lang.String GetParentId (){ try { return  (java.lang.String) javonetHandle.invoke("GetParentId");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}