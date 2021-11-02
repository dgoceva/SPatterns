/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitorexample;

public abstract class ComponentVisitor {

     public abstract void visit(Widget w);
     public abstract void visit(WidgetAssembly wa);

   }
