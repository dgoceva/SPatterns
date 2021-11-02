/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 import java.lang.reflect.*;
   /**
   * Class GenericLogger.
    */
   public class GenericLogger implements InvocationHandler {
    private Object target;

    public GenericLogger(Object target) {this.target = target;}

     public Object invoke(Object proxy, Method m, Object[] args)
       throws Throwable {

       System.out.println("Generic Logger Entry: Invoking " +
                           m.getName());
       return m.invoke(target, args);
     }
   }
