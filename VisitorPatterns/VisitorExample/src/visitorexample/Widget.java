/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitorexample;

public class Widget extends Component {
     protected double price;

     public Widget(String name, double price) {
       super(name);
       this.price = price;
     }

     public void setPrice(double price) { this.price = price; }
     public double getPrice() { return price; }

     public void accept (ComponentVisitor v) { v.visit(this); }
   }
