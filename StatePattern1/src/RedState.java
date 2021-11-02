
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;

public class RedState extends State {
     // Next state for the Black state:
     //   On a push(), go to "blue"
     //   On a pull(), go to "black"

    public void handlePush(Context c) {
       c.setState(new BlueState());
     }

     public void handlePull(Context c) {
       c.setState(new BlackState());
     }

     public Color getColor() {return (Color.red);}
   }
