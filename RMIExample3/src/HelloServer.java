import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class HelloServer extends UnicastRemoteObject implements IHello {

	private String name;

    public HelloServer(String name) throws RemoteException {
      super();
      this.name = name;
    }

	protected HelloServer() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
		name = "World!";
	}

	@Override
	public String sayHello() throws RemoteException {
		// TODO Auto-generated method stub
		return "Hello "+name;
	}
	
	 public static void main(String[] args) {
	       try {

	         // Register the remote object as "HelloServer".
	         Registry reg = LocateRegistry.createRegistry(1099);
	         reg.rebind("HelloServer",new HelloServer("HelloServer"));                      	System.out.println("HelloServer bound in registry!");
	       }
	       catch(Exception e) {
	         System.out.println("HelloServer error: " + e.getMessage());
	         e.printStackTrace();
	       }
	     }
}
