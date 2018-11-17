package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.*;
import jio.System.Drawing.Imaging.*;
import jio.System.Drawing.*;
import jio.System.Drawing.Printing.*;public class PreviewPage {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public PreviewFile getFile (){ try { return new PreviewFile((NObject)javonetHandle.<NObject>get("File"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getPageIndex (){ try { return javonetHandle.get("PageIndex");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getPageNumber (){ try { return javonetHandle.get("PageNumber");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getCopies (){ try { return javonetHandle.get("Copies");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public LlOrientation getOrientation (){ try { return LlOrientation.valueOf(((NEnum) javonetHandle.<NObject>get("Orientation")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getPrintPhysicalPage (){ try { return javonetHandle.get("PrintPhysicalPage");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public Point getPrintablePageOffset (){ try { return javonetHandle.<NObject>get("PrintablePageOffset");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public Size getPrintablePageSize (){ try { return javonetHandle.<NObject>get("PrintablePageSize");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public Size getPysicalPageSize (){ try { return javonetHandle.<NObject>get("PysicalPageSize");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public Size getPrinterResolution (){ try { return javonetHandle.<NObject>get("PrinterResolution");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getPrinterIndex (){ try { return javonetHandle.get("PrinterIndex");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.String getProjectName (){ try { return  (java.lang.String) javonetHandle.get("ProjectName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setJobName (java.lang.String value){ try { javonetHandle.set("JobName",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getJobName (){ try { return  (java.lang.String) javonetHandle.get("JobName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getPrinterName (){ try { return  (java.lang.String) javonetHandle.get("PrinterName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getPrinterDevice (){ try { return  (java.lang.String) javonetHandle.get("PrinterDevice");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getPrinterPort (){ try { return  (java.lang.String) javonetHandle.get("PrinterPort");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setUserValue (java.lang.String value){ try { javonetHandle.set("UserValue",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getUserValue (){ try { return  (java.lang.String) javonetHandle.get("UserValue");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public LlPreviewPageCreation getCreation (){ try { return javonetHandle.<NObject>get("Creation");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PageSettings getPageSettings (){ try { return new PageSettings((NObject)javonetHandle.<NObject>get("PageSettings"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PreviewPage(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public Metafile GetMetafile (){ try { return new Metafile((NObject)javonetHandle.invoke("GetMetafile"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public Bitmap GetBitmap (){ try { return new Bitmap((NObject)javonetHandle.invoke("GetBitmap"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public Bitmap GetBitmap (java.lang.Integer maxSize){ try { return new Bitmap((NObject)javonetHandle.invoke("GetBitmap",maxSize));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void Draw (Graphics g){ try { javonetHandle.invoke("Draw",g);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Draw (Graphics g,Rectangle rectangle){ try { javonetHandle.invoke("Draw",g,rectangle);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}