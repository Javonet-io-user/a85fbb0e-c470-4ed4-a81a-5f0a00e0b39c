package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyCrosstabCells extends DomItem {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public CrosstabCellContent getAll (){ try { return new CrosstabCellContent((NObject)javonetHandle.<NObject>get("All"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public CrosstabCellContent get_Item (java.lang.Integer rowLevel,java.lang.Integer columnLevel){ try { return new CrosstabCellContent((NObject)javonetHandle.invoke("get_Item",rowLevel,columnLevel));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public CrosstabCellContent get_Item (java.lang.Integer rowLevel,java.lang.Integer columnLevel,java.lang.Integer subColumnLevel){ try { return new CrosstabCellContent((NObject)javonetHandle.invoke("get_Item",rowLevel,columnLevel,subColumnLevel));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PropertyCrosstabCells(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void CopyFrom (DomItem source){ try { javonetHandle.invoke("CopyFrom",source);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public CrosstabCellContent Column (java.lang.Integer rowLevel){ try { return new CrosstabCellContent((NObject)javonetHandle.invoke("Column",rowLevel));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public CrosstabCellContent Row (java.lang.Integer columnLevel){ try { return new CrosstabCellContent((NObject)javonetHandle.invoke("Row",columnLevel));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}