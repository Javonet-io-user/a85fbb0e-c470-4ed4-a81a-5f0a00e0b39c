package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;
import jio.System.*;
import jio.System.Collections.Generic.*;
import Irony.Ast.*;public class NumberLiteral extends CompoundTerminalBase {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public NumberOptions getOptions (){ try { return NumberOptions.valueOf(((NEnum) javonetHandle.<NObject>get("Options")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setOptions (NumberOptions param){ try { javonetHandle.set("Options",NEnum.fromJavaEnum(param));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Character getDecimalSeparator (){ try { return javonetHandle.get("DecimalSeparator");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setDecimalSeparator (java.lang.Character param){ try { javonetHandle.set("DecimalSeparator",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public TypeCode[] getDefaultIntTypes (){ try { return Helper.ConvertNObjectToDestinationType((NObject[])javonetHandle.<NObject>get("DefaultIntTypes"),TypeCode[].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setDefaultIntTypes (TypeCode[] param){ try { javonetHandle.set("DefaultIntTypes",new Object[] {param});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public TypeCode getDefaultFloatType (){ try { return TypeCode.valueOf(((NEnum) javonetHandle.<NObject>get("DefaultFloatType")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setDefaultFloatType (TypeCode param){ try { javonetHandle.set("DefaultFloatType",NEnum.fromJavaEnum(param));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static TypeCode getTypeCodeBigInt (){ try { return TypeCode.valueOf(((NEnum) Javonet.getType("NumberLiteral").<NObject>get("TypeCodeBigInt")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setTypeCodeBigInt (TypeCode param){ try { Javonet.getType("NumberLiteral").set("TypeCodeBigInt",NEnum.fromJavaEnum(param));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static TypeCode getTypeCodeImaginary (){ try { return TypeCode.valueOf(((NEnum) Javonet.getType("NumberLiteral").<NObject>get("TypeCodeImaginary")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setTypeCodeImaginary (TypeCode param){ try { Javonet.getType("NumberLiteral").set("TypeCodeImaginary",NEnum.fromJavaEnum(param));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public NumberLiteral (java.lang.String name){  super((NObject) null); try {  javonetHandle = Javonet.New("NumberLiteral",name); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public NumberLiteral (java.lang.String name,NumberOptions options,Class astNodeType){  super((NObject) null); try {  javonetHandle = Javonet.New("NumberLiteral",name,NEnum.fromJavaEnum(options),Javonet.getType(getReturnObjectName(astNodeType).getTypeName())); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public NumberLiteral (java.lang.String name,NumberOptions options,AstNodeCreator astNodeCreator){  super((NObject) null); try {  javonetHandle = Javonet.New("NumberLiteral",name,NEnum.fromJavaEnum(options),astNodeCreator); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public NumberLiteral (java.lang.String name,NumberOptions options){  super((NObject) null); try {  javonetHandle = Javonet.New("NumberLiteral",name,NEnum.fromJavaEnum(options)); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public NumberLiteral(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void AddPrefix (java.lang.String prefix,NumberOptions options){ try { javonetHandle.invoke("AddPrefix",prefix,NEnum.fromJavaEnum(options));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddExponentSymbols (java.lang.String symbols,TypeCode floatType){ try { javonetHandle.invoke("AddExponentSymbols",symbols,NEnum.fromJavaEnum(floatType));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean IsSet (NumberOptions option){ try { return javonetHandle.invoke("IsSet",NEnum.fromJavaEnum(option));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void Init (GrammarData grammarData){ try { javonetHandle.invoke("Init",grammarData);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public IList<java.lang.String> GetFirsts (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetFirsts"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} } public enum NumberFlagsInternal{HasDot(4096L),HasExp(8192L),; private long numVal;NumberFlagsInternal(long numVal) {
		        this.numVal = numVal;
		    }
		
		    public long getNumVal() {
		        return numVal;
		    }
            }public static class ExponentsTable extends Dictionary<java.lang.Character,TypeCode> {public NObject javonetHandle; public ExponentsTable (){  super((NObject) null); try {  javonetHandle = Javonet.New("ExponentsTable"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ExponentsTable(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }}	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}