/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teaadapterexample;

class TestTeaBagAdaptation {


   public static void main(String[] args) {
       TeaCup teaCup = new TeaCup();


       System.out.println("Steeping tea bag");
       TeaBag teaBag = new TeaBag();       
       teaCup.steepTeaBag(teaBag);


       System.out.println("Steeping loose leaf tea");
       LooseLeafTea looseLeafTea = new LooseLeafTea();
       TeaBall teaBall = new TeaBall(looseLeafTea);
       teaCup.steepTeaBag(teaBall);
   }
} 