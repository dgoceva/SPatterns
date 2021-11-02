/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namelistrmiexample;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class NamesServiceImpl extends UnicastRemoteObject implements NamesService {

    public Names names = new Names();

    public static void main(String[] args) {
        System.out.println("Initializing NamesService...");
        try {
            Registry reg = LocateRegistry.createRegistry(13330);
            reg.rebind("Names",new NamesServiceImpl());
            System.out.println("NamesService running.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }

    public NamesServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public void addName(String name) throws RemoteException {
        names.add(name);
        System.out.println("Added '" + name + "'");
    }

    @Override
    public Names getNames() throws RemoteException {
        return names;
    }
 
}