/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//  Integer comparator
   public class IntComparator implements Comparator {
     public int compare(Number a, Number b) {
       int x = a.intValue();
       int y = b.intValue();
       if (x < y)
         return -1;
       else if (x > y)
         return 1;
       else
         return 0;
     }
   }
