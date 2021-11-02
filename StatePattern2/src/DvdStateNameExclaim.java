/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class DvdStateNameExclaim implements DvdStateName {  
    public DvdStateNameExclaim() {}
    
    public void showName(DvdStateContext dvdStateContext, 
                         String nameIn) {
         System.out.println(nameIn.replace(' ','!'));
         //show exclaim only once, switch back to stars
         dvdStateContext.setDvdStateName(new DvdStateNameStars());
    }  
}