public class TestSingleton {

     public static void main(String args[]) {
       // Get a reference to the single instance of Singleton.
       Singleton s = Singleton.instance();

       // Set the data value.
       s.setData(34);
       System.out.println("First reference: " + s);
       System.out.println("Singleton data value is: " +
                          s.getData());
       // Get another reference to the Singleton.
       // Is it the same object?
       s = null;
       s = Singleton.instance();
       System.out.println("\nSecond reference: " + s);
       System.out.println("Singleton data value is: " +
                          s.getData());
     }
   }