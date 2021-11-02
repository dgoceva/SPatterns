/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teadecoratorexample;

public class TeaLeaves extends Tea {  
   public TeaLeaves() {
       teaIsSteeped = false;
   }
   
   public void steepTea() {
       teaIsSteeped = true;
       System.out.println("tea leaves are steeping");
   }
}
