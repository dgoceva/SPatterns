/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awtexample2;

import java.awt.*;
import java.awt.event.*;

/**
 * An example of the Java 1.1 AWT event model. This class uses anonymous inner
 * classes as the listeners for button events. As a result, we do not need to
 * implement ActionListener.
 */
public class ButtonExample2
        extends WindowAdapter {

    Frame frame;
    Panel buttonPanel;
    Button redButton, greenButton;
// Build the GUI and display it.

    public ButtonExample2(String title) {
        frame = new Frame(title);
        buttonPanel = new Panel(new FlowLayout());

        redButton = new Button("Red");
        redButton.setBackground(Color.red);
        redButton.setActionCommand("Change To Red");
        redButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Red pressed");
                buttonPanel.setBackground(Color.red);
            }
        });
        buttonPanel.add(redButton);
        greenButton = new Button("Green");
        greenButton.setBackground(Color.green);
        greenButton.setActionCommand("Change To Green");
        greenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Green pressed");
                buttonPanel.setBackground(Color.green);
            }
        });
        buttonPanel.add(greenButton);

        frame.add("Center", buttonPanel);
        frame.addWindowListener(this);
        frame.pack();
        frame.setVisible(true);
    }
// Since we are a WindowAdapter, we already implement the
    // WindowListener interface.  So only override those methods
    // we are interested in.

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public static void main(String args[]) {
        new ButtonExample2("Button Example");
    }

}
