/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awtexample1;
import java.awt.*;
import java.awt.event.*;
/**
 * An example of the Java 1.1 AWT event model.
 * This class not only builds the GUI, but it is the
 *   listener for button events.
 */
public class ButtonExample1
  extends WindowAdapter
  implements ActionListener {

  Frame frame;
  Panel buttonPanel;
  Button redButton, greenButton;

// Build the GUI and display it.
  public ButtonExample1(String title) {
    frame = new Frame(title);
    buttonPanel = new Panel(new FlowLayout());

    redButton = new Button("Red");
    redButton.setBackground(Color.red);
    redButton.setActionCommand("Change To Red");
    redButton.addActionListener(this);
    buttonPanel.add(redButton);

   greenButton = new Button("Green");
    greenButton.setBackground(Color.green);
    greenButton.setActionCommand("Change To Green");
    greenButton.addActionListener(this);
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
// Since we handle the button events, we must implement
  // the ActionListener interface.
  public void actionPerformed(ActionEvent e) {
    String cmd = e.getActionCommand();
    if (cmd.equals("Change To Red")) {
      System.out.println("Red pressed");
      buttonPanel.setBackground(Color.red);
    }
    else if (cmd.equals("Change To Green")) {
      System.out.println("Green pressed");
      buttonPanel.setBackground(Color.green);
    }
  }

  public static void main(String args[]) {
    new ButtonExample1("Button Example");
  }    
}
