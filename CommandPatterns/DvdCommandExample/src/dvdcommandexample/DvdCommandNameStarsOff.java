/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdcommandexample;

public class DvdCommandNameStarsOff extends CommandAbstract {  
   private DvdName dvdName;  
    
   public DvdCommandNameStarsOff(DvdName dvdNameIn) {
       this.dvdName = dvdNameIn;
   }    
   public void execute() {
       this.dvdName.setNameStarsOff();
   } 
}