/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.rmi.*;
import java.math.*;
import compute.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Client that asks the Generic Compute Server to compute pi. The first
 * command-line argument is the server hostname. The second command-line
 * argument is the number of required digits after the decimal point for the
 * computation.
 */
public class ComputePi {

    public static void main(String args[]) {

        try {
            // Get a reference to the remote object from the registry.
           Registry reg = LocateRegistry.getRegistry(args[0], 1099);
           Compute comp = (Compute)reg.lookup("Compute");

            // Create a Task object.
            Pi task = new Pi(Integer.parseInt(args[1]));
            // Ask the server to perform the computation.
            BigDecimal pi = BigDecimal.valueOf((double)comp.executeTask(task));
            System.out.println(pi);
        } catch (Exception e) {
            System.err.println("ComputePi exception: "
                    + e.getMessage());
            e.printStackTrace();
        }
    }

}
