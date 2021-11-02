import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    IVehicle c = new Car("Botar");
	    ClassLoader cl = IVehicle.class.getClassLoader();
	    IVehicle v = (IVehicle) Proxy.newProxyInstance(cl,
	       new Class[] {IVehicle.class}, new GenericLogger(c));
	    v.start();
	    v.forward();
	    v.stop();
	    
	    IShape rect = new Rectangle();
	    cl = IShape.class.getClassLoader();
	    IShape s = (IShape) Proxy.newProxyInstance(cl,
	      new Class[] {IShape.class}, new GenericLogger(rect));
	    s.draw();
	    s.move();
	    s.resize();

	}

}
