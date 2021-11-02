public class Package {
 
    private PackageState state = new OrderedState();
 
    // getter, setter
    
    public void previousState() {
        state.prev(this);
    }
 
    public PackageState getState() {
		return state;
	}

	public void setState(PackageState state) {
		this.state = state;
	}

	public void nextState() {
        state.next(this);
    }
 
    public void printStatus() {
        state.printStatus();
    }
}