/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdstrategyexample;

class TestDvdStrategy {            
    
   public static void main(String[] args) {
       DvdNameContext allCapContext = 
           new DvdNameContext('C');
       DvdNameContext theEndContext = 
           new DvdNameContext('E');
       DvdNameContext spacesContext = 
           new DvdNameContext('S');
       
       String dvdNames[] = new String[3];
       dvdNames[0] = "Jay and Silent Bob Strike Back";
       dvdNames[1] = "The Fast and the Furious";
       dvdNames[2] = "The Others";
       
       char replaceChar = '*';       
       
       System.out.println("Testing formatting with all caps");
       String[] dvdCapNames = 
           allCapContext.formatDvdNames(dvdNames);
       
       System.out.println(" ");         
       System.out.println(
           "Testing formatting with beginning the at end");
       String[] dvdEndNames = 
           theEndContext.formatDvdNames(dvdNames);     
       
       System.out.println(" ");       
       System.out.println("Testing formatting with all spaces replaced with " + 
           replaceChar);
       String[] dvdSpcNames = 
           spacesContext.formatDvdNames(dvdNames, replaceChar);
   }
}  