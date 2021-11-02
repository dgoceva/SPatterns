/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guistateexample1;

import java.awt.Color;

public class BlackState extends State {
     // Next state for the Black state:
     //   On a push(), go to "red"
     //   On a pull(), go to "green“

    public void handlePush(Context c) {
       c.setState(new RedState());
     }

     public void handlePull(Context c) {
       c.setState(new GreenState());
     }

     public Color getColor() {return (Color.black);}
   }
