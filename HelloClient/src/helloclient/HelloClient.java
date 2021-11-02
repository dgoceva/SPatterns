/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloclient;

import IHello.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

   // Hello Client.
   public class HelloClient {

     public static void main(String[] args) {

       try {
           Registry reg = LocateRegistry.getRegistry("127.0.0.1", 1099);
           IHello server = (IHello)reg.lookup("HelloServer");
           System.out.println("Connected to server");
           System.out.println(server.sayHello());
       }
       catch(Exception e) {
         e.printStackTrace();
       }
     }

   }
