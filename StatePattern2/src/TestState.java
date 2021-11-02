/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

class TestState {
   public static void main(String[] args) 
   {
       DvdStateContext stateContext = new DvdStateContext();
       stateContext.showName(
         "Sponge Bob Squarepants - "+
           "Nautical Nonsense and Sponge Buddies");
       stateContext.showName(
         "Jay and Silent Bob Strike Back");  
       stateContext.showName(
         "Buffy The Vampire Slayer Season 2");
       stateContext.showName(
         "The Sopranos Season 2");
   }
} 