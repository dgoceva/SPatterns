/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;

public class GreenState extends State {
     // Next state for the Black state:
     //   On a push(), go to "black"
     //   On a pull(), go to "blue"

    public void handlePush(Context c) {
       c.setState(new BlackState());
     }

     public void handlePull(Context c) {
       c.setState(new BlueState());
     }

     public Color getColor() {return (Color.green);}
   }
