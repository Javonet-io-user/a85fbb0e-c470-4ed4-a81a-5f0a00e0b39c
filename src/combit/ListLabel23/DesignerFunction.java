package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.ComponentModel.*;
import combit.ListLabel23.*;
import combit.ListLabel23.DesignerExtensions.*;
import jio.System.*;public class DesignerFunction extends Component implements IDesignerFunction {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setFunctionName (java.lang.String value){ try { javonetHandle.set("FunctionName",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFunctionName (){ try { return  (java.lang.String) javonetHandle.get("FunctionName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setDescription (java.lang.String value){ try { javonetHandle.set("Description",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDescription (){ try { return  (java.lang.String) javonetHandle.get("Description");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setGroupName (java.lang.String value){ try { javonetHandle.set("GroupName",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getGroupName (){ try { return  (java.lang.String) javonetHandle.get("GroupName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setVisible (java.lang.Boolean value){ try { javonetHandle.set("Visible",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getVisible (){ try { return javonetHandle.get("Visible");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setIsConstantForConstantData (java.lang.Boolean value){ try { javonetHandle.set("IsConstantForConstantData",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getIsConstantForConstantData (){ try { return javonetHandle.get("IsConstantForConstantData");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setMinimalParameters (java.lang.Integer value){ try { javonetHandle.set("MinimalParameters",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getMinimalParameters (){ try { return javonetHandle.get("MinimalParameters");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setMaximumParameters (java.lang.Integer value){ try { javonetHandle.set("MaximumParameters",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getMaximumParameters (){ try { return javonetHandle.get("MaximumParameters");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setParameter1 (DesignerFunctionParameter value){ try { javonetHandle.set("Parameter1",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public DesignerFunctionParameter getParameter1 (){ try { return new DesignerFunctionParameter((NObject)javonetHandle.<NObject>get("Parameter1"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setParameter2 (DesignerFunctionParameter value){ try { javonetHandle.set("Parameter2",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public DesignerFunctionParameter getParameter2 (){ try { return new DesignerFunctionParameter((NObject)javonetHandle.<NObject>get("Parameter2"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setParameter3 (DesignerFunctionParameter value){ try { javonetHandle.set("Parameter3",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public DesignerFunctionParameter getParameter3 (){ try { return new DesignerFunctionParameter((NObject)javonetHandle.<NObject>get("Parameter3"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setParameter4 (DesignerFunctionParameter value){ try { javonetHandle.set("Parameter4",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public DesignerFunctionParameter getParameter4 (){ try { return new DesignerFunctionParameter((NObject)javonetHandle.<NObject>get("Parameter4"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setResultType (LlParamType value){ try { javonetHandle.set("ResultType",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LlParamType getResultType (){ try { return LlParamType.valueOf(((NEnum) javonetHandle.<NObject>get("ResultType")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public DesignerFunction (){  super((NObject) null); try {  javonetHandle = Javonet.New("DesignerFunction"); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("EvaluateFunction", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EvaluateFunctionHandler handler : _EvaluateFunctionListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], EvaluateFunctionEventArgs.class));}}});javonetHandle.addEventListener("CheckFunctionSyntax", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (CheckFunctionSyntaxHandler handler : _CheckFunctionSyntaxListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], CheckFunctionSyntaxEventArgs.class));}}});javonetHandle.addEventListener("ParameterAutoComplete", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (ParameterAutoCompleteHandler handler : _ParameterAutoCompleteListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ParameterAutoCompleteEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DesignerFunction(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void CleanUp (){ try { javonetHandle.invoke("CleanUp");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Integer SetLLJob (java.lang.Integer hLLJob,java.lang.Integer pLLBase){ try { return javonetHandle.invoke("SetLLJob",hLLJob,pLLBase);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer SetOption (java.lang.Integer nOption,java.lang.Integer nValue){ try { return javonetHandle.invoke("SetOption",nOption,nValue);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer GetOption (java.lang.Integer nOption,AtomicReference<java.lang.Integer> pnValue){ try { return javonetHandle.invoke("GetOption",nOption,new NOut(pnValue, Helper.JavaToDotnetType.get(java.lang.Integer.class)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer GetName (AtomicReference<java.lang.String> pbsName){ try { return javonetHandle.invoke("GetName",new NOut(pbsName, Helper.JavaToDotnetType.get(java.lang.String.class)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer GetDescr (AtomicReference<java.lang.String> pbsDescr){ try { return javonetHandle.invoke("GetDescr",new NOut(pbsDescr, Helper.JavaToDotnetType.get(java.lang.String.class)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer GetGroups (AtomicReference<java.lang.String> pbsGroups){ try { return javonetHandle.invoke("GetGroups",new NOut(pbsGroups, Helper.JavaToDotnetType.get(java.lang.String.class)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer GetGroupDescr (java.lang.String bsGroup,AtomicReference<java.lang.String> pbsDescr){ try { return javonetHandle.invoke("GetGroupDescr",bsGroup,new NOut(pbsDescr, Helper.JavaToDotnetType.get(java.lang.String.class)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer GetParaCount (AtomicReference<java.lang.Integer> pnMinParas,AtomicReference<java.lang.Integer> pnMaxParas){ try { return javonetHandle.invoke("GetParaCount",new NOut(pnMinParas, Helper.JavaToDotnetType.get(java.lang.Integer.class)),new NOut(pnMaxParas, Helper.JavaToDotnetType.get(java.lang.Integer.class)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer GetParaTypes (AtomicReference<java.lang.Integer> pnTypeRes,AtomicReference<java.lang.Integer> pnTypeArg1,AtomicReference<java.lang.Integer> pnTypeArg2,AtomicReference<java.lang.Integer> pnTypeArg3,AtomicReference<java.lang.Integer> pnTypeArg4){ try { return javonetHandle.invoke("GetParaTypes",new NOut(pnTypeRes, Helper.JavaToDotnetType.get(java.lang.Integer.class)),new NOut(pnTypeArg1, Helper.JavaToDotnetType.get(java.lang.Integer.class)),new NOut(pnTypeArg2, Helper.JavaToDotnetType.get(java.lang.Integer.class)),new NOut(pnTypeArg3, Helper.JavaToDotnetType.get(java.lang.Integer.class)),new NOut(pnTypeArg4, Helper.JavaToDotnetType.get(java.lang.Integer.class)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer CheckSyntax (AtomicReference<java.lang.String> pbsError,AtomicReference<java.lang.Integer> pnTypeRes,AtomicReference<java.lang.Integer> pnTypeResLL,AtomicReference<java.lang.Integer> pnDecs,java.lang.Integer nArgs,NObject VarArg1,NObject VarArg2,NObject VarArg3,NObject VarArg4){ try { return javonetHandle.invoke("CheckSyntax",new NRef(pbsError),new NOut(pnTypeRes, Helper.JavaToDotnetType.get(java.lang.Integer.class)),new NOut(pnTypeResLL, Helper.JavaToDotnetType.get(java.lang.Integer.class)),new NRef(pnDecs),nArgs,VarArg1,VarArg2,VarArg3,VarArg4);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer Execute (NObject pVarRes,AtomicReference<java.lang.Integer> pnTypeRes,AtomicReference<java.lang.Integer> pnTypeResLL,AtomicReference<java.lang.Integer> pnDecs,java.lang.Integer nArgs,NObject VarArg1,NObject VarArg2,NObject VarArg3,NObject VarArg4){ try { return javonetHandle.invoke("Execute",pVarRes,new NOut(pnTypeRes, Helper.JavaToDotnetType.get(java.lang.Integer.class)),new NOut(pnTypeResLL, Helper.JavaToDotnetType.get(java.lang.Integer.class)),new NRef(pnDecs),nArgs,VarArg1,VarArg2,VarArg3,VarArg4);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer GetVisibleFlag (AtomicReference<java.lang.Boolean> pbVisible){ try { return javonetHandle.invoke("GetVisibleFlag",new NOut(pbVisible, Helper.JavaToDotnetType.get(java.lang.Boolean.class)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer GetParaValueHint (java.lang.Integer nPara,AtomicReference<java.lang.String> pbsHint,AtomicReference<java.lang.String> pbsTabbedList){ try { return javonetHandle.invoke("GetParaValueHint",nPara,new NOut(pbsHint, Helper.JavaToDotnetType.get(java.lang.String.class)),new NOut(pbsTabbedList, Helper.JavaToDotnetType.get(java.lang.String.class)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Event
	 */
            private java.util.ArrayList< EvaluateFunctionHandler> _EvaluateFunctionListeners = new java.util.ArrayList<EvaluateFunctionHandler>();

            public void addEvaluateFunction(EvaluateFunctionHandler toAdd)
            {
                _EvaluateFunctionListeners.add(toAdd);
            }
            public void removeEvaluateFunction(EvaluateFunctionHandler toRemove)
            {
                _EvaluateFunctionListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< CheckFunctionSyntaxHandler> _CheckFunctionSyntaxListeners = new java.util.ArrayList<CheckFunctionSyntaxHandler>();

            public void addCheckFunctionSyntax(CheckFunctionSyntaxHandler toAdd)
            {
                _CheckFunctionSyntaxListeners.add(toAdd);
            }
            public void removeCheckFunctionSyntax(CheckFunctionSyntaxHandler toRemove)
            {
                _CheckFunctionSyntaxListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< ParameterAutoCompleteHandler> _ParameterAutoCompleteListeners = new java.util.ArrayList<ParameterAutoCompleteHandler>();

            public void addParameterAutoComplete(ParameterAutoCompleteHandler toAdd)
            {
                _ParameterAutoCompleteListeners.add(toAdd);
            }
            public void removeParameterAutoComplete(ParameterAutoCompleteHandler toRemove)
            {
                _ParameterAutoCompleteListeners.remove(toRemove);
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}