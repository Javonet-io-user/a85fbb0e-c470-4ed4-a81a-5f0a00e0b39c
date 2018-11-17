package combit.ListLabel23.DataProviders.SqlTokenizer;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DataProviders.SqlTokenizer.*;
import Irony.Ast.*;
import Irony.Parsing.*;public class NumberInBracketsNode extends SqlNodeBase implements IAstNodeInit {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.Integer getNumberValue (){ try { return javonetHandle.get("NumberValue");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }public NumberInBracketsNode (){  super((NObject) null); try {  javonetHandle = Javonet.New("NumberInBracketsNode"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public NumberInBracketsNode(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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