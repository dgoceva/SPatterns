/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdstateexample;

public class DvdStateNameStars implements DvdStateName {  
    int starCount;
    
    public DvdStateNameStars() {
        starCount = 0;
    }
    
    public void showName(DvdStateContext dvdStateContext, 
                         String nameIn) {
         System.out.println(nameIn.replace(' ','*'));
         // show stars twice, switch to exclamation point
         if (++starCount > 1) {
             dvdStateContext.setDvdStateName(
               new DvdStateNameExclaim());
         }       
    }  
}