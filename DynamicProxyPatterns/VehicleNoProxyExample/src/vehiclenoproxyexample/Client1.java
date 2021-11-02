/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclenoproxyexample;

/**
* Class Client1.
 * Interacts with a Car Vehicle directly.
 */
public class Client1 {

 public static void main(String[] args) {

   IVehicle v = new Car("Botar");
   v.start();
    v.forward();
    v.stop();
  }
}
