package vehicledynamicproxyexample;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.reflect.*;
   /**
   * Class VehicleHandler.
    */
   public class VehicleHandler implements InvocationHandler {
     private IVehicle v;

     public VehicleHandler(IVehicle v) {this.v = v;}

     public Object invoke(Object proxy, Method m, Object[] args)
            throws Throwable {
       System.out.println("Vehicle Handler: Invoking " +
                          m.getName());
       return m.invoke(v, args);
     }
   }
