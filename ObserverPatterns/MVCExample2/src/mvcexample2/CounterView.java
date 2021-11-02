/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcexample2;

import java.awt.*;
import java.awt.event.*;

/**
 * Class CounterView demonstrates having the model and view in the separate
 * classes. This class is just the view.
 */
public class CounterView extends Frame {

    // The view.
    private TextField tf = new TextField(10);

    // A reference to our associated model.
    private Counter counter;

    public CounterView(String title, Counter c) {
        super(title);
        counter = c;

        Panel tfPanel = new Panel();
        tf.setText(counter.getCount() + "");
        tfPanel.add(tf);
        add("North", tfPanel);
        Panel buttonPanel = new Panel();

        Button incButton = new Button("Increment");
        incButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter.incCount();
                tf.setText(counter.getCount() + "");
            }
        });
        buttonPanel.add(incButton);
        Button decButton = new Button("Decrement");
        decButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter.decCount();
                tf.setText(counter.getCount() + "");
            }
        });
        buttonPanel.add(decButton);

        Button exitButton = new Button("Exit");
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        buttonPanel.add(exitButton);

        add("South", buttonPanel);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] argv) {
        Counter counter = new Counter(0);
        CounterView cv1 = new CounterView("CounterView1", counter);
        cv1.setSize(300, 100);
        cv1.setVisible(true);
        CounterView cv2 = new CounterView("CounterView2", counter);
        cv2.setSize(300, 100);
        cv2.setVisible(true);
    }

}
