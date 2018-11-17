package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DataProviders.*;
import jio.System.Runtime.Serialization.*;
import combit.ListLabel23.*;
import jio.System.Collections.ObjectModel.*;
import jio.System.*;public abstract class DbConnectionDataProvider implements IDataProvider,ICanHandleUsedIdentifiers,ISerializable,IDisposable,ISupportsLogger {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setSupportsAdvancedFiltering (java.lang.Boolean value){ try { javonetHandle.set("SupportsAdvancedFiltering",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getSupportsAdvancedFiltering (){ try { return javonetHandle.get("SupportsAdvancedFiltering");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
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
            public void setMinimalSelect (java.lang.Boolean value){ try { javonetHandle.set("MinimalSelect",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getMinimalSelect (){ try { return javonetHandle.get("MinimalSelect");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
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
            public void setCancelBeforeClose (java.lang.Boolean value){ try { javonetHandle.set("CancelBeforeClose",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getCancelBeforeClose (){ try { return javonetHandle.get("CancelBeforeClose");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getSupportsAnyBaseTable (){ try { return javonetHandle.get("SupportsAnyBaseTable");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public ReadOnlyCollection<ITable> getTables (){ try { return new ReadOnlyCollection<ITable>((NObject)javonetHandle.<NObject>get("Tables"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public ReadOnlyCollection<ITableRelation> getRelations (){ try { return new ReadOnlyCollection<ITableRelation>((NObject)javonetHandle.<NObject>get("Relations"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public DbConnectionDataProvider(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void GetObjectData (SerializationInfo info,StreamingContext context){ try { javonetHandle.invoke("GetObjectData",info,context);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Dispose (){ try { javonetHandle.invoke("Dispose");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void SetLogger (ILlLogger logger,java.lang.Boolean overrideExisting){ try { javonetHandle.invoke("SetLogger",logger,overrideExisting);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public ITable GetTable (java.lang.String tableName){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetTable",tableName));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ITableRelation GetRelation (java.lang.String relationName){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetRelation",relationName));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void SetUsedIdentifiers (ReadOnlyCollection<java.lang.String> identifiers){ try { javonetHandle.invoke("SetUsedIdentifiers",identifiers);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Event
	 */
            private java.util.ArrayList< EventHandler<DefineTableEventArgs>> _DefineTableListeners = new java.util.ArrayList<EventHandler<DefineTableEventArgs>>();

            public void addDefineTable(EventHandler<DefineTableEventArgs> toAdd)
            {
                _DefineTableListeners.add(toAdd);
            }
            public void removeDefineTable(EventHandler<DefineTableEventArgs> toRemove)
            {
                _DefineTableListeners.remove(toRemove);
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
            }/**
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
            private java.util.ArrayList< EventHandler<AddDbCommandEventArgs>> _AddDbCommandListeners = new java.util.ArrayList<EventHandler<AddDbCommandEventArgs>>();

            public void addAddDbCommand(EventHandler<AddDbCommandEventArgs> toAdd)
            {
                _AddDbCommandListeners.add(toAdd);
            }
            public void removeAddDbCommand(EventHandler<AddDbCommandEventArgs> toRemove)
            {
                _AddDbCommandListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< DbConnectionDataProviderInitializedHandler> _InitializationCompletedListeners = new java.util.ArrayList<DbConnectionDataProviderInitializedHandler>();

            public void addInitializationCompleted(DbConnectionDataProviderInitializedHandler toAdd)
            {
                _InitializationCompletedListeners.add(toAdd);
            }
            public void removeInitializationCompleted(DbConnectionDataProviderInitializedHandler toRemove)
            {
                _InitializationCompletedListeners.remove(toRemove);
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}