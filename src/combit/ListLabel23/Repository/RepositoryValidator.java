package combit.ListLabel23.Repository;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Repository.*;public class RepositoryValidator {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setItemToOpenInDesigner (java.lang.String value){ try { javonetHandle.set("ItemToOpenInDesigner",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getItemToOpenInDesigner (){ try { return  (java.lang.String) javonetHandle.get("ItemToOpenInDesigner");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public RepositoryValidator (IRepository repository){ try {  javonetHandle = Javonet.New("RepositoryValidator",repository);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public RepositoryValidator(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void ValidateRepository (){ try { javonetHandle.invoke("ValidateRepository");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}