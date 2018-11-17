package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DataProviders.*;
import jio.System.Collections.ObjectModel.*;public class GoogleAnalyticsDataProvider implements IDataProvider {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setRowsPerDataRequest (java.lang.Integer value){ try { javonetHandle.set("RowsPerDataRequest",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getRowsPerDataRequest (){ try { return javonetHandle.get("RowsPerDataRequest");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.String getRefreshToken (){ try { return  (java.lang.String) javonetHandle.get("RefreshToken");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getClientId (){ try { return  (java.lang.String) javonetHandle.get("ClientId");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public GoogleAnalyticsDataProvider (java.lang.String refreshToken,java.lang.String clientId,java.lang.String clientSecret){ try {  javonetHandle = Javonet.New("GoogleAnalyticsDataProvider",refreshToken,clientId,clientSecret);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public GoogleAnalyticsDataProvider(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void AddQuery (java.lang.String tableName,java.lang.String[] ids,java.lang.String startDate,java.lang.String endDate,java.lang.String[] metrics,java.lang.String[] dimensions,java.lang.String[] sort,java.lang.String filters,java.lang.String segment,java.lang.String samplingLevel,java.lang.String startIndex,java.lang.String maxResult){ try { javonetHandle.invoke("AddQuery",tableName,new Object[] {ids},startDate,endDate,new Object[] {metrics},new Object[] {dimensions},new Object[] {sort},filters,segment,samplingLevel,startIndex,maxResult);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean get_SupportsAnyBaseTable (){ try { return javonetHandle.invoke("get_SupportsAnyBaseTable");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public ReadOnlyCollection<ITable> get_Tables (){ try { return new ReadOnlyCollection<ITable>((NObject)javonetHandle.invoke("get_Tables"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ReadOnlyCollection<ITableRelation> get_Relations (){ try { return new ReadOnlyCollection<ITableRelation>((NObject)javonetHandle.invoke("get_Relations"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ITable GetTable (java.lang.String tableName){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetTable",tableName));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ITableRelation GetRelation (java.lang.String relationName){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetRelation",relationName));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}