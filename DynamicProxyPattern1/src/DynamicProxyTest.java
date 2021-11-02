import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class DynamicProxyTest {

	public static void main(String[] args) {
		//version 1
		Map proxyInstance = (Map) Proxy.newProxyInstance(
				  DynamicProxyTest.class.getClassLoader(), 
				  new Class[] { Map.class }, 
				  new DynamicInvocationHandler());
		
		proxyInstance.put("hello", "world");
		
		//version 2
		proxyInstance = (Map) Proxy.newProxyInstance(
				  DynamicProxyTest.class.getClassLoader(), 
				  new Class[] { Map.class }, 
				  (proxy, method, methodArgs) -> {
				    if (method.getName().equals("get")) {
				        return 42;
				    } else {
				        throw new UnsupportedOperationException(
				          "Unsupported method: " + method.getName());
				    }
				});
		System.out.println((int) proxyInstance.get("hello")); // 42
//		proxyInstance.put("hello", "world"); // exception
		
		//example 2
		Map mapProxyInstance = (Map) Proxy.newProxyInstance(
				DynamicProxyTest.class.getClassLoader(), 
				new Class[] { Map.class }, 
				new TimingDynamicInvocationHandler(new HashMap<>()));

		mapProxyInstance.put("hello", "world");
		mapProxyInstance.get("hello");

		CharSequence csProxyInstance = (CharSequence) Proxy.newProxyInstance(
				DynamicProxyTest.class.getClassLoader(), 
				new Class[] { CharSequence.class }, 
				new TimingDynamicInvocationHandler("Hello World"));

		csProxyInstance.charAt(0);
		csProxyInstance.charAt(csProxyInstance.length()-1);
//		csProxyInstance.length();
	}
}
