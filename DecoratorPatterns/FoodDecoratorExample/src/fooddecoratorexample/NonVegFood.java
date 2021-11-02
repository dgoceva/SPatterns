/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddecoratorexample;

public class NonVegFood extends FoodDecorator{    
    public NonVegFood(Food newFood) {  
        super(newFood);  
    }  
    public String prepareFood(){  
        return super.prepareFood() +" With Roasted Chiken and Chiken Curry  ";   
    }  
    public double foodPrice()   {  
        return super.foodPrice()+150.0;  
    }  
}  