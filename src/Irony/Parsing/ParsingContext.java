package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;
import jio.System.*;
import Irony.*;
import jio.System.Globalization.*;
import jio.System.Collections.Generic.*;public class ParsingContext {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public ParseTree getCurrentParseTree (){ try { return new ParseTree((NObject)javonetHandle.<NObject>get("CurrentParseTree"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public ParserState getCurrentParserState (){ try { return new ParserState((NObject)javonetHandle.<NObject>get("CurrentParserState"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public ParseTreeNode getCurrentParserInput (){ try { return new ParseTreeNode((NObject)javonetHandle.<NObject>get("CurrentParserInput"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public ParserStatus getStatus (){ try { return ParserStatus.valueOf(((NEnum) javonetHandle.<NObject>get("Status")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetFiled
	 */
            public Parser getParser (){ try { return new Parser((NObject)javonetHandle.<NObject>get("Parser"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setParser (Parser param){ try { javonetHandle.set("Parser",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public LanguageData getLanguage (){ try { return new LanguageData((NObject)javonetHandle.<NObject>get("Language"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setLanguage (LanguageData param){ try { javonetHandle.set("Language",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public ParseOptions getOptions (){ try { return ParseOptions.valueOf(((NEnum) javonetHandle.<NObject>get("Options")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setOptions (ParseOptions param){ try { javonetHandle.set("Options",NEnum.fromJavaEnum(param));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Boolean getTracingEnabled (){ try { return javonetHandle.get("TracingEnabled");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetFiled
	 */
            public void setTracingEnabled (java.lang.Boolean param){ try { javonetHandle.set("TracingEnabled",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public ParseMode getMode (){ try { return ParseMode.valueOf(((NEnum) javonetHandle.<NObject>get("Mode")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setMode (ParseMode param){ try { javonetHandle.set("Mode",NEnum.fromJavaEnum(param));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getMaxErrors (){ try { return javonetHandle.get("MaxErrors");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setMaxErrors (java.lang.Integer param){ try { javonetHandle.set("MaxErrors",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public CultureInfo getCulture (){ try { return new CultureInfo((NObject)javonetHandle.<NObject>get("Culture"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setCulture (CultureInfo param){ try { javonetHandle.set("Culture",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public TokenStack getOpenBraces (){ try { return new TokenStack((NObject)javonetHandle.<NObject>get("OpenBraces"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setOpenBraces (TokenStack param){ try { javonetHandle.set("OpenBraces",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public ParserTrace getParserTrace (){ try { return new ParserTrace((NObject)javonetHandle.<NObject>get("ParserTrace"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setParserTrace (ParserTrace param){ try { javonetHandle.set("ParserTrace",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Token getCurrentToken (){ try { return new Token((NObject)javonetHandle.<NObject>get("CurrentToken"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setCurrentToken (Token param){ try { javonetHandle.set("CurrentToken",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public TokenList getCurrentCommentTokens (){ try { return new TokenList((NObject)javonetHandle.<NObject>get("CurrentCommentTokens"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setCurrentCommentTokens (TokenList param){ try { javonetHandle.set("CurrentCommentTokens",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Token getPreviousToken (){ try { return new Token((NObject)javonetHandle.<NObject>get("PreviousToken"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setPreviousToken (Token param){ try { javonetHandle.set("PreviousToken",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public SourceLocation getPreviousLineStart (){ try { return javonetHandle.<NObject>get("PreviousLineStart");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setPreviousLineStart (SourceLocation param){ try { javonetHandle.set("PreviousLineStart",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public TerminalList getCurrentTerminals (){ try { return new TerminalList((NObject)javonetHandle.<NObject>get("CurrentTerminals"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setCurrentTerminals (TerminalList param){ try { javonetHandle.set("CurrentTerminals",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public ISourceStream getSource (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("Source"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setSource (ISourceStream param){ try { javonetHandle.set("Source",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public VsScannerStateMap getVsLineScanState (){ try { return javonetHandle.<NObject>get("VsLineScanState");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setVsLineScanState (VsScannerStateMap param){ try { javonetHandle.set("VsLineScanState",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Boolean getHasErrors (){ try { return javonetHandle.get("HasErrors");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetFiled
	 */
            public void setHasErrors (java.lang.Boolean param){ try { javonetHandle.set("HasErrors",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Dictionary<java.lang.String,NObject> getValues (){ try { return new Dictionary<java.lang.String,NObject>((NObject)javonetHandle.<NObject>get("Values"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setValues (Dictionary<java.lang.String,NObject> param){ try { javonetHandle.set("Values",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getTabWidth (){ try { return javonetHandle.get("TabWidth");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setTabWidth (java.lang.Integer param){ try { javonetHandle.set("TabWidth",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ParsingContext (Parser parser){ try {  javonetHandle = Javonet.New("ParsingContext",parser);javonetHandle.addEventListener("TokenCreated", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<ParsingEventArgs> handler : _TokenCreatedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ParsingEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ParsingContext(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public Token CreateErrorToken (java.lang.String message,NObject[] args){ try { return new Token((NObject)javonetHandle.invoke("CreateErrorToken",message,new Object[] {args}));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void AddParserError (java.lang.String message,NObject[] args){ try { javonetHandle.invoke("AddParserError",message,new Object[] {args});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddParserMessage (ErrorLevel level,SourceLocation location,java.lang.String message,NObject[] args){ try { javonetHandle.invoke("AddParserMessage",NEnum.fromJavaEnum(level),location,message,new Object[] {args});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddTrace (java.lang.String message,NObject[] args){ try { javonetHandle.invoke("AddTrace",message,new Object[] {args});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddTrace (java.lang.Boolean asError,java.lang.String message,NObject[] args){ try { javonetHandle.invoke("AddTrace",asError,message,new Object[] {args});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void SetSourceLocation (SourceLocation location){ try { javonetHandle.invoke("SetSourceLocation",location);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public SourceSpan ComputeStackRangeSpan (java.lang.Integer nodeCount){ try { return javonetHandle.invoke("ComputeStackRangeSpan",nodeCount);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public StringSet GetExpectedTermSet (){ try { return new StringSet((NObject)javonetHandle.invoke("GetExpectedTermSet"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Event
	 */
            private java.util.ArrayList< EventHandler<ParsingEventArgs>> _TokenCreatedListeners = new java.util.ArrayList<EventHandler<ParsingEventArgs>>();

            public void addTokenCreated(EventHandler<ParsingEventArgs> toAdd)
            {
                _TokenCreatedListeners.add(toAdd);
            }
            public void removeTokenCreated(EventHandler<ParsingEventArgs> toRemove)
            {
                _TokenCreatedListeners.remove(toRemove);
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}