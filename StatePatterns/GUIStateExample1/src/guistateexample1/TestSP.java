/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guistateexample1;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Test program for the ContextNoSP class which does NOT use the State pattern.
 */
public class TestSP extends Frame
        implements ActionListener {

    // GUI attributes.
    private Button pushButton = new Button("Push Operation");
    private Button pullButton = new Button("Pull Operation");
    private Button exitButton = new Button("Exit");
    private Canvas canvas = new Canvas();

// The Context.
    private Context context = null;

    public TestSP() {
        super("State Pattern");
        context = new Context();
        setupWindow();
    }

    private void setupWindow() {
        // Setup GUI 
        setLayout(new FlowLayout());
        canvas.setBackground(context.getState().getColor());
        canvas.setSize(300, 200);
        add(canvas);
        pushButton.addActionListener(this);
        add(pushButton);
        pullButton.addActionListener(this);
        add(pullButton);
        exitButton.addActionListener(this);
        add(exitButton);

        setSize(300, 300);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent arg0) {
                System.exit(0);
            }

        });
    }

    // Handle GUI actions.
    public void actionPerformed(ActionEvent event) {
        Object src = event.getSource();
        if (src == pushButton) {
            context.push();
            canvas.setBackground(context.getState().getColor());
        } else if (src == pullButton) {
            context.pull();
            canvas.setBackground(context.getState().getColor());

        } else if (src == exitButton) {
            System.exit(0);
        }
    }

    // Main method.
    public static void main(String[] argv) {
        TestSP gui = new TestSP();
        gui.setVisible(true);
    }

}
