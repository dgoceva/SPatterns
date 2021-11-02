/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloserver;

import java.rmi.*;
import java.rmi.server.*;
import IHello.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

// Hello  Server.
public class HelloServer extends UnicastRemoteObject
        implements IHello {

    private String name;

    public HelloServer(String name) throws RemoteException {
        super();
        this.name = name;
    }

    public String sayHello() {
        return "Hello, World!";
    }

    public static void main(String[] args) {
         try {
             
            Registry reg = LocateRegistry.createRegistry(1099);
            reg.rebind("HelloServer",new HelloServer("HelloServer"));
            System.out.println("HelloServer Started");
        } catch (Exception e) {
            System.out.println("HelloServer error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
