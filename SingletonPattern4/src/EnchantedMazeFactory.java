/**
 * Class EnchantedMazeFactory is a implementation of a class
 * that allows one instantiation.
 * 
 * @author danielagotseva
 *
 */
public class EnchantedMazeFactory extends MazeFactory {

//	Return a reference to the single instance.
	public static MazeFactory instance() {
		if (uniqueInstance == null) {
			uniqueInstance = new EnchantedMazeFactory();
		}
		return uniqueInstance;
	}
	
//	Private subclass constructor!
	private EnchantedMazeFactory() {}
}
