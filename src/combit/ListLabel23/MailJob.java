package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.*;
import jio.System.Collections.ObjectModel.*;
import jio.System.Collections.Generic.*;
import jio.System.*;public class MailJob implements IDisposable {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public Collection<java.lang.String> getAttachmentList (){ try { return new Collection<java.lang.String>((NObject)javonetHandle.<NObject>get("AttachmentList"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public Dictionary<java.lang.String,java.lang.String> getAdditionalOptions (){ try { return new Dictionary<java.lang.String,java.lang.String>((NObject)javonetHandle.<NObject>get("AdditionalOptions"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setTo (java.lang.String value){ try { javonetHandle.set("To",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTo (){ try { return  (java.lang.String) javonetHandle.get("To");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setFrom (java.lang.String value){ try { javonetHandle.set("From",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFrom (){ try { return  (java.lang.String) javonetHandle.get("From");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setCC (java.lang.String value){ try { javonetHandle.set("CC",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getCC (){ try { return  (java.lang.String) javonetHandle.get("CC");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setBCC (java.lang.String value){ try { javonetHandle.set("BCC",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getBCC (){ try { return  (java.lang.String) javonetHandle.get("BCC");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setSubject (java.lang.String value){ try { javonetHandle.set("Subject",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSubject (){ try { return  (java.lang.String) javonetHandle.get("Subject");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setBody (java.lang.String value){ try { javonetHandle.set("Body",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getBody (){ try { return  (java.lang.String) javonetHandle.get("Body");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setBodyHtml (java.lang.String value){ try { javonetHandle.set("BodyHtml",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getBodyHtml (){ try { return  (java.lang.String) javonetHandle.get("BodyHtml");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setBodyRtf (java.lang.String value){ try { javonetHandle.set("BodyRtf",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getBodyRtf (){ try { return  (java.lang.String) javonetHandle.get("BodyRtf");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setProvider (java.lang.String value){ try { javonetHandle.set("Provider",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getProvider (){ try { return  (java.lang.String) javonetHandle.get("Provider");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setShowDialog (java.lang.Boolean value){ try { javonetHandle.set("ShowDialog",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getShowDialog (){ try { return javonetHandle.get("ShowDialog");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setUseMapiNameResolving (java.lang.Boolean value){ try { javonetHandle.set("UseMapiNameResolving",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getUseMapiNameResolving (){ try { return javonetHandle.get("UseMapiNameResolving");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public MailJob (){ try {  javonetHandle = Javonet.New("MailJob");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public MailJob(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Send (){ try { javonetHandle.invoke("Send");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Dispose (){ try { javonetHandle.invoke("Dispose");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}