/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Class Context has behavior dependent on its state. This class uses the State
 * pattern. Now when we get a pull() or push() request, we delegate the behavior
 * to our contained state object!
 */
public class Context {

    // The contained state.
    private State state = null;  // State attribute

    // Creates a new Context with the specified state.
    public Context(State state) {
        this.state = state;
    }
// Creates a new Context with the default state.

    public Context() {
        this(new RedState());
    }

    // Returns the state.
    public State getState() {
        return state;
    }

    // Sets the state.
    public void setState(State state) {
        this.state = state;
    }

    /**
     * The push() method performs different actions depending on the state of
     * the object. Using the State pattern, we delegate this behavior to our
     * contained state object.
     */
    public void push() {
        state.handlePush(this);
    }

    /**
     * The pull() method performs different actions depending on the state of
     * the object. Using the State pattern, we delegate this behavior to our
     * contained state object.
     */
    public void pull() {
        state.handlePull(this);
    }

}
