/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHello;

 import java.rmi.*;
   /**
   * Hello Interface.
    */
   public interface IHello extends Remote {
     public String sayHello() throws RemoteException;
   }
