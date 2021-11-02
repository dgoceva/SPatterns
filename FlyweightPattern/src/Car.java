import java.awt.Color;

public class Car implements Vehicle {
	private Engine engine;
	private Color color;
	
	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	public Car(Engine engine, Color color) {
		super();
		this.engine = engine;
		this.color = color;
	}
}

class Engine {
	
}
