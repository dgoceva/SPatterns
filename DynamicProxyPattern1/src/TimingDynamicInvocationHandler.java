import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;



public class TimingDynamicInvocationHandler implements InvocationHandler {

//    private static final Logger LOGGER = LoggerFactory.getLogger(
//    		TimingDynamicInvocationHandler.class);
//    private static Logger LOGGER = Logger.getAnonymousLogger();
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    		
    private final Map<String, Method> methods = new HashMap<>();
    
    private Object target;

	public TimingDynamicInvocationHandler(Object target) {
		super();
		this.target = target;
        for(Method method: target.getClass().getDeclaredMethods()) {
            this.methods.put(method.getName(), method);
        }
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
        long start = System.nanoTime();
        Object result = methods.get(method.getName()).invoke(target, args);
        long elapsed = System.nanoTime() - start;
 
        LOGGER.info(String.format("Executing %s finished in %d ns", 
        		method.getName(), elapsed));
 
        return result;
	}

}
