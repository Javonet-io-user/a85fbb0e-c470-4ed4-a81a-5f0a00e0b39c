package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.*;
import combit.ListLabel23.DataProviders.*;
import jio.System.Collections.ObjectModel.*;public class UsedIdentifierHelper {protected NObject javonetHandle; public UsedIdentifierHelper (ReadOnlyCollection<java.lang.String> identifiers){ try {  javonetHandle = Javonet.New("UsedIdentifierHelper",identifiers);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public UsedIdentifierHelper(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Boolean HasIdentifiersStartingWith (java.lang.String value,java.lang.Boolean caseSensitive){ try { return javonetHandle.invoke("HasIdentifiersStartingWith",value,caseSensitive);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public ReadOnlyCollection<java.lang.String> GetIdentifiersForTable (IDataProvider dataProvider,java.lang.String tableName,java.lang.Boolean includeJoinedIdentifiers){ try { return new ReadOnlyCollection<java.lang.String>((NObject)javonetHandle.invoke("GetIdentifiersForTable",dataProvider,tableName,includeJoinedIdentifiers));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}