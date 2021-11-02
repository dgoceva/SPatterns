/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class DvdStateContext {  
   private DvdStateName dvdStateName; 
    
   public DvdStateContext() {
       setDvdStateName(new DvdStateNameStars());  
       //start with stars
   }
   
   public void setDvdStateName(DvdStateName dvdStateNameIn) {
       this.dvdStateName = dvdStateNameIn;
   }
   
   public void showName(String nameIn) {
       this.dvdStateName.showName(this, nameIn);
   }
}