package combit.ListLabel23.Repository;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Repository.*;
import combit.ListLabel23.*;public class RepositoryItemType {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.String getValue (){ try { return  (java.lang.String) javonetHandle.get("Value");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetFiled
	 */
            public static RepositoryItemType getImage (){ try { return new RepositoryItemType((NObject)Javonet.getType("RepositoryItemType").<NObject>get("Image"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setImage (RepositoryItemType param){ try { Javonet.getType("RepositoryItemType").set("Image",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static RepositoryItemType getPDF (){ try { return new RepositoryItemType((NObject)Javonet.getType("RepositoryItemType").<NObject>get("PDF"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setPDF (RepositoryItemType param){ try { Javonet.getType("RepositoryItemType").set("PDF",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static RepositoryItemType getProjectList (){ try { return new RepositoryItemType((NObject)Javonet.getType("RepositoryItemType").<NObject>get("ProjectList"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setProjectList (RepositoryItemType param){ try { Javonet.getType("RepositoryItemType").set("ProjectList",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static RepositoryItemType getProjectCard (){ try { return new RepositoryItemType((NObject)Javonet.getType("RepositoryItemType").<NObject>get("ProjectCard"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setProjectCard (RepositoryItemType param){ try { Javonet.getType("RepositoryItemType").set("ProjectCard",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static RepositoryItemType getProjectLabel (){ try { return new RepositoryItemType((NObject)Javonet.getType("RepositoryItemType").<NObject>get("ProjectLabel"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setProjectLabel (RepositoryItemType param){ try { Javonet.getType("RepositoryItemType").set("ProjectLabel",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static RepositoryItemType getProjectIndex (){ try { return new RepositoryItemType((NObject)Javonet.getType("RepositoryItemType").<NObject>get("ProjectIndex"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setProjectIndex (RepositoryItemType param){ try { Javonet.getType("RepositoryItemType").set("ProjectIndex",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static RepositoryItemType getProjectReverseSide (){ try { return new RepositoryItemType((NObject)Javonet.getType("RepositoryItemType").<NObject>get("ProjectReverseSide"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setProjectReverseSide (RepositoryItemType param){ try { Javonet.getType("RepositoryItemType").set("ProjectReverseSide",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static RepositoryItemType getProjectTableOfContents (){ try { return new RepositoryItemType((NObject)Javonet.getType("RepositoryItemType").<NObject>get("ProjectTableOfContents"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setProjectTableOfContents (RepositoryItemType param){ try { Javonet.getType("RepositoryItemType").set("ProjectTableOfContents",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static RepositoryItemType getPrinterConfig (){ try { return new RepositoryItemType((NObject)Javonet.getType("RepositoryItemType").<NObject>get("PrinterConfig"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setPrinterConfig (RepositoryItemType param){ try { Javonet.getType("RepositoryItemType").set("PrinterConfig",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static RepositoryItemType getSketchImage (){ try { return new RepositoryItemType((NObject)Javonet.getType("RepositoryItemType").<NObject>get("SketchImage"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setSketchImage (RepositoryItemType param){ try { Javonet.getType("RepositoryItemType").set("SketchImage",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static RepositoryItemType getShapefile (){ try { return new RepositoryItemType((NObject)Javonet.getType("RepositoryItemType").<NObject>get("Shapefile"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setShapefile (RepositoryItemType param){ try { Javonet.getType("RepositoryItemType").set("Shapefile",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static RepositoryItemType getShapefileDatabase (){ try { return new RepositoryItemType((NObject)Javonet.getType("RepositoryItemType").<NObject>get("ShapefileDatabase"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setShapefileDatabase (RepositoryItemType param){ try { Javonet.getType("RepositoryItemType").set("ShapefileDatabase",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public RepositoryItemType(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.String ToString (){ try { return  (java.lang.String) javonetHandle.invoke("ToString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public static RepositoryItemType FromLlProject (LlProject project){ try { return new RepositoryItemType((NObject)Javonet.getType("RepositoryItemType").invoke("FromLlProject",NEnum.fromJavaEnum(project)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static LlProject ToLlProject (java.lang.String itemType){ try { return LlProject.valueOf(((NEnum) Javonet.getType("RepositoryItemType").invoke("ToLlProject",itemType)).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static RepositoryItemType FromStringValue (java.lang.String typeValue){ try { return new RepositoryItemType((NObject)Javonet.getType("RepositoryItemType").invoke("FromStringValue",typeValue));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static java.lang.Boolean IsProjectType (java.lang.String typeValue,java.lang.Boolean allowSpecialProjectTypes){ try { return Javonet.getType("RepositoryItemType").invoke("IsProjectType",typeValue,allowSpecialProjectTypes);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public static java.lang.Boolean IsProjectType (RepositoryItemType typeValue,java.lang.Boolean allowSpecialProjectTypes){ try { return Javonet.getType("RepositoryItemType").invoke("IsProjectType",typeValue,allowSpecialProjectTypes);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}