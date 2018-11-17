package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.*;
import jio.System.*;public interface ILlLogger { public java.lang.Boolean WantOutput (LogLevels level,LogCategory category);public void Debug (LogCategory category,java.lang.String message,NObject[] args);public void Debug (java.lang.Integer indentationDelta,LogCategory category,java.lang.String message,NObject[] args);public void Info (LogCategory category,java.lang.String message,NObject[] args);public void Info (java.lang.Integer indentationDelta,LogCategory category,java.lang.String message,NObject[] args);public void Warn (LogCategory category,java.lang.String message,NObject[] args);public void Error (LogCategory category,java.lang.String message,NObject[] args);}