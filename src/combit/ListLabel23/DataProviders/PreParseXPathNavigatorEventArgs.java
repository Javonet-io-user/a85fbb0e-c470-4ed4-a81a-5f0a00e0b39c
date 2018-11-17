package combit.ListLabel23.DataProviders;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.DataProviders.*;
import jio.System.Xml.XPath.*;public class PreParseXPathNavigatorEventArgs extends EventArgs {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public XPathNavigator getNavigator (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("Navigator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setParsedType (Class value){ try { javonetHandle.set("ParsedType",Javonet.getType(getReturnObjectName(value).getTypeName()));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Class getParsedType (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("ParsedType"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setParsedContent (NObject value){ try { javonetHandle.set("ParsedContent",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public NObject getParsedContent (){ try { return  (NObject) javonetHandle.<NObject>get("ParsedContent");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSkipDefaultProcessing (java.lang.Boolean value){ try { javonetHandle.set("SkipDefaultProcessing",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getSkipDefaultProcessing (){ try { return javonetHandle.get("SkipDefaultProcessing");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public PreParseXPathNavigatorEventArgs (XPathNavigator navigator){  super((NObject) null); try {  javonetHandle = Javonet.New("PreParseXPathNavigatorEventArgs",navigator); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PreParseXPathNavigatorEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}