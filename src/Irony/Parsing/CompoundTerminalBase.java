package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;
import jio.System.*;
import jio.System.Collections.Generic.*;public abstract class CompoundTerminalBase extends Terminal {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public java.lang.Character getEscapeChar (){ try { return javonetHandle.get("EscapeChar");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setEscapeChar (java.lang.Character param){ try { javonetHandle.set("EscapeChar",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public EscapeTable getEscapes (){ try { return new EscapeTable((NObject)javonetHandle.<NObject>get("Escapes"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setEscapes (EscapeTable param){ try { javonetHandle.set("Escapes",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Boolean getCaseSensitivePrefixesSuffixes (){ try { return javonetHandle.get("CaseSensitivePrefixesSuffixes");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetFiled
	 */
            public void setCaseSensitivePrefixesSuffixes (java.lang.Boolean param){ try { javonetHandle.set("CaseSensitivePrefixesSuffixes",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CompoundTerminalBase (java.lang.String name){  super((NObject) null); try {  javonetHandle = Javonet.New("CompoundTerminalBase",name); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CompoundTerminalBase (java.lang.String name,TermFlags flags){  super((NObject) null); try {  javonetHandle = Javonet.New("CompoundTerminalBase",name,NEnum.fromJavaEnum(flags)); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CompoundTerminalBase(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void AddSuffix (java.lang.String suffix,TypeCode[] typeCodes){ try { javonetHandle.invoke("AddSuffix",suffix,new Object[] {typeCodes});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Init (GrammarData grammarData){ try { javonetHandle.invoke("Init",grammarData);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public IList<java.lang.String> GetFirsts (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetFirsts"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public Token TryMatch (ParsingContext context,ISourceStream source){ try { return new Token((NObject)javonetHandle.invoke("TryMatch",context,source));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static EscapeTable GetDefaultEscapes (){ try { return new EscapeTable((NObject)Javonet.getType("CompoundTerminalBase").invoke("GetDefaultEscapes"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public static class CompoundTokenDetails {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.String getText (){ try { return  (java.lang.String) javonetHandle.get("Text");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetFiled
	 */
            public java.lang.String getPrefix (){ try { return  (java.lang.String) javonetHandle.get("Prefix");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setPrefix (java.lang.String param){ try { javonetHandle.set("Prefix",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getBody (){ try { return  (java.lang.String) javonetHandle.get("Body");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setBody (java.lang.String param){ try { javonetHandle.set("Body",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getSuffix (){ try { return  (java.lang.String) javonetHandle.get("Suffix");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setSuffix (java.lang.String param){ try { javonetHandle.set("Suffix",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getSign (){ try { return  (java.lang.String) javonetHandle.get("Sign");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setSign (java.lang.String param){ try { javonetHandle.set("Sign",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Short getFlags (){ try { return javonetHandle.get("Flags");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setFlags (java.lang.Short param){ try { javonetHandle.set("Flags",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getError (){ try { return  (java.lang.String) javonetHandle.get("Error");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setError (java.lang.String param){ try { javonetHandle.set("Error",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public TypeCode[] getTypeCodes (){ try { return Helper.ConvertNObjectToDestinationType((NObject[])javonetHandle.<NObject>get("TypeCodes"),TypeCode[].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setTypeCodes (TypeCode[] param){ try { javonetHandle.set("TypeCodes",new Object[] {param});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getExponentSymbol (){ try { return  (java.lang.String) javonetHandle.get("ExponentSymbol");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setExponentSymbol (java.lang.String param){ try { javonetHandle.set("ExponentSymbol",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
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
            public void setEndSymbol (java.lang.String param){ try { javonetHandle.set("EndSymbol",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public NObject getValue (){ try { return  (NObject) javonetHandle.<NObject>get("Value");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setValue (NObject param){ try { javonetHandle.set("Value",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Boolean getPartialOk (){ try { return javonetHandle.get("PartialOk");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetFiled
	 */
            public void setPartialOk (java.lang.Boolean param){ try { javonetHandle.set("PartialOk",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Boolean getIsPartial (){ try { return javonetHandle.get("IsPartial");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetFiled
	 */
            public void setIsPartial (java.lang.Boolean param){ try { javonetHandle.set("IsPartial",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Boolean getPartialContinues (){ try { return javonetHandle.get("PartialContinues");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetFiled
	 */
            public void setPartialContinues (java.lang.Boolean param){ try { javonetHandle.set("PartialContinues",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Byte getSubTypeIndex (){ try { return javonetHandle.get("SubTypeIndex");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setSubTypeIndex (java.lang.Byte param){ try { javonetHandle.set("SubTypeIndex",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CompoundTokenDetails (){ try {  javonetHandle = Javonet.New("CompoundTokenDetails");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CompoundTokenDetails(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Boolean IsSet (java.lang.Short flag){ try { return javonetHandle.invoke("IsSet",flag);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }}	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}