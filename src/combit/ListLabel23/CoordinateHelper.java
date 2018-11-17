package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.*;
import jio.System.Drawing.*;public class CoordinateHelper {protected NObject javonetHandle; public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static java.lang.Integer SCMFromPosition (java.lang.Double value,LlUnits unit){ try { return Javonet.getType("CoordinateHelper").invoke("SCMFromPosition",value,NEnum.fromJavaEnum(unit));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public static java.lang.Double ConvertUnit (java.lang.Double value,ConversionUnit source,LlUnits target,Graphics graphics){ try { return Javonet.getType("CoordinateHelper").invoke("ConvertUnit",value,NEnum.fromJavaEnum(source),NEnum.fromJavaEnum(target),graphics);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * Method
	 */
            public static java.lang.Double ConvertToPixel (java.lang.Double value,LlUnits source,java.lang.Integer dpi){ try { return Javonet.getType("CoordinateHelper").invoke("ConvertToPixel",value,NEnum.fromJavaEnum(source),dpi);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} } public enum ConversionUnit{Point(0L),Pixel(1L),Twip(2L),SCM(3L),; private long numVal;ConversionUnit(long numVal) {
		        this.numVal = numVal;
		    }
		
		    public long getNumVal() {
		        return numVal;
		    }
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}