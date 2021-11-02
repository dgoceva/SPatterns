/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleproxyexample;

/**
 * Class Client2.
 * Interacts with a Car Vehicle through a VehicleProxy.
 */
public class Client2 {
  public static void main(String[] args) {
    IVehicle c = new Car("Botar");
    IVehicle v = new VehicleProxy(c);
    v.start();
    v.forward();
    v.stop();
  }
}
