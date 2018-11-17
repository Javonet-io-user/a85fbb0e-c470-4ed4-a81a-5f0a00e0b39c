package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.IO.*;
import combit.ListLabel23.*;
import jio.System.Runtime.InteropServices.ComTypes.*;
import jio.System.*;public class ComStreamWrapper extends Stream {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public IStream getUnderlyingStream (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("UnderlyingStream"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Long getLength (){ try { return javonetHandle.get("Length");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setPosition (java.lang.Long value){ try { javonetHandle.set("Position",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Long getPosition (){ try { return javonetHandle.get("Position");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getCanRead (){ try { return javonetHandle.get("CanRead");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getCanWrite (){ try { return javonetHandle.get("CanWrite");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getCanSeek (){ try { return javonetHandle.get("CanSeek");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public ComStreamWrapper (IStream stream){  super((NObject) null); try {  javonetHandle = Javonet.New("ComStreamWrapper",stream); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ComStreamWrapper (java.lang.Integer nativeComStreamPointer){  super((NObject) null); try {  javonetHandle = Javonet.New("ComStreamWrapper",nativeComStreamPointer); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ComStreamWrapper(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Integer Read (java.lang.Byte[] buffer,java.lang.Integer offset,java.lang.Integer count){ try { return javonetHandle.invoke("Read",new Object[] {buffer},offset,count);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public void Write (java.lang.Byte[] buffer,java.lang.Integer offset,java.lang.Integer count){ try { javonetHandle.invoke("Write",new Object[] {buffer},offset,count);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Long Seek (java.lang.Long offset,SeekOrigin origin){ try { return javonetHandle.invoke("Seek",offset,NEnum.fromJavaEnum(origin));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void SetLength (java.lang.Long value){ try { javonetHandle.invoke("SetLength",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Flush (){ try { javonetHandle.invoke("Flush");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}