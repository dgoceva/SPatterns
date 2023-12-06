/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largeclassvirtualproxyexample;

// Client of LargeClass.
   public class Client {

     public static void main(String args[]) {
       // Create a LargeClass proxy.
       ILargeClass lc = new LargeClassProxy("Title");

       // Do other things...
       System.out.println("Doing other things...");

       // Now invoke a method of LargeClass.
       // The proxy will create it.
       lc.method1();
    }
   }
