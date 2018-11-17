package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DataProviders.*;
import combit.ListLabel23.*;
import jio.System.*;
import jio.System.Collections.ObjectModel.*;public class ObjectDataProvider implements IDataProvider,ICanHandleUsedIdentifiers,ISupportsLogger {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setUseLinqForSorting (java.lang.Boolean value){ try { javonetHandle.set("UseLinqForSorting",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getUseLinqForSorting (){ try { return javonetHandle.get("UseLinqForSorting");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setFlattenStructure (java.lang.Boolean value){ try { javonetHandle.set("FlattenStructure",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getFlattenStructure (){ try { return javonetHandle.get("FlattenStructure");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setMaximumRecursionDepth (java.lang.Integer value){ try { javonetHandle.set("MaximumRecursionDepth",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getMaximumRecursionDepth (){ try { return javonetHandle.get("MaximumRecursionDepth");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setRootTableName (java.lang.String value){ try { javonetHandle.set("RootTableName",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getRootTableName (){ try { return  (java.lang.String) javonetHandle.get("RootTableName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public NObject getSource (){ try { return  (NObject) javonetHandle.<NObject>get("Source");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setObjectForStructureParsing (NObject value){ try { javonetHandle.set("ObjectForStructureParsing",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public NObject getObjectForStructureParsing (){ try { return  (NObject) javonetHandle.<NObject>get("ObjectForStructureParsing");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public ObjectDataProvider (NObject source,java.lang.Integer maximumRecursionDepth){ try {  javonetHandle = Javonet.New("ObjectDataProvider",source,maximumRecursionDepth);javonetHandle.addEventListener("HandleEnumerableProperty", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<HandleEnumerablePropertyEventArgs> handler : _HandleEnumerablePropertyListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], HandleEnumerablePropertyEventArgs.class));}}});javonetHandle.addEventListener("HandleFlattenedProperty", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<HandleFlattenedPropertyEventArgs> handler : _HandleFlattenedPropertyListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], HandleFlattenedPropertyEventArgs.class));}}});javonetHandle.addEventListener("LoadDeferredContent", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<LoadDeferredContentEventArgs> handler : _LoadDeferredContentListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], LoadDeferredContentEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ObjectDataProvider(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void SetLogger (ILlLogger logger,java.lang.Boolean overrideExisting){ try { javonetHandle.invoke("SetLogger",logger,overrideExisting);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
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
            private java.util.ArrayList< EventHandler<HandleEnumerablePropertyEventArgs>> _HandleEnumerablePropertyListeners = new java.util.ArrayList<EventHandler<HandleEnumerablePropertyEventArgs>>();

            public void addHandleEnumerableProperty(EventHandler<HandleEnumerablePropertyEventArgs> toAdd)
            {
                _HandleEnumerablePropertyListeners.add(toAdd);
            }
            public void removeHandleEnumerableProperty(EventHandler<HandleEnumerablePropertyEventArgs> toRemove)
            {
                _HandleEnumerablePropertyListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< EventHandler<HandleFlattenedPropertyEventArgs>> _HandleFlattenedPropertyListeners = new java.util.ArrayList<EventHandler<HandleFlattenedPropertyEventArgs>>();

            public void addHandleFlattenedProperty(EventHandler<HandleFlattenedPropertyEventArgs> toAdd)
            {
                _HandleFlattenedPropertyListeners.add(toAdd);
            }
            public void removeHandleFlattenedProperty(EventHandler<HandleFlattenedPropertyEventArgs> toRemove)
            {
                _HandleFlattenedPropertyListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< EventHandler<LoadDeferredContentEventArgs>> _LoadDeferredContentListeners = new java.util.ArrayList<EventHandler<LoadDeferredContentEventArgs>>();

            public void addLoadDeferredContent(EventHandler<LoadDeferredContentEventArgs> toAdd)
            {
                _LoadDeferredContentListeners.add(toAdd);
            }
            public void removeLoadDeferredContent(EventHandler<LoadDeferredContentEventArgs> toRemove)
            {
                _LoadDeferredContentListeners.remove(toRemove);
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}