/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// String comparator
   public class StringComparator implements Comparator {
     public int compare(Number a, Number b) {
       String x = a.toString();
       String y = b.toString();
       if (x.compareTo(y) < 0)
         return -1;
       else if (x.compareTo(y) > 0)
         return 1;
       else
         return 0;
     }
   }
