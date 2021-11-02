/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teaadapterexample;

public class TeaBag {  
   boolean teaBagIsSteeped; 
    
   public TeaBag() {
       teaBagIsSteeped = false;
   }
   
   public void steepTeaInCup() {
       teaBagIsSteeped = true;
       System.out.println("tea bag is steeping in cup");
   }
}