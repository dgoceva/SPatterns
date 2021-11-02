/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teabagcompositeexample;

import java.util.LinkedList;
import java.util.ListIterator;


public abstract class TeaBags {  
   LinkedList teaBagList; 
   TeaBags parent;
   String name;
    
   public abstract int countTeaBags();
   
   public abstract boolean add(TeaBags teaBagsToAdd);
   public abstract boolean remove(TeaBags teaBagsToRemove);
   public abstract ListIterator createListIterator();
   
   public void setParent(TeaBags parentIn) {
       parent = parentIn;
   }
   public TeaBags getParent() {
      return parent;
   }
   
   public void setName(String nameIn) {
       name = nameIn;
   }
   public String getName() {
       return name;
   }
}