import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class TimingDynamicInvocationHandler implements InvocationHandler {

    private static Logger LOGGER = LoggerFactory.getLogger(
    		TimingDynamicInvocationHandler.class);
    		
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
 
        LOGGER.info("Executing "+method.getName()+" with {} params finished in {} ns", 
        		Arrays.toString(args), elapsed);
 
        return result;
	}

}
