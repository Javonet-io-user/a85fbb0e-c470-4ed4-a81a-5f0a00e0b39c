package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DataProviders.*;
import combit.ListLabel23.*;
import jio.System.Net.*;
import jio.System.*;
import jio.System.Collections.ObjectModel.*;public class ODataDataProvider implements IDataProvider,ICanHandleUsedIdentifiers,IDisposable,ISupportsLogger {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.String getUrl (){ try { return  (java.lang.String) javonetHandle.get("Url");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public NetworkCredential getNetworkCredential (){ try { return new NetworkCredential((NObject)javonetHandle.<NObject>get("NetworkCredential"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setConnectionTimeout (java.lang.Integer value){ try { javonetHandle.set("ConnectionTimeout",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getConnectionTimeout (){ try { return javonetHandle.get("ConnectionTimeout");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setMaximumEmbeddedFieldDepth (java.lang.Integer value){ try { javonetHandle.set("MaximumEmbeddedFieldDepth",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getMaximumEmbeddedFieldDepth (){ try { return javonetHandle.get("MaximumEmbeddedFieldDepth");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setSuppressComplexEdmTypeExpansion (java.lang.Boolean value){ try { javonetHandle.set("SuppressComplexEdmTypeExpansion",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getSuppressComplexEdmTypeExpansion (){ try { return javonetHandle.get("SuppressComplexEdmTypeExpansion");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public ODataDataProvider (java.lang.String url,java.lang.Boolean retrieveRealValuesForDesigner){ try {  javonetHandle = Javonet.New("ODataDataProvider",url,retrieveRealValuesForDesigner);javonetHandle.addEventListener("DefineTable", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<DefineTableEventArgs> handler : _DefineTableListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], DefineTableEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ODataDataProvider (java.lang.String url,java.lang.Boolean retrieveRealValuesForDesigner,NetworkCredential networkCredential){ try {  javonetHandle = Javonet.New("ODataDataProvider",url,retrieveRealValuesForDesigner,networkCredential);javonetHandle.addEventListener("DefineTable", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<DefineTableEventArgs> handler : _DefineTableListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], DefineTableEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ODataDataProvider (java.lang.String url,java.lang.Boolean retrieveRealValuesForDesigner,NetworkCredential networkCredential,java.lang.String localMetadataFilePath){ try {  javonetHandle = Javonet.New("ODataDataProvider",url,retrieveRealValuesForDesigner,networkCredential,localMetadataFilePath);javonetHandle.addEventListener("DefineTable", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<DefineTableEventArgs> handler : _DefineTableListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], DefineTableEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ODataDataProvider(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}