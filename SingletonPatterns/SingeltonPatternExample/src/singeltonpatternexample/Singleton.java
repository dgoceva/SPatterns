/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singeltonpatternexample;

/**
    * Class Singleton is an implementation of a class that
    * only allows one instantiation.
    */
   public class Singleton {

     // The private reference to the one and only instance.
     private static Singleton uniqueInstance = null;

     // An instance attribute.
     private int data =  0;
/**
      * Returns a reference to the single instance.
      * Creates the instance if it does not yet exist.
      * (This is called lazy instantiation.)
      */
     public static Singleton instance() {
       if(uniqueInstance == null) uniqueInstance = new Singleton();
       return uniqueInstance;
     }
     /**
      * The Singleton Constructor.
      * Note that it is private!
      * No client can instantiate a Singleton object!
      */
     private Singleton() {}

     // Accessors and mutators here!

    /**
     * @return the data
     */
    public int getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(int data) {
        this.data = data;
    }
     
   }
