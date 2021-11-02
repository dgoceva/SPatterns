/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddecoratorexample;

public class VegFood implements Food {  
    public String prepareFood(){  
         return "Veg Food";  
    }  
  
        public double foodPrice(){  
        return 50.0;  
    }  
}  