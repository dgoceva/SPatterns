import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.logging.Logger;

public class DynamicInvocationHandler implements InvocationHandler {

//    private static Logger LOGGER = Logger.getAnonymousLogger();
//    private static Logger LOGGER = Logger.getLogger(DynamicInvocationHandler.class.getName());
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
        LOGGER.info("Invoked method: "+method.getName());
        
        return 42;
	}

}
