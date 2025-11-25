
public class Circle extends Shape {

	private int radius;
	
	
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Circle(Circle source) {
		super(source);
		// TODO Auto-generated constructor stub
		this.radius = source.radius;
	}


	@Override
	public Shape clone() {
		// TODO Auto-generated method stub
		return new Circle(this);
	}


//	@Override
//	public String toString() {
//		return "Circle [radius=" + radius + "]";
//	}


	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}

}
