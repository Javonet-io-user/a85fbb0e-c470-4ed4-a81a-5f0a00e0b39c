package combit.ListLabel23.DesignerExtensions;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.DesignerExtensions.*;
import jio.System.*;public class PercentageDesignerProperty extends DesignerProperty {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setMinimum (java.lang.Double value){ try { javonetHandle.set("Minimum",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Double getMinimum (){ try { return javonetHandle.get("Minimum");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * SetProperty
	 */
            public void setMaximum (java.lang.Double value){ try { javonetHandle.set("Maximum",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Double getMaximum (){ try { return javonetHandle.get("Maximum");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }public PercentageDesignerProperty (java.lang.String name,NObject defaultValue){  super((NObject) null); try {  javonetHandle = Javonet.New("PercentageDesignerProperty",name,defaultValue); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PercentageDesignerProperty(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}