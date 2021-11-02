/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUINoSPExample;

import java.awt.Color;

/**
 * Class ContextNoSP has behavior dependent on its state. The push() and pull()
 * methods do different things depending on the state of the object. This class
 * does NOT use the State pattern.
 */
public class ContextNoSP {

    // The state!
    private Color state = null;

    // Creates a new ContextNoSP with the specified state (color).
    public ContextNoSP(Color color) {
        state = color;
    }
    // Creates a new ContextNoSP with the default state

    public ContextNoSP() {
        this(Color.red);
    }
    // Returns the state.

    public Color getState() {
        return state;
    }

    // Sets the state.
    public void setState(Color state) {
        this.state = state;
    }

    /**
     * The push() method performs different actions depending on the state of
     * the object. Actually, right now the only action is to make a state
     * transition.
     */
    public void push() {
        if (state == Color.red) {
            state = Color.blue;
        } else if (state == Color.green) {
            state = Color.black;
        } else if (state == Color.black) {
            state = Color.red;
        } else if (state == Color.blue) {
            state = Color.green;
        }
    }

    /**
     * The pull() method performs different actions depending on the state of
     * the object. Actually, right now the only action is to make a state
     * transition.
     */
    public void pull() {
        if (state == Color.red) {
            state = Color.green;
        } else if (state == Color.green) {
            state = Color.blue;
        } else if (state == Color.black) {
            state = Color.green;
        } else if (state == Color.blue) {
            state = Color.red;
        }
    }

}
