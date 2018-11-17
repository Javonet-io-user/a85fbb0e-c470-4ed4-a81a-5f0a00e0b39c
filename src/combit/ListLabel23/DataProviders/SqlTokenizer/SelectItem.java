package combit.ListLabel23.DataProviders.SqlTokenizer;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DataProviders.SqlTokenizer.*;
import Irony.Ast.*;
import Irony.Parsing.*;public class SelectItem extends SqlNodeBase implements IAstNodeInit {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public SqlNodeBase getColumnDefinition (){ try { return new SqlNodeBase((NObject)javonetHandle.<NObject>get("ColumnDefinition"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public ColumnRef getAlias (){ try { return new ColumnRef((NObject)javonetHandle.<NObject>get("Alias"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public SelectItem (){  super((NObject) null); try {  javonetHandle = Javonet.New("SelectItem"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SelectItem(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Init (AstContext context,ParseTreeNode parseNode){ try { javonetHandle.invoke("Init",context,parseNode);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}