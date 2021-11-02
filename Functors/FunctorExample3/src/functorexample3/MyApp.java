/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functorexample3;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

public class MyApp extends Frame implements ActionListener {

    // GUI attributes.
    private Button goButton = new Button("Go");
    private Button exitButton = new Button("Exit");
// MyApp Constructor

    public MyApp() {
        super("My Application");
        setupWindow();
    }

    // Setup GUI.
    private void setupWindow() {
        Panel bottomPanel = new Panel();
        add(bottomPanel);
        bottomPanel.add(goButton);
        bottomPanel.add(exitButton);
        // Register myself as an action listener for these buttons!
        goButton.addActionListener(this);
        exitButton.addActionListener(this);
        pack();
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int i = JOptionPane.showConfirmDialog(null, "Seguro que quiere salir?");
                if (i == 0) {
                    System.exit(0);//cierra aplicacion
                }
            }
        });
    }
// Handle GUI actions.
    // This is the callback function!

    public void actionPerformed(ActionEvent event) {
        Object src = event.getSource();
        if (src == goButton) {
            go();
        } else if (src == exitButton) {
            System.exit(0);
        }
    }

    public void go() {
        throw new UnsupportedOperationException("TODO");
    }

    // Main method.
    public static void main(String[] argv) {
        MyApp app = new MyApp();
        app.setVisible(true);
    }
}
