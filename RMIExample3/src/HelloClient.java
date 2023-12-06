import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Get a reference to the remote object.
			Registry reg = LocateRegistry.getRegistry("127.0.0.1", 1099);
			IHello server = (IHello) reg.lookup("HelloServer");
			System.out.println("Bound to: " + server);
			// Invoke the remote method.
			System.out.println(server.sayHello());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
