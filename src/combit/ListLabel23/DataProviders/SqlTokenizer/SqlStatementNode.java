package combit.ListLabel23.DataProviders.SqlTokenizer;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DataProviders.SqlTokenizer.*;
import Irony.Ast.*;
import Irony.Parsing.*;
import jio.System.*;public class SqlStatementNode extends SqlNodeBase implements IAstNodeInit {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public SelectNode getSelect (){ try { return new SelectNode((NObject)javonetHandle.<NObject>get("Select"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public FromNode getFrom (){ try { return new FromNode((NObject)javonetHandle.<NObject>get("From"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public JoinNode getJoin (){ try { return new JoinNode((NObject)javonetHandle.<NObject>get("Join"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public WhereNode getWhere (){ try { return new WhereNode((NObject)javonetHandle.<NObject>get("Where"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public GroupByNode getGroupBy (){ try { return new GroupByNode((NObject)javonetHandle.<NObject>get("GroupBy"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public HavingNode getHaving (){ try { return new HavingNode((NObject)javonetHandle.<NObject>get("Having"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public OrderByNode getOrderBy (){ try { return new OrderByNode((NObject)javonetHandle.<NObject>get("OrderBy"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public UnionNode getUnion (){ try { return new UnionNode((NObject)javonetHandle.<NObject>get("Union"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public Nullable<java.lang.Integer> getTopOrLimit (){ try { return javonetHandle.<NObject>get("TopOrLimit");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public SqlStatementNode (){  super((NObject) null); try {  javonetHandle = Javonet.New("SqlStatementNode"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SqlStatementNode(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Init (AstContext context,ParseTreeNode treeNode){ try { javonetHandle.invoke("Init",context,treeNode);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}