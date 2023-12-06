/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadepatternteaexample;

class TestFacade {
   public static void main(String[] args) {
       FacadeCuppaMaker cuppaMaker = new FacadeCuppaMaker();
       FacadeTeaCup teaCup = cuppaMaker.makeACuppa();
       System.out.println(teaCup);
   }
}