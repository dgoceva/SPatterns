/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdstrategyexample;

public class DvdNameTheAtEndStrategy extends DvdNameStrategy {
   public String formatDvdName(String dvdName, char charIn) {
       if (dvdName.startsWith("The ")) {
           return new String(dvdName.substring(4, 
             (dvdName.length())) + ", The");
       }
       if (dvdName.startsWith("THE ")) {
           return new String(dvdName.substring(4, 
             (dvdName.length())) + ", THE");
       }       
       if (dvdName.startsWith("the ")) {
           return new String(dvdName.substring(4, 
             (dvdName.length())) + ", the");
       }         
       return dvdName;
   }
}