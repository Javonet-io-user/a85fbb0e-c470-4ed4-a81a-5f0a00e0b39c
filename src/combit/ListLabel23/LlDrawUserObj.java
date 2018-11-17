package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.*;public class LlDrawUserObj extends ValueType {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public java.lang.Integer getnSize (){ try { return javonetHandle.get("nSize");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setnSize (java.lang.Integer param){ try { javonetHandle.set("nSize",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getpszName (){ try { return  (java.lang.String) javonetHandle.get("pszName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setpszName (java.lang.String param){ try { javonetHandle.set("pszName",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getpszContents (){ try { return  (java.lang.String) javonetHandle.get("pszContents");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setpszContents (java.lang.String param){ try { javonetHandle.set("pszContents",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getlPara (){ try { return javonetHandle.<NObject>get("lPara");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setlPara (java.lang.Integer param){ try { javonetHandle.set("lPara",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getlpPtr (){ try { return javonetHandle.<NObject>get("lpPtr");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setlpPtr (java.lang.Integer param){ try { javonetHandle.set("lpPtr",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer gethPara (){ try { return javonetHandle.<NObject>get("hPara");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void sethPara (java.lang.Integer param){ try { javonetHandle.set("hPara",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Boolean getbIsotropic (){ try { return javonetHandle.get("bIsotropic");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetFiled
	 */
            public void setbIsotropic (java.lang.Boolean param){ try { javonetHandle.set("bIsotropic",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getpszParameters (){ try { return  (java.lang.String) javonetHandle.get("pszParameters");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setpszParameters (java.lang.String param){ try { javonetHandle.set("pszParameters",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer gethRefDC (){ try { return javonetHandle.<NObject>get("hRefDC");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void sethRefDC (java.lang.Integer param){ try { javonetHandle.set("hRefDC",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer gethPaintDC (){ try { return javonetHandle.<NObject>get("hPaintDC");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void sethPaintDC (java.lang.Integer param){ try { javonetHandle.set("hPaintDC",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public RECT getrcPaint (){ try { return javonetHandle.<NObject>get("rcPaint");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setrcPaint (RECT param){ try { javonetHandle.set("rcPaint",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getnPaintMode (){ try { return javonetHandle.get("nPaintMode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setnPaintMode (java.lang.Integer param){ try { javonetHandle.set("nPaintMode",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LlDrawUserObj(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}