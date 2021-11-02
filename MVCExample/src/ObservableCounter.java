import java.util.Observable;

public class ObservableCounter extends Observable {

	// The model.
	private int count;

	public ObservableCounter(int count) { this.count = count; }

	public int getCount() { return count; }

	public void incCount() {
		count++;
		setChanged();
		notifyObservers();
	}

	public void decCount() {
		count--;
		setChanged();
		notifyObservers();
	}
}
