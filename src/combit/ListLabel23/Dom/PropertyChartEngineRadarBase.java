package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyChartEngineRadarBase extends PropertyChartEngineBase {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setRadarCenterMinimumValue (java.lang.String value){ try { javonetHandle.set("RadarCenterMinimumValue",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getRadarCenterMinimumValue (){ try { return  (java.lang.String) javonetHandle.get("RadarCenterMinimumValue");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setRadarCircularMode (java.lang.String value){ try { javonetHandle.set("RadarCircularMode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getRadarCircularMode (){ try { return  (java.lang.String) javonetHandle.get("RadarCircularMode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setRadarForceAutoZeroValues (java.lang.String value){ try { javonetHandle.set("RadarForceAutoZeroValues",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getRadarForceAutoZeroValues (){ try { return  (java.lang.String) javonetHandle.get("RadarForceAutoZeroValues");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setRadarForceCentered (java.lang.String value){ try { javonetHandle.set("RadarForceCentered",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getRadarForceCentered (){ try { return  (java.lang.String) javonetHandle.get("RadarForceCentered");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setRadarRotateClockwise (java.lang.String value){ try { javonetHandle.set("RadarRotateClockwise",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getRadarRotateClockwise (){ try { return  (java.lang.String) javonetHandle.get("RadarRotateClockwise");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setRadarRotationDelta (java.lang.String value){ try { javonetHandle.set("RadarRotationDelta",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getRadarRotationDelta (){ try { return  (java.lang.String) javonetHandle.get("RadarRotationDelta");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertyFilling getFilling (){ try { return new PropertyFilling((NObject)javonetHandle.<NObject>get("Filling"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PropertyCategoryAxisXRadar getXAxis (){ try { return new PropertyCategoryAxisXRadar((NObject)javonetHandle.<NObject>get("XAxis"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PropertyChartEngineRadarBase(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}