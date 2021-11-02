/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teaadapterexample;

public class TeaBall extends TeaBag {  
   LooseLeafTea looseLeafTea;
   
   public TeaBall(LooseLeafTea looseLeafTeaIn) {
       looseLeafTea = looseLeafTeaIn;
       teaBagIsSteeped = looseLeafTea.teaIsSteeped;
   }
    
   public void steepTeaInCup() {
       looseLeafTea.steepTea();
       teaBagIsSteeped = true;
   }
}