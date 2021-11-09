
public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MazeFactory factory = MazeFactory.instance("enchanted");
		MazeFactory factory = MazeFactory.instance("agent");
		MazeFactory factory1 = MazeFactory.instance();
	}

}
