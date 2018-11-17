package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;
import jio.System.*;public class SubItemTable extends SubItemTableBase {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public CollectionSubItemBases getSubItems (){ try { return new CollectionSubItemBases((NObject)javonetHandle.<NObject>get("SubItems"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyTableLines getLines (){ try { return new PropertyTableLines((NObject)javonetHandle.<NObject>get("Lines"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyLineOptions getLineOptions (){ try { return new PropertyLineOptions((NObject)javonetHandle.<NObject>get("LineOptions"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setExpandable (Nullable<java.lang.Boolean> value){ try { javonetHandle.set("Expandable",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Nullable<java.lang.Boolean> getExpandable (){ try { return javonetHandle.<NObject>get("Expandable");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setRelationId (java.lang.String value){ try { javonetHandle.set("RelationId",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getRelationId (){ try { return  (java.lang.String) javonetHandle.get("RelationId");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public SubItemTable (CollectionSubItemBasesBase itemCollection){  super((NObject) null); try {  javonetHandle = Javonet.New("SubItemTable",itemCollection); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SubItemTable (CollectionSubItemBasesBase itemCollection,java.lang.Integer index){  super((NObject) null); try {  javonetHandle = Javonet.New("SubItemTable",itemCollection,index); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SubItemTable(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}