package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;
import jio.System.Collections.Generic.*;
import jio.System.*;public class QuotedValueLiteral extends DataLiteralBase {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public java.lang.String getStartSymbol (){ try { return  (java.lang.String) javonetHandle.get("StartSymbol");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setStartSymbol (java.lang.String param){ try { javonetHandle.set("StartSymbol",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getEndSymbol (){ try { return  (java.lang.String) javonetHandle.get("EndSymbol");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setEndSymbol (java.lang.String param){ try { javonetHandle.set("EndSymbol",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public QuotedValueLiteral (java.lang.String name,java.lang.String startEndSymbol,TypeCode dataType){  super((NObject) null); try {  javonetHandle = Javonet.New("QuotedValueLiteral",name,startEndSymbol,NEnum.fromJavaEnum(dataType)); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public QuotedValueLiteral (java.lang.String name,java.lang.String startSymbol,java.lang.String endSymbol,TypeCode dataType){  super((NObject) null); try {  javonetHandle = Javonet.New("QuotedValueLiteral",name,startSymbol,endSymbol,NEnum.fromJavaEnum(dataType)); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public QuotedValueLiteral(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public IList<java.lang.String> GetFirsts (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetFirsts"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}