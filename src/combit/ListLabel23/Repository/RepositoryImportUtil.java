package combit.ListLabel23.Repository;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Repository.*;
import combit.ListLabel23.*;
import jio.System.*;public class RepositoryImportUtil implements IDisposable {protected NObject javonetHandle; public RepositoryImportUtil (IRepository targetRepository){ try {  javonetHandle = Javonet.New("RepositoryImportUtil",targetRepository);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public RepositoryImportUtil(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.String CreateNewProject (LlProject projectType,java.lang.String uiName){ try { return  (java.lang.String) javonetHandle.invoke("CreateNewProject",NEnum.fromJavaEnum(projectType),uiName);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public java.lang.String ImportProjectFile (ListLabel ll,java.lang.String filePath,java.lang.String userImportData,java.lang.String printerConfigFile,java.lang.String sketchImageFile){ try { return  (java.lang.String) javonetHandle.invoke("ImportProjectFile",ll,filePath,userImportData,printerConfigFile,sketchImageFile);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public java.lang.Boolean TryGetPreviouslyImportedItem (java.lang.String originalFilePath,AtomicReference<java.lang.String> assignedRepositoryItemId){ try { return javonetHandle.invoke("TryGetPreviouslyImportedItem",originalFilePath,new NOut(assignedRepositoryItemId, Helper.JavaToDotnetType.get(java.lang.String.class)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.String ImportProjectFileWithDependencies (ListLabel ll,java.lang.String projectFilePath,java.lang.String repositoryItemId){ try { return  (java.lang.String) javonetHandle.invoke("ImportProjectFileWithDependencies",ll,projectFilePath,repositoryItemId);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public Tuple<java.lang.String,java.lang.String> ImportShapefile (ListLabel ll,java.lang.String shpFilePath,java.lang.String dbfFilePath,java.lang.String userImportData){ try { return new Tuple<java.lang.String,java.lang.String>((NObject)javonetHandle.invoke("ImportShapefile",ll,shpFilePath,dbfFilePath,userImportData));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.String ImportPdfFile (ListLabel ll,java.lang.String filePath,java.lang.String userImportData){ try { return  (java.lang.String) javonetHandle.invoke("ImportPdfFile",ll,filePath,userImportData);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public java.lang.String ImportImageFile (ListLabel ll,java.lang.String filePath,java.lang.String userImportData){ try { return  (java.lang.String) javonetHandle.invoke("ImportImageFile",ll,filePath,userImportData);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public java.lang.String ImportReverseSideFile (ListLabel ll,java.lang.String filePath,java.lang.String userImportData){ try { return  (java.lang.String) javonetHandle.invoke("ImportReverseSideFile",ll,filePath,userImportData);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public java.lang.String ImportTableOfContentsFile (ListLabel ll,java.lang.String filePath,java.lang.String userImportData){ try { return  (java.lang.String) javonetHandle.invoke("ImportTableOfContentsFile",ll,filePath,userImportData);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public java.lang.String ImportIndexFile (ListLabel ll,java.lang.String filePath,java.lang.String userImportData){ try { return  (java.lang.String) javonetHandle.invoke("ImportIndexFile",ll,filePath,userImportData);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public java.lang.String ImportPrinterConfigFile (ListLabel ll,java.lang.String filePath,java.lang.String parentProjectItemId,java.lang.String userImportData){ try { return  (java.lang.String) javonetHandle.invoke("ImportPrinterConfigFile",ll,filePath,parentProjectItemId,userImportData);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public java.lang.String ImportSketchImageFile (ListLabel ll,java.lang.String filePath,java.lang.String parentProjectItemId,java.lang.String userImportData){ try { return  (java.lang.String) javonetHandle.invoke("ImportSketchImageFile",ll,filePath,parentProjectItemId,userImportData);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public void SetItemUIName (java.lang.String itemId,java.lang.String uiName,java.lang.Integer lcid){ try { javonetHandle.invoke("SetItemUIName",itemId,uiName,lcid);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Dispose (){ try { javonetHandle.invoke("Dispose");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}