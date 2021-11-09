/**
 * Class MazeFactory is a implementation of a class that
 * only allows one instantiation of a subclass. This version
 * requires its subclasses to provide an implementation of
 * a static instance() method.
 * 
 * @author danielagotseva
 *
 */
public abstract class MazeFactory {
//	The protected reference to the one and only instance.
	protected static MazeFactory uniqueInstance = null;
	
//	The MazeFactory Constructor.
//	If you have a default constructor, it can not be private here!
	protected MazeFactory() {}
	
//	Return a reference to the single instance.
	public static MazeFactory instance() {
		return uniqueInstance;
	}	
}
