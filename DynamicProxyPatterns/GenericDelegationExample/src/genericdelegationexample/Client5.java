/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericdelegationexample;

import java.lang.reflect.*;
/**
 * Class Client5.
 * Interacts with a Car Vehicle through a dynamically
 * generated proxy and a Generic Logger.
 */
public class Client5 {
  public static void main(String[] args) {
    IVehicle c = new Car("Botar");
    ClassLoader cl = IVehicle.class.getClassLoader();
    IVehicle v = (IVehicle) Proxy.newProxyInstance(cl,
       new Class[] {IVehicle.class}, new GenericLogger(c));
    v.start();
    v.forward();
    v.stop();
  }
}
