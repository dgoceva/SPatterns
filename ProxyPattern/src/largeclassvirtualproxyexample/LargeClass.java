/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largeclassvirtualproxyexample;

// The LargeClass class.
   public class LargeClass implements ILargeClass {

     private String title;
     public LargeClass(String title) {this.title = title;}
     public void method1() {
        // Do method1 stuff.
        System.out.println("method1");
     }
     public void method2() {
        // Do method2 stuff.
        System.out.println("method2");
     }
   }
