/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functorexample1;

public class Utilities {
     public static int compareNumbers(Number a, Number b, Comparator c) {
       return c.compare(a, b);
     }
   }
