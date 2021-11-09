/**
 * Class MazeFactory is a implementation of a class that
 * only allows one instantiation of a subclass.
 * 
 * @author danielagotseva
 *
 */
public abstract class MazeFactory {
//	The private reference to the one and only instance.
	private static MazeFactory uniqueInstance = null;
	
//	The MazeFactory Constructor.
//	If you have a default constructor, it can not be private here!
	protected MazeFactory() {}
	
//	Return a reference to the single instance.
//	If the instance not yet created, create "enchanted" as default.
	public static MazeFactory instance() {
		if (uniqueInstance == null)
			return instance("enchanted");
		else
			return uniqueInstance;
	}
	
//	Create the instance using specified String name.
	public static MazeFactory instance(String name) {
		System.out.println("Class "+name+" is created");
		if (uniqueInstance == null)
			if (name.equals("enchanted"))
				uniqueInstance = new EnchantedMazeFactory();
			else if (name.equals("agent"))
				uniqueInstance = new AgentMazeFactory();
		return uniqueInstance;
	}
	
}
