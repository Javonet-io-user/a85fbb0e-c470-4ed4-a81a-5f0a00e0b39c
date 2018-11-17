package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.DataProviders.*;
import jio.System.Xml.XPath.*;public class GetNodeTypeEventArgs extends EventArgs {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setNodeType (NodeType value){ try { javonetHandle.set("NodeType",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public NodeType getNodeType (){ try { return NodeType.valueOf(((NEnum) javonetHandle.<NObject>get("NodeType")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public XPathNavigator getNode (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("Node"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public GetNodeTypeEventArgs (XPathNavigator node,NodeType defaultNodeType){  super((NObject) null); try {  javonetHandle = Javonet.New("GetNodeTypeEventArgs",node,NEnum.fromJavaEnum(defaultNodeType)); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public GetNodeTypeEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}