
/**
 * Class EnchantedMazeFactory is a implementation of a class
 * that allows one instantiation.
 * 
 * @author danielagotseva
 *
 */
public class AgentMazeFactory extends MazeFactory {

	//		Return a reference to the single instance.
	public static MazeFactory instance() {
		if (uniqueInstance == null) {
			uniqueInstance = new AgentMazeFactory();
		}
		System.out.println("Class AgentMazeFactory is created "+uniqueInstance);
		return uniqueInstance;
	}

	//		Private subclass constructor!
	private AgentMazeFactory() {}

}
