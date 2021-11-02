/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitorexample;

public class SimpleVisitor extends ComponentVisitor {

     public SimpleVisitor() {}

     public void visit (Widget w) {
       System.out.println("Visiting a Widget");
     }

     public void visit (WidgetAssembly wa) {
       System.out.println("Visiting a WidgetAssembly");
     }

   }
