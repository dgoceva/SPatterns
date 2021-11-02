/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcexample3;

import java.awt.*;
import java.awt.event.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Class ObservableCounterView demonstrates having the model and view in the
 * separate classes. This class is just the view.
 */
public class ObservableCounterView extends Frame {

    // The view.
    private TextField tf = new TextField(10);

    // A reference to our associated model.
    private ObservableCounter counter;

    public ObservableCounterView(String title, ObservableCounter c) {
        super(title);
        counter = c;

        // Add an anonymous observer to the ObservableCounter.
        counter.addObserver(new Observer() {
            public void update(Observable src, Object obj) {
                if (src == counter) {
                    tf.setText(((ObservableCounter) src).getCount() + "");
                }
            }
        });

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

}
