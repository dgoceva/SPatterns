import java.util.Observable;

public class DelegatedObservable extends Observable {

	public DelegatedObservable() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected synchronized void clearChanged() {
		// TODO Auto-generated method stub
		super.clearChanged();
	}

	@Override
	protected synchronized void setChanged() {
		// TODO Auto-generated method stub
		super.setChanged();
	}
	
}
