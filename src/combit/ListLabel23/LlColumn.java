package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.*;public class LlColumn {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public java.lang.Integer getnSize (){ try { return javonetHandle.get("nSize");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setnSize (java.lang.Integer param){ try { javonetHandle.set("nSize",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getxPos (){ try { return javonetHandle.get("xPos");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setxPos (java.lang.Integer param){ try { javonetHandle.set("xPos",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getnWidth (){ try { return javonetHandle.get("nWidth");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setnWidth (java.lang.Integer param){ try { javonetHandle.set("nWidth",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getbSepLeft (){ try { return javonetHandle.get("bSepLeft");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setbSepLeft (java.lang.Integer param){ try { javonetHandle.set("bSepLeft",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getfntColumn (){ try { return javonetHandle.get("fntColumn");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setfntColumn (java.lang.Integer param){ try { javonetHandle.set("fntColumn",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LlColumn (){ try {  javonetHandle = Javonet.New("LlColumn");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LlColumn(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}