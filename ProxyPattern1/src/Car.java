
/**
   * Class Car
    */
   public class Car implements IVehicle {
     private String name;

     public Car(String name) {this.name = name;}

     public void start() {
       System.out.println("Car " + name + " started");
     }

    @Override
    public void stop() {
       System.out.println("Car " + name + " stopped");
    }

    @Override
    public void forward() {
       System.out.println("Car " + name + " forwarded");
    }

    @Override
    public void reverse() {
       System.out.println("Car " + name + " reversed");
    }

    @Override
    public String getName() {
        return name;
    }
   }
