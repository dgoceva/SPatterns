package vehicledynamicproxyexample;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
   * Interface IVehicle.
    */
   public interface IVehicle {
     public void start();
     public void stop();
    public void forward();
     public void reverse();
     public String getName();
   }
