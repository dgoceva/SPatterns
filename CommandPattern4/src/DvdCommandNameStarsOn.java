/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class DvdCommandNameStarsOn extends CommandAbstract {
   private DvdName dvdName;  
    
   public DvdCommandNameStarsOn(DvdName dvdNameIn) {
       this.dvdName = dvdNameIn;
   }    
   public void execute() {
       this.dvdName.setNameStarsOn();
   } 
}