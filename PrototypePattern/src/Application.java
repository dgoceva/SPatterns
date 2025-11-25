import java.util.ArrayList;
import java.util.Arrays;

public class Application {

	private ArrayList<Shape> shapes = new ArrayList<Shape>();

	public Application() {
		super();
		// TODO Auto-generated constructor stub
		Circle circle = new Circle();
		circle.setX(10);
		circle.setY(10);
		circle.setRadius(20);
		shapes.add(circle);
		
		Circle anotherCircle = (Circle)circle.clone();
		shapes.add(anotherCircle);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(10);
		rectangle.setHeight(20);
		shapes.add(rectangle);
	}
	
	public ArrayList<Shape> businessLogic() {
		ArrayList<Shape> shapesCopy = new ArrayList<Shape>();
		
		for(Shape shape : shapes) {
			shapesCopy.add(shape.clone());
		}
		return shapesCopy;
	}

	@Override
	public String toString() {
		return "Application [shapes=" + shapes + "]";
	}
	
	
}
