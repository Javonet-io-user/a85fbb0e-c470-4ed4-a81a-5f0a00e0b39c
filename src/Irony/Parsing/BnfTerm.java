package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;
import Irony.Ast.*;
import jio.System.*;public abstract class BnfTerm {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public Grammar getGrammar (){ try { return new Grammar((NObject)javonetHandle.<NObject>get("Grammar"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setAstConfig (AstNodeConfig value){ try { javonetHandle.set("AstConfig",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public AstNodeConfig getAstConfig (){ try { return new AstNodeConfig((NObject)javonetHandle.<NObject>get("AstConfig"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetFiled
	 */
            public java.lang.String getName (){ try { return  (java.lang.String) javonetHandle.get("Name");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setName (java.lang.String param){ try { javonetHandle.set("Name",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getErrorAlias (){ try { return  (java.lang.String) javonetHandle.get("ErrorAlias");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setErrorAlias (java.lang.String param){ try { javonetHandle.set("ErrorAlias",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public TermFlags getFlags (){ try { return TermFlags.valueOf(((NEnum) javonetHandle.<NObject>get("Flags")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setFlags (TermFlags param){ try { javonetHandle.set("Flags",NEnum.fromJavaEnum(param));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getPrecedence (){ try { return javonetHandle.get("Precedence");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setPrecedence (java.lang.Integer param){ try { javonetHandle.set("Precedence",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Associativity getAssociativity (){ try { return Associativity.valueOf(((NEnum) javonetHandle.<NObject>get("Associativity")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setAssociativity (Associativity param){ try { javonetHandle.set("Associativity",NEnum.fromJavaEnum(param));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static java.lang.Integer getNoPrecedence (){ try { return Javonet.getType("BnfTerm").get("NoPrecedence");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public static void setNoPrecedence (java.lang.Integer param){ try { Javonet.getType("BnfTerm").set("NoPrecedence",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public BnfTerm (java.lang.String name){ try {  javonetHandle = Javonet.New("BnfTerm",name);javonetHandle.addEventListener("Shifting", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<ParsingEventArgs> handler : _ShiftingListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ParsingEventArgs.class));}}});javonetHandle.addEventListener("AstNodeCreated", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<AstNodeEventArgs> handler : _AstNodeCreatedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], AstNodeEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public BnfTerm (java.lang.String name,java.lang.String errorAlias,Class nodeType){ try {  javonetHandle = Javonet.New("BnfTerm",name,errorAlias,Javonet.getType(getReturnObjectName(nodeType).getTypeName()));javonetHandle.addEventListener("Shifting", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<ParsingEventArgs> handler : _ShiftingListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ParsingEventArgs.class));}}});javonetHandle.addEventListener("AstNodeCreated", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<AstNodeEventArgs> handler : _AstNodeCreatedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], AstNodeEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public BnfTerm (java.lang.String name,java.lang.String errorAlias,AstNodeCreator nodeCreator){ try {  javonetHandle = Javonet.New("BnfTerm",name,errorAlias,nodeCreator);javonetHandle.addEventListener("Shifting", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<ParsingEventArgs> handler : _ShiftingListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ParsingEventArgs.class));}}});javonetHandle.addEventListener("AstNodeCreated", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<AstNodeEventArgs> handler : _AstNodeCreatedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], AstNodeEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public BnfTerm (java.lang.String name,java.lang.String errorAlias){ try {  javonetHandle = Javonet.New("BnfTerm",name,errorAlias);javonetHandle.addEventListener("Shifting", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<ParsingEventArgs> handler : _ShiftingListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ParsingEventArgs.class));}}});javonetHandle.addEventListener("AstNodeCreated", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<AstNodeEventArgs> handler : _AstNodeCreatedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], AstNodeEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public BnfTerm(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Init (GrammarData grammarData){ try { javonetHandle.invoke("Init",grammarData);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.String GetParseNodeCaption (ParseTreeNode node){ try { return  (java.lang.String) javonetHandle.invoke("GetParseNodeCaption",node);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public java.lang.String ToString (){ try { return  (java.lang.String) javonetHandle.invoke("ToString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public java.lang.Integer GetHashCode (){ try { return javonetHandle.invoke("GetHashCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public void SetFlag (TermFlags flag){ try { javonetHandle.invoke("SetFlag",NEnum.fromJavaEnum(flag));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void SetFlag (TermFlags flag,java.lang.Boolean value){ try { javonetHandle.invoke("SetFlag",NEnum.fromJavaEnum(flag),value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean HasAstConfig (){ try { return javonetHandle.invoke("HasAstConfig");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public BnfExpression Q (){ try { return new BnfExpression((NObject)javonetHandle.invoke("Q"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Event
	 */
            private java.util.ArrayList< EventHandler<ParsingEventArgs>> _ShiftingListeners = new java.util.ArrayList<EventHandler<ParsingEventArgs>>();

            public void addShifting(EventHandler<ParsingEventArgs> toAdd)
            {
                _ShiftingListeners.add(toAdd);
            }
            public void removeShifting(EventHandler<ParsingEventArgs> toRemove)
            {
                _ShiftingListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< EventHandler<AstNodeEventArgs>> _AstNodeCreatedListeners = new java.util.ArrayList<EventHandler<AstNodeEventArgs>>();

            public void addAstNodeCreated(EventHandler<AstNodeEventArgs> toAdd)
            {
                _AstNodeCreatedListeners.add(toAdd);
            }
            public void removeAstNodeCreated(EventHandler<AstNodeEventArgs> toRemove)
            {
                _AstNodeCreatedListeners.remove(toRemove);
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}