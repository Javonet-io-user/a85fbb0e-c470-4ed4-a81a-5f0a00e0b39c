package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;
import jio.System.Collections.Generic.*;
import jio.System.*;public class Terminal extends BnfTerm {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public Terminal getOutputTerminal (){ try { return new Terminal((NObject)javonetHandle.<NObject>get("OutputTerminal"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetFiled
	 */
            public TokenCategory getCategory (){ try { return TokenCategory.valueOf(((NEnum) javonetHandle.<NObject>get("Category")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setCategory (TokenCategory param){ try { javonetHandle.set("Category",NEnum.fromJavaEnum(param));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getPriority (){ try { return javonetHandle.get("Priority");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setPriority (java.lang.Integer param){ try { javonetHandle.set("Priority",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public TokenEditorInfo getEditorInfo (){ try { return new TokenEditorInfo((NObject)javonetHandle.<NObject>get("EditorInfo"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setEditorInfo (TokenEditorInfo param){ try { javonetHandle.set("EditorInfo",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Byte getMultilineIndex (){ try { return javonetHandle.get("MultilineIndex");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setMultilineIndex (java.lang.Byte param){ try { javonetHandle.set("MultilineIndex",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Terminal getIsPairFor (){ try { return new Terminal((NObject)javonetHandle.<NObject>get("IsPairFor"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setIsPairFor (Terminal param){ try { javonetHandle.set("IsPairFor",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static java.lang.Integer getLowestPriority (){ try { return Javonet.getType("Terminal").get("LowestPriority");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public static void setLowestPriority (java.lang.Integer param){ try { Javonet.getType("Terminal").set("LowestPriority",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static java.lang.Integer getHighestPriority (){ try { return Javonet.getType("Terminal").get("HighestPriority");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public static void setHighestPriority (java.lang.Integer param){ try { Javonet.getType("Terminal").set("HighestPriority",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static java.lang.Integer getReservedWordsPriority (){ try { return Javonet.getType("Terminal").get("ReservedWordsPriority");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public static void setReservedWordsPriority (java.lang.Integer param){ try { Javonet.getType("Terminal").set("ReservedWordsPriority",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Terminal (java.lang.String name){  super((NObject) null); try {  javonetHandle = Javonet.New("Terminal",name); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("ValidateToken", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<ValidateTokenEventArgs> handler : _ValidateTokenListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ValidateTokenEventArgs.class));}}});javonetHandle.addEventListener("ParserInputPreview", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<ParsingEventArgs> handler : _ParserInputPreviewListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ParsingEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Terminal (java.lang.String name,TokenCategory category){  super((NObject) null); try {  javonetHandle = Javonet.New("Terminal",name,NEnum.fromJavaEnum(category)); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("ValidateToken", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<ValidateTokenEventArgs> handler : _ValidateTokenListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ValidateTokenEventArgs.class));}}});javonetHandle.addEventListener("ParserInputPreview", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<ParsingEventArgs> handler : _ParserInputPreviewListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ParsingEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Terminal (java.lang.String name,java.lang.String errorAlias,TokenCategory category,TermFlags flags){  super((NObject) null); try {  javonetHandle = Javonet.New("Terminal",name,errorAlias,NEnum.fromJavaEnum(category),NEnum.fromJavaEnum(flags)); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("ValidateToken", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<ValidateTokenEventArgs> handler : _ValidateTokenListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ValidateTokenEventArgs.class));}}});javonetHandle.addEventListener("ParserInputPreview", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<ParsingEventArgs> handler : _ParserInputPreviewListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ParsingEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Terminal (java.lang.String name,TokenCategory category,TermFlags flags){  super((NObject) null); try {  javonetHandle = Javonet.New("Terminal",name,NEnum.fromJavaEnum(category),NEnum.fromJavaEnum(flags)); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("ValidateToken", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<ValidateTokenEventArgs> handler : _ValidateTokenListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ValidateTokenEventArgs.class));}}});javonetHandle.addEventListener("ParserInputPreview", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<ParsingEventArgs> handler : _ParserInputPreviewListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ParsingEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Terminal(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
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
            public java.lang.String TokenToString (Token token){ try { return  (java.lang.String) javonetHandle.invoke("TokenToString",token);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public static java.lang.Integer ByPriorityReverse (Terminal x,Terminal y){ try { return Javonet.getType("Terminal").invoke("ByPriorityReverse",x,y);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public void SetOutputTerminal (Grammar grammar,Terminal outputTerminal){ try { javonetHandle.invoke("SetOutputTerminal",grammar,outputTerminal);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static java.lang.String TerminalsToString (IEnumerable<Terminal> terminals){ try { return  (java.lang.String) Javonet.getType("Terminal").invoke("TerminalsToString",terminals);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Event
	 */
            private java.util.ArrayList< EventHandler<ValidateTokenEventArgs>> _ValidateTokenListeners = new java.util.ArrayList<EventHandler<ValidateTokenEventArgs>>();

            public void addValidateToken(EventHandler<ValidateTokenEventArgs> toAdd)
            {
                _ValidateTokenListeners.add(toAdd);
            }
            public void removeValidateToken(EventHandler<ValidateTokenEventArgs> toRemove)
            {
                _ValidateTokenListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< EventHandler<ParsingEventArgs>> _ParserInputPreviewListeners = new java.util.ArrayList<EventHandler<ParsingEventArgs>>();

            public void addParserInputPreview(EventHandler<ParsingEventArgs> toAdd)
            {
                _ParserInputPreviewListeners.add(toAdd);
            }
            public void removeParserInputPreview(EventHandler<ParsingEventArgs> toRemove)
            {
                _ParserInputPreviewListeners.remove(toRemove);
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}