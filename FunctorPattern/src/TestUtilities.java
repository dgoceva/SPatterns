/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 public class TestUtilities {
     public static void main(String args[]) {
       // Create an integer Comparator.
       Comparator c1 = new IntComparator();

       // Compare two objects.
       int result = Utilities.compareNumbers(new Float(5.5),
                                             new Double(12.0), c1);
       System.out.println("Result is: " + result);

       // Create a string Comparator.
       Comparator c2 = new StringComparator();
// Compare the same two objects.
       result = Utilities.compareNumbers(new Float(5.5),
                                         new Double(12.0), c2);
       System.out.println("Result is: " + result);
     }
   }
