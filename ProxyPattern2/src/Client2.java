
/**
 * Class Client2.
 * Interacts with a Car Vehicle through a VehicleProxy.
 */
public class Client2 {
  public static void main(String[] args) {
    IVehicle c = new Car("Botar");
    IVehicle v = new VehicleProxy(c);
    v.start();
    v.forward();
    v.stop();
  }
}
