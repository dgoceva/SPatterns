/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleproxyexample;

/**
   * Class VehicleProxy.
    */
   public class VehicleProxy implements IVehicle {
     private IVehicle v;

    public VehicleProxy(IVehicle v) {this.v = v;}

    public void start() {
       System.out.println("VehicleProxy: Begin of start()");
       v.start();
       System.out.println("VehicleProxy: End of start()");
     }
    @Override
    public void stop() {
       System.out.println("VehicleProxy: Begin of stop()");
       v.stop();
       System.out.println("VehicleProxy: End of stop()");
    }

    @Override
    public void forward() {
       System.out.println("VehicleProxy: Begin of forward()");
       v.forward();
       System.out.println("VehicleProxy: End of forward()");
    }

    @Override
    public void reverse() {
       System.out.println("VehicleProxy: Begin of start()");
       v.reverse();
       System.out.println("VehicleProxy: End of start()");
    }

    @Override
    public String getName() {
       return v.getName();
    }
  }
