/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitorexample;

public class PriceVisitor extends ComponentVisitor {
     private double maxPrice;

     public PriceVisitor(double maxPrice) {
       this.maxPrice = maxPrice; }

     public void visit (Widget w) {
       double price = w.getPrice();
       if (price > maxPrice)
         System.out.println("Don't Buy! Widget price of " +
           price + " exceeds maximum price (" + maxPrice + ").");
       else
         System.out.println("Buy! Widget price of " + price +
           " is less than maximum price (" + maxPrice + ").");
     }
public void visit (WidgetAssembly wa) {
       double price = wa.getPrice();
       if (price > maxPrice)
         System.out.println("Don't Buy! WidgetAssembly price of " +
           price + " exceeds maximum price (" + maxPrice + ").");
       else
         System.out.println("Buy! WidgetAssembly price of " +
           price + " is less than maximum price (" +
           maxPrice + ").");
     }

   }
