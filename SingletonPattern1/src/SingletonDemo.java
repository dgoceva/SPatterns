
public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MazeFactory factory = MazeFactory.instance("EnchantedMazeFactory");
		MazeFactory factory = MazeFactory.instance("AgentMazeFactory");
		MazeFactory factory1 = MazeFactory.instance();
	}

}
