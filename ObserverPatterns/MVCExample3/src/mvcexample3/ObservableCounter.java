/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcexample3;

import java.util.Observable;

/**
 * Class ObservableCounter implements a simple observable counter model.
 */
public class ObservableCounter extends Observable {

    // The model.
    private int count;

    public ObservableCounter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void incCount() {
        count++;
        setChanged();
        notifyObservers();
    }

    public void decCount() {
        count--;
        setChanged();
        notifyObservers();
    }

    public static void main(String[] argv) {
        ObservableCounter counter = new ObservableCounter(0);
        ObservableCounterView cv1 = new ObservableCounterView("ObservableCounterView1", counter);
        cv1.setSize(300, 100);
        cv1.setVisible(true);
        ObservableCounterView cv2 = new ObservableCounterView("ObservableCounterView2", counter);
        cv2.setSize(300, 100);
        cv2.setVisible(true);
    }
}
