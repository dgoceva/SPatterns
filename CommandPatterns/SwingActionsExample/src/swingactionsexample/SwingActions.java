/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingactionsexample;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

/**
 * Class SwingActions demonstrates the Command Pattern
 * using Swing Actions.
 */
public class SwingActions extends JFrame {

  private JToolBar tb;
  private JTextArea ta;
  private JMenu fileMenu;
  private Action openAction;
  private Action closeAction;

  public SwingActions() {
    super("SwingActions");
    setupGUI();
  }
private void setupGUI() {

    //Create the toolbar and menu.
    tb = new JToolBar();
    fileMenu = new JMenu("File");

    //Create the text area used for output.
    ta = new JTextArea(5, 30);
    JScrollPane scrollPane = new JScrollPane(ta);

    //Layout the content pane.
    JPanel contentPane = new JPanel();
    contentPane.setLayout(new BorderLayout());
    contentPane.setPreferredSize(new Dimension(400, 150));
    contentPane.add(tb, BorderLayout.NORTH);
    contentPane.add(scrollPane, BorderLayout.CENTER);
    setContentPane(contentPane);
//Set up the menu bar.
    JMenuBar mb = new JMenuBar();
    mb.add(fileMenu);
    setJMenuBar(mb);

    // Create an action for "Open".
    ImageIcon openIcon = new ImageIcon("open.gif");
    openAction = new AbstractAction("Open", openIcon) {
      public void actionPerformed(ActionEvent e) {
        ta.append("Open action from " + e.getActionCommand() +"\n");
      }
    };

    // Use the action to add a button to the toolbar.
    JButton openButton = tb.add(openAction);
    openButton.setText("Open Button");
    openButton.setActionCommand("Open Button");
    openButton.setToolTipText("This is the open button");
// Use the action to add a menu item to the file menu.
    JMenuItem openMenuItem = fileMenu.add(openAction);
    openMenuItem.setIcon(null);
    openMenuItem.setActionCommand("Open Menu Item");

    // Create an action for "Close" and use the action to add
    // a button to the toolbar and a menu item to the menu.
    // Code NOT shown - similar to "open" code above.
    // Create an action for "Open".
    ImageIcon closeIcon = new ImageIcon("close.gif");
    closeAction = new AbstractAction("Close", openIcon) {
      public void actionPerformed(ActionEvent e) {
        ta.append("Close action from " + e.getActionCommand() +"\n");
      }
    };

    // Use the action to add a button to the toolbar.
    JButton closeButton = tb.add(closeAction);
    closeButton.setText("Close Button");
    closeButton.setActionCommand("Close Button");
    closeButton.setToolTipText("This is the close button");
// Use the action to add a menu item to the file menu.
    JMenuItem closeMenuItem = fileMenu.add(closeAction);
    closeMenuItem.setIcon(null);
    closeMenuItem.setActionCommand("Close Menu Item");
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    SwingActions frame = new SwingActions();
    frame.pack();
    frame.setVisible(true);
  }

}
