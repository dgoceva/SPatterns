
public class SingletonPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MazeFactory factory = EnchantedMazeFactory.instance();
		MazeFactory factory1 = MazeFactory.instance();
	}

}
