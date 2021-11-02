
public class Car implements IVehicle {

	private String name;
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Car " + name + " started");	
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Car " + name + " stopped");	
	}

	@Override
	public void forward() {
		// TODO Auto-generated method stub
		System.out.println("Car " + name + " going forward");	
	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		System.out.println("Car " + name + " going backward");	
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public Car(String name) {
		super();
		this.name = name;
	}

}
