/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpatternexample1;

// Test program for Pegs.
public class TestPegs {

    public static void main(String args[]) {

        // Create some pegs.
        RoundPeg roundPeg = new RoundPeg();
        SquarePeg squarePeg = new SquarePeg();

        // Do an insert using the square peg.
        squarePeg.insert("Inserting square peg...");
        // Now we'd like to do an insert using the round peg.
        // But this client only understands the insert()
        // method of pegs, not a insertIntoHole() method.
        // The solution: create an adapter that adapts
        // a square peg to a round peg!
        PegAdapter adapter = new PegAdapter(roundPeg);
        adapter.insert("Inserting round peg...");
    }

}
