/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compute;

   import java.io.Serializable;

   /**
   * Task Interface.
    */
   public interface Task extends Serializable {
     Object execute();
   }
