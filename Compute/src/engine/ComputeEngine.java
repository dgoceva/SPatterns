/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

import compute.*;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Server that executes a task specified in a Task object.
 */
public class ComputeEngine extends UnicastRemoteObject
        implements Compute {

    public ComputeEngine() throws RemoteException {
        super();
    }

    public Object executeTask(Task t) {
        return t.execute();
    }

    public static void main(String[] args) {

        // Create the remote object.
        // Register the remote object as "Compute".
        try {
            Registry reg = LocateRegistry.createRegistry(1099);
            reg.rebind("Compute",new ComputeEngine());
            System.out.println("ComputeEngine bound");
        } catch (Exception e) {
            System.err.println("ComputeEngine exception: "
                    + e.getMessage());
            e.printStackTrace();
        }
    }

}
