import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSingletonTest {

	public static void main(String[] args) throws FileNotFoundException, 
			IOException, ClassNotFoundException {
//		mainReflectionSingleton();
//		mainEnumSingleton();
//		mainSerializedSingleton();
		mainDesirializedSingleton();
	}
	public static void mainReflectionSingleton() {
		// TODO Auto-generated method stub
	       EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
	       EagerInitializedSingleton instanceTwo = null;
	       try {
	    	   Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
	    	   for (Constructor constructor : constructors) {
	    		   //Below code will destroy the singleton pattern
	    		   constructor.setAccessible(true);
	    		   instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
	    		   break;
	    	   }
	       } catch (Exception e) {
	    	   e.printStackTrace();
	       }
	       System.out.println(instanceOne.hashCode());
	       System.out.println(instanceTwo.hashCode());
	}
	
	public static void mainEnumSingleton() {
		//EnumSingleton instanceOne = new EnumSingleton();
		EnumSingleton instance = EnumSingleton.getInstance();
		EnumSingleton instanceTwo = null;
		Constructor[] constructors = EnumSingleton.class.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			try {
				constructor.setAccessible(true);
				instanceTwo = (EnumSingleton)constructor.newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("instance: "+instance);
		System.out.println("instanceTwo: "+instanceTwo);
	}

	public static void mainSerializedSingleton() {
		// TODO Auto-generated method stub
	       SerializedSingleton instanceOne = SerializedSingleton.getInstance();
	       SerializedSingleton instanceTwo = null;
	       try {
	    	   Constructor[] constructors = SerializedSingleton.class.getDeclaredConstructors();
	    	   for (Constructor constructor : constructors) {
	    		   //Below code will destroy the singleton pattern
	    		   constructor.setAccessible(true);
	    		   instanceTwo = (SerializedSingleton) constructor.newInstance();
	    		   break;
	    	   }
	       } catch (Exception e) {
	    	   e.printStackTrace();
	       }
	       System.out.println(instanceOne);
	       System.out.println(instanceTwo);
	}
	
	public static void mainDesirializedSingleton() throws FileNotFoundException,
			IOException, ClassNotFoundException {
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                "filename.ser"));
        out.writeObject(instanceOne);
        out.close();
        
        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream(
                "filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();
        
        System.out.println("instanceOne ="+instanceOne);
        System.out.println("instanceTwo ="+instanceTwo);
        

	}
	

}
