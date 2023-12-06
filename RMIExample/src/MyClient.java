// start rmiregistry 5000 <in the same path where stub class exists>

import java.rmi.*;

public class MyClient {
	public static void main(String args[]) {
		try {
			Adder stub = (Adder) Naming.lookup("rmi://localhost:5000/sonoo");
			System.out.println(stub.add(34, 4));
		} catch (Exception e) {
		}
	}
}  