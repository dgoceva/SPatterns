/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;

public class BlueState extends State {
     // Next state for the Black state:
     //   On a push(), go to "green"
     //   On a pull(), go to "red"

    public void handlePush(Context c) {
       c.setState(new GreenState());
     }

     public void handlePull(Context c) {
       c.setState(new RedState());
     }

     public Color getColor() {return (Color.blue);}
   }
