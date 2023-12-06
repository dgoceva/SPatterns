/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpatternexample2;

// The SquarePeg class.
   public class SquarePeg implements ISquarePeg {
     public void insert(String str) {
       System.out.println("SquarePeg insert(): " + str);
     }
   }
