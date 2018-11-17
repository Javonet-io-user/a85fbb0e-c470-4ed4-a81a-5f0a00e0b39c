package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;
import jio.System.CodeDom.*;
import combit.ListLabel23.*;public class DomItem {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public ListLabel getParentComponent (){ try { return new ListLabel((NObject)javonetHandle.<NObject>get("ParentComponent"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public DomItem(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Boolean PropertyExists (java.lang.String propertyName){ try { return javonetHandle.invoke("PropertyExists",propertyName);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean ObjectExists (java.lang.String objectName){ try { return javonetHandle.invoke("ObjectExists",objectName);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.String GetProperty (java.lang.String propertyName){ try { return  (java.lang.String) javonetHandle.invoke("GetProperty",propertyName);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public java.lang.String GetProperty (java.lang.String propertyName,java.lang.Boolean throwException){ try { return  (java.lang.String) javonetHandle.invoke("GetProperty",propertyName,throwException);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public void SetProperty (java.lang.String propertyName,java.lang.String propertyValue){ try { javonetHandle.invoke("SetProperty",propertyName,propertyValue);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void SetProperty (java.lang.String propertyName,java.lang.String propertyValue,java.lang.Boolean throwException){ try { javonetHandle.invoke("SetProperty",propertyName,propertyValue,throwException);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void GenerateCode (CodeMemberMethod method,java.lang.String prefix){ try { javonetHandle.invoke("GenerateCode",method,prefix);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void CopyFrom (DomItem source){ try { javonetHandle.invoke("CopyFrom",source);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}