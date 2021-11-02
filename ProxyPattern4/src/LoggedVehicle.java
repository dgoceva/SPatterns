/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
   * Class LoggedVehicle.
    */
   public class LoggedVehicle implements IVehicle {
     private IVehicle v;

     public LoggedVehicle(IVehicle v) {this.v = v;}

     public void start() {
       System.out.println("Log Entry: Vehicle " + v.getName() +
                          " started");
       v.start();
     }

    @Override
    public void stop() {
       System.out.println("Log Entry: Vehicle " + v.getName() +
                          " stopped");
       v.stop();
    }

    @Override
    public void forward() {
       System.out.println("Log Entry: Vehicle " + v.getName() +
                          " forwarded");
       v.forward();
    }

    @Override
    public void reverse() {
       System.out.println("Log Entry: Vehicle " + v.getName() +
                          " reversed");
       v.reverse();
    }

    @Override
    public String getName() {
        return v.getName();
    }
   }
