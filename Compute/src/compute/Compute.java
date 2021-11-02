/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compute;

import java.rmi.*;

   /**
   * Generic Compute Interface.
    */
   public interface Compute extends Remote {
     Object executeTask(Task t) throws RemoteException;
   }
