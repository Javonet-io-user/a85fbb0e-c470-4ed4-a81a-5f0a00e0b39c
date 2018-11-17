package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DataProviders.*;
import combit.ListLabel23.*;
import jio.System.Collections.ObjectModel.*;
import jio.System.Data.*;
import jio.System.*;public class DbCommandSetDataProvider implements IDataProvider,ICanHandleUsedIdentifiers,IDisposable,ISupportsLogger {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setUseLegacyRegexSqlTokenizer (java.lang.Boolean value){ try { javonetHandle.set("UseLegacyRegexSqlTokenizer",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getUseLegacyRegexSqlTokenizer (){ try { return javonetHandle.get("UseLegacyRegexSqlTokenizer");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setSupportGetParentRow (java.lang.Boolean value){ try { javonetHandle.set("SupportGetParentRow",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getSupportGetParentRow (){ try { return javonetHandle.get("SupportGetParentRow");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setSupportSorting (java.lang.Boolean value){ try { javonetHandle.set("SupportSorting",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getSupportSorting (){ try { return javonetHandle.get("SupportSorting");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setSupportGetCount (java.lang.Boolean value){ try { javonetHandle.set("SupportGetCount",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getSupportGetCount (){ try { return javonetHandle.get("SupportGetCount");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setCaseSensitive (java.lang.Boolean value){ try { javonetHandle.set("CaseSensitive",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getCaseSensitive (){ try { return javonetHandle.get("CaseSensitive");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setUseJoinsForParentRow (java.lang.Boolean value){ try { javonetHandle.set("UseJoinsForParentRow",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getUseJoinsForParentRow (){ try { return javonetHandle.get("UseJoinsForParentRow");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getSupportsAnyBaseTable (){ try { return javonetHandle.get("SupportsAnyBaseTable");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setPrefixTableNameWithSchema (java.lang.Boolean value){ try { javonetHandle.set("PrefixTableNameWithSchema",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getPrefixTableNameWithSchema (){ try { return javonetHandle.get("PrefixTableNameWithSchema");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setCancelBeforeClose (java.lang.Boolean value){ try { javonetHandle.set("CancelBeforeClose",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getCancelBeforeClose (){ try { return javonetHandle.get("CancelBeforeClose");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setDisposeCommand (java.lang.Boolean value){ try { javonetHandle.set("DisposeCommand",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getDisposeCommand (){ try { return javonetHandle.get("DisposeCommand");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setColumnCaching (java.lang.Boolean value){ try { javonetHandle.set("ColumnCaching",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getColumnCaching (){ try { return javonetHandle.get("ColumnCaching");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setDisableIdentifierValidation (java.lang.Boolean value){ try { javonetHandle.set("DisableIdentifierValidation",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getDisableIdentifierValidation (){ try { return javonetHandle.get("DisableIdentifierValidation");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setMinimalSelect (java.lang.Boolean value){ try { javonetHandle.set("MinimalSelect",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getMinimalSelect (){ try { return javonetHandle.get("MinimalSelect");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public DbCommandSetDataProvider (){ try {  javonetHandle = Javonet.New("DbCommandSetDataProvider");javonetHandle.addEventListener("ExecuteDbCommand", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<ExecuteDbCommandEventArgs> handler : _ExecuteDbCommandListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ExecuteDbCommandEventArgs.class));}}});javonetHandle.addEventListener("TranslateFilterSyntax", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<TranslateFilterSyntaxEventArgs> handler : _TranslateFilterSyntaxListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], TranslateFilterSyntaxEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DbCommandSetDataProvider(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void SetLogger (ILlLogger logger,java.lang.Boolean overrideExisting){ try { javonetHandle.invoke("SetLogger",logger,overrideExisting);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Dispose (){ try { javonetHandle.invoke("Dispose");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void SetUsedIdentifiers (ReadOnlyCollection<java.lang.String> identifiers){ try { javonetHandle.invoke("SetUsedIdentifiers",identifiers);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddCommand (IDbCommand command,java.lang.String tableName,java.lang.String identifierDelimiterFormat,java.lang.String parameterMarkerFormat){ try { javonetHandle.invoke("AddCommand",command,tableName,identifierDelimiterFormat,parameterMarkerFormat);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddCommand (IDbCommand command,java.lang.String tableName){ try { javonetHandle.invoke("AddCommand",command,tableName);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddRelation (java.lang.String relationName,java.lang.String parentTableName,java.lang.String childTableName,java.lang.String parentColumnName,java.lang.String childColumnName){ try { javonetHandle.invoke("AddRelation",relationName,parentTableName,childTableName,parentColumnName,childColumnName);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddRelation (java.lang.String relationName,java.lang.String parentTableName,java.lang.String childTableName,java.lang.String parentColumnName,java.lang.String childColumnName,java.lang.String parentTableSchema,java.lang.String childTableSchema){ try { javonetHandle.invoke("AddRelation",relationName,parentTableName,childTableName,parentColumnName,childColumnName,parentTableSchema,childTableSchema);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
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
            public ITableRelation GetRelation (java.lang.String relationName){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetRelation",relationName));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Event
	 */
            private java.util.ArrayList< EventHandler<ExecuteDbCommandEventArgs>> _ExecuteDbCommandListeners = new java.util.ArrayList<EventHandler<ExecuteDbCommandEventArgs>>();

            public void addExecuteDbCommand(EventHandler<ExecuteDbCommandEventArgs> toAdd)
            {
                _ExecuteDbCommandListeners.add(toAdd);
            }
            public void removeExecuteDbCommand(EventHandler<ExecuteDbCommandEventArgs> toRemove)
            {
                _ExecuteDbCommandListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< EventHandler<TranslateFilterSyntaxEventArgs>> _TranslateFilterSyntaxListeners = new java.util.ArrayList<EventHandler<TranslateFilterSyntaxEventArgs>>();

            public void addTranslateFilterSyntax(EventHandler<TranslateFilterSyntaxEventArgs> toAdd)
            {
                _TranslateFilterSyntaxListeners.add(toAdd);
            }
            public void removeTranslateFilterSyntax(EventHandler<TranslateFilterSyntaxEventArgs> toRemove)
            {
                _TranslateFilterSyntaxListeners.remove(toRemove);
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}