/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teadecoratorexample;

class TestChaiDecorator {            
    
   public static void main(String[] args) {
       Tea teaLeaves = new TeaLeaves();
       Tea chaiDecorator = new ChaiDecorator(teaLeaves);
       chaiDecorator.steepTea();
   }
}