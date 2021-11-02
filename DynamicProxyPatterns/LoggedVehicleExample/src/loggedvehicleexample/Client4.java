/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loggedvehicleexample;

/**
 * Class Client4.
 * Interacts with a Car Vehicle through a Logging Decorator.
 */
public class Client4 {
  public static void main(String[] args) {
    IVehicle c = new Car("Botar");
    IVehicle v = new LoggedVehicle(c);
    v.start();
    v.forward();
    v.stop();
  }
}
