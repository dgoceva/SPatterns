/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testenumeration;

import java.util.*;

   public class TestEnumeration {

     public static void main(String args[]) {
       // Create a Vector and add some items to it.
       Vector v = new Vector();
       v.addElement(new Integer(5));
       v.addElement(new Integer(9));
       v.addElement(new String("Hi, There!"));

       // Traverse the vector using an Enumeration.
       Enumeration ev = v.elements();
       System.out.println("\nVector values are:");
       traverse(ev);
// Now create a hash table and add some items to it.
       Hashtable h = new Hashtable();
       h.put("Bob", new Double(6.0));
       h.put("Joe", new Double(18.5));
       h.put("Fred", new Double(32.0));

       // Traverse the hash table keys using an Enumeration.
       Enumeration ekeys = h.keys();
       System.out.println("\nHash keys are:");
       traverse(ekeys);

       // Traverse the hash table values using an Enumeration.
       Enumeration evalues = h.elements();
       System.out.println("\nHash values are:");
       traverse(evalues);
     }
private static void traverse(Enumeration e) {
       while (e.hasMoreElements()) {
         System.out.println(e.nextElement());
       }
     }

   }
