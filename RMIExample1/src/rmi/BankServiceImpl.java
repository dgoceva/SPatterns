package rmi;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.*;
import java.sql.*;
import java.util.*;

import rmi.BankService;

public class BankServiceImpl implements BankService {
	BankServiceImpl() throws RemoteException {
	}

	public List<Customer> getCustomers() {
		List<Customer> list = new ArrayList<Customer>();
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/system?user=root&password=root");
			PreparedStatement ps = con.prepareStatement("select * from customer400");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Customer c = new Customer();
				c.setAcc_no(rs.getInt(1));
				c.setFirstname(rs.getString(2));
				c.setLastname(rs.getString(3));
				c.setEmail(rs.getString(4));
				c.setAmount(rs.getFloat(5));
				list.add(c);
			}

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}// end of getCustomers()
	
	public void createStubAndBind() throws RemoteException {
		
		BankService stub = (BankService) UnicastRemoteObject.exportObject((BankService) this, 0);
		Registry registry = LocateRegistry.createRegistry(1099);
		registry.rebind("BankService", stub);
	}

}