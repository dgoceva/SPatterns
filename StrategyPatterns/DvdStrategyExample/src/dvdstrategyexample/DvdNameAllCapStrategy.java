/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdstrategyexample;

public class DvdNameAllCapStrategy extends DvdNameStrategy {
   public String formatDvdName(String dvdName, char charIn) {
       return dvdName.toUpperCase();
   }
}