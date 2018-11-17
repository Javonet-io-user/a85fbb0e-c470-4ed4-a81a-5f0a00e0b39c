package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;
import jio.System.IO.*;
import jio.System.*;public abstract class ProjectBase extends DomItem implements IDisposable {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setDesignerRedraw (java.lang.String value){ try { javonetHandle.set("DesignerRedraw",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public PropertySettings getSettings (){ try { return new PropertySettings((NObject)javonetHandle.<NObject>get("Settings"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public CollectionObjectBases getObjects (){ try { return new CollectionObjectBases((NObject)javonetHandle.<NObject>get("Objects"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public CollectionUserVariables getUserVariables (){ try { return new CollectionUserVariables((NObject)javonetHandle.<NObject>get("UserVariables"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public CollectionSumVariables getSumVariables (){ try { return new CollectionSumVariables((NObject)javonetHandle.<NObject>get("SumVariables"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public CollectionProjectParameters getProjectParameters (){ try { return new CollectionProjectParameters((NObject)javonetHandle.<NObject>get("ProjectParameters"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyLayoutBase getLayout (){ try { return new PropertyLayoutBase((NObject)javonetHandle.<NObject>get("Layout"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyReportSections getReportSections (){ try { return new PropertyReportSections((NObject)javonetHandle.<NObject>get("ReportSections"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setUserData (java.lang.String value){ try { javonetHandle.set("UserData",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getUserData (){ try { return  (java.lang.String) javonetHandle.get("UserData");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setPageRanges (java.lang.String value){ try { javonetHandle.set("PageRanges",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPageRanges (){ try { return  (java.lang.String) javonetHandle.get("PageRanges");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setIssueRanges (java.lang.String value){ try { javonetHandle.set("IssueRanges",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getIssueRanges (){ try { return  (java.lang.String) javonetHandle.get("IssueRanges");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setFilter (java.lang.String value){ try { javonetHandle.set("Filter",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFilter (){ try { return  (java.lang.String) javonetHandle.get("Filter");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getChanged (){ try { return  (java.lang.String) javonetHandle.get("Changed");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public CollectionRegions getRegions (){ try { return new CollectionRegions((NObject)javonetHandle.<NObject>get("Regions"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public CollectionLayers getLayers (){ try { return new CollectionLayers((NObject)javonetHandle.<NObject>get("Layers"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public CollectionTemplates getProjectTemplates (){ try { return new CollectionTemplates((NObject)javonetHandle.<NObject>get("ProjectTemplates"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public CollectionReportParameters getReportParameters (){ try { return new CollectionReportParameters((NObject)javonetHandle.<NObject>get("ReportParameters"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public CollectionCollectionVariables getCollectionVariables (){ try { return new CollectionCollectionVariables((NObject)javonetHandle.<NObject>get("CollectionVariables"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public ProjectBase(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Dispose (){ try { javonetHandle.invoke("Dispose");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void GetFromParent (){ try { javonetHandle.invoke("GetFromParent");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Open (Stream projectStream){ try { javonetHandle.invoke("Open",projectStream);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Open (Stream projectStream,Stream printerSettingsStream){ try { javonetHandle.invoke("Open",projectStream,printerSettingsStream);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public DomItem CurrentObject (LlDomCurrentObjectLevel level){ try { return new DomItem((NObject)javonetHandle.invoke("CurrentObject",NEnum.fromJavaEnum(level)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void Open (Stream projectStream,Stream printerSettingsStream,LlDomSettings domSettings){ try { javonetHandle.invoke("Open",projectStream,printerSettingsStream,NEnum.fromJavaEnum(domSettings));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Open (java.lang.String projectFile,LlDomFileMode fileMode){ try { javonetHandle.invoke("Open",projectFile,NEnum.fromJavaEnum(fileMode));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Open (java.lang.String projectFile,LlDomFileMode fileMode,LlDomAccessMode accessMode){ try { javonetHandle.invoke("Open",projectFile,NEnum.fromJavaEnum(fileMode),NEnum.fromJavaEnum(accessMode));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Open (java.lang.String projectFile,LlDomFileMode fileMode,LlDomAccessMode accessMode,java.lang.Boolean ignoreErrors){ try { javonetHandle.invoke("Open",projectFile,NEnum.fromJavaEnum(fileMode),NEnum.fromJavaEnum(accessMode),ignoreErrors);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Open (java.lang.String projectFile,LlDomFileMode fileMode,LlDomAccessMode accessMode,LlDomSettings settings){ try { javonetHandle.invoke("Open",projectFile,NEnum.fromJavaEnum(fileMode),NEnum.fromJavaEnum(accessMode),NEnum.fromJavaEnum(settings));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Save (){ try { javonetHandle.invoke("Save");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Save (java.lang.String projectFile){ try { javonetHandle.invoke("Save",projectFile);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Close (){ try { javonetHandle.invoke("Close");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void ResetInformation (){ try { javonetHandle.invoke("ResetInformation");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}