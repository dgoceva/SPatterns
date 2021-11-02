/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class DvdName {  
   private String titleName;  
    
   public DvdName(String titleName) {
       this.setTitleName(titleName);
   }    
  
   public final void setTitleName(String titleNameIn) {
       this.titleName = titleNameIn;
   }
   public final String getTitleName() {
       return this.titleName;
   }
   
   public void setNameStarsOn() {
       this.setTitleName(this.getTitleName().replace(' ','*'));
   }
   public void setNameStarsOff() {
       this.setTitleName(this.getTitleName().replace('*',' '));
   }   
   
   public String toString() {
       return ("DVD: " + this.getTitleName());
   }
}