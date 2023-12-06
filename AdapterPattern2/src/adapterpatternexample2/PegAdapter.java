/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpatternexample2;

/**
    * The PegAdapter class.
    * This is the two-way adapter class.
    */
   public class PegAdapter implements ISquarePeg, IRoundPeg {
     private RoundPeg roundPeg;
     private SquarePeg squarePeg;

     public PegAdapter(RoundPeg peg) {this.roundPeg = peg;}

     public PegAdapter(SquarePeg peg) {this.squarePeg = peg;}

     public void insert(String str) {roundPeg.insertIntoHole(str);}

     public void insertIntoHole(String msg){squarePeg.insert(msg);}
   }
