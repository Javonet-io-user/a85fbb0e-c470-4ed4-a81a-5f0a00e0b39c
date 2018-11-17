package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DataProviders.*;public class DataSourceConnectionProperties {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setConnectionString (java.lang.String value){ try { javonetHandle.set("ConnectionString",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getConnectionString (){ try { return  (java.lang.String) javonetHandle.get("ConnectionString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setSourceType (DataSourceType value){ try { javonetHandle.set("SourceType",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public DataSourceType getSourceType (){ try { return DataSourceType.valueOf(((NEnum) javonetHandle.<NObject>get("SourceType")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public DataSourceConnectionProperties (){ try {  javonetHandle = Javonet.New("DataSourceConnectionProperties");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataSourceConnectionProperties(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.String ToString (){ try { return  (java.lang.String) javonetHandle.invoke("ToString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}