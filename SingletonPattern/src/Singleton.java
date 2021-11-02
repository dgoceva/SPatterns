 /**
    * Class Singleton is an implementation of a class that
    * only allows one instantiation.
    */
   public class Singleton {

     // The private reference to the one and only instance.
     private static Singleton uniqueInstance = null;

     // An instance attribute.
     private int data =  0;
     /**
      * Returns a reference to the single instance.
      * Creates the instance if it does not yet exist.
      * (This is called lazy instantiation.)
      */
     public static Singleton instance() {
       if(uniqueInstance == null) uniqueInstance = new Singleton();
       return uniqueInstance;
     }
     /**
      * The Singleton Constructor.
      * Note that it is private!
      * No client can instantiate a Singleton object!
      */
    private Singleton() {}
	public static Singleton getUniqueInstance() {
		return uniqueInstance;
	}
	public static void setUniqueInstance(Singleton uniqueInstance) {
		Singleton.uniqueInstance = uniqueInstance;
	}
	
    // Accessors and mutators here!
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}     
   }