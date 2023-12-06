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
public interface DvdListIterator {
   public void first();
   public void next();  
   public boolean isDone();
   public String currentItem();
}