/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcexample2;

/**
 * Class Counter implements a simple counter model.
 */
public class Counter {

    // The model.
    private int count;

    public Counter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void incCount() {
        count++;
    }

    public void decCount() {
        count--;
    }

}
