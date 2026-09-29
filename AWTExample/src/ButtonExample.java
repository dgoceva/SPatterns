import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;


public class ButtonExample extends WindowAdapter implements ActionListener {

	Frame frame;
	Panel buttonPanel;
	Button redButton, greenButton;
	
	// Build the GUI and display it.
	public ButtonExample(String title) {
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    new ButtonExample("Button Example");
	}

}
