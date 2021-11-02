/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddecoratorexample;

public class ChineeseFood extends FoodDecorator{  
  public ChineeseFood(Food newFood)    {  
        super(newFood);  
  }  
    public String prepareFood(){  
        return super.prepareFood() +" With Fried Rice and Manchurian  ";   
    }  
    public double foodPrice()   {  
        return super.foodPrice()+65.0;  
        }  
}  