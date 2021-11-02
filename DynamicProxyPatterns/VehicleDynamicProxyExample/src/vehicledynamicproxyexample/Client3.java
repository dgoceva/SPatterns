/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicledynamicproxyexample;

import java.lang.reflect.*;
/**
 * Class Client3.
 * Interacts with a Car Vehicle through a dynamically
 * generated VehicleProxy.
 */
public class Client3 {
  public static void main(String[] args) {
    IVehicle c = new Car("Botar");
    ClassLoader cl = IVehicle.class.getClassLoader();
    IVehicle v = (IVehicle) Proxy.newProxyInstance(cl,
       new Class[] {IVehicle.class}, new VehicleHandler(c));
    v.start();
    v.forward();
    v.stop();
  }
}
