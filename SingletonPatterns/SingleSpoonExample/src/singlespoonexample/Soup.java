/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlespoonexample;

import java.util.ArrayList;
import java.util.ListIterator;


public class Soup 
{
   ArrayList soupIngredients = new ArrayList();    
   String soupName;
   
   public String getSoupName()
   {
       return soupName;
   }
   
   public String toString()
   {
        StringBuffer stringOfIngredients = new StringBuffer(soupName);
        stringOfIngredients.append(" Ingredients: ");
        ListIterator soupIterator = soupIngredients.listIterator();
        while (soupIterator.hasNext())
        {
            stringOfIngredients.append((String)soupIterator.next());
        }
        return stringOfIngredients.toString();
   }
}        
