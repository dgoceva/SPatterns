/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;

/**
    * Abstract class which defines the interface for the
    *   behavior of a particular state of the Context.
    */
   public abstract class State {
     public abstract void handlePush(Context c);
     public abstract void handlePull(Context c);
     public abstract Color getColor();
   }
