/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpatternexample2;

public class FibonacciTask implements Task {
     int n1 = 1;
     int n2 = 0;
     int num;

     public FibonacciTask() {}
     public void performTask() {
       num = n1 + n2;
       System.out.println("Next Fibonacci number is: " + num);
       n1 = n2;
       n2 = num;
     }
     public String toString() {return ("Fibonacci Sequence Task");}
   }
