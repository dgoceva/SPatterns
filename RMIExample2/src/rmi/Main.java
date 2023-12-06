// npx kill-port 1099

package rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init();
		send();
	}

	public static void init() {
		try {
			MessengerServiceImpl messengerService = new MessengerServiceImpl();
			messengerService.createStubAndBind();
		} catch (RemoteException e) {
			System.err.println("Exception Occurred: " + e);
		}
	}

	public static void send() {
		try {
			Registry registry = LocateRegistry.getRegistry();
			MessengerService server = (MessengerService) registry.lookup("MessengerService");
			System.out.println(server.sendMessage("Client Message"));
		} catch (RemoteException | NotBoundException e) {
			System.err.println("Exception Occurred: " + e);
		}
	}
}
