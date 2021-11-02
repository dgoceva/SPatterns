/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teabagcompositeexample;

import java.util.ListIterator;


public class OneTeaBag extends TeaBags { 
    public OneTeaBag(String nameIn) {
        this.setName(nameIn);
    }
    
    public int countTeaBags() {
        return 1;
    }
   
    public boolean add(TeaBags teaBagsToAdd) {
        return false;
    }
    public boolean remove(TeaBags teaBagsToRemove) {
        return false;
    }
    public ListIterator createListIterator() {
        return null;
    }
}