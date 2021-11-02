/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitorexample;

import java.util.Enumeration;
import java.util.Vector;

public class WidgetAssembly extends Component {
     protected Vector components;

     public WidgetAssembly (String name) {
       super(name);
       components = new Vector();
     }

     public void addComponent (Component c) {
       components.addElement(c);
     }
public void removeComponent (Component c) {
       components.removeElement(c);
     }

     public double getPrice() {

       double totalPrice = 0.0;

       Enumeration e = components.elements();
       while (e.hasMoreElements()) {
         totalPrice += ((Component) e.nextElement()).getPrice();
       }
       return totalPrice;
     }

     public void accept (ComponentVisitor v) { v.visit(this); }
   }
