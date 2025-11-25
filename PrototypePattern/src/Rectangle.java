
public class Rectangle extends Shape {

	private int width;
	private int height;
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(Rectangle source) {
		super(source);
		// TODO Auto-generated constructor stub
		this.width = source.width;
		this.height = source.height;
	}

	@Override
	public Shape clone() {
		// TODO Auto-generated method stub
		return new Rectangle(this);
	}

//	@Override
//	public String toString() {
//		return "Rectangle [width=" + width + ", height=" + height + "]";
//	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
