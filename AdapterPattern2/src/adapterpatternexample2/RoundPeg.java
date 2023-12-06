/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpatternexample2;

// The RoundPeg class.
   public class RoundPeg implements IRoundPeg {
     public void insertIntoHole(String msg) {
       System.out.println("RoundPeg insertIntoHole(): " + msg);
     }
   }
