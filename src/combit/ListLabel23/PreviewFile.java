package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.*;
import jio.System.*;
import jio.System.Collections.*;
import jio.System.Collections.ObjectModel.*;public class PreviewFile implements ICollection,IEnumerable,IDisposable {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setLanguage (LlLanguage value){ try { javonetHandle.set("Language",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlLanguage getLanguage (){ try { return LlLanguage.valueOf(((NEnum) javonetHandle.<NObject>get("Language")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getHandle (){ try { return javonetHandle.<NObject>get("Handle");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getFileVersion (){ try { return javonetHandle.get("FileVersion");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getAPIVersion (){ try { return javonetHandle.get("APIVersion");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public LlUnits getUnits (){ try { return LlUnits.valueOf(((NEnum) javonetHandle.<NObject>get("Units")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getEmfResolution (){ try { return javonetHandle.get("EmfResolution");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getPrinterCount (){ try { return javonetHandle.get("PrinterCount");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public LlBoxType getBoxType (){ try { return LlBoxType.valueOf(((NEnum) javonetHandle.<NObject>get("BoxType")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.String getFilename (){ try { return  (java.lang.String) javonetHandle.get("Filename");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.Integer getCount (){ try { return javonetHandle.get("Count");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public ReadOnlyCollection<PreviewPage> getPages (){ try { return new ReadOnlyCollection<PreviewPage>((NObject)javonetHandle.<NObject>get("Pages"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PreviewPage get_Item (java.lang.Integer index){ try { return new PreviewPage((NObject)javonetHandle.invoke("get_Item",index));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PreviewFile (java.lang.String filename){ try {  javonetHandle = Javonet.New("PreviewFile",filename);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PreviewFile (java.lang.String filename,java.lang.Boolean readOnly){ try {  javonetHandle = Javonet.New("PreviewFile",filename,readOnly);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PreviewFile (java.lang.String filename,java.lang.Boolean readOnly,java.lang.String tempPath,LlLanguage language){ try {  javonetHandle = Javonet.New("PreviewFile",filename,readOnly,tempPath,NEnum.fromJavaEnum(language));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PreviewFile (java.lang.Integer handle){ try {  javonetHandle = Javonet.New("PreviewFile",handle);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PreviewFile(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Dispose (){ try { javonetHandle.invoke("Dispose");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.String GetProjectParameterValue (java.lang.String parameterName){ try { return  (java.lang.String) javonetHandle.invoke("GetProjectParameterValue",parameterName);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public void Close (){ try { javonetHandle.invoke("Close");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void DeleteFiles (){ try { javonetHandle.invoke("DeleteFiles");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.String GetFilename (){ try { return  (java.lang.String) javonetHandle.invoke("GetFilename");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public java.lang.String GetFilename (java.lang.Integer jobIndex){ try { return  (java.lang.String) javonetHandle.invoke("GetFilename",jobIndex);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public void ConvertTo (java.lang.String filename){ try { javonetHandle.invoke("ConvertTo",filename);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void ConvertTo (java.lang.String filename,java.lang.String targetFormat){ try { javonetHandle.invoke("ConvertTo",filename,targetFormat);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Append (java.lang.String filename){ try { javonetHandle.invoke("Append",filename);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Append (PreviewFile previewFile){ try { javonetHandle.invoke("Append",previewFile);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Append (java.lang.Integer handle){ try { javonetHandle.invoke("Append",handle);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Print (){ try { javonetHandle.invoke("Print");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Print (java.lang.String printerName){ try { javonetHandle.invoke("Print",printerName);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Print (java.lang.String printerName1,java.lang.String printerName2){ try { javonetHandle.invoke("Print",printerName1,printerName2);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Print (java.lang.String printerName1,java.lang.String printerName2,java.lang.Integer startPageIndex,java.lang.Integer endPageIndex){ try { javonetHandle.invoke("Print",printerName1,printerName2,startPageIndex,endPageIndex);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Print (java.lang.String printerName1,java.lang.String printerName2,java.lang.Integer startPageIndex,java.lang.Integer endPageIndex,java.lang.Integer copies){ try { javonetHandle.invoke("Print",printerName1,printerName2,startPageIndex,endPageIndex,copies);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Print (java.lang.String printerName1,java.lang.String printerName2,java.lang.Integer startPageIndex,java.lang.Integer endPageIndex,java.lang.Integer copies,LlStgsysPrintFlag flags,java.lang.String title,java.lang.Integer windowHandle){ try { javonetHandle.invoke("Print",printerName1,printerName2,startPageIndex,endPageIndex,copies,NEnum.fromJavaEnum(flags),title,windowHandle);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public IEnumerator GetEnumerator (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetEnumerator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void CopyTo (java.lang.reflect.Array array,java.lang.Integer index){ try { javonetHandle.invoke("CopyTo",array,index);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public NObject get_SyncRoot (){ try { return  (NObject) javonetHandle.invoke("get_SyncRoot");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Boolean get_IsSynchronized (){ try { return javonetHandle.invoke("get_IsSynchronized");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}