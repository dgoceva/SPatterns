/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpatternexample1;

/**
    * The RoundPeg class.
    * This is the Adaptee class.
    */
   public class RoundPeg {
     public void insertIntoHole(String msg) {
       System.out.println("RoundPeg insertIntoHole(): " + msg);
     }
   }
