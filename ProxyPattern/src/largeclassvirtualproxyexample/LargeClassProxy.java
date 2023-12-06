/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largeclassvirtualproxyexample;

// The LargeClassProxy class.

import java.lang.reflect.Constructor;

   public class LargeClassProxy implements ILargeClass {
     private ILargeClass largeClass = null;
     private String title;

     // Constructor
     public LargeClassProxy(String title) {
       this.title = title;
     }

     // Method 1. Create LargeClass instance if needed.
     public void method1() {
       if (largeClass == null)
         largeClass = createLargeClass();
       largeClass.method1();
     }
// Method 2. Create LargeClass instance if needed.
     public void method2() {
       if (largeClass == null)
         largeClass = createLargeClass();
       largeClass.method2();
     }

     // Private method to create the LargeClass instance.
     private ILargeClass createLargeClass() {
       ILargeClass lc = null;
       try {
         // Get Class object for LargeClass.
         // When we do this, the class will be downloaded.
         Class c = Class.forName("largeclassvirtualproxyexample.LargeClass");

         // Get Class objects for the LargeClass(String) constructor
         // arguments.
         Class[] args = new Class[] {String.class};
// Get the LargeClass(String) constructor.
         Constructor cons = c.getConstructor(args);

         // Create the instance of LargeClass.
         Object[] actualArgs = new Object[] {title};
         lc = (ILargeClass) cons.newInstance(actualArgs);
         System.out.println("Creating instance of LargeClass");
       }
       catch (Exception e) {
         System.out.println("Exception: " + e);
       }
       return lc;
     }

   }
