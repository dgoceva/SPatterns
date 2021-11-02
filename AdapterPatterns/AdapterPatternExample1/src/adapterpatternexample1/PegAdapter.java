/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpatternexample1;

/**
    * The PegAdapter class.
    * This is the Adapter class.
    * It adapts a RoundPeg to a SquarePeg.
    * Its interface is that of a SquarePeg.
    */
   public class PegAdapter extends SquarePeg {
     private RoundPeg roundPeg;

     public PegAdapter(RoundPeg peg)  {this.roundPeg = peg;}

     public void insert(String str)  {roundPeg.insertIntoHole(str);}

   }
