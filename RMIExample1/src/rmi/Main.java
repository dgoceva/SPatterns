// netstat -ano | findstr :1099

// taskkill /pid "EnterProcessIdHere" /F

package rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import rmi.BankService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init();
		bankInfo();
	}

	public static void init() {
		try {
			BankServiceImpl bank = new BankServiceImpl();
			bank.createStubAndBind();
		} catch (RemoteException e) {
			System.err.println("Exception Occurred: " + e);
		}
	}

	public static void bankInfo() {
		try {
			Registry registry = LocateRegistry.getRegistry();
			BankService bank = (BankService) registry.lookup("BankService");
			List<Customer> list = bank.getCustomers();
			for (Customer c : list) {
				System.out.println(c.getAcc_no() + " " + c.getFirstname() + " " + c.getLastname() + " " + c.getEmail()
						+ " " + c.getAmount());
			}
		} catch (RemoteException | NotBoundException e) {
			System.err.println("Exception Occurred: " + e);
		}

	}
}
