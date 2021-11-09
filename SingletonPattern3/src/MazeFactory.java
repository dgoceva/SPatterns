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
		System.out.println("Class is created "+uniqueInstance);
		if (uniqueInstance == null)
			return instance("EnchantedMazeFactory");
		else
			return uniqueInstance;
	}
	
//	Create the instance using specified String name.
	public static MazeFactory instance(String name) {
		if (uniqueInstance == null)
			try {
				uniqueInstance = (MazeFactory) Class.forName(name).newInstance();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Class "+name+" is created "+uniqueInstance);
		return uniqueInstance;
	}
	
}
