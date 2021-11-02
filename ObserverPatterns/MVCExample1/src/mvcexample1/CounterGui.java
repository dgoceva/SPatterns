/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcexample1;

import java.awt.*;
import java.awt.event.*;

/**
 * Class CounterGui demonstrates having the model and view in the same class.
 */
public class CounterGui extends Frame {

    // The counter.  (The model!)
    private int counter = 0;

    // The view.
    private TextField tf = new TextField(10);

    public CounterGui(String title) {
        super(title);
        Panel tfPanel = new Panel();
        tf.setText("0");
        tfPanel.add(tf);
        add("North", tfPanel);

        Panel buttonPanel = new Panel();

        Button incButton = new Button("Increment");
        incButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter++;
                tf.setText(counter + "");
            }
        });
        buttonPanel.add(incButton);
        Button decButton = new Button("Decrement");
        decButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter--;
                tf.setText(counter + "");
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
        CounterGui cg = new CounterGui("CounterGui");
        cg.setSize(350, 150);
        cg.setVisible(true);
    }
}
