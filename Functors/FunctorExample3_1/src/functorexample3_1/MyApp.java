/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functorexample3_1;

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
        // Use instances of anonymous inner classes
        // as the callback objects for the button events!
        goButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                go();
            }
        });
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });
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

    public void go() {
        throw new UnsupportedOperationException("TODO");
    }

    // Main method.
    public static void main(String[] argv) {
        MyApp app = new MyApp();
        app.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
