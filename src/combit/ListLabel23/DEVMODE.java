package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.*;public class DEVMODE {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public java.lang.String getdmDeviceName (){ try { return  (java.lang.String) javonetHandle.get("dmDeviceName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setdmDeviceName (java.lang.String param){ try { javonetHandle.set("dmDeviceName",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Short getdmSpecVersion (){ try { return javonetHandle.get("dmSpecVersion");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setdmSpecVersion (java.lang.Short param){ try { javonetHandle.set("dmSpecVersion",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Short getdmDriverVersion (){ try { return javonetHandle.get("dmDriverVersion");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setdmDriverVersion (java.lang.Short param){ try { javonetHandle.set("dmDriverVersion",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Short getdmSize (){ try { return javonetHandle.get("dmSize");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setdmSize (java.lang.Short param){ try { javonetHandle.set("dmSize",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Short getdmDriverExtra (){ try { return javonetHandle.get("dmDriverExtra");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setdmDriverExtra (java.lang.Short param){ try { javonetHandle.set("dmDriverExtra",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getdmFields (){ try { return javonetHandle.get("dmFields");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setdmFields (java.lang.Integer param){ try { javonetHandle.set("dmFields",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Short getdmOrientation (){ try { return javonetHandle.get("dmOrientation");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setdmOrientation (java.lang.Short param){ try { javonetHandle.set("dmOrientation",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Short getdmPaperSize (){ try { return javonetHandle.get("dmPaperSize");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setdmPaperSize (java.lang.Short param){ try { javonetHandle.set("dmPaperSize",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Short getdmPaperLength (){ try { return javonetHandle.get("dmPaperLength");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setdmPaperLength (java.lang.Short param){ try { javonetHandle.set("dmPaperLength",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Short getdmPaperWidth (){ try { return javonetHandle.get("dmPaperWidth");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setdmPaperWidth (java.lang.Short param){ try { javonetHandle.set("dmPaperWidth",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Short getdmScale (){ try { return javonetHandle.get("dmScale");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setdmScale (java.lang.Short param){ try { javonetHandle.set("dmScale",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Short getdmCopies (){ try { return javonetHandle.get("dmCopies");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setdmCopies (java.lang.Short param){ try { javonetHandle.set("dmCopies",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Short getdmDefaultSource (){ try { return javonetHandle.get("dmDefaultSource");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setdmDefaultSource (java.lang.Short param){ try { javonetHandle.set("dmDefaultSource",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Short getdmPrintQuality (){ try { return javonetHandle.get("dmPrintQuality");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setdmPrintQuality (java.lang.Short param){ try { javonetHandle.set("dmPrintQuality",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Short getdmColor (){ try { return javonetHandle.get("dmColor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setdmColor (java.lang.Short param){ try { javonetHandle.set("dmColor",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Short getdmDuplex (){ try { return javonetHandle.get("dmDuplex");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setdmDuplex (java.lang.Short param){ try { javonetHandle.set("dmDuplex",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Short getdmYResolution (){ try { return javonetHandle.get("dmYResolution");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setdmYResolution (java.lang.Short param){ try { javonetHandle.set("dmYResolution",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Short getdmTTOption (){ try { return javonetHandle.get("dmTTOption");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setdmTTOption (java.lang.Short param){ try { javonetHandle.set("dmTTOption",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Short getdmCollate (){ try { return javonetHandle.get("dmCollate");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setdmCollate (java.lang.Short param){ try { javonetHandle.set("dmCollate",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getdmFormName (){ try { return  (java.lang.String) javonetHandle.get("dmFormName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setdmFormName (java.lang.String param){ try { javonetHandle.set("dmFormName",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Short getdmUnusedPadding (){ try { return javonetHandle.get("dmUnusedPadding");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setdmUnusedPadding (java.lang.Short param){ try { javonetHandle.set("dmUnusedPadding",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getdmBitsPerPel (){ try { return javonetHandle.get("dmBitsPerPel");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setdmBitsPerPel (java.lang.Integer param){ try { javonetHandle.set("dmBitsPerPel",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getdmPelsWidth (){ try { return javonetHandle.get("dmPelsWidth");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setdmPelsWidth (java.lang.Integer param){ try { javonetHandle.set("dmPelsWidth",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getdmPelsHeight (){ try { return javonetHandle.get("dmPelsHeight");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setdmPelsHeight (java.lang.Integer param){ try { javonetHandle.set("dmPelsHeight",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getdmDisplayFlags (){ try { return javonetHandle.get("dmDisplayFlags");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setdmDisplayFlags (java.lang.Integer param){ try { javonetHandle.set("dmDisplayFlags",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getdmDisplayFrequency (){ try { return javonetHandle.get("dmDisplayFrequency");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setdmDisplayFrequency (java.lang.Integer param){ try { javonetHandle.set("dmDisplayFrequency",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static java.lang.Integer getTStrSize (){ try { return Javonet.getType("DEVMODE").get("TStrSize");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public static void setTStrSize (java.lang.Integer param){ try { Javonet.getType("DEVMODE").set("TStrSize",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DEVMODE (){ try {  javonetHandle = Javonet.New("DEVMODE");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DEVMODE(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}