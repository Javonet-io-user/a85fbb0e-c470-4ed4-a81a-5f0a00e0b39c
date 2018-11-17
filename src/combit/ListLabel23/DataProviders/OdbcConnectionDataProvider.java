package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DataProviders.*;
import jio.System.Data.Odbc.*;
import jio.System.Runtime.Serialization.*;
import jio.System.*;public class OdbcConnectionDataProvider extends DbConnectionDataProvider implements ISerializable {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setget_OdbcConnectionDataProviderOdbcConnectionDataProviderSupportsAdvancedFiltering (java.lang.Boolean value){ try { javonetHandle.set("get_OdbcConnectionDataProviderOdbcConnectionDataProviderSupportsAdvancedFiltering",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getOdbcConnectionDataProviderOdbcConnectionDataProviderSupportsAdvancedFiltering (){ try { return javonetHandle.get("OdbcConnectionDataProviderOdbcConnectionDataProviderSupportsAdvancedFiltering");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setSupportedElementTypes (DbConnectionElementTypes value){ try { javonetHandle.set("SupportedElementTypes",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public DbConnectionElementTypes getSupportedElementTypes (){ try { return DbConnectionElementTypes.valueOf(((NEnum) javonetHandle.<NObject>get("SupportedElementTypes")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setPrefixTableNameWithSchema (java.lang.Boolean value){ try { javonetHandle.set("PrefixTableNameWithSchema",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getPrefixTableNameWithSchema (){ try { return javonetHandle.get("PrefixTableNameWithSchema");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setIdentifierDelimiterFormat (java.lang.String value){ try { javonetHandle.set("IdentifierDelimiterFormat",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getIdentifierDelimiterFormat (){ try { return  (java.lang.String) javonetHandle.get("IdentifierDelimiterFormat");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDisableRelations (java.lang.Boolean value){ try { javonetHandle.set("DisableRelations",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getDisableRelations (){ try { return javonetHandle.get("DisableRelations");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public OdbcConnectionDataProvider (OdbcConnection connection){  super((NObject) null); try {  javonetHandle = Javonet.New("OdbcConnectionDataProvider",connection); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("AddRelations", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<AddRelationEventArgs> handler : _AddRelationsListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], AddRelationEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public OdbcConnectionDataProvider (OdbcConnection connection,java.lang.String identifierDelimiterFormat){  super((NObject) null); try {  javonetHandle = Javonet.New("OdbcConnectionDataProvider",connection,identifierDelimiterFormat); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("AddRelations", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<AddRelationEventArgs> handler : _AddRelationsListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], AddRelationEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public OdbcConnectionDataProvider(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void GetObjectData (SerializationInfo info,StreamingContext context){ try { javonetHandle.invoke("GetObjectData",info,context);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Event
	 */
            private java.util.ArrayList< EventHandler<AddRelationEventArgs>> _AddRelationsListeners = new java.util.ArrayList<EventHandler<AddRelationEventArgs>>();

            public void addAddRelations(EventHandler<AddRelationEventArgs> toAdd)
            {
                _AddRelationsListeners.add(toAdd);
            }
            public void removeAddRelations(EventHandler<AddRelationEventArgs> toRemove)
            {
                _AddRelationsListeners.remove(toRemove);
            }public static class AddRelationEventArgs extends EventArgs {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setProvider (DbCommandSetDataProvider value){ try { javonetHandle.set("Provider",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public DbCommandSetDataProvider getProvider (){ try { return new DbCommandSetDataProvider((NObject)javonetHandle.<NObject>get("Provider"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public AddRelationEventArgs (){  super((NObject) null); try {  javonetHandle = Javonet.New("AddRelationEventArgs"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public AddRelationEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }}public interface AddRelationsEventHandler { public void Invoke (NObject sender,AddRelationEventArgs e);}	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}