import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;
import java.util.Observer;

public class ObservableCounterView extends Frame {

	// The view.
	private TextField tf = new TextField(10);

	// A reference to our associated model.
	private ObservableCounter counter;

	public ObservableCounterView(String title,
			ObservableCounter c) {
		super(title);
		counter = c;

		// Add an anonymous observer to the ObservableCounter.
		counter.addObserver(new Observer() {
			public void update(Observable src, Object obj) {
				if (src == counter) {
					tf.setText(((ObservableCounter)src).getCount() + "");
				}
			}
		} );

		Panel tfPanel = new Panel();
		tf.setText(counter.getCount()+ "");
		tfPanel.add(tf);
		add("North", tfPanel);
		Panel buttonPanel = new Panel();

		Button incButton = new Button("Increment");
		incButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter.incCount();
				tf.setText(counter.getCount() + "");
			}
		} );
		buttonPanel.add(incButton);
		Button decButton = new Button("Decrement");
		decButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter.decCount();
				tf.setText(counter.getCount()+ "");
			}
		} );
		buttonPanel.add(decButton);

		Button exitButton = new Button("Exit");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		} );
		buttonPanel.add(exitButton);

		add("South", buttonPanel);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		} );
	}
	public static void main(String[] argv) {
		ObservableCounter counter = new ObservableCounter(0);
		ObservableCounterView cv1 = new
				ObservableCounterView("ObservableCounterView1", counter);
		cv1.setSize(300, 100);
		cv1.setVisible(true);
		ObservableCounterView cv2 = new
				ObservableCounterView("ObservableCounterView2", counter);
		cv2.setSize(300, 100);
		cv2.setVisible(true);
	}
}
