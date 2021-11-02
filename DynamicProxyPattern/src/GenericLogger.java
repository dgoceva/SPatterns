import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GenericLogger implements InvocationHandler {

	private Object target;
	
	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Generic Logger Entry: Invoking " +
				arg1.getName());
		return arg1.invoke(target, arg2);
	}

	public GenericLogger(Object target) {
		super();
		this.target = target;
	}

}
