package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DataProviders.*;
import jio.System.Runtime.Serialization.*;
import jio.System.Collections.ObjectModel.*;
import jio.System.Xml.XPath.*;
import jio.System.*;public class XmlDataProvider implements IDataProvider,ICanHandleUsedIdentifiers,ISerializable,IFileList {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setParseFirstElementOnly (java.lang.Boolean value){ try { javonetHandle.set("ParseFirstElementOnly",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getParseFirstElementOnly (){ try { return javonetHandle.get("ParseFirstElementOnly");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setFlattenStructure (java.lang.Boolean value){ try { javonetHandle.set("FlattenStructure",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getFlattenStructure (){ try { return javonetHandle.get("FlattenStructure");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setFlattenNodesWithNoAttributes (java.lang.Boolean value){ try { javonetHandle.set("FlattenNodesWithNoAttributes",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getFlattenNodesWithNoAttributes (){ try { return javonetHandle.get("FlattenNodesWithNoAttributes");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setRegisterEmptyNodesAsColumnsWhenFlattening (java.lang.Boolean value){ try { javonetHandle.set("RegisterEmptyNodesAsColumnsWhenFlattening",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getRegisterEmptyNodesAsColumnsWhenFlattening (){ try { return javonetHandle.get("RegisterEmptyNodesAsColumnsWhenFlattening");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setUri (java.lang.String value){ try { javonetHandle.set("Uri",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getUri (){ try { return  (java.lang.String) javonetHandle.get("Uri");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDocument (IXPathNavigable value){ try { javonetHandle.set("Document",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public IXPathNavigable getDocument (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("Document"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setAutoResolveNamespacesMode (AutoResolveNamespacesMode value){ try { javonetHandle.set("AutoResolveNamespacesMode",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public AutoResolveNamespacesMode getAutoResolveNamespacesMode (){ try { return AutoResolveNamespacesMode.valueOf(((NEnum) javonetHandle.<NObject>get("AutoResolveNamespacesMode")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setValueFieldName (java.lang.String value){ try { javonetHandle.set("ValueFieldName",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getValueFieldName (){ try { return  (java.lang.String) javonetHandle.get("ValueFieldName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public XmlDataProvider (){ try {  javonetHandle = Javonet.New("XmlDataProvider");javonetHandle.addEventListener("PreParseXPathNavigator", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<PreParseXPathNavigatorEventArgs> handler : _PreParseXPathNavigatorListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], PreParseXPathNavigatorEventArgs.class));}}});javonetHandle.addEventListener("GetNodeType", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<GetNodeTypeEventArgs> handler : _GetNodeTypeListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], GetNodeTypeEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public XmlDataProvider (java.lang.String uri){ try {  javonetHandle = Javonet.New("XmlDataProvider",uri);javonetHandle.addEventListener("PreParseXPathNavigator", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<PreParseXPathNavigatorEventArgs> handler : _PreParseXPathNavigatorListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], PreParseXPathNavigatorEventArgs.class));}}});javonetHandle.addEventListener("GetNodeType", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<GetNodeTypeEventArgs> handler : _GetNodeTypeListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], GetNodeTypeEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public XmlDataProvider (IXPathNavigable document){ try {  javonetHandle = Javonet.New("XmlDataProvider",document);javonetHandle.addEventListener("PreParseXPathNavigator", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<PreParseXPathNavigatorEventArgs> handler : _PreParseXPathNavigatorListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], PreParseXPathNavigatorEventArgs.class));}}});javonetHandle.addEventListener("GetNodeType", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<GetNodeTypeEventArgs> handler : _GetNodeTypeListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], GetNodeTypeEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public XmlDataProvider(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void GetObjectData (SerializationInfo info,StreamingContext context){ try { javonetHandle.invoke("GetObjectData",info,context);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public ReadOnlyCollection<java.lang.String> GetFileList (){ try { return new ReadOnlyCollection<java.lang.String>((NObject)javonetHandle.invoke("GetFileList"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void SetFileList (ReadOnlyCollection<java.lang.String> fileList){ try { javonetHandle.invoke("SetFileList",fileList);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
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
            private java.util.ArrayList< EventHandler<PreParseXPathNavigatorEventArgs>> _PreParseXPathNavigatorListeners = new java.util.ArrayList<EventHandler<PreParseXPathNavigatorEventArgs>>();

            public void addPreParseXPathNavigator(EventHandler<PreParseXPathNavigatorEventArgs> toAdd)
            {
                _PreParseXPathNavigatorListeners.add(toAdd);
            }
            public void removePreParseXPathNavigator(EventHandler<PreParseXPathNavigatorEventArgs> toRemove)
            {
                _PreParseXPathNavigatorListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< EventHandler<GetNodeTypeEventArgs>> _GetNodeTypeListeners = new java.util.ArrayList<EventHandler<GetNodeTypeEventArgs>>();

            public void addGetNodeType(EventHandler<GetNodeTypeEventArgs> toAdd)
            {
                _GetNodeTypeListeners.add(toAdd);
            }
            public void removeGetNodeType(EventHandler<GetNodeTypeEventArgs> toRemove)
            {
                _GetNodeTypeListeners.remove(toRemove);
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}