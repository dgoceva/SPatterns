/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorpattern;

/**
 *
 * @author Admin
 */
public class IteratorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       DvdList fiveShakespeareMovies = new DvdList();
       fiveShakespeareMovies.append("10 Things I Hate About You");
       fiveShakespeareMovies.append("Shakespeare In Love");
       fiveShakespeareMovies.append("O (2001)");
       fiveShakespeareMovies.append("American Pie 2");
       fiveShakespeareMovies.append("Scotland, PA.");
       fiveShakespeareMovies.append("Hamlet (2000)");


       DvdListIterator fiveShakespeareIterator = 
         fiveShakespeareMovies.createIterator();
       while (!fiveShakespeareIterator.isDone()) {
           System.out.println(fiveShakespeareIterator.currentItem());
           fiveShakespeareIterator.next();  
       }
       
       fiveShakespeareMovies.delete("American Pie 2");
       
       System.out.println(" ");   
       fiveShakespeareIterator.first();       
       while (!fiveShakespeareIterator.isDone()) {
           System.out.println(fiveShakespeareIterator.currentItem());
           fiveShakespeareIterator.next();  
       }       
   }    
}
