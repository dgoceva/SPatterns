package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.*;

public interface BankService extends Remote {
	public List<Customer> getCustomers() throws RemoteException;
}