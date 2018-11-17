package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;
import jio.System.Drawing.Printing.*;public class Region extends DomItem {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setCollate (java.lang.String value){ try { javonetHandle.set("Collate",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getCollate (){ try { return  (java.lang.String) javonetHandle.get("Collate");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getIsStandardRegion (){ try { return  (java.lang.String) javonetHandle.get("IsStandardRegion");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setUseForOutput (java.lang.String value){ try { javonetHandle.set("UseForOutput",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getUseForOutput (){ try { return  (java.lang.String) javonetHandle.get("UseForOutput");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setCondition (java.lang.String value){ try { javonetHandle.set("Condition",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getCondition (){ try { return  (java.lang.String) javonetHandle.get("Condition");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setCopies (java.lang.String value){ try { javonetHandle.set("Copies",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getCopies (){ try { return  (java.lang.String) javonetHandle.get("Copies");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyDevice getDevice (){ try { return new PropertyDevice((NObject)javonetHandle.<NObject>get("Device"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setDuplex (java.lang.String value){ try { javonetHandle.set("Duplex",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDuplex (){ try { return  (java.lang.String) javonetHandle.get("Duplex");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setFitPage (java.lang.String value){ try { javonetHandle.set("FitPage",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFitPage (){ try { return  (java.lang.String) javonetHandle.get("FitPage");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setForcePaperFormat (java.lang.String value){ try { javonetHandle.set("ForcePaperFormat",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getForcePaperFormat (){ try { return  (java.lang.String) javonetHandle.get("ForcePaperFormat");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyLayout getLayout (){ try { return new PropertyLayout((NObject)javonetHandle.<NObject>get("Layout"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setName (java.lang.String value){ try { javonetHandle.set("Name",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getName (){ try { return  (java.lang.String) javonetHandle.get("Name");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyPaper getPaper (){ try { return new PropertyPaper((NObject)javonetHandle.<NObject>get("Paper"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSourceTray (java.lang.String value){ try { javonetHandle.set("SourceTray",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSourceTray (){ try { return  (java.lang.String) javonetHandle.get("SourceTray");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setUsePhysicalPaper (java.lang.String value){ try { javonetHandle.set("UsePhysicalPaper",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getUsePhysicalPaper (){ try { return  (java.lang.String) javonetHandle.get("UsePhysicalPaper");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setShowInPrintDialog (java.lang.String value){ try { javonetHandle.set("ShowInPrintDialog",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getShowInPrintDialog (){ try { return  (java.lang.String) javonetHandle.get("ShowInPrintDialog");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public Region (CollectionRegions regionCollection){  super((NObject) null); try {  javonetHandle = Javonet.New("Region",regionCollection); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Region (CollectionRegions regionCollection,java.lang.Integer index){  super((NObject) null); try {  javonetHandle = Javonet.New("Region",regionCollection,index); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Region(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Set (PrinterSettings printerSettings){ try { javonetHandle.invoke("Set",printerSettings);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Set (PrinterSettings printerSettings,PageSettings pageSettings){ try { javonetHandle.invoke("Set",printerSettings,pageSettings);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}