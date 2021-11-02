/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddecoratorexample;

public abstract class FoodDecorator implements Food{  
    private Food newFood;  
    public FoodDecorator(Food newFood)  {  
        this.newFood=newFood;  
    }  
    @Override  
    public String prepareFood(){  
        return newFood.prepareFood();   
    }  
    public double foodPrice(){  
        return newFood.foodPrice();  
    }  
}  